/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SuspendSubAccountInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5383739240914516794L;
    private String subAccountSID;
    private ActivateStatusEnum activate = ActivateStatusEnum.DEACTIVATE;
    private String responseType = "json";
    /** GETTER
     * The SubaccountSid to be activated or suspended
     */
    @JsonGetter("SubAccountSID")
    public String getSubAccountSID ( ) { 
        return this.subAccountSID;
    }
    
    /** SETTER
     * The SubaccountSid to be activated or suspended
     */
    @JsonSetter("SubAccountSID")
    public void setSubAccountSID (String value) { 
        this.subAccountSID = value;
        notifyObservers(this.subAccountSID);
    }
 
    /** GETTER
     * 0 to suspend or 1 to activate
     */
    @JsonGetter("Activate")
    public ActivateStatusEnum getActivate ( ) { 
        return this.activate;
    }
    
    /** SETTER
     * 0 to suspend or 1 to activate
     */
    @JsonSetter("Activate")
    public void setActivate (ActivateStatusEnum value) { 
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
 