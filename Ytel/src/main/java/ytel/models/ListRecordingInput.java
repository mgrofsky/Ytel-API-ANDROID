/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListRecordingInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5551294019177343455L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String datecreated;
    private String callsid;
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
     * Filter results by creation date
     */
    @JsonGetter("Datecreated")
    public String getDatecreated ( ) { 
        return this.datecreated;
    }
    
    /** SETTER
     * Filter results by creation date
     */
    @JsonSetter("Datecreated")
    public void setDatecreated (String value) { 
        this.datecreated = value;
        notifyObservers(this.datecreated);
    }
 
    /** GETTER
     * The unique identifier for a call.
     */
    @JsonGetter("callsid")
    public String getCallsid ( ) { 
        return this.callsid;
    }
    
    /** SETTER
     * The unique identifier for a call.
     */
    @JsonSetter("callsid")
    public void setCallsid (String value) { 
        this.callsid = value;
        notifyObservers(this.callsid);
    }
 
}
 