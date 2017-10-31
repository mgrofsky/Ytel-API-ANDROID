/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewTemplateInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5048877074336779860L;
    private UUID templateid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a template object
     */
    @JsonGetter("templateid")
    public UUID getTemplateid ( ) { 
        return this.templateid;
    }
    
    /** SETTER
     * The unique identifier for a template object
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
 
}
 