/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendRinglessVMInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5349653274607964459L;
    private String from;
    private String rVMCallerId;
    private String to;
    private String voiceMailURL;
    private String responseType = "json";
    private HttpActionEnum method = HttpActionEnum.GET;
    private String statusCallBackUrl;
    private HttpActionEnum statsCallBackMethod;
    /** GETTER
     * This number to display on Caller ID as calling
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * This number to display on Caller ID as calling
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * Alternate caller ID required for RVM
     */
    @JsonGetter("RVMCallerId")
    public String getRVMCallerId ( ) { 
        return this.rVMCallerId;
    }
    
    /** SETTER
     * Alternate caller ID required for RVM
     */
    @JsonSetter("RVMCallerId")
    public void setRVMCallerId (String value) { 
        this.rVMCallerId = value;
        notifyObservers(this.rVMCallerId);
    }
 
    /** GETTER
     * To number
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * To number
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * URL to an audio file
     */
    @JsonGetter("VoiceMailURL")
    public String getVoiceMailURL ( ) { 
        return this.voiceMailURL;
    }
    
    /** SETTER
     * URL to an audio file
     */
    @JsonSetter("VoiceMailURL")
    public void setVoiceMailURL (String value) { 
        this.voiceMailURL = value;
        notifyObservers(this.voiceMailURL);
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
     * Not currently used in this version
     */
    @JsonGetter("Method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Not currently used in this version
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * URL to post the status of the Ringless request
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * URL to post the status of the Ringless request
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
        notifyObservers(this.statusCallBackUrl);
    }
 
    /** GETTER
     * POST or GET
     */
    @JsonGetter("StatsCallBackMethod")
    public HttpActionEnum getStatsCallBackMethod ( ) { 
        return this.statsCallBackMethod;
    }
    
    /** SETTER
     * POST or GET
     */
    @JsonSetter("StatsCallBackMethod")
    public void setStatsCallBackMethod (HttpActionEnum value) { 
        this.statsCallBackMethod = value;
        notifyObservers(this.statsCallBackMethod);
    }
 
}
 