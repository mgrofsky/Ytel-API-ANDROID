/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewShortCodeInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4617544004528576894L;
    private String messagesid;
    private String responseType = "json";
    /** GETTER
     * Message sid
     */
    @JsonGetter("messagesid")
    public String getMessagesid ( ) { 
        return this.messagesid;
    }
    
    /** SETTER
     * Message sid
     */
    @JsonSetter("messagesid")
    public void setMessagesid (String value) { 
        this.messagesid = value;
        notifyObservers(this.messagesid);
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
 