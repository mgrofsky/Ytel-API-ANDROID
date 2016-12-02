/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/02/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSuspendSubAccountInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5764268940262133893L;
    private String subaccountsid;
    private ActivateStatus activate;
    private String responseType;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("subaccountsid")
    public String getSubaccountsid ( ) { 
        return this.subaccountsid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("subaccountsid")
    public void setSubaccountsid (String value) { 
        this.subaccountsid = value;
        notifyObservers(this.subaccountsid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("activate")
    public ActivateStatus getActivate ( ) { 
        return this.activate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("activate")
    public void setActivate (ActivateStatus value) { 
        this.activate = value;
        notifyObservers(this.activate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 