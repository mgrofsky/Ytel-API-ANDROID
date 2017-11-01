/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateConferenceInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4999099363315808689L;
    private String from;
    private String to;
    private String url;
    private HttpActionEnum method = HttpActionEnum.POST;
    private String recordCallbackUrl;
    private String responseType = "json";
    private String statusCallBackUrl;
    private HttpActionEnum statusCallBackMethod;
    private String fallBackUrl;
    private HttpActionEnum fallBackMethod;
    private Boolean record;
    private HttpActionEnum recordCallbackMethod;
    private String schdeuleTime;
    private Integer timeout;
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
     * URL requested once the call connects
     */
    @JsonGetter("Url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * URL requested once the call connects
     */
    @JsonSetter("Url")
    public void setUrl (String value) { 
        this.url = value;
        notifyObservers(this.url);
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
     * Recording parameters will be sent here upon completion.
     */
    @JsonGetter("RecordCallbackUrl")
    public String getRecordCallbackUrl ( ) { 
        return this.recordCallbackUrl;
    }
    
    /** SETTER
     * Recording parameters will be sent here upon completion.
     */
    @JsonSetter("RecordCallbackUrl")
    public void setRecordCallbackUrl (String value) { 
        this.recordCallbackUrl = value;
        notifyObservers(this.recordCallbackUrl);
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
    @JsonGetter("FallBackUrl")
    public String getFallBackUrl ( ) { 
        return this.fallBackUrl;
    }
    
    /** SETTER
     * URL requested if the initial Url parameter fails or encounters an error
     */
    @JsonSetter("FallBackUrl")
    public void setFallBackUrl (String value) { 
        this.fallBackUrl = value;
        notifyObservers(this.fallBackUrl);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonGetter("FallBackMethod")
    public HttpActionEnum getFallBackMethod ( ) { 
        return this.fallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonSetter("FallBackMethod")
    public void setFallBackMethod (HttpActionEnum value) { 
        this.fallBackMethod = value;
        notifyObservers(this.fallBackMethod);
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
     * Specifies the HTTP method used to request the required URL once conference connects.
     */
    @JsonGetter("RecordCallbackMethod")
    public HttpActionEnum getRecordCallbackMethod ( ) { 
        return this.recordCallbackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once conference connects.
     */
    @JsonSetter("RecordCallbackMethod")
    public void setRecordCallbackMethod (HttpActionEnum value) { 
        this.recordCallbackMethod = value;
        notifyObservers(this.recordCallbackMethod);
    }
 
    /** GETTER
     * Schedule conference in future. Schedule time must be greater than current time
     */
    @JsonGetter("SchdeuleTime")
    public String getSchdeuleTime ( ) { 
        return this.schdeuleTime;
    }
    
    /** SETTER
     * Schedule conference in future. Schedule time must be greater than current time
     */
    @JsonSetter("SchdeuleTime")
    public void setSchdeuleTime (String value) { 
        this.schdeuleTime = value;
        notifyObservers(this.schdeuleTime);
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
 