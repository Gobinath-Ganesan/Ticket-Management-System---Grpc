package de.uniba.rz.grpc;

import de.uniba.rz.Utlities.GeneralUtilitiesGrpc;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.io.rpc.*;
import de.uniba.rz.ui.swing.MainFrame;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class GrpcClient {

    private String hostname;
    private int channelid;
    private ManagedChannel channel;
    private TicketServiceGrpc.TicketServiceBlockingStub client;
    private MainFrame mainFrame;
    HashMap<Integer, Ticket> grpcTicketStore;

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public GrpcClient(String argHostname, int argChannel, HashMap<Integer, Ticket> grpcTicketStore) {
        this.hostname = argHostname;
        this.channelid = argChannel;
        this.grpcTicketStore = grpcTicketStore;
        channel = ManagedChannelBuilder.forAddress(hostname, channelid)
                .usePlaintext()
                .build();
        client = TicketServiceGrpc.newBlockingStub(channel);
    }

    public Ticket createNewTicket(Ticket argTicketToCreate) {
        System.out.println("Inside create new ticket");

        TicketWithoutId ticket = TicketWithoutId.newBuilder()
                .setReporter(argTicketToCreate.getReporter())
                .setTopic(argTicketToCreate.getReporter())
                .setDescription(argTicketToCreate.getDescription())
                .setType(Type.valueOf(argTicketToCreate.getType().name()))
                .setPriority(Priority.valueOf(argTicketToCreate.getPriority().name()))
                .build();

        CreateNewTicketRequest createRequest = CreateNewTicketRequest.newBuilder()
                .setNewticket(ticket)
                .build();

        CreateNewTicketResponse createResponse = client.createTicket(createRequest);
        de.uniba.rz.io.rpc.Ticket newTicket = createResponse.getCreatedTicket();

        return GeneralUtilitiesGrpc.getModelTicketFromRpcTicket(newTicket);
    }

    public List<Ticket> getAllTickets() {

        List<de.uniba.rz.io.rpc.Ticket> allRpcTickets;
        System.out.println("Inside get all tickets");
        de.uniba.rz.io.rpc.Empty emptyRequest = de.uniba.rz.io.rpc.Empty.getDefaultInstance();
        GetAllTicketsResponse getAllResponse = client.getAllTickets(emptyRequest);
        allRpcTickets = getAllResponse.getListOfTicketsList();
        List<Ticket> allModelTickets = GeneralUtilitiesGrpc.getModelTicketsFromRpcTickets(allRpcTickets);
        return allModelTickets;
    }

    public Ticket GetTicketByID(int argId) {

        de.uniba.rz.io.rpc.Ticket retrivedTicket;
        System.out.println("Inside get ticket by id");
        GetTicketByIdRequest getTicketRequest = GetTicketByIdRequest.newBuilder()
                .setId(argId)
                .build();

        GetTicketByIdResponse getTicketResponse = client.getTicketById(getTicketRequest);
        retrivedTicket = getTicketResponse.getTicketById();
        return GeneralUtilitiesGrpc.getModelTicketFromRpcTicket(retrivedTicket);
    }

    public Ticket updateTicket(int argId, Status argStatus) {
        de.uniba.rz.io.rpc.Ticket updatedTicket;
        System.out.println("Inside update ticket by id");
        UpdateTicketRequest updateTicketRequest = UpdateTicketRequest.newBuilder()
                .setId(argId)
                .setStatus(de.uniba.rz.io.rpc.Status.valueOf(argStatus.name()))
                .build();

        UpdateTicketResponse updateTicketResponse = client.updateTicket(updateTicketRequest);
        updatedTicket = updateTicketResponse.getTicket();
        System.out.println(updatedTicket);
        return GeneralUtilitiesGrpc.getModelTicketFromRpcTicket(updatedTicket);
    }

    public void autoUpdateTicket()
    {
        System.out.println("starting update service.");
        TicketServiceGrpc.TicketServiceStub asyncClient = TicketServiceGrpc.newStub(channel);
//        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<Empty> requestObserver = asyncClient.startAutoUpdating(new StreamObserver<AutoUpdateResponse>() {
            @Override
            public void onNext(AutoUpdateResponse value) {
                System.out.println("server has sent an onNext.");
                List<Ticket> tickets = GeneralUtilitiesGrpc.getModelTicketsFromRpcTickets(value.getListOfTicketsList());
                mainFrame.updateTable(tickets);
                for (Ticket tick:tickets
                ) {
                    grpcTicketStore.put(tick.getId(),tick);
                }
            }

            @Override
            public void onError(Throwable t) {
//              latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
//                latch.countDown();
            }
        });

    }

    public void closeChannel() {
        System.out.println("Closing channel");
        channel.shutdown();
    }
}
