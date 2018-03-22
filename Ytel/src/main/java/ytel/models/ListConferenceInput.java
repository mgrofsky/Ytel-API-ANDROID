/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListConferenceInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5584093582526156463L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String friendlyName;
    private String dateCreated;
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
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
    /** GETTER
     * Only return conferences with the specified FriendlyName
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * Only return conferences with the specified FriendlyName
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
        notifyObservers(this.friendlyName);
    }
 
    /** GETTER
     * Conference created date
     */
    @JsonGetter("DateCreated")
    public String getDateCreated ( ) { 
        return this.dateCreated;
    }
    
    /** SETTER
     * Conference created date
     */
    @JsonSetter("DateCreated")
    public void setDateCreated (String value) { 
        this.dateCreated = value;
        notifyObservers(this.dateCreated);
    }
 
}
 