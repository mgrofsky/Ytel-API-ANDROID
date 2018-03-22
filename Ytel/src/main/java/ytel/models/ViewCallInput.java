/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewCallInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5609583688407071171L;
    private String callsid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for the voice call.
     */
    @JsonGetter("callsid")
    public String getCallsid ( ) { 
        return this.callsid;
    }
    
    /** SETTER
     * The unique identifier for the voice call.
     */
    @JsonSetter("callsid")
    public void setCallsid (String value) { 
        this.callsid = value;
        notifyObservers(this.callsid);
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
 