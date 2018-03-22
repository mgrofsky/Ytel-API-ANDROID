/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VoiceEffectInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5319284741153793696L;
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
     * Set the pitch in semitone (half-step) intervals. Value between -14 and 14
     */
    @JsonGetter("PitchSemiTones")
    public Double getPitchSemiTones ( ) { 
        return this.pitchSemiTones;
    }
    
    /** SETTER
     * Set the pitch in semitone (half-step) intervals. Value between -14 and 14
     */
    @JsonSetter("PitchSemiTones")
    public void setPitchSemiTones (Double value) { 
        this.pitchSemiTones = value;
        notifyObservers(this.pitchSemiTones);
    }
 
    /** GETTER
     * Set the pitch in octave intervals.. Value between -1 and 1
     */
    @JsonGetter("PitchOctaves")
    public Double getPitchOctaves ( ) { 
        return this.pitchOctaves;
    }
    
    /** SETTER
     * Set the pitch in octave intervals.. Value between -1 and 1
     */
    @JsonSetter("PitchOctaves")
    public void setPitchOctaves (Double value) { 
        this.pitchOctaves = value;
        notifyObservers(this.pitchOctaves);
    }
 
    /** GETTER
     * Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
     */
    @JsonGetter("Pitch")
    public Double getPitch ( ) { 
        return this.pitch;
    }
    
    /** SETTER
     * Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
     */
    @JsonSetter("Pitch")
    public void setPitch (Double value) { 
        this.pitch = value;
        notifyObservers(this.pitch);
    }
 
    /** GETTER
     * Set the rate for audio. The lower the value, the lower the rate. value greater than 0
     */
    @JsonGetter("Rate")
    public Double getRate ( ) { 
        return this.rate;
    }
    
    /** SETTER
     * Set the rate for audio. The lower the value, the lower the rate. value greater than 0
     */
    @JsonSetter("Rate")
    public void setRate (Double value) { 
        this.rate = value;
        notifyObservers(this.rate);
    }
 
    /** GETTER
     * Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0
     */
    @JsonGetter("Tempo")
    public Double getTempo ( ) { 
        return this.tempo;
    }
    
    /** SETTER
     * Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0
     */
    @JsonSetter("Tempo")
    public void setTempo (Double value) { 
        this.tempo = value;
        notifyObservers(this.tempo);
    }
 
}
 