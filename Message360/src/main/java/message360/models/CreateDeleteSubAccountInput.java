/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateDeleteSubAccountInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5425160298354477137L;
    private String subAccountSID;
    private MergeNumberStatus mergeNumber = MergeNumberStatus.DELETE;
    private String responseType = "json";
    /** GETTER
     * The SubaccountSid to be deleted
     */
    @JsonGetter("SubAccountSID")
    public String getSubAccountSID ( ) { 
        return this.subAccountSID;
    }
    
    /** SETTER
     * The SubaccountSid to be deleted
     */
    @JsonSetter("SubAccountSID")
    public void setSubAccountSID (String value) { 
        this.subAccountSID = value;
        notifyObservers(this.subAccountSID);
    }
 
    /** GETTER
     * 0 to delete or 1 to merge numbers to parent account.
     */
    @JsonGetter("MergeNumber")
    public MergeNumberStatus getMergeNumber ( ) { 
        return this.mergeNumber;
    }
    
    /** SETTER
     * 0 to delete or 1 to merge numbers to parent account.
     */
    @JsonSetter("MergeNumber")
    public void setMergeNumber (MergeNumberStatus value) { 
        this.mergeNumber = value;
        notifyObservers(this.mergeNumber);
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
 