/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCheckFundsInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5136165618226637248L;
    private String accountSid;
    private String authToken;
    /** GETTER
     * Your message360 Account SID
     */
    @JsonGetter("account_sid")
    public String getAccountSid ( ) { 
        return this.accountSid;
    }
    
    /** SETTER
     * Your message360 Account SID
     */
    @JsonSetter("account_sid")
    public void setAccountSid (String value) { 
        this.accountSid = value;
        notifyObservers(this.accountSid);
    }
 
    /** GETTER
     * Your message360 Token
     */
    @JsonGetter("auth_token")
    public String getAuthToken ( ) { 
        return this.authToken;
    }
    
    /** SETTER
     * Your message360 Token
     */
    @JsonSetter("auth_token")
    public void setAuthToken (String value) { 
        this.authToken = value;
        notifyObservers(this.authToken);
    }
 
}
 