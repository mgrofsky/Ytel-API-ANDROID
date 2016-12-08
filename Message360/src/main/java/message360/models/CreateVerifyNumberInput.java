/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateVerifyNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5498336286243553291L;
    private String phonenumber;
    private String type;
    private String responseType = "json";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("phonenumber")
    public String getPhonenumber ( ) { 
        return this.phonenumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("phonenumber")
    public void setPhonenumber (String value) { 
        this.phonenumber = value;
        notifyObservers(this.phonenumber);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
        notifyObservers(this.type);
    }
 
    /** GETTER
     * Response Type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 