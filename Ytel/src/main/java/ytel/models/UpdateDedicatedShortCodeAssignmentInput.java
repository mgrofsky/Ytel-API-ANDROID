/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateDedicatedShortCodeAssignmentInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5183761673503317970L;
    private String shortcode;
    private String responseType = "json";
    private String friendlyName;
    private String callbackMethod;
    private String callbackUrl;
    private String fallbackMethod;
    private String fallbackUrl;
    /** GETTER
     * List of valid dedicated shortcode to your Ytel account.
     */
    @JsonGetter("Shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * List of valid dedicated shortcode to your Ytel account.
     */
    @JsonSetter("Shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
        notifyObservers(this.shortcode);
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
     * User generated name of the dedicated shortcode.
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * User generated name of the dedicated shortcode.
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
        notifyObservers(this.friendlyName);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    @JsonGetter("CallbackMethod")
    public String getCallbackMethod ( ) { 
        return this.callbackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    @JsonSetter("CallbackMethod")
    public void setCallbackMethod (String value) { 
        this.callbackMethod = value;
        notifyObservers(this.callbackMethod);
    }
 
    /** GETTER
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    @JsonGetter("CallbackUrl")
    public String getCallbackUrl ( ) { 
        return this.callbackUrl;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    @JsonSetter("CallbackUrl")
    public void setCallbackUrl (String value) { 
        this.callbackUrl = value;
        notifyObservers(this.callbackUrl);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonGetter("FallbackMethod")
    public String getFallbackMethod ( ) { 
        return this.fallbackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonSetter("FallbackMethod")
    public void setFallbackMethod (String value) { 
        this.fallbackMethod = value;
        notifyObservers(this.fallbackMethod);
    }
 
    /** GETTER
     * URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
     */
    @JsonGetter("FallbackUrl")
    public String getFallbackUrl ( ) { 
        return this.fallbackUrl;
    }
    
    /** SETTER
     * URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
     */
    @JsonSetter("FallbackUrl")
    public void setFallbackUrl (String value) { 
        this.fallbackUrl = value;
        notifyObservers(this.fallbackUrl);
    }
 
}
 