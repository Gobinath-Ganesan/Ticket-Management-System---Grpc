// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketManagement.proto

package de.uniba.rz.io.rpc;

/**
 * Protobuf type {@code GetAllTicketsResponse}
 */
public  final class GetAllTicketsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetAllTicketsResponse)
    GetAllTicketsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAllTicketsResponse.newBuilder() to construct.
  private GetAllTicketsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllTicketsResponse() {
    listOfTickets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAllTicketsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              listOfTickets_ = new java.util.ArrayList<de.uniba.rz.io.rpc.Ticket>();
              mutable_bitField0_ |= 0x00000001;
            }
            listOfTickets_.add(
                input.readMessage(de.uniba.rz.io.rpc.Ticket.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        listOfTickets_ = java.util.Collections.unmodifiableList(listOfTickets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return de.uniba.rz.io.rpc.TicketManagement.internal_static_GetAllTicketsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.uniba.rz.io.rpc.TicketManagement.internal_static_GetAllTicketsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.uniba.rz.io.rpc.GetAllTicketsResponse.class, de.uniba.rz.io.rpc.GetAllTicketsResponse.Builder.class);
  }

  public static final int LISTOFTICKETS_FIELD_NUMBER = 1;
  private java.util.List<de.uniba.rz.io.rpc.Ticket> listOfTickets_;
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  public java.util.List<de.uniba.rz.io.rpc.Ticket> getListOfTicketsList() {
    return listOfTickets_;
  }
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  public java.util.List<? extends de.uniba.rz.io.rpc.TicketOrBuilder> 
      getListOfTicketsOrBuilderList() {
    return listOfTickets_;
  }
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  public int getListOfTicketsCount() {
    return listOfTickets_.size();
  }
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  public de.uniba.rz.io.rpc.Ticket getListOfTickets(int index) {
    return listOfTickets_.get(index);
  }
  /**
   * <code>repeated .Ticket listOfTickets = 1;</code>
   */
  public de.uniba.rz.io.rpc.TicketOrBuilder getListOfTicketsOrBuilder(
      int index) {
    return listOfTickets_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < listOfTickets_.size(); i++) {
      output.writeMessage(1, listOfTickets_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < listOfTickets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, listOfTickets_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof de.uniba.rz.io.rpc.GetAllTicketsResponse)) {
      return super.equals(obj);
    }
    de.uniba.rz.io.rpc.GetAllTicketsResponse other = (de.uniba.rz.io.rpc.GetAllTicketsResponse) obj;

    if (!getListOfTicketsList()
        .equals(other.getListOfTicketsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getListOfTicketsCount() > 0) {
      hash = (37 * hash) + LISTOFTICKETS_FIELD_NUMBER;
      hash = (53 * hash) + getListOfTicketsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.GetAllTicketsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.uniba.rz.io.rpc.GetAllTicketsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GetAllTicketsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetAllTicketsResponse)
      de.uniba.rz.io.rpc.GetAllTicketsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_GetAllTicketsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_GetAllTicketsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.uniba.rz.io.rpc.GetAllTicketsResponse.class, de.uniba.rz.io.rpc.GetAllTicketsResponse.Builder.class);
    }

    // Construct using de.uniba.rz.io.rpc.GetAllTicketsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getListOfTicketsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (listOfTicketsBuilder_ == null) {
        listOfTickets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        listOfTicketsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_GetAllTicketsResponse_descriptor;
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.GetAllTicketsResponse getDefaultInstanceForType() {
      return de.uniba.rz.io.rpc.GetAllTicketsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.GetAllTicketsResponse build() {
      de.uniba.rz.io.rpc.GetAllTicketsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.GetAllTicketsResponse buildPartial() {
      de.uniba.rz.io.rpc.GetAllTicketsResponse result = new de.uniba.rz.io.rpc.GetAllTicketsResponse(this);
      int from_bitField0_ = bitField0_;
      if (listOfTicketsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          listOfTickets_ = java.util.Collections.unmodifiableList(listOfTickets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.listOfTickets_ = listOfTickets_;
      } else {
        result.listOfTickets_ = listOfTicketsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.uniba.rz.io.rpc.GetAllTicketsResponse) {
        return mergeFrom((de.uniba.rz.io.rpc.GetAllTicketsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.uniba.rz.io.rpc.GetAllTicketsResponse other) {
      if (other == de.uniba.rz.io.rpc.GetAllTicketsResponse.getDefaultInstance()) return this;
      if (listOfTicketsBuilder_ == null) {
        if (!other.listOfTickets_.isEmpty()) {
          if (listOfTickets_.isEmpty()) {
            listOfTickets_ = other.listOfTickets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureListOfTicketsIsMutable();
            listOfTickets_.addAll(other.listOfTickets_);
          }
          onChanged();
        }
      } else {
        if (!other.listOfTickets_.isEmpty()) {
          if (listOfTicketsBuilder_.isEmpty()) {
            listOfTicketsBuilder_.dispose();
            listOfTicketsBuilder_ = null;
            listOfTickets_ = other.listOfTickets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            listOfTicketsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListOfTicketsFieldBuilder() : null;
          } else {
            listOfTicketsBuilder_.addAllMessages(other.listOfTickets_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      de.uniba.rz.io.rpc.GetAllTicketsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.uniba.rz.io.rpc.GetAllTicketsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<de.uniba.rz.io.rpc.Ticket> listOfTickets_ =
      java.util.Collections.emptyList();
    private void ensureListOfTicketsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        listOfTickets_ = new java.util.ArrayList<de.uniba.rz.io.rpc.Ticket>(listOfTickets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        de.uniba.rz.io.rpc.Ticket, de.uniba.rz.io.rpc.Ticket.Builder, de.uniba.rz.io.rpc.TicketOrBuilder> listOfTicketsBuilder_;

    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public java.util.List<de.uniba.rz.io.rpc.Ticket> getListOfTicketsList() {
      if (listOfTicketsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(listOfTickets_);
      } else {
        return listOfTicketsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public int getListOfTicketsCount() {
      if (listOfTicketsBuilder_ == null) {
        return listOfTickets_.size();
      } else {
        return listOfTicketsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public de.uniba.rz.io.rpc.Ticket getListOfTickets(int index) {
      if (listOfTicketsBuilder_ == null) {
        return listOfTickets_.get(index);
      } else {
        return listOfTicketsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder setListOfTickets(
        int index, de.uniba.rz.io.rpc.Ticket value) {
      if (listOfTicketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListOfTicketsIsMutable();
        listOfTickets_.set(index, value);
        onChanged();
      } else {
        listOfTicketsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder setListOfTickets(
        int index, de.uniba.rz.io.rpc.Ticket.Builder builderForValue) {
      if (listOfTicketsBuilder_ == null) {
        ensureListOfTicketsIsMutable();
        listOfTickets_.set(index, builderForValue.build());
        onChanged();
      } else {
        listOfTicketsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder addListOfTickets(de.uniba.rz.io.rpc.Ticket value) {
      if (listOfTicketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListOfTicketsIsMutable();
        listOfTickets_.add(value);
        onChanged();
      } else {
        listOfTicketsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder addListOfTickets(
        int index, de.uniba.rz.io.rpc.Ticket value) {
      if (listOfTicketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListOfTicketsIsMutable();
        listOfTickets_.add(index, value);
        onChanged();
      } else {
        listOfTicketsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder addListOfTickets(
        de.uniba.rz.io.rpc.Ticket.Builder builderForValue) {
      if (listOfTicketsBuilder_ == null) {
        ensureListOfTicketsIsMutable();
        listOfTickets_.add(builderForValue.build());
        onChanged();
      } else {
        listOfTicketsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder addListOfTickets(
        int index, de.uniba.rz.io.rpc.Ticket.Builder builderForValue) {
      if (listOfTicketsBuilder_ == null) {
        ensureListOfTicketsIsMutable();
        listOfTickets_.add(index, builderForValue.build());
        onChanged();
      } else {
        listOfTicketsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder addAllListOfTickets(
        java.lang.Iterable<? extends de.uniba.rz.io.rpc.Ticket> values) {
      if (listOfTicketsBuilder_ == null) {
        ensureListOfTicketsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, listOfTickets_);
        onChanged();
      } else {
        listOfTicketsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder clearListOfTickets() {
      if (listOfTicketsBuilder_ == null) {
        listOfTickets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listOfTicketsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public Builder removeListOfTickets(int index) {
      if (listOfTicketsBuilder_ == null) {
        ensureListOfTicketsIsMutable();
        listOfTickets_.remove(index);
        onChanged();
      } else {
        listOfTicketsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public de.uniba.rz.io.rpc.Ticket.Builder getListOfTicketsBuilder(
        int index) {
      return getListOfTicketsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public de.uniba.rz.io.rpc.TicketOrBuilder getListOfTicketsOrBuilder(
        int index) {
      if (listOfTicketsBuilder_ == null) {
        return listOfTickets_.get(index);  } else {
        return listOfTicketsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public java.util.List<? extends de.uniba.rz.io.rpc.TicketOrBuilder> 
         getListOfTicketsOrBuilderList() {
      if (listOfTicketsBuilder_ != null) {
        return listOfTicketsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(listOfTickets_);
      }
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public de.uniba.rz.io.rpc.Ticket.Builder addListOfTicketsBuilder() {
      return getListOfTicketsFieldBuilder().addBuilder(
          de.uniba.rz.io.rpc.Ticket.getDefaultInstance());
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public de.uniba.rz.io.rpc.Ticket.Builder addListOfTicketsBuilder(
        int index) {
      return getListOfTicketsFieldBuilder().addBuilder(
          index, de.uniba.rz.io.rpc.Ticket.getDefaultInstance());
    }
    /**
     * <code>repeated .Ticket listOfTickets = 1;</code>
     */
    public java.util.List<de.uniba.rz.io.rpc.Ticket.Builder> 
         getListOfTicketsBuilderList() {
      return getListOfTicketsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        de.uniba.rz.io.rpc.Ticket, de.uniba.rz.io.rpc.Ticket.Builder, de.uniba.rz.io.rpc.TicketOrBuilder> 
        getListOfTicketsFieldBuilder() {
      if (listOfTicketsBuilder_ == null) {
        listOfTicketsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            de.uniba.rz.io.rpc.Ticket, de.uniba.rz.io.rpc.Ticket.Builder, de.uniba.rz.io.rpc.TicketOrBuilder>(
                listOfTickets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        listOfTickets_ = null;
      }
      return listOfTicketsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetAllTicketsResponse)
  }

  // @@protoc_insertion_point(class_scope:GetAllTicketsResponse)
  private static final de.uniba.rz.io.rpc.GetAllTicketsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.uniba.rz.io.rpc.GetAllTicketsResponse();
  }

  public static de.uniba.rz.io.rpc.GetAllTicketsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllTicketsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllTicketsResponse>() {
    @java.lang.Override
    public GetAllTicketsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAllTicketsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllTicketsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllTicketsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public de.uniba.rz.io.rpc.GetAllTicketsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
