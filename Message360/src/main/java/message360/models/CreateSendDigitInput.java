/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSendDigitInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4825541882489631943L;
    private String callSid;
    private String playDtmf;
    private Direction playDtmfDirection;
    private String responseType = "json";
    /** GETTER
     * The unique identifier of each call resource
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * The unique identifier of each call resource
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
        notifyObservers(this.callSid);
    }
 
    /** GETTER
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    @JsonGetter("PlayDtmf")
    public String getPlayDtmf ( ) { 
        return this.playDtmf;
    }
    
    /** SETTER
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    @JsonSetter("PlayDtmf")
    public void setPlayDtmf (String value) { 
        this.playDtmf = value;
        notifyObservers(this.playDtmf);
    }
 
    /** GETTER
     * The leg of the call DTMF digits should be sent to
     */
    @JsonGetter("PlayDtmfDirection")
    public Direction getPlayDtmfDirection ( ) { 
        return this.playDtmfDirection;
    }
    
    /** SETTER
     * The leg of the call DTMF digits should be sent to
     */
    @JsonSetter("PlayDtmfDirection")
    public void setPlayDtmfDirection (Direction value) { 
        this.playDtmfDirection = value;
        notifyObservers(this.playDtmfDirection);
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
 