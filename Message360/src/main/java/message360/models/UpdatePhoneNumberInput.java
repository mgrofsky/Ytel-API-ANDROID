/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdatePhoneNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4932153863642081595L;
    private String phoneNumber;
    private String friendlyName;
    private String voiceUrl;
    private HttpAction voiceMethod;
    private String voiceFallbackUrl;
    private HttpAction voiceFallbackMethod;
    private String hangupCallback;
    private HttpAction hangupCallbackMethod;
    private String heartbeatUrl;
    private HttpAction heartbeatMethod;
    private String smsUrl;
    private HttpAction smsMethod;
    private String smsFallbackUrl;
    private HttpAction smsFallbackMethod;
    private String responseType = "json";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PhoneNumber")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
        notifyObservers(this.phoneNumber);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
        notifyObservers(this.friendlyName);
    }
 
    /** GETTER
     * URL requested once the call connects
     */
    @JsonGetter("VoiceUrl")
    public String getVoiceUrl ( ) { 
        return this.voiceUrl;
    }
    
    /** SETTER
     * URL requested once the call connects
     */
    @JsonSetter("VoiceUrl")
    public void setVoiceUrl (String value) { 
        this.voiceUrl = value;
        notifyObservers(this.voiceUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VoiceMethod")
    public HttpAction getVoiceMethod ( ) { 
        return this.voiceMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VoiceMethod")
    public void setVoiceMethod (HttpAction value) { 
        this.voiceMethod = value;
        notifyObservers(this.voiceMethod);
    }
 
    /** GETTER
     * URL requested if the voice URL is not available
     */
    @JsonGetter("VoiceFallbackUrl")
    public String getVoiceFallbackUrl ( ) { 
        return this.voiceFallbackUrl;
    }
    
    /** SETTER
     * URL requested if the voice URL is not available
     */
    @JsonSetter("VoiceFallbackUrl")
    public void setVoiceFallbackUrl (String value) { 
        this.voiceFallbackUrl = value;
        notifyObservers(this.voiceFallbackUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VoiceFallbackMethod")
    public HttpAction getVoiceFallbackMethod ( ) { 
        return this.voiceFallbackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VoiceFallbackMethod")
    public void setVoiceFallbackMethod (HttpAction value) { 
        this.voiceFallbackMethod = value;
        notifyObservers(this.voiceFallbackMethod);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HangupCallback")
    public String getHangupCallback ( ) { 
        return this.hangupCallback;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HangupCallback")
    public void setHangupCallback (String value) { 
        this.hangupCallback = value;
        notifyObservers(this.hangupCallback);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HangupCallbackMethod")
    public HttpAction getHangupCallbackMethod ( ) { 
        return this.hangupCallbackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HangupCallbackMethod")
    public void setHangupCallbackMethod (HttpAction value) { 
        this.hangupCallbackMethod = value;
        notifyObservers(this.hangupCallbackMethod);
    }
 
    /** GETTER
     * URL requested once the call connects
     */
    @JsonGetter("HeartbeatUrl")
    public String getHeartbeatUrl ( ) { 
        return this.heartbeatUrl;
    }
    
    /** SETTER
     * URL requested once the call connects
     */
    @JsonSetter("HeartbeatUrl")
    public void setHeartbeatUrl (String value) { 
        this.heartbeatUrl = value;
        notifyObservers(this.heartbeatUrl);
    }
 
    /** GETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed time
     */
    @JsonGetter("HeartbeatMethod")
    public HttpAction getHeartbeatMethod ( ) { 
        return this.heartbeatMethod;
    }
    
    /** SETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed time
     */
    @JsonSetter("HeartbeatMethod")
    public void setHeartbeatMethod (HttpAction value) { 
        this.heartbeatMethod = value;
        notifyObservers(this.heartbeatMethod);
    }
 
    /** GETTER
     * URL requested when an SMS is received
     */
    @JsonGetter("SmsUrl")
    public String getSmsUrl ( ) { 
        return this.smsUrl;
    }
    
    /** SETTER
     * URL requested when an SMS is received
     */
    @JsonSetter("SmsUrl")
    public void setSmsUrl (String value) { 
        this.smsUrl = value;
        notifyObservers(this.smsUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SmsMethod")
    public HttpAction getSmsMethod ( ) { 
        return this.smsMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SmsMethod")
    public void setSmsMethod (HttpAction value) { 
        this.smsMethod = value;
        notifyObservers(this.smsMethod);
    }
 
    /** GETTER
     * URL requested once the call connects
     */
    @JsonGetter("SmsFallbackUrl")
    public String getSmsFallbackUrl ( ) { 
        return this.smsFallbackUrl;
    }
    
    /** SETTER
     * URL requested once the call connects
     */
    @JsonSetter("SmsFallbackUrl")
    public void setSmsFallbackUrl (String value) { 
        this.smsFallbackUrl = value;
        notifyObservers(this.smsFallbackUrl);
    }
 
    /** GETTER
     * URL requested if the sms URL is not available
     */
    @JsonGetter("SmsFallbackMethod")
    public HttpAction getSmsFallbackMethod ( ) { 
        return this.smsFallbackMethod;
    }
    
    /** SETTER
     * URL requested if the sms URL is not available
     */
    @JsonSetter("SmsFallbackMethod")
    public void setSmsFallbackMethod (HttpAction value) { 
        this.smsFallbackMethod = value;
        notifyObservers(this.smsFallbackMethod);
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
 