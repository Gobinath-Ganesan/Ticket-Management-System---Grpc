package de.uniba.rz.io.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Unary
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: ticketManagement.proto")
public final class TicketServiceGrpc {

  private TicketServiceGrpc() {}

  public static final String SERVICE_NAME = "TicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.Empty,
      de.uniba.rz.io.rpc.GetAllTicketsResponse> getGetAllTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllTickets",
      requestType = de.uniba.rz.io.rpc.Empty.class,
      responseType = de.uniba.rz.io.rpc.GetAllTicketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.Empty,
      de.uniba.rz.io.rpc.GetAllTicketsResponse> getGetAllTicketsMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.Empty, de.uniba.rz.io.rpc.GetAllTicketsResponse> getGetAllTicketsMethod;
    if ((getGetAllTicketsMethod = TicketServiceGrpc.getGetAllTicketsMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getGetAllTicketsMethod = TicketServiceGrpc.getGetAllTicketsMethod) == null) {
          TicketServiceGrpc.getGetAllTicketsMethod = getGetAllTicketsMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.Empty, de.uniba.rz.io.rpc.GetAllTicketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "GetAllTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.GetAllTicketsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("GetAllTickets"))
                  .build();
          }
        }
     }
     return getGetAllTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.CreateNewTicketRequest,
      de.uniba.rz.io.rpc.CreateNewTicketResponse> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTicket",
      requestType = de.uniba.rz.io.rpc.CreateNewTicketRequest.class,
      responseType = de.uniba.rz.io.rpc.CreateNewTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.CreateNewTicketRequest,
      de.uniba.rz.io.rpc.CreateNewTicketResponse> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.CreateNewTicketRequest, de.uniba.rz.io.rpc.CreateNewTicketResponse> getCreateTicketMethod;
    if ((getCreateTicketMethod = TicketServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getCreateTicketMethod = TicketServiceGrpc.getCreateTicketMethod) == null) {
          TicketServiceGrpc.getCreateTicketMethod = getCreateTicketMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.CreateNewTicketRequest, de.uniba.rz.io.rpc.CreateNewTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "CreateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.CreateNewTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.CreateNewTicketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("CreateTicket"))
                  .build();
          }
        }
     }
     return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.GetTicketByIdRequest,
      de.uniba.rz.io.rpc.GetTicketByIdResponse> getGetTicketByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTicketById",
      requestType = de.uniba.rz.io.rpc.GetTicketByIdRequest.class,
      responseType = de.uniba.rz.io.rpc.GetTicketByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.GetTicketByIdRequest,
      de.uniba.rz.io.rpc.GetTicketByIdResponse> getGetTicketByIdMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.GetTicketByIdRequest, de.uniba.rz.io.rpc.GetTicketByIdResponse> getGetTicketByIdMethod;
    if ((getGetTicketByIdMethod = TicketServiceGrpc.getGetTicketByIdMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getGetTicketByIdMethod = TicketServiceGrpc.getGetTicketByIdMethod) == null) {
          TicketServiceGrpc.getGetTicketByIdMethod = getGetTicketByIdMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.GetTicketByIdRequest, de.uniba.rz.io.rpc.GetTicketByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "GetTicketById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.GetTicketByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.GetTicketByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("GetTicketById"))
                  .build();
          }
        }
     }
     return getGetTicketByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.UpdateTicketRequest,
      de.uniba.rz.io.rpc.UpdateTicketResponse> getUpdateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTicket",
      requestType = de.uniba.rz.io.rpc.UpdateTicketRequest.class,
      responseType = de.uniba.rz.io.rpc.UpdateTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.UpdateTicketRequest,
      de.uniba.rz.io.rpc.UpdateTicketResponse> getUpdateTicketMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.UpdateTicketRequest, de.uniba.rz.io.rpc.UpdateTicketResponse> getUpdateTicketMethod;
    if ((getUpdateTicketMethod = TicketServiceGrpc.getUpdateTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getUpdateTicketMethod = TicketServiceGrpc.getUpdateTicketMethod) == null) {
          TicketServiceGrpc.getUpdateTicketMethod = getUpdateTicketMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.UpdateTicketRequest, de.uniba.rz.io.rpc.UpdateTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "UpdateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.UpdateTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.UpdateTicketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("UpdateTicket"))
                  .build();
          }
        }
     }
     return getUpdateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.Empty,
      de.uniba.rz.io.rpc.AutoUpdateResponse> getStartAutoUpdatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartAutoUpdating",
      requestType = de.uniba.rz.io.rpc.Empty.class,
      responseType = de.uniba.rz.io.rpc.AutoUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.Empty,
      de.uniba.rz.io.rpc.AutoUpdateResponse> getStartAutoUpdatingMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.Empty, de.uniba.rz.io.rpc.AutoUpdateResponse> getStartAutoUpdatingMethod;
    if ((getStartAutoUpdatingMethod = TicketServiceGrpc.getStartAutoUpdatingMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getStartAutoUpdatingMethod = TicketServiceGrpc.getStartAutoUpdatingMethod) == null) {
          TicketServiceGrpc.getStartAutoUpdatingMethod = getStartAutoUpdatingMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.Empty, de.uniba.rz.io.rpc.AutoUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "StartAutoUpdating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.AutoUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("StartAutoUpdating"))
                  .build();
          }
        }
     }
     return getStartAutoUpdatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketServiceStub newStub(io.grpc.Channel channel) {
    return new TicketServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TicketServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TicketServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Unary
   * </pre>
   */
  public static abstract class TicketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllTickets(de.uniba.rz.io.rpc.Empty request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetAllTicketsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllTicketsMethod(), responseObserver);
    }

    /**
     */
    public void createTicket(de.uniba.rz.io.rpc.CreateNewTicketRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.CreateNewTicketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     */
    public void getTicketById(de.uniba.rz.io.rpc.GetTicketByIdRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetTicketByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateTicket(de.uniba.rz.io.rpc.UpdateTicketRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.UpdateTicketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTicketMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.Empty> startAutoUpdating(
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.AutoUpdateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStartAutoUpdatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllTicketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.Empty,
                de.uniba.rz.io.rpc.GetAllTicketsResponse>(
                  this, METHODID_GET_ALL_TICKETS)))
          .addMethod(
            getCreateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.CreateNewTicketRequest,
                de.uniba.rz.io.rpc.CreateNewTicketResponse>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getGetTicketByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.GetTicketByIdRequest,
                de.uniba.rz.io.rpc.GetTicketByIdResponse>(
                  this, METHODID_GET_TICKET_BY_ID)))
          .addMethod(
            getUpdateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.UpdateTicketRequest,
                de.uniba.rz.io.rpc.UpdateTicketResponse>(
                  this, METHODID_UPDATE_TICKET)))
          .addMethod(
            getStartAutoUpdatingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.Empty,
                de.uniba.rz.io.rpc.AutoUpdateResponse>(
                  this, METHODID_START_AUTO_UPDATING)))
          .build();
    }
  }

  /**
   * <pre>
   *Unary
   * </pre>
   */
  public static final class TicketServiceStub extends io.grpc.stub.AbstractStub<TicketServiceStub> {
    private TicketServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllTickets(de.uniba.rz.io.rpc.Empty request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetAllTicketsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTicket(de.uniba.rz.io.rpc.CreateNewTicketRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.CreateNewTicketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketById(de.uniba.rz.io.rpc.GetTicketByIdRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetTicketByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTicket(de.uniba.rz.io.rpc.UpdateTicketRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.UpdateTicketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.Empty> startAutoUpdating(
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.AutoUpdateResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStartAutoUpdatingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *Unary
   * </pre>
   */
  public static final class TicketServiceBlockingStub extends io.grpc.stub.AbstractStub<TicketServiceBlockingStub> {
    private TicketServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.uniba.rz.io.rpc.GetAllTicketsResponse getAllTickets(de.uniba.rz.io.rpc.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllTicketsMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.uniba.rz.io.rpc.CreateNewTicketResponse createTicket(de.uniba.rz.io.rpc.CreateNewTicketRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.uniba.rz.io.rpc.GetTicketByIdResponse getTicketById(de.uniba.rz.io.rpc.GetTicketByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.uniba.rz.io.rpc.UpdateTicketResponse updateTicket(de.uniba.rz.io.rpc.UpdateTicketRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTicketMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Unary
   * </pre>
   */
  public static final class TicketServiceFutureStub extends io.grpc.stub.AbstractStub<TicketServiceFutureStub> {
    private TicketServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.GetAllTicketsResponse> getAllTickets(
        de.uniba.rz.io.rpc.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllTicketsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.CreateNewTicketResponse> createTicket(
        de.uniba.rz.io.rpc.CreateNewTicketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.GetTicketByIdResponse> getTicketById(
        de.uniba.rz.io.rpc.GetTicketByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.UpdateTicketResponse> updateTicket(
        de.uniba.rz.io.rpc.UpdateTicketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_TICKETS = 0;
  private static final int METHODID_CREATE_TICKET = 1;
  private static final int METHODID_GET_TICKET_BY_ID = 2;
  private static final int METHODID_UPDATE_TICKET = 3;
  private static final int METHODID_START_AUTO_UPDATING = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_TICKETS:
          serviceImpl.getAllTickets((de.uniba.rz.io.rpc.Empty) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetAllTicketsResponse>) responseObserver);
          break;
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((de.uniba.rz.io.rpc.CreateNewTicketRequest) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.CreateNewTicketResponse>) responseObserver);
          break;
        case METHODID_GET_TICKET_BY_ID:
          serviceImpl.getTicketById((de.uniba.rz.io.rpc.GetTicketByIdRequest) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetTicketByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TICKET:
          serviceImpl.updateTicket((de.uniba.rz.io.rpc.UpdateTicketRequest) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.UpdateTicketResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_AUTO_UPDATING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.startAutoUpdating(
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.AutoUpdateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.uniba.rz.io.rpc.TicketManagement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketService");
    }
  }

  private static final class TicketServiceFileDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier {
    TicketServiceFileDescriptorSupplier() {}
  }

  private static final class TicketServiceMethodDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketServiceFileDescriptorSupplier())
              .addMethod(getGetAllTicketsMethod())
              .addMethod(getCreateTicketMethod())
              .addMethod(getGetTicketByIdMethod())
              .addMethod(getUpdateTicketMethod())
              .addMethod(getStartAutoUpdatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
