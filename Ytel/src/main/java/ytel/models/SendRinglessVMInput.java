/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendRinglessVMInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5739287120784655357L;
    private String from;
    private String rVMCallerId;
    private String to;
    private String voiceMailURL;
    private String responseType = "json";
    private HttpActionEnum method = HttpActionEnum.GET;
    private String statusCallBackUrl;
    private HttpActionEnum statsCallBackMethod;
    /** GETTER
     * A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * A required secondary Caller ID for RVM to work.
     */
    @JsonGetter("RVMCallerId")
    public String getRVMCallerId ( ) { 
        return this.rVMCallerId;
    }
    
    /** SETTER
     * A required secondary Caller ID for RVM to work.
     */
    @JsonSetter("RVMCallerId")
    public void setRVMCallerId (String value) { 
        this.rVMCallerId = value;
        notifyObservers(this.rVMCallerId);
    }
 
    /** GETTER
     * A valid number (E.164 format) that will receive the phone call.
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * A valid number (E.164 format) that will receive the phone call.
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * The URL requested once the RVM connects. A set of default parameters will be sent here.
     */
    @JsonGetter("VoiceMailURL")
    public String getVoiceMailURL ( ) { 
        return this.voiceMailURL;
    }
    
    /** SETTER
     * The URL requested once the RVM connects. A set of default parameters will be sent here.
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
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    @JsonGetter("Method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
        notifyObservers(this.statusCallBackUrl);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    @JsonGetter("StatsCallBackMethod")
    public HttpActionEnum getStatsCallBackMethod ( ) { 
        return this.statsCallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    @JsonSetter("StatsCallBackMethod")
    public void setStatsCallBackMethod (HttpActionEnum value) { 
        this.statsCallBackMethod = value;
        notifyObservers(this.statsCallBackMethod);
    }
 
}
 