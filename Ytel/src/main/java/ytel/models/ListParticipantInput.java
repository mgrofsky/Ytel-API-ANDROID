/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListParticipantInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4863305720306016641L;
    private String conferenceSid;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private Boolean muted;
    private Boolean deaf;
    /** GETTER
     * The unique identifier for a conference.
     */
    @JsonGetter("ConferenceSid")
    public String getConferenceSid ( ) { 
        return this.conferenceSid;
    }
    
    /** SETTER
     * The unique identifier for a conference.
     */
    @JsonSetter("ConferenceSid")
    public void setConferenceSid (String value) { 
        this.conferenceSid = value;
        notifyObservers(this.conferenceSid);
    }
 
    /** GETTER
     * Response format, xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response format, xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
        notifyObservers(this.page);
    }
 
    /** GETTER
     * The count of objects to return per page.
     */
    @JsonGetter("Pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * The count of objects to return per page.
     */
    @JsonSetter("Pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
    /** GETTER
     * Specifies if participant should be muted.
     */
    @JsonGetter("Muted")
    public Boolean getMuted ( ) { 
        return this.muted;
    }
    
    /** SETTER
     * Specifies if participant should be muted.
     */
    @JsonSetter("Muted")
    public void setMuted (Boolean value) { 
        this.muted = value;
        notifyObservers(this.muted);
    }
 
    /** GETTER
     * Specifies if the participant should hear audio in the conference.
     */
    @JsonGetter("Deaf")
    public Boolean getDeaf ( ) { 
        return this.deaf;
    }
    
    /** SETTER
     * Specifies if the participant should hear audio in the conference.
     */
    @JsonSetter("Deaf")
    public void setDeaf (Boolean value) { 
        this.deaf = value;
        notifyObservers(this.deaf);
    }
 
}
 