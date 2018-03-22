/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PlayConferenceAudioInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5074553376902758213L;
    private String conferenceSid;
    private String participantSid;
    private AudioFormatEnum audioUrl;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a conference object.
     */
    @JsonGetter("ConferenceSid")
    public String getConferenceSid ( ) { 
        return this.conferenceSid;
    }
    
    /** SETTER
     * The unique identifier for a conference object.
     */
    @JsonSetter("ConferenceSid")
    public void setConferenceSid (String value) { 
        this.conferenceSid = value;
        notifyObservers(this.conferenceSid);
    }
 
    /** GETTER
     * The unique identifier for a participant object.
     */
    @JsonGetter("ParticipantSid")
    public String getParticipantSid ( ) { 
        return this.participantSid;
    }
    
    /** SETTER
     * The unique identifier for a participant object.
     */
    @JsonSetter("ParticipantSid")
    public void setParticipantSid (String value) { 
        this.participantSid = value;
        notifyObservers(this.participantSid);
    }
 
    /** GETTER
     * The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
     */
    @JsonGetter("AudioUrl")
    public AudioFormatEnum getAudioUrl ( ) { 
        return this.audioUrl;
    }
    
    /** SETTER
     * The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
     */
    @JsonSetter("AudioUrl")
    public void setAudioUrl (AudioFormatEnum value) { 
        this.audioUrl = value;
        notifyObservers(this.audioUrl);
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
 