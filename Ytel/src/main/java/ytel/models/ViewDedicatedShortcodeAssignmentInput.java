/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewDedicatedShortcodeAssignmentInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4712639905833500842L;
    private String shortcode;
    private String responseType = "json";
    /** GETTER
     * List of valid Dedicated Short Code to your Ytel account
     */
    @JsonGetter("Shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * List of valid Dedicated Short Code to your Ytel account
     */
    @JsonSetter("Shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
        notifyObservers(this.shortcode);
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
 