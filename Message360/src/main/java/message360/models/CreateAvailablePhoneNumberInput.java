/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateAvailablePhoneNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4826301287896077905L;
    private NumberType numberType;
    private String areaCode;
    private Integer pageSize;
    private String responseType = "json";
    /** GETTER
     * Number type either SMS,Voice or all
     */
    @JsonGetter("NumberType")
    public NumberType getNumberType ( ) { 
        return this.numberType;
    }
    
    /** SETTER
     * Number type either SMS,Voice or all
     */
    @JsonSetter("NumberType")
    public void setNumberType (NumberType value) { 
        this.numberType = value;
        notifyObservers(this.numberType);
    }
 
    /** GETTER
     * Phone Number Area Code
     */
    @JsonGetter("AreaCode")
    public String getAreaCode ( ) { 
        return this.areaCode;
    }
    
    /** SETTER
     * Phone Number Area Code
     */
    @JsonSetter("AreaCode")
    public void setAreaCode (String value) { 
        this.areaCode = value;
        notifyObservers(this.areaCode);
    }
 
    /** GETTER
     * Page Size
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * Page Size
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
        notifyObservers(this.pageSize);
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
 