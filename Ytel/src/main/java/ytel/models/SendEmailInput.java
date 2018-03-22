/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendEmailInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5375661220635977980L;
    private String to;
    private SendEmailAsEnum type = SendEmailAsEnum.HTML;
    private String subject;
    private String message;
    private String responseType = "json";
    private String from;
    private String cc;
    private String bcc;
    private String attachment;
    /** GETTER
     * A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * Specifies the type of email to be sent
     */
    @JsonGetter("Type")
    public SendEmailAsEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Specifies the type of email to be sent
     */
    @JsonSetter("Type")
    public void setType (SendEmailAsEnum value) { 
        this.type = value;
        notifyObservers(this.type);
    }
 
    /** GETTER
     * The subject of the mail. Must be a valid string.
     */
    @JsonGetter("Subject")
    public String getSubject ( ) { 
        return this.subject;
    }
    
    /** SETTER
     * The subject of the mail. Must be a valid string.
     */
    @JsonSetter("Subject")
    public void setSubject (String value) { 
        this.subject = value;
        notifyObservers(this.subject);
    }
 
    /** GETTER
     * The email message that is to be sent in the text.
     */
    @JsonGetter("Message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * The email message that is to be sent in the text.
     */
    @JsonSetter("Message")
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
     * A valid address that will send the email.
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * A valid address that will send the email.
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    @JsonGetter("Cc")
    public String getCc ( ) { 
        return this.cc;
    }
    
    /** SETTER
     * Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    @JsonSetter("Cc")
    public void setCc (String value) { 
        this.cc = value;
        notifyObservers(this.cc);
    }
 
    /** GETTER
     * Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    @JsonGetter("Bcc")
    public String getBcc ( ) { 
        return this.bcc;
    }
    
    /** SETTER
     * Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    @JsonSetter("Bcc")
    public void setBcc (String value) { 
        this.bcc = value;
        notifyObservers(this.bcc);
    }
 
    /** GETTER
     * A file that is attached to the email. Must be less than 7 MB in size.
     */
    @JsonGetter("Attachment")
    public String getAttachment ( ) { 
        return this.attachment;
    }
    
    /** SETTER
     * A file that is attached to the email. Must be less than 7 MB in size.
     */
    @JsonSetter("Attachment")
    public void setAttachment (String value) { 
        this.attachment = value;
        notifyObservers(this.attachment);
    }
 
}
 