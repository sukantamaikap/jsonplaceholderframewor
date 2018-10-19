package com.personal.jsonplacholder.base;

import com.personal.jsonplacholder.framework.factory.JsonPlaceHolderHelperFactory;
import com.personal.jsonplacholder.framework.testconfig.parser.TestConfigParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends AbstractTest {

  private static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);
  private JsonPlaceHolderHelperFactory jsonPlaceHolderHelperFactory;

  @BeforeSuite(alwaysRun = true)
  @Override
  protected void performHealthCheck() throws Exception {
    String instanceName = TestConfigParser.getInstance().getCompleteTestConfiguration().getTitle();
    LOG.info("RUNNING TEST ON {} INSTANCE", instanceName);

    LOG.info("DOING HEALTH CHECK FOR ALL RE-TARGETING COMPONENTS");
    this.jsonPlaceHolderHelperFactory.doHealthCheck();
  }
}
