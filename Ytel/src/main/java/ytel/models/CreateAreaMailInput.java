/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateAreaMailInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4788985546682952795L;
    private String routes;
    private String attachbyid;
    private String front;
    private String back;
    private String responseType = "json";
    private String description;
    private String targettype;
    private String htmldata;
    /** GETTER
     * List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
     */
    @JsonGetter("routes")
    public String getRoutes ( ) { 
        return this.routes;
    }
    
    /** SETTER
     * List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
     */
    @JsonSetter("routes")
    public void setRoutes (String value) { 
        this.routes = value;
        notifyObservers(this.routes);
    }
 
    /** GETTER
     * Set an existing areamail by attaching its AreamailId.
     */
    @JsonGetter("attachbyid")
    public String getAttachbyid ( ) { 
        return this.attachbyid;
    }
    
    /** SETTER
     * Set an existing areamail by attaching its AreamailId.
     */
    @JsonSetter("attachbyid")
    public void setAttachbyid (String value) { 
        this.attachbyid = value;
        notifyObservers(this.attachbyid);
    }
 
    /** GETTER
     * The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
     */
    @JsonGetter("front")
    public String getFront ( ) { 
        return this.front;
    }
    
    /** SETTER
     * The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
     */
    @JsonSetter("front")
    public void setFront (String value) { 
        this.front = value;
        notifyObservers(this.front);
    }
 
    /** GETTER
     * The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
     */
    @JsonGetter("back")
    public String getBack ( ) { 
        return this.back;
    }
    
    /** SETTER
     * The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
     */
    @JsonSetter("back")
    public void setBack (String value) { 
        this.back = value;
        notifyObservers(this.back);
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
     * A string value to use as a description for this AreaMail item.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * A string value to use as a description for this AreaMail item.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
        notifyObservers(this.description);
    }
 
    /** GETTER
     * The delivery location type.
     */
    @JsonGetter("targettype")
    public String getTargettype ( ) { 
        return this.targettype;
    }
    
    /** SETTER
     * The delivery location type.
     */
    @JsonSetter("targettype")
    public void setTargettype (String value) { 
        this.targettype = value;
        notifyObservers(this.targettype);
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
 