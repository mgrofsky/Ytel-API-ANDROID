/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSubAccountInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4738092417531268586L;
    private String firstname;
    private String lastname;
    private String email;
    private String responseType = "json";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("firstname")
    public String getFirstname ( ) { 
        return this.firstname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("firstname")
    public void setFirstname (String value) { 
        this.firstname = value;
        notifyObservers(this.firstname);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("lastname")
    public String getLastname ( ) { 
        return this.lastname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lastname")
    public void setLastname (String value) { 
        this.lastname = value;
        notifyObservers(this.lastname);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
        notifyObservers(this.email);
    }
 
    /** GETTER
     * ResponseType Format either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * ResponseType Format either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 