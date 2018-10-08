package com.personal.jsonplacholder.framework.testconfig.object;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public class GenericServer {
  public GenericServer() {}

  @SerializedName("protocol")
  private String protocol;

  @SerializedName("host")
  private String host;

  @SerializedName("ports")
  private int[] ports;

  public String getHost() {
    return this.host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public int[] getPorts() {
    return this.ports;
  }

  public void setPorts(int[] ports) {
    this.ports = ports;
  }

  public String getProtocol() {
    return this.protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  @Override
  public String toString() {
    final StringBuilder genericHostDetails = new StringBuilder();
    genericHostDetails.append("protocol -");
    genericHostDetails.append(this.getProtocol());
    genericHostDetails.append("host - ");
    genericHostDetails.append(this.getHost());
    genericHostDetails.append(" ports - ");
    genericHostDetails.append(Arrays.toString(this.ports));
    return genericHostDetails.toString();
  }
}
