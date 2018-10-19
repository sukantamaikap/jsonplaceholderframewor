package com.personal.jsonplacholder.framework.factory;

import com.personal.jsonplacholder.framework.base.BaseFacotry;
import com.personal.jsonplacholder.framework.helper.JsonPlaceHolderHelper;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonPlaceHolderHelperFactory extends BaseFacotry {
  private static final Logger LOG = LoggerFactory.getLogger(JsonPlaceHolderHelperFactory.class);

  private JsonPlaceHolderHelper placeHolderHelper;

  public JsonPlaceHolderHelperFactory() throws URISyntaxException {
    this.placeHolderHelper = new JsonPlaceHolderHelper();
  }

  @Override
  public void doHealthCheck() throws Exception {}

  public JsonPlaceHolderHelper getPlaceHolderHelper() {
    return this.placeHolderHelper;
  }
}
