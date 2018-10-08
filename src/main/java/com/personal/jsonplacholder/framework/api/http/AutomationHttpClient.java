package com.personal.jsonplacholder.framework.api.http;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutomationHttpClient {

  private static final Logger LOG = LoggerFactory.getLogger(AutomationHttpClient.class);

  public final synchronized Response postRequest(String url) {
    LOG.info("end point to be be executed : {}", url);
    return given().when().post(url);
  }

  public final synchronized Response getRequest(final String uri, final ContentType contentType) {
    LOG.info("end point to be executed : {}", uri);
    RestAssured.baseURI = uri;
    return RestAssured.given().contentType(contentType).when().get();
  }

  public final synchronized Response getRequestWithQueryParams(
      String baseUri, final Map<String, String> params, final ContentType contentType) {
    LOG.info("end point to be executed : {}, with request params : {}", baseUri, params);
    RestAssured.baseURI = baseUri;
    return RestAssured.given().queryParams(params).contentType(contentType).when().get();
  }
}
