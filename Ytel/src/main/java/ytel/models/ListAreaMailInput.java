/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListAreaMailInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4937238653786047910L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String areamailsid;
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
     * The count of objects to return per page.
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * The count of objects to return per page.
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
    /** GETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonGetter("areamailsid")
    public String getAreamailsid ( ) { 
        return this.areamailsid;
    }
    
    /** SETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonSetter("areamailsid")
    public void setAreamailsid (String value) { 
        this.areamailsid = value;
        notifyObservers(this.areamailsid);
    }
 
    /** GETTER
     * The date the AreaMail was created.
     */
    @JsonGetter("dateCreated")
    public String getDateCreated ( ) { 
        return this.dateCreated;
    }
    
    /** SETTER
     * The date the AreaMail was created.
     */
    @JsonSetter("dateCreated")
    public void setDateCreated (String value) { 
        this.dateCreated = value;
        notifyObservers(this.dateCreated);
    }
 
}
 