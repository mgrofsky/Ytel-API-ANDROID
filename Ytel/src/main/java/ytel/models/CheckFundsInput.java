/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CheckFundsInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4826685621862505028L;
    private String accountSid;
    private String authToken;
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
 
}
 