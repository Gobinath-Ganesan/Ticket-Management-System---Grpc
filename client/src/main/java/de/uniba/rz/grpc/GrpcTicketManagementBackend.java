package de.uniba.rz.grpc;

import de.uniba.rz.Utlities.GeneralUtilitiesUdp;
import de.uniba.rz.app.TicketManagementBackend;
import de.uniba.rz.entities.*;
import de.uniba.rz.ui.swing.MainFrame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GrpcTicketManagementBackend implements TicketManagementBackend {

    private String hostname;
    private int channel;
    HashMap<Integer, Ticket> grpcTicketStore = new HashMap<>();

    GrpcClient grpcClient;
    private MainFrame mainFrame;

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        grpcClient.setMainFrame(mainFrame);
        grpcClient.autoUpdateTicket();
    }

    public GrpcTicketManagementBackend(String argHostname, int argChannel){
        this.hostname = argHostname;
        this.channel = argChannel;
        grpcClient = new GrpcClient(hostname,channel, grpcTicketStore);
    }

    @Override
    public Ticket createNewTicket(String reporter, String topic, String description, Type type, Priority priority) throws TicketException {
        Ticket newTicket = new Ticket(0,reporter,topic,description,type,priority);
        Ticket newTicketWithID = grpcClient.createNewTicket(newTicket);
        grpcTicketStore.put(newTicketWithID.getId(),newTicketWithID);
        return (Ticket) newTicketWithID.clone();
    }

    @Override
    public List<Ticket> getAllTickets() throws TicketException {
        List<Ticket> allTickets = new ArrayList<>();
        allTickets = grpcClient.getAllTickets();
        for (Ticket tick:allTickets
             ) {
            grpcTicketStore.put(tick.getId(),tick);
        }
        return allTickets;
    }

    @Override
    public Ticket getTicketById(int id) throws TicketException {
        Ticket ticketToRetrive = null;
        ticketToRetrive = grpcClient.GetTicketByID(id);
        return ticketToRetrive;
    }

    @Override
    public Ticket acceptTicket(int id) throws TicketException {
        Ticket acceptTicket = null;
        Ticket acceptedTicket = null;
        if(grpcTicketStore.containsKey(id)){
            acceptTicket = grpcTicketStore.get(id);
            if(acceptTicket.getStatus() != Status.NEW){
                throw new TicketException("Cannot accept the ticket with the id "+ acceptTicket.getId());
            }
        }
        else
            throw new TicketException("Unable to find the ticket in ticketstore");

        acceptedTicket = grpcClient.updateTicket(acceptTicket.getId(), Status.ACCEPTED);
        System.out.println("Ticket accepted "+acceptedTicket.getId());

        return acceptedTicket;
    }

    @Override
    public Ticket rejectTicket(int id) throws TicketException {
        Ticket rejectTicket = null;
        Ticket rejectedTicket = null;
        if(grpcTicketStore.containsKey(id)){
            rejectTicket = grpcTicketStore.get(id);
            if(rejectTicket.getStatus() != Status.NEW){
                throw new TicketException("Cannot reject the ticket with the id "+ rejectTicket.getId());
            }
        }
        else
            throw new TicketException("Unable to find the ticket in ticketstore");
        rejectedTicket = grpcClient.updateTicket(rejectTicket.getId(), Status.REJECTED);
        return rejectedTicket;
    }

    @Override
    public Ticket closeTicket(int id) throws TicketException {
        Ticket closeTicket = null;
        Ticket closedTicket = null;
        if(grpcTicketStore.containsKey(id)){
            closeTicket = grpcTicketStore.get(id);
            if(closeTicket.getStatus() != Status.ACCEPTED){
                throw new TicketException("Cannot close the ticket with the id "+ closeTicket.getId());
            }
        }
        else
            throw new TicketException("Unable to find the ticket in ticketstore");
        closedTicket = grpcClient.updateTicket(closeTicket.getId(), Status.CLOSED);
        return  closedTicket;
    }

    @Override
    public void triggerShutdown() {
        grpcClient.closeChannel();
    }
}
