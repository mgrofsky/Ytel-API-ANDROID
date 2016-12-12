/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListAddressInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5749065949160683032L;
    private Integer page = 1;
    private Integer pageSize = 10;
    private String addressId;
    private String dateCreated;
    private String responseType = "json";
    /** GETTER
     * Return requested # of items starting the value, default=0, must be an integer
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Return requested # of items starting the value, default=0, must be an integer
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
        notifyObservers(this.page);
    }
 
    /** GETTER
     * How many results to return, default=10, max 100, must be an integer
     */
    @JsonGetter("pageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * How many results to return, default=10, max 100, must be an integer
     */
    @JsonSetter("pageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
        notifyObservers(this.pageSize);
    }
 
    /** GETTER
     * addresses Sid
     */
    @JsonGetter("addressId")
    public String getAddressId ( ) { 
        return this.addressId;
    }
    
    /** SETTER
     * addresses Sid
     */
    @JsonSetter("addressId")
    public void setAddressId (String value) { 
        this.addressId = value;
        notifyObservers(this.addressId);
    }
 
    /** GETTER
     * date created address.
     */
    @JsonGetter("dateCreated")
    public String getDateCreated ( ) { 
        return this.dateCreated;
    }
    
    /** SETTER
     * date created address.
     */
    @JsonSetter("dateCreated")
    public void setDateCreated (String value) { 
        this.dateCreated = value;
        notifyObservers(this.dateCreated);
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
 