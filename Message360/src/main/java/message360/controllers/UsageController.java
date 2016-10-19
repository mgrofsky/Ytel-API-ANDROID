/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 10/18/2016
 */
package message360.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import message360.*;
import message360.models.*;
import message360.exceptions.*;
import message360.http.client.HttpClient;
import message360.http.client.HttpContext;
import message360.http.request.HttpRequest;
import message360.http.response.HttpResponse;
import message360.http.response.HttpStringResponse;
import message360.http.client.APICallBack;

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
     * Get all usage 
     * @param    productCode    Required parameter: Product Code
     * @param    startDate    Required parameter: Start Usage Date
     * @param    endDate    Required parameter: End Usage Date
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListUsageAsync(
                final String productCode,
                final String startDate,
                final String endDate,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == productCode)
            throw new NullPointerException("The parameter \"productCode\" is a required parameter and cannot be null.");

        if (null == startDate)
            throw new NullPointerException("The parameter \"startDate\" is a required parameter and cannot be null.");

        if (null == endDate)
            throw new NullPointerException("The parameter \"endDate\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/usage/listusage.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5640615505228182183L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4689757659570931844L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4886569448045010292L;
            {
                    put( "ProductCode", productCode );
                    put( "startDate", startDate );
                    put( "endDate", endDate );
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