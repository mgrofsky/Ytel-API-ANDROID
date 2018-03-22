/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddUnsubscribesInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4888134771706257458L;
    private String email;
    private String responseType = "json";
    /** GETTER
     * A valid email address that is to be added to the unsubscribe list
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * A valid email address that is to be added to the unsubscribe list
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
        notifyObservers(this.email);
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
 