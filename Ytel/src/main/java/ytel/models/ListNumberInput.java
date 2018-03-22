/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4810295741576706140L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pageSize = 10;
    private NumberTypeEnum numberType;
    private String friendlyName;
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
     * Which page of the overall response will be returned. Page indexing starts at 1.
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Which page of the overall response will be returned. Page indexing starts at 1.
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
        notifyObservers(this.page);
    }
 
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
        notifyObservers(this.pageSize);
    }
 
    /** GETTER
     * The capability supported by the number.Number type either SMS,Voice or all
     */
    @JsonGetter("NumberType")
    public NumberTypeEnum getNumberType ( ) { 
        return this.numberType;
    }
    
    /** SETTER
     * The capability supported by the number.Number type either SMS,Voice or all
     */
    @JsonSetter("NumberType")
    public void setNumberType (NumberTypeEnum value) { 
        this.numberType = value;
        notifyObservers(this.numberType);
    }
 
    /** GETTER
     * A human-readable label added to the number object.
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * A human-readable label added to the number object.
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
        notifyObservers(this.friendlyName);
    }
 
}
 