/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.controllers;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ytel.api.models.*;
import com.ytel.api.exceptions.*;
import com.ytel.api.APIHelper;
import com.ytel.api.Configuration;
import com.ytel.api.testing.TestHelper;
import com.ytel.api.controllers.EmailController;
import com.ytel.api.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EmailControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static EmailController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getEmail();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Retrieve a list of emails that have been blocked.
     * @throws Throwable
     */
    @Test
    public void testTestBlockedEmails() throws Throwable {
        // Parameters for the API call
        String offset = null;
        String limit = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createBlockedEmailsAsync(offset, limit, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Retrieve a list of emails that are on the spam list.
     * @throws Throwable
     */
    @Test
    public void testTestSpamEmails() throws Throwable {
        // Parameters for the API call
        String offset = null;
        String limit = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createSpamEmailsAsync(offset, limit, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Retrieve a list of emails that have bounced.
     * @throws Throwable
     */
    @Test
    public void testTestBouncedEmails() throws Throwable {
        // Parameters for the API call
        String offset = null;
        String limit = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createBouncedEmailsAsync(offset, limit, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Retrieve a list of invalid email addresses.
     * @throws Throwable
     */
    @Test
    public void testTestInvalidEmails() throws Throwable {
        // Parameters for the API call
        String offset = null;
        String limit = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createInvalidEmailsAsync(offset, limit, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Retrieve a list of email addresses from the unsubscribe list.
     * @throws Throwable
     */
    @Test
    public void testTestListUnsubscribedEmails() throws Throwable {
        // Parameters for the API call
        String offset = null;
        String limit = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createListUnsubscribedEmailsAsync(offset, limit, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
