/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateRecordCallInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5561890011186448182L;
    private String callSid;
    private boolean record;
    private Direction direction;
    private Integer timeLimit;
    private String callBackUrl;
    private AudioFormat fileformat;
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
     * Set true to initiate recording or false to terminate recording
     */
    @JsonGetter("Record")
    public boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * Set true to initiate recording or false to terminate recording
     */
    @JsonSetter("Record")
    public void setRecord (boolean value) { 
        this.record = value;
        notifyObservers(this.record);
    }
 
    /** GETTER
     * The leg of the call to record
     */
    @JsonGetter("Direction")
    public Direction getDirection ( ) { 
        return this.direction;
    }
    
    /** SETTER
     * The leg of the call to record
     */
    @JsonSetter("Direction")
    public void setDirection (Direction value) { 
        this.direction = value;
        notifyObservers(this.direction);
    }
 
    /** GETTER
     * Time in seconds the recording duration should not exceed
     */
    @JsonGetter("TimeLimit")
    public Integer getTimeLimit ( ) { 
        return this.timeLimit;
    }
    
    /** SETTER
     * Time in seconds the recording duration should not exceed
     */
    @JsonSetter("TimeLimit")
    public void setTimeLimit (Integer value) { 
        this.timeLimit = value;
        notifyObservers(this.timeLimit);
    }
 
    /** GETTER
     * URL consulted after the recording completes
     */
    @JsonGetter("CallBackUrl")
    public String getCallBackUrl ( ) { 
        return this.callBackUrl;
    }
    
    /** SETTER
     * URL consulted after the recording completes
     */
    @JsonSetter("CallBackUrl")
    public void setCallBackUrl (String value) { 
        this.callBackUrl = value;
        notifyObservers(this.callBackUrl);
    }
 
    /** GETTER
     * Format of the recording file. Can be .mp3 or .wav
     */
    @JsonGetter("Fileformat")
    public AudioFormat getFileformat ( ) { 
        return this.fileformat;
    }
    
    /** SETTER
     * Format of the recording file. Can be .mp3 or .wav
     */
    @JsonSetter("Fileformat")
    public void setFileformat (AudioFormat value) { 
        this.fileformat = value;
        notifyObservers(this.fileformat);
    }
 
    /** GETTER
     * Response format, xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response format, xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 