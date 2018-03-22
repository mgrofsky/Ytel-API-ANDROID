/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateConferenceInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4850567770028560514L;
    private String from;
    private String to;
    private String url;
    private String responseType = "json";
    private HttpActionEnum method = HttpActionEnum.POST;
    private String statusCallBackUrl;
    private HttpActionEnum statusCallBackMethod;
    private String fallbackUrl;
    private HttpActionEnum fallbackMethod;
    private Boolean record;
    private String recordCallBackUrl;
    private HttpActionEnum recordCallBackMethod;
    private String scheduleTime;
    private Integer timeout;
    /** GETTER
     * A valid 10-digit number (E.164 format) that will be initiating the conference call.
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * A valid 10-digit number (E.164 format) that will be initiating the conference call.
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * A valid 10-digit number (E.164 format) that is to receive the conference call.
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * A valid 10-digit number (E.164 format) that is to receive the conference call.
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * URL requested once the conference connects
     */
    @JsonGetter("Url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * URL requested once the conference connects
     */
    @JsonSetter("Url")
    public void setUrl (String value) { 
        this.url = value;
        notifyObservers(this.url);
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
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
        notifyObservers(this.statusCallBackUrl);
    }
 
    /** GETTER
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonGetter("StatusCallBackMethod")
    public HttpActionEnum getStatusCallBackMethod ( ) { 
        return this.statusCallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonSetter("StatusCallBackMethod")
    public void setStatusCallBackMethod (HttpActionEnum value) { 
        this.statusCallBackMethod = value;
        notifyObservers(this.statusCallBackMethod);
    }
 
    /** GETTER
     * URL requested if the initial Url parameter fails or encounters an error
     */
    @JsonGetter("FallbackUrl")
    public String getFallbackUrl ( ) { 
        return this.fallbackUrl;
    }
    
    /** SETTER
     * URL requested if the initial Url parameter fails or encounters an error
     */
    @JsonSetter("FallbackUrl")
    public void setFallbackUrl (String value) { 
        this.fallbackUrl = value;
        notifyObservers(this.fallbackUrl);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonGetter("FallbackMethod")
    public HttpActionEnum getFallbackMethod ( ) { 
        return this.fallbackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonSetter("FallbackMethod")
    public void setFallbackMethod (HttpActionEnum value) { 
        this.fallbackMethod = value;
        notifyObservers(this.fallbackMethod);
    }
 
    /** GETTER
     * Specifies if the conference should be recorded.
     */
    @JsonGetter("Record")
    public Boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * Specifies if the conference should be recorded.
     */
    @JsonSetter("Record")
    public void setRecord (Boolean value) { 
        this.record = value;
        notifyObservers(this.record);
    }
 
    /** GETTER
     * Recording parameters will be sent here upon completion.
     */
    @JsonGetter("RecordCallBackUrl")
    public String getRecordCallBackUrl ( ) { 
        return this.recordCallBackUrl;
    }
    
    /** SETTER
     * Recording parameters will be sent here upon completion.
     */
    @JsonSetter("RecordCallBackUrl")
    public void setRecordCallBackUrl (String value) { 
        this.recordCallBackUrl = value;
        notifyObservers(this.recordCallBackUrl);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required URL once conference connects.
     */
    @JsonGetter("RecordCallBackMethod")
    public HttpActionEnum getRecordCallBackMethod ( ) { 
        return this.recordCallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once conference connects.
     */
    @JsonSetter("RecordCallBackMethod")
    public void setRecordCallBackMethod (HttpActionEnum value) { 
        this.recordCallBackMethod = value;
        notifyObservers(this.recordCallBackMethod);
    }
 
    /** GETTER
     * Schedule conference in future. Schedule time must be greater than current time
     */
    @JsonGetter("ScheduleTime")
    public String getScheduleTime ( ) { 
        return this.scheduleTime;
    }
    
    /** SETTER
     * Schedule conference in future. Schedule time must be greater than current time
     */
    @JsonSetter("ScheduleTime")
    public void setScheduleTime (String value) { 
        this.scheduleTime = value;
        notifyObservers(this.scheduleTime);
    }
 
    /** GETTER
     * The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
     */
    @JsonGetter("Timeout")
    public Integer getTimeout ( ) { 
        return this.timeout;
    }
    
    /** SETTER
     * The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
     */
    @JsonSetter("Timeout")
    public void setTimeout (Integer value) { 
        this.timeout = value;
        notifyObservers(this.timeout);
    }
 
}
 