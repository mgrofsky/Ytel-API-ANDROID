/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewAddressInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4858723698445171295L;
    private String addressid;
    private String responseType = "json";
    /** GETTER
     * The identifier of the address to be retrieved.
     */
    @JsonGetter("addressid")
    public String getAddressid ( ) { 
        return this.addressid;
    }
    
    /** SETTER
     * The identifier of the address to be retrieved.
     */
    @JsonSetter("addressid")
    public void setAddressid (String value) { 
        this.addressid = value;
        notifyObservers(this.addressid);
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
 