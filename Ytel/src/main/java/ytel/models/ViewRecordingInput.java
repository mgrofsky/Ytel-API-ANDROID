/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewRecordingInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4774329131830477395L;
    private String recordingsid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for the recording.
     */
    @JsonGetter("recordingsid")
    public String getRecordingsid ( ) { 
        return this.recordingsid;
    }
    
    /** SETTER
     * The unique identifier for the recording.
     */
    @JsonSetter("recordingsid")
    public void setRecordingsid (String value) { 
        this.recordingsid = value;
        notifyObservers(this.recordingsid);
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
 