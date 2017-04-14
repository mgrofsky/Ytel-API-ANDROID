/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateGroupCallInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4866208527319961668L;
    private String fromCountryCode = "1";
    private String from;
    private String toCountryCode = "1";
    private String to;
    private String url;
    private HttpActionEnum method;
    private String statusCallBackUrl;
    private HttpActionEnum statusCallBackMethod;
    private String fallBackUrl;
    private HttpActionEnum fallBackMethod;
    private String heartBeatUrl;
    private HttpActionEnum heartBeatMethod;
    private Integer timeout;
    private String playDtmf;
    private String hideCallerId;
    private Boolean record;
    private String recordCallBackUrl;
    private HttpActionEnum recordCallBackMethod;
    private Boolean transcribe;
    private String transcribeCallBackUrl;
    private String responseType = "json";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FromCountryCode")
    public String getFromCountryCode ( ) { 
        return this.fromCountryCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FromCountryCode")
    public void setFromCountryCode (String value) { 
        this.fromCountryCode = value;
        notifyObservers(this.fromCountryCode);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ToCountryCode")
    public String getToCountryCode ( ) { 
        return this.toCountryCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ToCountryCode")
    public void setToCountryCode (String value) { 
        this.toCountryCode = value;
        notifyObservers(this.toCountryCode);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Url")
    public void setUrl (String value) { 
        this.url = value;
        notifyObservers(this.url);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
        notifyObservers(this.statusCallBackUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("StatusCallBackMethod")
    public HttpActionEnum getStatusCallBackMethod ( ) { 
        return this.statusCallBackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("StatusCallBackMethod")
    public void setStatusCallBackMethod (HttpActionEnum value) { 
        this.statusCallBackMethod = value;
        notifyObservers(this.statusCallBackMethod);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FallBackUrl")
    public String getFallBackUrl ( ) { 
        return this.fallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FallBackUrl")
    public void setFallBackUrl (String value) { 
        this.fallBackUrl = value;
        notifyObservers(this.fallBackUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FallBackMethod")
    public HttpActionEnum getFallBackMethod ( ) { 
        return this.fallBackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FallBackMethod")
    public void setFallBackMethod (HttpActionEnum value) { 
        this.fallBackMethod = value;
        notifyObservers(this.fallBackMethod);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HeartBeatUrl")
    public String getHeartBeatUrl ( ) { 
        return this.heartBeatUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HeartBeatUrl")
    public void setHeartBeatUrl (String value) { 
        this.heartBeatUrl = value;
        notifyObservers(this.heartBeatUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HeartBeatMethod")
    public HttpActionEnum getHeartBeatMethod ( ) { 
        return this.heartBeatMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HeartBeatMethod")
    public void setHeartBeatMethod (HttpActionEnum value) { 
        this.heartBeatMethod = value;
        notifyObservers(this.heartBeatMethod);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Timeout")
    public Integer getTimeout ( ) { 
        return this.timeout;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Timeout")
    public void setTimeout (Integer value) { 
        this.timeout = value;
        notifyObservers(this.timeout);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PlayDtmf")
    public String getPlayDtmf ( ) { 
        return this.playDtmf;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PlayDtmf")
    public void setPlayDtmf (String value) { 
        this.playDtmf = value;
        notifyObservers(this.playDtmf);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HideCallerId")
    public String getHideCallerId ( ) { 
        return this.hideCallerId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HideCallerId")
    public void setHideCallerId (String value) { 
        this.hideCallerId = value;
        notifyObservers(this.hideCallerId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Record")
    public Boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Record")
    public void setRecord (Boolean value) { 
        this.record = value;
        notifyObservers(this.record);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RecordCallBackUrl")
    public String getRecordCallBackUrl ( ) { 
        return this.recordCallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RecordCallBackUrl")
    public void setRecordCallBackUrl (String value) { 
        this.recordCallBackUrl = value;
        notifyObservers(this.recordCallBackUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RecordCallBackMethod")
    public HttpActionEnum getRecordCallBackMethod ( ) { 
        return this.recordCallBackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RecordCallBackMethod")
    public void setRecordCallBackMethod (HttpActionEnum value) { 
        this.recordCallBackMethod = value;
        notifyObservers(this.recordCallBackMethod);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Transcribe")
    public Boolean getTranscribe ( ) { 
        return this.transcribe;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Transcribe")
    public void setTranscribe (Boolean value) { 
        this.transcribe = value;
        notifyObservers(this.transcribe);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TranscribeCallBackUrl")
    public String getTranscribeCallBackUrl ( ) { 
        return this.transcribeCallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TranscribeCallBackUrl")
    public void setTranscribeCallBackUrl (String value) { 
        this.transcribeCallBackUrl = value;
        notifyObservers(this.transcribeCallBackUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 