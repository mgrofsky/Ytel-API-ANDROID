/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSendShortCodeInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5706062917681560652L;
    private String shortcode;
    private String tocountrycode = "1";
    private String to;
    private UUID templateid;
    private String responseType = "json";
    private String data;
    private String method = "GET";
    private String messageStatusCallback;
    /** GETTER
     * The Short Code number that is the sender of this message
     */
    @JsonGetter("shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * The Short Code number that is the sender of this message
     */
    @JsonSetter("shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
        notifyObservers(this.shortcode);
    }
 
    /** GETTER
     * The country code for sending this message
     */
    @JsonGetter("tocountrycode")
    public String getTocountrycode ( ) { 
        return this.tocountrycode;
    }
    
    /** SETTER
     * The country code for sending this message
     */
    @JsonSetter("tocountrycode")
    public void setTocountrycode (String value) { 
        this.tocountrycode = value;
        notifyObservers(this.tocountrycode);
    }
 
    /** GETTER
     * A valid 10-digit number that should receive the message+
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * A valid 10-digit number that should receive the message+
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * The unique identifier for the template used for the message
     */
    @JsonGetter("templateid")
    public UUID getTemplateid ( ) { 
        return this.templateid;
    }
    
    /** SETTER
     * The unique identifier for the template used for the message
     */
    @JsonSetter("templateid")
    public void setTemplateid (UUID value) { 
        this.templateid = value;
        notifyObservers(this.templateid);
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
     * format of your data, example: {companyname}:test,{otpcode}:1234
     */
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * format of your data, example: {companyname}:test,{otpcode}:1234
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
        notifyObservers(this.data);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    @JsonGetter("Method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    @JsonSetter("Method")
    public void setMethod (String value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    @JsonGetter("MessageStatusCallback")
    public String getMessageStatusCallback ( ) { 
        return this.messageStatusCallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    @JsonSetter("MessageStatusCallback")
    public void setMessageStatusCallback (String value) { 
        this.messageStatusCallback = value;
        notifyObservers(this.messageStatusCallback);
    }
 
}
 