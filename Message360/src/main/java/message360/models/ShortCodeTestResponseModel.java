/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ShortCodeTestResponseModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5736402319249335924L;
    private Message360Model message360;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message360")
    public Message360Model getMessage360 ( ) { 
        return this.message360;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message360")
    public void setMessage360 (Message360Model value) { 
        this.message360 = value;
        notifyObservers(this.message360);
    }
 
}
 