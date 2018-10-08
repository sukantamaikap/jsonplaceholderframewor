package com.personal.jsonplacholder.framework.testconfig.object;

import com.google.gson.annotations.SerializedName;

/**
 * Represents all TestConfig.json. Please note any of the members may be null. The client should do
 * a null check.
 */
public class GenericTestConfig {
  @SerializedName("instance")
  private String testInstance;

  public GenericTestConfig() {}

  public String getTestInstance() {
    return testInstance;
  }

  public void setTestInstance(final String testInstance) {
    this.testInstance = testInstance;
  }
}
