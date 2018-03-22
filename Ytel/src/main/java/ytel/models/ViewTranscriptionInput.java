/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewTranscriptionInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4801590005359692278L;
    private String transcriptionsid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a transcription object.
     */
    @JsonGetter("transcriptionsid")
    public String getTranscriptionsid ( ) { 
        return this.transcriptionsid;
    }
    
    /** SETTER
     * The unique identifier for a transcription object.
     */
    @JsonSetter("transcriptionsid")
    public void setTranscriptionsid (String value) { 
        this.transcriptionsid = value;
        notifyObservers(this.transcriptionsid);
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
 