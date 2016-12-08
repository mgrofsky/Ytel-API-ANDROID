/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateInterruptedCallInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4659271236437106456L;
    private String callSid;
    private String url;
    private HttpAction method;
    private InterruptedCallStatus status;
    private String responseType = "json";
    /** GETTER
     * Call SId
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * Call SId
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
        notifyObservers(this.callSid);
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
    public HttpAction getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * The method used to request the above Url parameter
     */
    @JsonSetter("Method")
    public void setMethod (HttpAction value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * Status to set the in-progress call to
     */
    @JsonGetter("Status")
    public InterruptedCallStatus getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status to set the in-progress call to
     */
    @JsonSetter("Status")
    public void setStatus (InterruptedCallStatus value) { 
        this.status = value;
        notifyObservers(this.status);
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
 
}
 