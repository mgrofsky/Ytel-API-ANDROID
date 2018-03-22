/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TemplateDataModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4735010036061585944L;
    private String companyname;
    private String otpcode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("companyname")
    public String getCompanyname ( ) { 
        return this.companyname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("companyname")
    public void setCompanyname (String value) { 
        this.companyname = value;
        notifyObservers(this.companyname);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("otpcode")
    public String getOtpcode ( ) { 
        return this.otpcode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("otpcode")
    public void setOtpcode (String value) { 
        this.otpcode = value;
        notifyObservers(this.otpcode);
    }
 
}
 