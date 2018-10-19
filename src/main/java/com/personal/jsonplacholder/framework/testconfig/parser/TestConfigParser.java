package com.personal.jsonplacholder.framework.testconfig.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.personal.jsonplacholder.framework.testconfig.object.GenericTestConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class TestConfigParser {
  private static final Logger LOG = LoggerFactory.getLogger(TestConfigParser.class);
  private static final String TEST_CONFIG_FILE = "TestConfig.json";

  private String testDir;
  private static TestConfigParser testConfigParser;
  private GenericTestConfig currentTestConfig;

  private TestConfigParser() throws IOException {
    this.testDir = System.getProperty("user.dir");
    final InputStream testConfigFile =
        new FileInputStream(this.testDir + File.separator + TEST_CONFIG_FILE);

    try (final Reader reader =
        new InputStreamReader(testConfigFile, StandardCharsets.UTF_8.displayName())) {
      final Gson gson = new GsonBuilder().create();
      this.currentTestConfig = gson.fromJson(reader, GenericTestConfig.class);
      LOG.info("TestConfig found : " + this.currentTestConfig.toString());
    }
  }

  public static synchronized TestConfigParser getInstance() {
    if (testConfigParser == null) {
      try {
        testConfigParser = new TestConfigParser();
      } catch (final IOException exception) {
        Assert.fail("TestConfig.json not found : " + exception.getStackTrace());
      }
    }

    return testConfigParser;
  }

  /**
   * Get the complete test configuration as {@link GenericTestConfig} object ToDo : Wrap {@link
   * GenericTestConfig} in a read-only object. So that, clients may not be able to modify it at
   * runtime.
   *
   * @return {@link GenericTestConfig}
   */
  public GenericTestConfig getCompleteTestConfiguration() {
    return this.currentTestConfig;
  }
}
