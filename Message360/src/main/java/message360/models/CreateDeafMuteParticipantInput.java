/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateDeafMuteParticipantInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5482702179688510050L;
    private String conferenceSid;
    private String participantSid;
    private Boolean muted;
    private Boolean deaf;
    private String responseType = "json";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("conferenceSid")
    public String getConferenceSid ( ) { 
        return this.conferenceSid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("conferenceSid")
    public void setConferenceSid (String value) { 
        this.conferenceSid = value;
        notifyObservers(this.conferenceSid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ParticipantSid")
    public String getParticipantSid ( ) { 
        return this.participantSid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ParticipantSid")
    public void setParticipantSid (String value) { 
        this.participantSid = value;
        notifyObservers(this.participantSid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Muted")
    public Boolean getMuted ( ) { 
        return this.muted;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Muted")
    public void setMuted (Boolean value) { 
        this.muted = value;
        notifyObservers(this.muted);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Deaf")
    public Boolean getDeaf ( ) { 
        return this.deaf;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Deaf")
    public void setDeaf (Boolean value) { 
        this.deaf = value;
        notifyObservers(this.deaf);
    }
 
    /** GETTER
     * Response Type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 