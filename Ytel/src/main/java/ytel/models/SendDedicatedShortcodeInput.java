/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendDedicatedShortcodeInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5726798796852813281L;
    private int shortcode;
    private double to;
    private String body;
    private String responseType = "json";
    private HttpActionEnum method;
    private String messagestatuscallback;
    /** GETTER
     * Your dedicated shortcode
     */
    @JsonGetter("shortcode")
    public int getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Your dedicated shortcode
     */
    @JsonSetter("shortcode")
    public void setShortcode (int value) { 
        this.shortcode = value;
        notifyObservers(this.shortcode);
    }
 
    /** GETTER
     * The number to send your SMS to
     */
    @JsonGetter("to")
    public double getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * The number to send your SMS to
     */
    @JsonSetter("to")
    public void setTo (double value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * The body of your message
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * The body of your message
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
        notifyObservers(this.body);
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
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
     */
    @JsonGetter("method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
     */
    @JsonSetter("method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    @JsonGetter("messagestatuscallback")
    public String getMessagestatuscallback ( ) { 
        return this.messagestatuscallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    @JsonSetter("messagestatuscallback")
    public void setMessagestatuscallback (String value) { 
        this.messagestatuscallback = value;
        notifyObservers(this.messagestatuscallback);
    }
 
}
 