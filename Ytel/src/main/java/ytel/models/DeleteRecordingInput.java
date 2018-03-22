/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteRecordingInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5430301050920805193L;
    private String recordingsid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a recording.
     */
    @JsonGetter("recordingsid")
    public String getRecordingsid ( ) { 
        return this.recordingsid;
    }
    
    /** SETTER
     * The unique identifier for a recording.
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
 