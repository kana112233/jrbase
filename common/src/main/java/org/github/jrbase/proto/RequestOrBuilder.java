// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package org.github.jrbase.proto;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 cmd = 1;</code>
   * @return The cmd.
   */
  int getCmd();

  /**
   * <code>string key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string valueStr = 3;</code>
   * @return The valueStr.
   */
  java.lang.String getValueStr();
  /**
   * <code>string valueStr = 3;</code>
   * @return The bytes for valueStr.
   */
  com.google.protobuf.ByteString
      getValueStrBytes();

  /**
   * <code>int32 valueInt = 4;</code>
   * @return The valueInt.
   */
  int getValueInt();

  /**
   * <code>.ListStr listStr = 5;</code>
   * @return Whether the listStr field is set.
   */
  boolean hasListStr();
  /**
   * <code>.ListStr listStr = 5;</code>
   * @return The listStr.
   */
  org.github.jrbase.proto.ListStr getListStr();
  /**
   * <code>.ListStr listStr = 5;</code>
   */
  org.github.jrbase.proto.ListStrOrBuilder getListStrOrBuilder();

  public org.github.jrbase.proto.Request.ValuesCase getValuesCase();
}