/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateAddressInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5503568752941760865L;
    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private String zip;
    private String responseType = "json";
    private String description;
    private String email;
    private String phone;
    /** GETTER
     * Name of user
     */
    @JsonGetter("Name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of user
     */
    @JsonSetter("Name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * Address of user.
     */
    @JsonGetter("Address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Address of user.
     */
    @JsonSetter("Address")
    public void setAddress (String value) { 
        this.address = value;
        notifyObservers(this.address);
    }
 
    /** GETTER
     * Must be a 2 letter country short-name code (ISO 3166)
     */
    @JsonGetter("Country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Must be a 2 letter country short-name code (ISO 3166)
     */
    @JsonSetter("Country")
    public void setCountry (String value) { 
        this.country = value;
        notifyObservers(this.country);
    }
 
    /** GETTER
     * Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
     */
    @JsonGetter("State")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
     */
    @JsonSetter("State")
    public void setState (String value) { 
        this.state = value;
        notifyObservers(this.state);
    }
 
    /** GETTER
     * City Name.
     */
    @JsonGetter("City")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * City Name.
     */
    @JsonSetter("City")
    public void setCity (String value) { 
        this.city = value;
        notifyObservers(this.city);
    }
 
    /** GETTER
     * Zip code of city.
     */
    @JsonGetter("Zip")
    public String getZip ( ) { 
        return this.zip;
    }
    
    /** SETTER
     * Zip code of city.
     */
    @JsonSetter("Zip")
    public void setZip (String value) { 
        this.zip = value;
        notifyObservers(this.zip);
    }
 
    /** GETTER
     * Response type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
    /** GETTER
     * Description of addresses.
     */
    @JsonGetter("Description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description of addresses.
     */
    @JsonSetter("Description")
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
    @JsonGetter("Phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * Phone number of user.
     */
    @JsonSetter("Phone")
    public void setPhone (String value) { 
        this.phone = value;
        notifyObservers(this.phone);
    }
 
}
 