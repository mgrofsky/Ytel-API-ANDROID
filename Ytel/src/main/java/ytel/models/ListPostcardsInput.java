/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListPostcardsInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4989574017949196146L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String postcardid;
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
     * The date the postcard was created.
     */
    @JsonGetter("dateCreated")
    public String getDateCreated ( ) { 
        return this.dateCreated;
    }
    
    /** SETTER
     * The date the postcard was created.
     */
    @JsonSetter("dateCreated")
    public void setDateCreated (String value) { 
        this.dateCreated = value;
        notifyObservers(this.dateCreated);
    }
 
}
 