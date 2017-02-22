/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewTranscriptionInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5303803299792430696L;
    private String transcriptionSid;
    private String responseType = "json";
    /** GETTER
     * Unique Transcription ID
     */
    @JsonGetter("TranscriptionSid")
    public String getTranscriptionSid ( ) { 
        return this.transcriptionSid;
    }
    
    /** SETTER
     * Unique Transcription ID
     */
    @JsonSetter("TranscriptionSid")
    public void setTranscriptionSid (String value) { 
        this.transcriptionSid = value;
        notifyObservers(this.transcriptionSid);
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
 