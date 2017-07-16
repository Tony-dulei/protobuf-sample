// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.whg.protobuf;

public final class StudentProtoBuf {
  private StudentProtoBuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface StudentProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int64 id = 1;
    /**
     * <code>optional int64 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional int64 id = 1;</code>
     */
    long getId();

    // optional int32 age = 2;
    /**
     * <code>optional int32 age = 2;</code>
     */
    boolean hasAge();
    /**
     * <code>optional int32 age = 2;</code>
     */
    int getAge();

    // optional bool sex = 3;
    /**
     * <code>optional bool sex = 3;</code>
     */
    boolean hasSex();
    /**
     * <code>optional bool sex = 3;</code>
     */
    boolean getSex();

    // optional string name = 4;
    /**
     * <code>optional string name = 4;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 4;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 4;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code tutorial.StudentProto}
   */
  public static final class StudentProto extends
      com.google.protobuf.GeneratedMessage
      implements StudentProtoOrBuilder {
    // Use StudentProto.newBuilder() to construct.
    private StudentProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StudentProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StudentProto defaultInstance;
    public static StudentProto getDefaultInstance() {
      return defaultInstance;
    }

    public StudentProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StudentProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              age_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sex_ = input.readBool();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              name_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.whg.protobuf.StudentProtoBuf.internal_static_tutorial_StudentProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.whg.protobuf.StudentProtoBuf.internal_static_tutorial_StudentProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.whg.protobuf.StudentProtoBuf.StudentProto.class, com.whg.protobuf.StudentProtoBuf.StudentProto.Builder.class);
    }

    public static com.google.protobuf.Parser<StudentProto> PARSER =
        new com.google.protobuf.AbstractParser<StudentProto>() {
      public StudentProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StudentProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StudentProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>optional int64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    // optional int32 age = 2;
    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>optional int32 age = 2;</code>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 age = 2;</code>
     */
    public int getAge() {
      return age_;
    }

    // optional bool sex = 3;
    public static final int SEX_FIELD_NUMBER = 3;
    private boolean sex_;
    /**
     * <code>optional bool sex = 3;</code>
     */
    public boolean hasSex() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool sex = 3;</code>
     */
    public boolean getSex() {
      return sex_;
    }

    // optional string name = 4;
    public static final int NAME_FIELD_NUMBER = 4;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 4;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = 0L;
      age_ = 0;
      sex_ = false;
      name_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, sex_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, sex_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.whg.protobuf.StudentProtoBuf.StudentProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.whg.protobuf.StudentProtoBuf.StudentProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code tutorial.StudentProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.whg.protobuf.StudentProtoBuf.StudentProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.whg.protobuf.StudentProtoBuf.internal_static_tutorial_StudentProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.whg.protobuf.StudentProtoBuf.internal_static_tutorial_StudentProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.whg.protobuf.StudentProtoBuf.StudentProto.class, com.whg.protobuf.StudentProtoBuf.StudentProto.Builder.class);
      }

      // Construct using com.whg.protobuf.StudentProtoBuf.StudentProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        sex_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.whg.protobuf.StudentProtoBuf.internal_static_tutorial_StudentProto_descriptor;
      }

      public com.whg.protobuf.StudentProtoBuf.StudentProto getDefaultInstanceForType() {
        return com.whg.protobuf.StudentProtoBuf.StudentProto.getDefaultInstance();
      }

      public com.whg.protobuf.StudentProtoBuf.StudentProto build() {
        com.whg.protobuf.StudentProtoBuf.StudentProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.whg.protobuf.StudentProtoBuf.StudentProto buildPartial() {
        com.whg.protobuf.StudentProtoBuf.StudentProto result = new com.whg.protobuf.StudentProtoBuf.StudentProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.age_ = age_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sex_ = sex_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.whg.protobuf.StudentProtoBuf.StudentProto) {
          return mergeFrom((com.whg.protobuf.StudentProtoBuf.StudentProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.whg.protobuf.StudentProtoBuf.StudentProto other) {
        if (other == com.whg.protobuf.StudentProtoBuf.StudentProto.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        if (other.hasSex()) {
          setSex(other.getSex());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000008;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.whg.protobuf.StudentProtoBuf.StudentProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.whg.protobuf.StudentProtoBuf.StudentProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int64 id = 1;
      private long id_ ;
      /**
       * <code>optional int64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>optional int64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      // optional int32 age = 2;
      private int age_ ;
      /**
       * <code>optional int32 age = 2;</code>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000002;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        onChanged();
        return this;
      }

      // optional bool sex = 3;
      private boolean sex_ ;
      /**
       * <code>optional bool sex = 3;</code>
       */
      public boolean hasSex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool sex = 3;</code>
       */
      public boolean getSex() {
        return sex_;
      }
      /**
       * <code>optional bool sex = 3;</code>
       */
      public Builder setSex(boolean value) {
        bitField0_ |= 0x00000004;
        sex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool sex = 3;</code>
       */
      public Builder clearSex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sex_ = false;
        onChanged();
        return this;
      }

      // optional string name = 4;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 4;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:tutorial.StudentProto)
    }

    static {
      defaultInstance = new StudentProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:tutorial.StudentProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_StudentProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tutorial_StudentProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\022\010tutorial\"B\n\014StudentProt" +
      "o\022\n\n\002id\030\001 \001(\003\022\013\n\003age\030\002 \001(\005\022\013\n\003sex\030\003 \001(\010\022" +
      "\014\n\004name\030\004 \001(\tB#\n\020com.whg.protobufB\017Stude" +
      "ntProtoBuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_tutorial_StudentProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_tutorial_StudentProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_tutorial_StudentProto_descriptor,
              new java.lang.String[] { "Id", "Age", "Sex", "Name", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
