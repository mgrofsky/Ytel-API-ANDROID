/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/02/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateDeleteMergeSubAccountInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5488759837356132836L;
    private String subaccountsid;
    private MergeNumberStatus mergenumber;
    private String responseType = "json";
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
    @JsonGetter("mergenumber")
    public MergeNumberStatus getMergenumber ( ) { 
        return this.mergenumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("mergenumber")
    public void setMergenumber (MergeNumberStatus value) { 
        this.mergenumber = value;
        notifyObservers(this.mergenumber);
    }
 
    /** GETTER
     * Response type format either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 