/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListAddressInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5196155149106546908L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String addressid;
    private String dateCreated;
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
 
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
        notifyObservers(this.page);
    }
 
    /** GETTER
     * How many results to return, default is 10, max is 100, must be an integer
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * How many results to return, default is 10, max is 100, must be an integer
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
    /** GETTER
     * addresses Sid
     */
    @JsonGetter("addressid")
    public String getAddressid ( ) { 
        return this.addressid;
    }
    
    /** SETTER
     * addresses Sid
     */
    @JsonSetter("addressid")
    public void setAddressid (String value) { 
        this.addressid = value;
        notifyObservers(this.addressid);
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
 
}
 