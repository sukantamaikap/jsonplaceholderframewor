package com.personal.jsonplacholder.framework.constants;

/** This class represents all the services constants. */
public final class ServiceConstants {
  private ServiceConstants() {
  }

  public static final class RestResources {
    private RestResources() {
    }

    public static final String POSTS = "/posts";
    public static final String POST_ID = "/posts/%s";
    public static final String COMMENTS = "/comments";
    public static final String COMMENT_ID = "/comment/%s";
  }
}
