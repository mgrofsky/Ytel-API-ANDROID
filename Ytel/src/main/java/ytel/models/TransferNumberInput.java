/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransferNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5568349667135947832L;
    private String phonenumber;
    private String fromaccountsid;
    private String toaccountsid;
    private String responseType = "json";
    /** GETTER
     * A valid 10-digit Ytel number (E.164 format).
     */
    @JsonGetter("phonenumber")
    public String getPhonenumber ( ) { 
        return this.phonenumber;
    }
    
    /** SETTER
     * A valid 10-digit Ytel number (E.164 format).
     */
    @JsonSetter("phonenumber")
    public void setPhonenumber (String value) { 
        this.phonenumber = value;
        notifyObservers(this.phonenumber);
    }
 
    /** GETTER
     * A specific Accountsid from where Number is getting transfer.
     */
    @JsonGetter("fromaccountsid")
    public String getFromaccountsid ( ) { 
        return this.fromaccountsid;
    }
    
    /** SETTER
     * A specific Accountsid from where Number is getting transfer.
     */
    @JsonSetter("fromaccountsid")
    public void setFromaccountsid (String value) { 
        this.fromaccountsid = value;
        notifyObservers(this.fromaccountsid);
    }
 
    /** GETTER
     * A specific Accountsid to which Number is getting transfer.
     */
    @JsonGetter("toaccountsid")
    public String getToaccountsid ( ) { 
        return this.toaccountsid;
    }
    
    /** SETTER
     * A specific Accountsid to which Number is getting transfer.
     */
    @JsonSetter("toaccountsid")
    public void setToaccountsid (String value) { 
        this.toaccountsid = value;
        notifyObservers(this.toaccountsid);
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
 