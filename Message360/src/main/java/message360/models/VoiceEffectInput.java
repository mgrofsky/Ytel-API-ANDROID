/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VoiceEffectInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5248820299382979541L;
    private String callSid;
    private String responseType = "json";
    private AudioDirectionEnum audioDirection;
    private Double pitchSemiTones;
    private Double pitchOctaves;
    private Double pitch;
    private Double rate;
    private Double tempo;
    /** GETTER
     * The unique identifier for the in-progress voice call.
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * The unique identifier for the in-progress voice call.
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
        notifyObservers(this.callSid);
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
 
    /** GETTER
     * The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
     */
    @JsonGetter("AudioDirection")
    public AudioDirectionEnum getAudioDirection ( ) { 
        return this.audioDirection;
    }
    
    /** SETTER
     * The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
     */
    @JsonSetter("AudioDirection")
    public void setAudioDirection (AudioDirectionEnum value) { 
        this.audioDirection = value;
        notifyObservers(this.audioDirection);
    }
 
    /** GETTER
     * value between -14 and 14
     */
    @JsonGetter("PitchSemiTones")
    public Double getPitchSemiTones ( ) { 
        return this.pitchSemiTones;
    }
    
    /** SETTER
     * value between -14 and 14
     */
    @JsonSetter("PitchSemiTones")
    public void setPitchSemiTones (Double value) { 
        this.pitchSemiTones = value;
        notifyObservers(this.pitchSemiTones);
    }
 
    /** GETTER
     * value between -1 and 1
     */
    @JsonGetter("PitchOctaves")
    public Double getPitchOctaves ( ) { 
        return this.pitchOctaves;
    }
    
    /** SETTER
     * value between -1 and 1
     */
    @JsonSetter("PitchOctaves")
    public void setPitchOctaves (Double value) { 
        this.pitchOctaves = value;
        notifyObservers(this.pitchOctaves);
    }
 
    /** GETTER
     * value greater than 0
     */
    @JsonGetter("Pitch")
    public Double getPitch ( ) { 
        return this.pitch;
    }
    
    /** SETTER
     * value greater than 0
     */
    @JsonSetter("Pitch")
    public void setPitch (Double value) { 
        this.pitch = value;
        notifyObservers(this.pitch);
    }
 
    /** GETTER
     * value greater than 0
     */
    @JsonGetter("Rate")
    public Double getRate ( ) { 
        return this.rate;
    }
    
    /** SETTER
     * value greater than 0
     */
    @JsonSetter("Rate")
    public void setRate (Double value) { 
        this.rate = value;
        notifyObservers(this.rate);
    }
 
    /** GETTER
     * value greater than 0
     */
    @JsonGetter("Tempo")
    public Double getTempo ( ) { 
        return this.tempo;
    }
    
    /** SETTER
     * value greater than 0
     */
    @JsonSetter("Tempo")
    public void setTempo (Double value) { 
        this.tempo = value;
        notifyObservers(this.tempo);
    }
 
}
 