package com.personal.jsonplacholder.base;

import org.testng.annotations.BeforeSuite;

public abstract class AbstractTest {
  @BeforeSuite(alwaysRun = true)
  protected abstract void performHealthCheck() throws Exception;
}
