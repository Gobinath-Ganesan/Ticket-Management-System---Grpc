package de.uniba.rz.grpcbackend;

import de.uniba.rz.backend.RemoteAccess;
import de.uniba.rz.backend.TicketStore;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcRemoteAccess implements RemoteAccess {

    private int port;
    private Server grpcServer;

    GrpcTicketServiceImpl grpcTicketServiceImpl;

    TicketStore ticketStore;

    public GrpcRemoteAccess(String port) {
        this.port = Integer.parseInt(port);
    }

    @Override
    public void prepareStartup(TicketStore ticketStore) {
        this.ticketStore = ticketStore;
    }

    @Override
    public void shutdown() {
        grpcServer.shutdown();
    }

    @Override
    public void run(){
        grpcTicketServiceImpl = new GrpcTicketServiceImpl();
        grpcTicketServiceImpl.setTicketStore(ticketStore);

        this.grpcServer = ServerBuilder.forPort(this.port)
                .addService(grpcTicketServiceImpl)
                .build();
        try {
            grpcServer.start();
            System.out.println("Server started and listened on port " + this.port);

            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    System.err.println("*** shutting down gRPC server since JVM is shutting down");
                    grpcServer.shutdown();
                    System.err.println("*** server shut down");
                }
            });
            grpcServer.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e){

        }
    }
}
