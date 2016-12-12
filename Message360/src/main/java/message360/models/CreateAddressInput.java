/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateAddressInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5236435620586402610L;
    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private String zip;
    private String description;
    private String email;
    private String phone;
    private String responseType = "json";
    /** GETTER
     * Name of user
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of user
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * Address of user.
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Address of user.
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
        notifyObservers(this.address);
    }
 
    /** GETTER
     * Must be a 2 letter country short-name code (ISO 3166)
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Must be a 2 letter country short-name code (ISO 3166)
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
        notifyObservers(this.country);
    }
 
    /** GETTER
     * Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
        notifyObservers(this.state);
    }
 
    /** GETTER
     * City Name.
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * City Name.
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
        notifyObservers(this.city);
    }
 
    /** GETTER
     * Zip code of city.
     */
    @JsonGetter("zip")
    public String getZip ( ) { 
        return this.zip;
    }
    
    /** SETTER
     * Zip code of city.
     */
    @JsonSetter("zip")
    public void setZip (String value) { 
        this.zip = value;
        notifyObservers(this.zip);
    }
 
    /** GETTER
     * Description of addresses.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description of addresses.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
        notifyObservers(this.description);
    }
 
    /** GETTER
     * Email Id of user.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email Id of user.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
        notifyObservers(this.email);
    }
 
    /** GETTER
     * Phone number of user.
     */
    @JsonGetter("phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * Phone number of user.
     */
    @JsonSetter("phone")
    public void setPhone (String value) { 
        this.phone = value;
        notifyObservers(this.phone);
    }
 
    /** GETTER
     * Response Type Either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type Either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 