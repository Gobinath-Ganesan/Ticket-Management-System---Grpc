package de.uniba.rz.Utlities;

import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.entities.Type;

import java.util.ArrayList;
import java.util.List;

public class GeneralUtilitiesGrpc {

    private GeneralUtilitiesGrpc() {}

    public static Ticket getModelTicketFromRpcTicket(de.uniba.rz.io.rpc.Ticket rpcTicket) {
        Ticket ticket = new Ticket();
        ticket.setId(rpcTicket.getId());
        ticket.setDescription(rpcTicket.getDescription());
        ticket.setPriority(Priority.valueOf(rpcTicket.getPriority().name()));
        ticket.setType(Type.valueOf(rpcTicket.getType().name()));
        ticket.setStatus(Status.valueOf(rpcTicket.getStatus().name()));
        ticket.setReporter(rpcTicket.getReporter());
        ticket.setTopic(rpcTicket.getTopic());
        return ticket;
    }

    public static List<Ticket> getModelTicketsFromRpcTickets(List<de.uniba.rz.io.rpc.Ticket> allRpcTickets) {
        List<Ticket> allModelTickets = new ArrayList<>();
        for(de.uniba.rz.io.rpc.Ticket ticket:allRpcTickets) {
            allModelTickets.add(getModelTicketFromRpcTicket(ticket));
        }
        return allModelTickets;
    }

    public static de.uniba.rz.io.rpc.Ticket getRpcTicketFromModelTicket(Ticket modelTicket) {
        de.uniba.rz.io.rpc.Ticket ticket = de.uniba.rz.io.rpc.Ticket.newBuilder()
            .setId(modelTicket.getId())
            .setDescription(modelTicket.getDescription())
            .setPriority(de.uniba.rz.io.rpc.Priority.valueOf(modelTicket.getPriority().name()))
            .setType(de.uniba.rz.io.rpc.Type.valueOf(modelTicket.getType().name()))
            .setStatus(de.uniba.rz.io.rpc.Status.valueOf(modelTicket.getStatus().name()))
            .setReporter(modelTicket.getReporter())
            .setTopic(modelTicket.getTopic())
            .build();
        return ticket;
    }

    public static List<de.uniba.rz.io.rpc.Ticket> getRpcTicketsFromModelTickets(List<Ticket> allModelTickets) {
        List<de.uniba.rz.io.rpc.Ticket> allRpcTickets = new ArrayList<>();
        for(Ticket ticket:allModelTickets) {
            allRpcTickets.add(getRpcTicketFromModelTicket(ticket));
        }
        return allRpcTickets;
    }
}
