// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketManagement.proto

package de.uniba.rz.io.rpc;

public interface AutoUpdateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AutoUpdateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  java.util.List<de.uniba.rz.io.rpc.Ticket> 
      getListOfTicketsList();
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  de.uniba.rz.io.rpc.Ticket getListOfTickets(int index);
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  int getListOfTicketsCount();
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  java.util.List<? extends de.uniba.rz.io.rpc.TicketOrBuilder> 
      getListOfTicketsOrBuilderList();
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  de.uniba.rz.io.rpc.TicketOrBuilder getListOfTicketsOrBuilder(
      int index);
}
