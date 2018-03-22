/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListInboundShortcodeInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5037630770395803532L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String from;
    private String shortcode;
    private String datecreated;
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
     * Only list SMS messages sent from this number
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * Only list SMS messages sent from this number
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * Only list SMS messages sent to Shortcode
     */
    @JsonGetter("Shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list SMS messages sent to Shortcode
     */
    @JsonSetter("Shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
        notifyObservers(this.shortcode);
    }
 
    /** GETTER
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    @JsonGetter("Datecreated")
    public String getDatecreated ( ) { 
        return this.datecreated;
    }
    
    /** SETTER
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    @JsonSetter("Datecreated")
    public void setDatecreated (String value) { 
        this.datecreated = value;
        notifyObservers(this.datecreated);
    }
 
}
 