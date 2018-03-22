/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePostcardInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5636239596824371977L;
    private String to;
    private String from;
    private String attachbyid;
    private String front;
    private String back;
    private String message;
    private String setting;
    private String responseType = "json";
    private String description;
    private String htmldata;
    /** GETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * Set an existing postcard by attaching its PostcardId.
     */
    @JsonGetter("attachbyid")
    public String getAttachbyid ( ) { 
        return this.attachbyid;
    }
    
    /** SETTER
     * Set an existing postcard by attaching its PostcardId.
     */
    @JsonSetter("attachbyid")
    public void setAttachbyid (String value) { 
        this.attachbyid = value;
        notifyObservers(this.attachbyid);
    }
 
    /** GETTER
     * A 4.25"x6.25" or 6.25"x11.25" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
     */
    @JsonGetter("front")
    public String getFront ( ) { 
        return this.front;
    }
    
    /** SETTER
     * A 4.25"x6.25" or 6.25"x11.25" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
     */
    @JsonSetter("front")
    public void setFront (String value) { 
        this.front = value;
        notifyObservers(this.front);
    }
 
    /** GETTER
     * A 4.25"x6.25" or 6.25"x11.25" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you.
     */
    @JsonGetter("back")
    public String getBack ( ) { 
        return this.back;
    }
    
    /** SETTER
     * A 4.25"x6.25" or 6.25"x11.25" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you.
     */
    @JsonSetter("back")
    public void setBack (String value) { 
        this.back = value;
        notifyObservers(this.back);
    }
 
    /** GETTER
     * The message for the back of the postcard with a maximum of 350 characters.
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * The message for the back of the postcard with a maximum of 350 characters.
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
        notifyObservers(this.message);
    }
 
    /** GETTER
     * Code for the dimensions of the media to be printed.
     */
    @JsonGetter("setting")
    public String getSetting ( ) { 
        return this.setting;
    }
    
    /** SETTER
     * Code for the dimensions of the media to be printed.
     */
    @JsonSetter("setting")
    public void setSetting (String value) { 
        this.setting = value;
        notifyObservers(this.setting);
    }
 
    /** GETTER
     * Response Type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
    /** GETTER
     * A description for the postcard.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * A description for the postcard.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
        notifyObservers(this.description);
    }
 
    /** GETTER
     * A string value that contains HTML markup.
     */
    @JsonGetter("htmldata")
    public String getHtmldata ( ) { 
        return this.htmldata;
    }
    
    /** SETTER
     * A string value that contains HTML markup.
     */
    @JsonSetter("htmldata")
    public void setHtmldata (String value) { 
        this.htmldata = value;
        notifyObservers(this.htmldata);
    }
 
}
 