/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewSMSInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4965887677239069561L;
    private String messageSid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a sms message.
     */
    @JsonGetter("MessageSid")
    public String getMessageSid ( ) { 
        return this.messageSid;
    }
    
    /** SETTER
     * The unique identifier for a sms message.
     */
    @JsonSetter("MessageSid")
    public void setMessageSid (String value) { 
        this.messageSid = value;
        notifyObservers(this.messageSid);
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
 