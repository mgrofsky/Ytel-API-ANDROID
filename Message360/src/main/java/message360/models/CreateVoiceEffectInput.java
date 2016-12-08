/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateVoiceEffectInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5207710257447663647L;
    private String callSid;
    private AudioDirection audioDirection;
    private Double pitchSemiTones;
    private Double pitchOctaves;
    private Double pitch;
    private Double rate;
    private Double tempo;
    private String responseType = "json";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
        notifyObservers(this.callSid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AudioDirection")
    public AudioDirection getAudioDirection ( ) { 
        return this.audioDirection;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AudioDirection")
    public void setAudioDirection (AudioDirection value) { 
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
 