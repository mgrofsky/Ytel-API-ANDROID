/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AvailablePhoneNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4728554151683755521L;
    private NumberTypeEnum numbertype;
    private String areacode;
    private String responseType = "json";
    private Integer pagesize = 10;
    /** GETTER
     * Number type either SMS,Voice or all
     */
    @JsonGetter("numbertype")
    public NumberTypeEnum getNumbertype ( ) { 
        return this.numbertype;
    }
    
    /** SETTER
     * Number type either SMS,Voice or all
     */
    @JsonSetter("numbertype")
    public void setNumbertype (NumberTypeEnum value) { 
        this.numbertype = value;
        notifyObservers(this.numbertype);
    }
 
    /** GETTER
     * Specifies the area code for the returned list of available numbers. Only available for North American numbers.
     */
    @JsonGetter("areacode")
    public String getAreacode ( ) { 
        return this.areacode;
    }
    
    /** SETTER
     * Specifies the area code for the returned list of available numbers. Only available for North American numbers.
     */
    @JsonSetter("areacode")
    public void setAreacode (String value) { 
        this.areacode = value;
        notifyObservers(this.areacode);
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
     * The count of objects to return.
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * The count of objects to return.
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
}
 