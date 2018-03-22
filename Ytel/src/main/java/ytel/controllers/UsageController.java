/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import ytel.*;
import ytel.models.*;
import ytel.exceptions.*;
import ytel.http.client.HttpClient;
import ytel.http.client.HttpContext;
import ytel.http.request.HttpRequest;
import ytel.http.response.HttpResponse;
import ytel.http.response.HttpStringResponse;
import ytel.http.client.APICallBack;

public class UsageController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static UsageController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the UsageController class 
     */
    public static UsageController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new UsageController();
            }
        }
        return instance;
    }

    /**
     * Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
     * @param    ListUsageInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listUsageAsync(
                final ListUsageInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/usage/listusage.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4866859213941250985L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5129468298963442885L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5393975613236243774L;
            {
                    put( "ProductCode", (input.getProductCode() != null) ? input.getProductCode().value() : 0 );
                    put( "startDate", input.getStartDate() );
                    put( "endDate", input.getEndDate() );
                    put( "IncludeSubAccounts", input.getIncludeSubAccounts() );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}