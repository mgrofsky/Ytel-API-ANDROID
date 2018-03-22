/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateTokenInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5261182539872815767L;
    private String accountSid;
    private String authToken;
    private String username;
    private String password;
    /** GETTER
     * Your Ytel Account SID
     */
    @JsonGetter("account_sid")
    public String getAccountSid ( ) { 
        return this.accountSid;
    }
    
    /** SETTER
     * Your Ytel Account SID
     */
    @JsonSetter("account_sid")
    public void setAccountSid (String value) { 
        this.accountSid = value;
        notifyObservers(this.accountSid);
    }
 
    /** GETTER
     * Your Ytel Token
     */
    @JsonGetter("auth_token")
    public String getAuthToken ( ) { 
        return this.authToken;
    }
    
    /** SETTER
     * Your Ytel Token
     */
    @JsonSetter("auth_token")
    public void setAuthToken (String value) { 
        this.authToken = value;
        notifyObservers(this.authToken);
    }
 
    /** GETTER
     * WebRTC username authentication
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * WebRTC username authentication
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
        notifyObservers(this.username);
    }
 
    /** GETTER
     * WebRTC password authentication
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * WebRTC password authentication
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
        notifyObservers(this.password);
    }
 
}
 