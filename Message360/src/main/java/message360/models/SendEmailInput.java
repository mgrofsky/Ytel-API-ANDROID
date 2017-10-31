/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendEmailInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4877185020243476340L;
    private String to;
    private String from;
    private SendEmailAsEnum type = SendEmailAsEnum.HTML;
    private String subject;
    private String message;
    private String responseType = "json";
    private String cc;
    private String bcc;
    private String attachment;
    /** GETTER
     * The to email address
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * The to email address
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * The from email address
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * The from email address
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * email format type, html or text
     */
    @JsonGetter("type")
    public SendEmailAsEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * email format type, html or text
     */
    @JsonSetter("type")
    public void setType (SendEmailAsEnum value) { 
        this.type = value;
        notifyObservers(this.type);
    }
 
    /** GETTER
     * Email subject
     */
    @JsonGetter("subject")
    public String getSubject ( ) { 
        return this.subject;
    }
    
    /** SETTER
     * Email subject
     */
    @JsonSetter("subject")
    public void setSubject (String value) { 
        this.subject = value;
        notifyObservers(this.subject);
    }
 
    /** GETTER
     * The body of the email message
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * The body of the email message
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
        notifyObservers(this.message);
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
     * CC Email address
     */
    @JsonGetter("cc")
    public String getCc ( ) { 
        return this.cc;
    }
    
    /** SETTER
     * CC Email address
     */
    @JsonSetter("cc")
    public void setCc (String value) { 
        this.cc = value;
        notifyObservers(this.cc);
    }
 
    /** GETTER
     * BCC Email address
     */
    @JsonGetter("bcc")
    public String getBcc ( ) { 
        return this.bcc;
    }
    
    /** SETTER
     * BCC Email address
     */
    @JsonSetter("bcc")
    public void setBcc (String value) { 
        this.bcc = value;
        notifyObservers(this.bcc);
    }
 
    /** GETTER
     * File to be attached.File must be less than 7MB.
     */
    @JsonGetter("attachment")
    public String getAttachment ( ) { 
        return this.attachment;
    }
    
    /** SETTER
     * File to be attached.File must be less than 7MB.
     */
    @JsonSetter("attachment")
    public void setAttachment (String value) { 
        this.attachment = value;
        notifyObservers(this.attachment);
    }
 
}
 