/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ErrorModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5198987609268465458L;
    private String code;
    private String message;
    private List<String> moreInfo;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Code")
    public void setCode (String value) { 
        this.code = value;
        notifyObservers(this.code);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message")
    public void setMessage (String value) { 
        this.message = value;
        notifyObservers(this.message);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MoreInfo")
    public List<String> getMoreInfo ( ) { 
        return this.moreInfo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MoreInfo")
    public void setMoreInfo (List<String> value) { 
        this.moreInfo = value;
        notifyObservers(this.moreInfo);
    }
 
}
 