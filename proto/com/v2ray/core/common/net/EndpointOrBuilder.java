// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/net/destination.proto

package com.v2ray.core.common.net;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.common.net.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .v2ray.core.common.net.Network network = 1;</code>
   */
  int getNetworkValue();
  /**
   * <code>optional .v2ray.core.common.net.Network network = 1;</code>
   */
  com.v2ray.core.common.net.Network getNetwork();

  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
   */
  boolean hasAddress();
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
   */
  com.v2ray.core.common.net.IPOrDomain getAddress();
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
   */
  com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder();

  /**
   * <code>optional uint32 port = 3;</code>
   */
  int getPort();
}
