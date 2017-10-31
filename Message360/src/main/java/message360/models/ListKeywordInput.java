/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListKeywordInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4808428027402364639L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pageSize = 10;
    private String keyword;
    private Integer shortcode;
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
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
        notifyObservers(this.page);
    }
 
    /** GETTER
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
        notifyObservers(this.pageSize);
    }
 
    /** GETTER
     * Only list keywords of keyword
     */
    @JsonGetter("Keyword")
    public String getKeyword ( ) { 
        return this.keyword;
    }
    
    /** SETTER
     * Only list keywords of keyword
     */
    @JsonSetter("Keyword")
    public void setKeyword (String value) { 
        this.keyword = value;
        notifyObservers(this.keyword);
    }
 
    /** GETTER
     * Only list keywords of shortcode
     */
    @JsonGetter("Shortcode")
    public Integer getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list keywords of shortcode
     */
    @JsonSetter("Shortcode")
    public void setShortcode (Integer value) { 
        this.shortcode = value;
        notifyObservers(this.shortcode);
    }
 
}
 