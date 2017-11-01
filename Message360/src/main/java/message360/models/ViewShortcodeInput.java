/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewShortcodeInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4656491340799419462L;
    private String messageSid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for the sms resource
     */
    @JsonGetter("MessageSid")
    public String getMessageSid ( ) { 
        return this.messageSid;
    }
    
    /** SETTER
     * The unique identifier for the sms resource
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
 