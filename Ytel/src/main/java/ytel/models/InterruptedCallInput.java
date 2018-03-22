/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class InterruptedCallInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4812402416514268791L;
    private String callSid;
    private String responseType = "json";
    private String url;
    private HttpActionEnum method;
    private InterruptedCallStatusEnum status;
    /** GETTER
     * The unique identifier for voice call that is in progress.
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * The unique identifier for voice call that is in progress.
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
        notifyObservers(this.callSid);
    }
 
    /** GETTER
     * Response type format xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
    /** GETTER
     * URL the in-progress call will be redirected to
     */
    @JsonGetter("Url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * URL the in-progress call will be redirected to
     */
    @JsonSetter("Url")
    public void setUrl (String value) { 
        this.url = value;
        notifyObservers(this.url);
    }
 
    /** GETTER
     * The method used to request the above Url parameter
     */
    @JsonGetter("Method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * The method used to request the above Url parameter
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * Status to set the in-progress call to
     */
    @JsonGetter("Status")
    public InterruptedCallStatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status to set the in-progress call to
     */
    @JsonSetter("Status")
    public void setStatus (InterruptedCallStatusEnum value) { 
        this.status = value;
        notifyObservers(this.status);
    }
 
}
 