package de.uniba.rz.grpcbackend;

import de.uniba.rz.Utlities.GeneralUtilitiesGrpc;
import de.uniba.rz.Utlities.GeneralUtilitiesUdp;
import de.uniba.rz.backend.TicketStore;
import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.entities.Type;
import de.uniba.rz.io.rpc.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

class GrpcTicketServiceImpl extends TicketServiceGrpc.TicketServiceImplBase {

    static TicketStore ticketStore;
    List<StreamObserver<AutoUpdateResponse>> responseObservers;

    public GrpcTicketServiceImpl() {
        responseObservers = new ArrayList();
    }

    /**
     * This methos sets the ticket store
     * @param argTicketStore
     */
    public void setTicketStore(TicketStore argTicketStore){
        ticketStore = argTicketStore;
    }

    @Override
    public void getAllTickets(Empty request, StreamObserver<GetAllTicketsResponse> responseObserver) {

        System.out.println("Inside get all tickets");
        //super.getALlTickets(request, responseObserver);
        List<Ticket> allTickets = ticketStore.getAllTickets();

        //Create the response
        GetAllTicketsResponse response = GetAllTicketsResponse.newBuilder()
                .addAllListOfTickets(GeneralUtilitiesGrpc.getRpcTicketsFromModelTickets(allTickets))
                .build();

        //Send the response
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();
    }

    @Override
    public void createTicket(CreateNewTicketRequest request, StreamObserver<CreateNewTicketResponse> responseObserver) {

        System.out.println("Inside create ticket");
        //Extract the ticket
        TicketWithoutId newTicket = request.getNewticket();
        Ticket newTicketWithID = ticketStore.storeNewTicket(newTicket.getReporter(),
                newTicket.getTopic(),
                newTicket.getDescription(),
                Type.valueOf(newTicket.getType().name()),
                Priority.valueOf(newTicket.getPriority().name()));

        //Create the response
        CreateNewTicketResponse response = CreateNewTicketResponse.newBuilder()
                .setCreatedTicket(GeneralUtilitiesGrpc.getRpcTicketFromModelTicket(newTicketWithID))
                .build();

        //Send the response
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();

        notifyObservers();

        //super.createTicket(request, responseObserver);
    }

    @Override
    public void getTicketById(GetTicketByIdRequest request, StreamObserver<GetTicketByIdResponse> responseObserver) {
        //super.getTicketById(request, responseObserver);

        System.out.println("Inside get ticket by id");
        //Extract the date
        int ticketId = request.getId();

        //Get the ticket
        Ticket t = GeneralUtilitiesUdp.getTicketByID(ticketStore.getAllTickets(),ticketId);

        //Create the response
        GetTicketByIdResponse response = GetTicketByIdResponse.newBuilder()
                .setTicketById(GeneralUtilitiesGrpc.getRpcTicketFromModelTicket(t))
                .build();

        //Send the response
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();

    }

    @Override
    public void updateTicket(UpdateTicketRequest request, StreamObserver<UpdateTicketResponse> responseObserver) {
        //super.updateTicket(request, responseObserver);

        System.out.println("Inside update ticket");
        //Extract the data
        int id = request.getId();
        Status status = Status.valueOf(request.getStatus().name());

        //Get the ticket
        Ticket t = GeneralUtilitiesUdp.getTicketByID(ticketStore.getAllTickets(),id);

        //Set the status
        t.setStatus(status);

        System.out.println("updating the ticket with id "+t.getId()+" with the status "+t.getStatus().name());

        //Create the response
        UpdateTicketResponse response = UpdateTicketResponse.newBuilder()
                .setTicket(GeneralUtilitiesGrpc.getRpcTicketFromModelTicket(t))
                .build();

        //Send the response
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();

        notifyObservers();
    }


    @Override
    public StreamObserver<Empty> startAutoUpdating(StreamObserver<AutoUpdateResponse> responseObserver) {
        responseObservers.add(responseObserver);
        System.out.println("A client has registered an observer.");

        return new StreamObserver<Empty>() {

            @Override
            public void onNext(Empty value) {
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObservers.remove(responseObserver);
            }

        };
    }

    private void notifyObservers() {
        AutoUpdateResponse autoUpdateResponse = AutoUpdateResponse.newBuilder()
                .addAllListOfTickets(GeneralUtilitiesGrpc.getRpcTicketsFromModelTickets(ticketStore.getAllTickets()))
                .build();

        for(StreamObserver<AutoUpdateResponse> ro:responseObservers) {
            ro.onNext(autoUpdateResponse);
        }
    }
}
