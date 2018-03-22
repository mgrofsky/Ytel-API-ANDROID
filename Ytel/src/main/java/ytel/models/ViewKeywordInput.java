/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewKeywordInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5192237139127348574L;
    private String keywordid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier of each keyword
     */
    @JsonGetter("Keywordid")
    public String getKeywordid ( ) { 
        return this.keywordid;
    }
    
    /** SETTER
     * The unique identifier of each keyword
     */
    @JsonSetter("Keywordid")
    public void setKeywordid (String value) { 
        this.keywordid = value;
        notifyObservers(this.keywordid);
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
 