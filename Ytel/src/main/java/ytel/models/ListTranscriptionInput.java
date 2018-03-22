/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListTranscriptionInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4980109241225092452L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private StatusEnum status;
    private String dateTranscribed;
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
     * The state of the transcription.
     */
    @JsonGetter("status")
    public StatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The state of the transcription.
     */
    @JsonSetter("status")
    public void setStatus (StatusEnum value) { 
        this.status = value;
        notifyObservers(this.status);
    }
 
    /** GETTER
     * The date the transcription took place.
     */
    @JsonGetter("dateTranscribed")
    public String getDateTranscribed ( ) { 
        return this.dateTranscribed;
    }
    
    /** SETTER
     * The date the transcription took place.
     */
    @JsonSetter("dateTranscribed")
    public void setDateTranscribed (String value) { 
        this.dateTranscribed = value;
        notifyObservers(this.dateTranscribed);
    }
 
}
 