package com.personal.jsonplacholder.framework.base;

import com.personal.jsonplacholder.framework.testconfig.parser.TestConfigParser;

public class Core {
  private TestConfigParser testConfigParser;

  public Core() {
    this.testConfigParser = TestConfigParser.getInstance();
  }

  protected TestConfigParser getTestConfigParser() {
    return this.testConfigParser;
  }
}
