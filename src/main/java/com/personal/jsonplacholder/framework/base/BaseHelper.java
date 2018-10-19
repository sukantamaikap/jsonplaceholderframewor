package com.personal.jsonplacholder.framework.base;

import com.personal.jsonplacholder.framework.api.http.AutomationHttpClient;
import java.net.URISyntaxException;
import org.apache.http.client.utils.URIBuilder;

public abstract class BaseHelper extends Core {
  private AutomationHttpClient automationHttpClient;

  public BaseHelper() {
    this.automationHttpClient = new AutomationHttpClient();
  }

  public AutomationHttpClient getAutomationHttpClient() {
    return this.automationHttpClient;
  }

  /**
   * This method should be implemented by all helpers to 1. check if TestConfig consists of the
   * required service and call it from constructor.
   */
  protected abstract void isServicePresent();

  protected String buildBaseURI(String protocol, String host, final int port)
      throws URISyntaxException {
    return new URIBuilder().setScheme(protocol).setHost(host).setPort(port).build().toString();
  }
}
