package com.personal.jsonplacholder.tests;

import com.personal.jsonplacholder.base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Tests all functionality of comments for jsonplaceholder
 */
public class CommentTests extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(CommentTests.class);

    @Test
    public void testCreateComments() {
        LOG.info("CREATE COMMENT");

        LOG.info("VALIDATE COMMENT IS PERSISTED");
    }

}
