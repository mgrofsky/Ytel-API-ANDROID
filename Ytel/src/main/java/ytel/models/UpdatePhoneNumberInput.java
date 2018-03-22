/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdatePhoneNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5718565373166323305L;
    private String phoneNumber;
    private String voiceUrl;
    private String responseType = "json";
    private String friendlyName;
    private HttpActionEnum voiceMethod;
    private String voiceFallbackUrl;
    private HttpActionEnum voiceFallbackMethod;
    private String hangupCallback;
    private HttpActionEnum hangupCallbackMethod;
    private String heartbeatUrl;
    private HttpActionEnum heartbeatMethod;
    private String smsUrl;
    private HttpActionEnum smsMethod;
    private String smsFallbackUrl;
    private HttpActionEnum smsFallbackMethod;
    /** GETTER
     * A valid Ytel number (E.164 format).
     */
    @JsonGetter("PhoneNumber")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * A valid Ytel number (E.164 format).
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
        notifyObservers(this.phoneNumber);
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
     * Phone number friendly name description
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * Phone number friendly name description
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
        notifyObservers(this.friendlyName);
    }
 
    /** GETTER
     * Post or Get
     */
    @JsonGetter("VoiceMethod")
    public HttpActionEnum getVoiceMethod ( ) { 
        return this.voiceMethod;
    }
    
    /** SETTER
     * Post or Get
     */
    @JsonSetter("VoiceMethod")
    public void setVoiceMethod (HttpActionEnum value) { 
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
     * Post or Get
     */
    @JsonGetter("VoiceFallbackMethod")
    public HttpActionEnum getVoiceFallbackMethod ( ) { 
        return this.voiceFallbackMethod;
    }
    
    /** SETTER
     * Post or Get
     */
    @JsonSetter("VoiceFallbackMethod")
    public void setVoiceFallbackMethod (HttpActionEnum value) { 
        this.voiceFallbackMethod = value;
        notifyObservers(this.voiceFallbackMethod);
    }
 
    /** GETTER
     * callback url after a hangup occurs
     */
    @JsonGetter("HangupCallback")
    public String getHangupCallback ( ) { 
        return this.hangupCallback;
    }
    
    /** SETTER
     * callback url after a hangup occurs
     */
    @JsonSetter("HangupCallback")
    public void setHangupCallback (String value) { 
        this.hangupCallback = value;
        notifyObservers(this.hangupCallback);
    }
 
    /** GETTER
     * Post or Get
     */
    @JsonGetter("HangupCallbackMethod")
    public HttpActionEnum getHangupCallbackMethod ( ) { 
        return this.hangupCallbackMethod;
    }
    
    /** SETTER
     * Post or Get
     */
    @JsonSetter("HangupCallbackMethod")
    public void setHangupCallbackMethod (HttpActionEnum value) { 
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
    public HttpActionEnum getHeartbeatMethod ( ) { 
        return this.heartbeatMethod;
    }
    
    /** SETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed time
     */
    @JsonSetter("HeartbeatMethod")
    public void setHeartbeatMethod (HttpActionEnum value) { 
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
     * Post or Get
     */
    @JsonGetter("SmsMethod")
    public HttpActionEnum getSmsMethod ( ) { 
        return this.smsMethod;
    }
    
    /** SETTER
     * Post or Get
     */
    @JsonSetter("SmsMethod")
    public void setSmsMethod (HttpActionEnum value) { 
        this.smsMethod = value;
        notifyObservers(this.smsMethod);
    }
 
    /** GETTER
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    @JsonGetter("SmsFallbackUrl")
    public String getSmsFallbackUrl ( ) { 
        return this.smsFallbackUrl;
    }
    
    /** SETTER
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    @JsonSetter("SmsFallbackUrl")
    public void setSmsFallbackUrl (String value) { 
        this.smsFallbackUrl = value;
        notifyObservers(this.smsFallbackUrl);
    }
 
    /** GETTER
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    @JsonGetter("SmsFallbackMethod")
    public HttpActionEnum getSmsFallbackMethod ( ) { 
        return this.smsFallbackMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    @JsonSetter("SmsFallbackMethod")
    public void setSmsFallbackMethod (HttpActionEnum value) { 
        this.smsFallbackMethod = value;
        notifyObservers(this.smsFallbackMethod);
    }
 
}
 