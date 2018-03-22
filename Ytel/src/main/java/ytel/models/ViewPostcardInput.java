/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewPostcardInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4927815820387926775L;
    private String postcardid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a postcard object.
     */
    @JsonGetter("postcardid")
    public String getPostcardid ( ) { 
        return this.postcardid;
    }
    
    /** SETTER
     * The unique identifier for a postcard object.
     */
    @JsonSetter("postcardid")
    public void setPostcardid (String value) { 
        this.postcardid = value;
        notifyObservers(this.postcardid);
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
 