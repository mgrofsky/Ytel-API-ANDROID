/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListInboundSMSInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5448440934203028019L;
    private Integer page;
    private String pagesize;
    private String from;
    private String to;
    private String responseType = "json";
    /** GETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Which page of the overall response will be returned. Zero indexed
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
    public String getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("pagesize")
    public void setPagesize (String value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
    /** GETTER
     * From Number to Inbound SMS
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * From Number to Inbound SMS
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * To Number to get Inbound SMS
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * To Number to get Inbound SMS
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
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
 
}
 