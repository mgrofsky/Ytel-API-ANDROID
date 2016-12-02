/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/02/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewCallInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4704650712964382842L;
    private String callsid;
    private String responseType = "json";
    /** GETTER
     * Call Sid id for particular Call
     */
    @JsonGetter("callsid")
    public String getCallsid ( ) { 
        return this.callsid;
    }
    
    /** SETTER
     * Call Sid id for particular Call
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
 