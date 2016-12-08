/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewAddressInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4728991379803873706L;
    private String addressId;
    private String responseType = "json";
    /** GETTER
     * The identifier of the address to be retrieved.
     */
    @JsonGetter("addressId")
    public String getAddressId ( ) { 
        return this.addressId;
    }
    
    /** SETTER
     * The identifier of the address to be retrieved.
     */
    @JsonSetter("addressId")
    public void setAddressId (String value) { 
        this.addressId = value;
        notifyObservers(this.addressId);
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
 