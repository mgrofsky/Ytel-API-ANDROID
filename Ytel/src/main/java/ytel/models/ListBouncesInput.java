/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListBouncesInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4648145296246544412L;
    private String responseType = "json";
    private String offset;
    private String limit;
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
     * The starting point of the list of bounced emails that should be returned.
     */
    @JsonGetter("Offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The starting point of the list of bounced emails that should be returned.
     */
    @JsonSetter("Offset")
    public void setOffset (String value) { 
        this.offset = value;
        notifyObservers(this.offset);
    }
 
    /** GETTER
     * The count of results that should be returned.
     */
    @JsonGetter("Limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The count of results that should be returned.
     */
    @JsonSetter("Limit")
    public void setLimit (String value) { 
        this.limit = value;
        notifyObservers(this.limit);
    }
 
}
 