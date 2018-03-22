/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BulkBuyNumberInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5347185043778556425L;
    private NumberTypeEnum numberType;
    private String areaCode;
    private String quantity;
    private String responseType = "json";
    private String leftover;
    /** GETTER
     * The capability the number supports.
     */
    @JsonGetter("NumberType")
    public NumberTypeEnum getNumberType ( ) { 
        return this.numberType;
    }
    
    /** SETTER
     * The capability the number supports.
     */
    @JsonSetter("NumberType")
    public void setNumberType (NumberTypeEnum value) { 
        this.numberType = value;
        notifyObservers(this.numberType);
    }
 
    /** GETTER
     * Specifies the area code for the returned list of available numbers. Only available for North American numbers.
     */
    @JsonGetter("AreaCode")
    public String getAreaCode ( ) { 
        return this.areaCode;
    }
    
    /** SETTER
     * Specifies the area code for the returned list of available numbers. Only available for North American numbers.
     */
    @JsonSetter("AreaCode")
    public void setAreaCode (String value) { 
        this.areaCode = value;
        notifyObservers(this.areaCode);
    }
 
    /** GETTER
     * A positive integer that tells how many number you want to buy at a time.
     */
    @JsonGetter("Quantity")
    public String getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * A positive integer that tells how many number you want to buy at a time.
     */
    @JsonSetter("Quantity")
    public void setQuantity (String value) { 
        this.quantity = value;
        notifyObservers(this.quantity);
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
     * If desired quantity is unavailable purchase what is available .
     */
    @JsonGetter("Leftover")
    public String getLeftover ( ) { 
        return this.leftover;
    }
    
    /** SETTER
     * If desired quantity is unavailable purchase what is available .
     */
    @JsonSetter("Leftover")
    public void setLeftover (String value) { 
        this.leftover = value;
        notifyObservers(this.leftover);
    }
 
}
 