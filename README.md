# Getting started

Ytel API version 3

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

* Browse to locate the folder containing the source code. Select the location of the Ytel gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

## How to Use

The following section explains how to use the Ytel library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

In the following step naigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':Ytel')``` to the dependencies section as shown in the illustration below.

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Ytel&workspaceName=Ytel&projectName=Ytel&rootNamespace=ytel)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > Ytel > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

ytel.Configuration.initialize(appContext);
YtelClient client = new YtelClient(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [WebRTCController](#web_rtc_controller)
* [SharedShortCodeController](#shared_short_code_controller)
* [ConferenceController](#conference_controller)
* [PhoneNumberController](#phone_number_controller)
* [TranscriptionController](#transcription_controller)
* [RecordingController](#recording_controller)
* [EmailController](#email_controller)
* [SMSController](#sms_controller)
* [CallController](#call_controller)
* [CarrierController](#carrier_controller)
* [AddressController](#address_controller)
* [SubAccountController](#sub_account_controller)
* [AccountController](#account_controller)
* [UsageController](#usage_controller)
* [ShortCodeController](#short_code_controller)
* [PostCardController](#post_card_controller)
* [LetterController](#letter_controller)
* [AreaMailController](#area_mail_controller)

## <a name="web_rtc_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.WebRTCController") WebRTCController

### Get singleton instance

The singleton instance of the ``` WebRTCController ``` class can be accessed from the API Client.

```java
WebRTCController webRTC = client.getWebRTC();
```

### <a name="create_token_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.WebRTCController.createTokenAsync") createTokenAsync

> Ytel webrtc


```java
void createTokenAsync(
        final CreateTokenInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSid |  ``` Required ```  | Your Ytel Account SID |
| authToken |  ``` Required ```  | Your Ytel Token |
| username |  ``` Required ```  | WebRTC username authentication |
| password |  ``` Required ```  | WebRTC password authentication |


#### Example Usage

```java
CreateTokenInput collect = new CreateTokenInput();

String accountSid = "account_sid";
collect.setAccountSid(accountSid);

String authToken = "auth_token";
collect.setAuthToken(authToken);

String username = "username";
collect.setUsername(username);

String password = "password";
collect.setPassword(password);

// Invoking the API call with sample inputs
webRTC.createTokenAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="check_funds_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.WebRTCController.checkFundsAsync") checkFundsAsync

> TODO: Add a method description


```java
void checkFundsAsync(
        final CheckFundsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSid |  ``` Required ```  | Your Ytel Account SID |
| authToken |  ``` Required ```  | Your Ytel Token |


#### Example Usage

```java
CheckFundsInput collect = new CheckFundsInput();

String accountSid = "account_sid";
collect.setAccountSid(accountSid);

String authToken = "auth_token";
collect.setAuthToken(authToken);

// Invoking the API call with sample inputs
webRTC.checkFundsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="shared_short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.SharedShortCodeController") SharedShortCodeController

### Get singleton instance

The singleton instance of the ``` SharedShortCodeController ``` class can be accessed from the API Client.

```java
SharedShortCodeController sharedShortCode = client.getSharedShortCode();
```

### <a name="view_template_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.viewTemplateAsync") viewTemplateAsync

> View a Shared ShortCode Template


```java
void viewTemplateAsync(
        final ViewTemplateInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| templateId |  ``` Required ```  | The unique identifier for a template object |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewTemplateInput collect = new ViewTemplateInput();

UUID templateId = UUID.randomUUID();
collect.setTemplateId(templateId);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sharedShortCode.viewTemplateAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_shared_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.viewSharedShortcodesAsync") viewSharedShortcodesAsync

> View a ShortCode Message


```java
void viewSharedShortcodesAsync(
        final ViewSharedShortcodesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messagesid |  ``` Required ```  | Message sid |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewSharedShortcodesInput collect = new ViewSharedShortcodesInput();

String messagesid = "messagesid";
collect.setMessagesid(messagesid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sharedShortCode.viewSharedShortcodesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_outbound_shared_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.listOutboundSharedShortcodesAsync") listOutboundSharedShortcodesAsync

> List ShortCode Messages


```java
void listOutboundSharedShortcodesAsync(
        final ListOutboundSharedShortcodesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| shortcode |  ``` Optional ```  | Only list messages sent from this Short Code |
| to |  ``` Optional ```  | Only list messages sent to this number |
| datesent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |


#### Example Usage

```java
ListOutboundSharedShortcodesInput collect = new ListOutboundSharedShortcodesInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String to = "to";
collect.setTo(to);

String datesent = "datesent";
collect.setDatesent(datesent);

// Invoking the API call with sample inputs
sharedShortCode.listOutboundSharedShortcodesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_inbound_shared_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.listInboundSharedShortcodesAsync") listInboundSharedShortcodesAsync

> List All Inbound ShortCode


```java
void listInboundSharedShortcodesAsync(
        final ListInboundSharedShortcodesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound ShortCode |
| shortcode |  ``` Optional ```  | Only list messages sent to this Short Code |
| datecreated |  ``` Optional ```  | Only list messages sent with the specified date |


#### Example Usage

```java
ListInboundSharedShortcodesInput collect = new ListInboundSharedShortcodesInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String from = "from";
collect.setFrom(from);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String datecreated = "Datecreated";
collect.setDatecreated(datecreated);

// Invoking the API call with sample inputs
sharedShortCode.listInboundSharedShortcodesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="send_shared_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.sendSharedShortcodeAsync") sendSharedShortcodeAsync

> Send an SMS from a Ytel ShortCode


```java
void sendSharedShortcodeAsync(
        final SendSharedShortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | The Short Code number that is the sender of this message |
| to |  ``` Required ```  | A valid 10-digit number that should receive the message |
| templateid |  ``` Required ```  | The unique identifier for the template used for the message |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| data |  ``` Required ```  | format of your data, example: {companyname}:test,{otpcode}:1234 |
| method |  ``` Optional ```  ``` DefaultValue ```  | Specifies the HTTP method used to request the required URL once the Short Code message is sent. |
| messageStatusCallback |  ``` Optional ```  | URL that can be requested to receive notification when Short Code message was sent. |


#### Example Usage

```java
SendSharedShortcodeInput collect = new SendSharedShortcodeInput();

String shortcode = "shortcode";
collect.setShortcode(shortcode);

String to = "to";
collect.setTo(to);

UUID templateid = UUID.randomUUID();
collect.setTemplateid(templateid);

String responseType = "json";
collect.setResponseType(responseType);

String data = "data";
collect.setData(data);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String messageStatusCallback = "MessageStatusCallback";
collect.setMessageStatusCallback(messageStatusCallback);

// Invoking the API call with sample inputs
sharedShortCode.sendSharedShortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_templates_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.listTemplatesAsync") listTemplatesAsync

> List Shortcode Templates by Type


```java
void listTemplatesAsync(
        final ListTemplatesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| type |  ``` Optional ```  ``` DefaultValue ```  | The type (category) of template Valid values: marketing, authorization |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| shortcode |  ``` Optional ```  | Only list templates of type |


#### Example Usage

```java
ListTemplatesInput collect = new ListTemplatesInput();

String responseType = "json";
collect.setResponseType(responseType);

String type = "authorization";
collect.setType(type);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

// Invoking the API call with sample inputs
sharedShortCode.listTemplatesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_keyword_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.viewKeywordAsync") viewKeywordAsync

> View a set of properties for a single keyword.


```java
void viewKeywordAsync(
        final ViewKeywordInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| keywordid |  ``` Required ```  | The unique identifier of each keyword |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewKeywordInput collect = new ViewKeywordInput();

String keywordid = "Keywordid";
collect.setKeywordid(keywordid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sharedShortCode.viewKeywordAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_keyword_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.listKeywordAsync") listKeywordAsync

> Retrieve a list of keywords associated with your Ytel account.


```java
void listKeywordAsync(
        final ListKeywordInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| keyword |  ``` Optional ```  | Only list keywords of keyword |
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |


#### Example Usage

```java
ListKeywordInput collect = new ListKeywordInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String keyword = "Keyword";
collect.setKeyword(keyword);

Integer shortcode = 204;
collect.setShortcode(shortcode);

// Invoking the API call with sample inputs
sharedShortCode.listKeywordAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_assignement_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.viewAssignementAsync") viewAssignementAsync

> The response returned here contains all resource properties associated with the given Shortcode.


```java
void viewAssignementAsync(
        final ViewAssignementInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid Shortcode to your Ytel account |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewAssignementInput collect = new ViewAssignementInput();

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sharedShortCode.viewAssignementAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_assignment_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.listAssignmentAsync") listAssignmentAsync

> Retrieve a list of shortcode assignment associated with your Ytel account.


```java
void listAssignmentAsync(
        final ListAssignmentInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |


#### Example Usage

```java
ListAssignmentInput collect = new ListAssignmentInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

// Invoking the API call with sample inputs
sharedShortCode.listAssignmentAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="update_assignment_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SharedShortCodeController.updateAssignmentAsync") updateAssignmentAsync

> TODO: Add a method description


```java
void updateAssignmentAsync(
        final UpdateAssignmentInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid shortcode to your Ytel account |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| friendlyName |  ``` Optional ```  | User generated name of the shortcode |
| callbackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| callbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. |
| fallbackUrl |  ``` Optional ```  | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. |
| fallbackUrlMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |


#### Example Usage

```java
UpdateAssignmentInput collect = new UpdateAssignmentInput();

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String responseType = "json";
collect.setResponseType(responseType);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String callbackUrl = "CallbackUrl";
collect.setCallbackUrl(callbackUrl);

HttpActionEnum callbackMethod = HttpActionEnum.fromString("GET");
collect.setCallbackMethod(callbackMethod);

String fallbackUrl = "FallbackUrl";
collect.setFallbackUrl(fallbackUrl);

HttpActionEnum fallbackUrlMethod = HttpActionEnum.fromString("GET");
collect.setFallbackUrlMethod(fallbackUrlMethod);

// Invoking the API call with sample inputs
sharedShortCode.updateAssignmentAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="conference_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.ConferenceController") ConferenceController

### Get singleton instance

The singleton instance of the ``` ConferenceController ``` class can be accessed from the API Client.

```java
ConferenceController conference = client.getConference();
```

### <a name="deaf_mute_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.deafMuteParticipantAsync") deafMuteParticipantAsync

> Deaf Mute Participant


```java
void deafMuteParticipantAsync(
        final DeafMuteParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | ID of the active conference |
| participantSid |  ``` Required ```  | ID of an active participant |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| muted |  ``` Optional ```  | Mute a participant |
| deaf |  ``` Optional ```  | Make it so a participant cant hear |


#### Example Usage

```java
DeafMuteParticipantInput collect = new DeafMuteParticipantInput();

String conferenceSid = "conferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

String responseType = "json";
collect.setResponseType(responseType);

Boolean muted = true;
collect.setMuted(muted);

Boolean deaf = true;
collect.setDeaf(deaf);

// Invoking the API call with sample inputs
conference.deafMuteParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.viewParticipantAsync") viewParticipantAsync

> Retrieve information about a participant by its ParticipantSid.


```java
void viewParticipantAsync(
        final ViewParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewParticipantInput collect = new ViewParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.viewParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.viewConferenceAsync") viewConferenceAsync

> Retrieve information about a conference by its ConferenceSid.


```java
void viewConferenceAsync(
        final ViewConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier of each conference resource |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewConferenceInput collect = new ViewConferenceInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.viewConferenceAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="add_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.addParticipantAsync") addParticipantAsync

> Add Participant in conference 


```java
void addParticipantAsync(
        final AddParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantNumber |  ``` Required ```  | The phone number of the participant to be added. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| muted |  ``` Optional ```  | Specifies if participant should be muted. |
| deaf |  ``` Optional ```  | Specifies if the participant should hear audio in the conference. |


#### Example Usage

```java
AddParticipantInput collect = new AddParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantNumber = "ParticipantNumber";
collect.setParticipantNumber(participantNumber);

String responseType = "json";
collect.setResponseType(responseType);

Boolean muted = true;
collect.setMuted(muted);

Boolean deaf = true;
collect.setDeaf(deaf);

// Invoking the API call with sample inputs
conference.addParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.createConferenceAsync") createConferenceAsync

> Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.


```java
void createConferenceAsync(
        final CreateConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | A valid 10-digit number (E.164 format) that will be initiating the conference call. |
| to |  ``` Required ```  | A valid 10-digit number (E.164 format) that is to receive the conference call. |
| url |  ``` Required ```  | URL requested once the conference connects |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  ``` DefaultValue ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallbackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| record |  ``` Optional ```  | Specifies if the conference should be recorded. |
| recordCallBackUrl |  ``` Optional ```  | Recording parameters will be sent here upon completion. |
| recordCallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once conference connects. |
| scheduleTime |  ``` Optional ```  | Schedule conference in future. Schedule time must be greater than current time |
| timeout |  ``` Optional ```  | The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. |


#### Example Usage

```java
CreateConferenceInput collect = new CreateConferenceInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

String responseType = "json";
collect.setResponseType(responseType);

HttpActionEnum method = HttpActionEnum.fromString("POST");
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

HttpActionEnum statusCallBackMethod = HttpActionEnum.fromString("GET");
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallbackUrl = "FallbackUrl";
collect.setFallbackUrl(fallbackUrl);

HttpActionEnum fallbackMethod = HttpActionEnum.fromString("GET");
collect.setFallbackMethod(fallbackMethod);

Boolean record = true;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

HttpActionEnum recordCallBackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallBackMethod(recordCallBackMethod);

String scheduleTime = "ScheduleTime";
collect.setScheduleTime(scheduleTime);

Integer timeout = 204;
collect.setTimeout(timeout);

// Invoking the API call with sample inputs
conference.createConferenceAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="hangup_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.hangupParticipantAsync") hangupParticipantAsync

> Remove a participant from a conference.


```java
void hangupParticipantAsync(
        final HangupParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
HangupParticipantInput collect = new HangupParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.hangupParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="play_conference_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.playConferenceAudioAsync") playConferenceAudioAsync

> Play an audio file during a conference.


```java
void playConferenceAudioAsync(
        final PlayConferenceAudioInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |
| audioUrl |  ``` Required ```  | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
PlayConferenceAudioInput collect = new PlayConferenceAudioInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

AudioFormatEnum audioUrl = AudioFormatEnum.fromString("mp3");
collect.setAudioUrl(audioUrl);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.playConferenceAudioAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.listParticipantAsync") listParticipantAsync

> Retrieve a list of participants for an in-progress conference.


```java
void listParticipantAsync(
        final ListParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response format, xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| muted |  ``` Optional ```  | Specifies if participant should be muted. |
| deaf |  ``` Optional ```  | Specifies if the participant should hear audio in the conference. |


#### Example Usage

```java
ListParticipantInput collect = new ListParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

Boolean muted = true;
collect.setMuted(muted);

Boolean deaf = true;
collect.setDeaf(deaf);

// Invoking the API call with sample inputs
conference.listParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ConferenceController.listConferenceAsync") listConferenceAsync

> Retrieve a list of conference objects.


```java
void listConferenceAsync(
        final ListConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| friendlyName |  ``` Optional ```  | Only return conferences with the specified FriendlyName |
| dateCreated |  ``` Optional ```  | Conference created date |


#### Example Usage

```java
ListConferenceInput collect = new ListConferenceInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
conference.listConferenceAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="phone_number_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.PhoneNumberController") PhoneNumberController

### Get singleton instance

The singleton instance of the ``` PhoneNumberController ``` class can be accessed from the API Client.

```java
PhoneNumberController phoneNumber = client.getPhoneNumber();
```

### <a name="available_phone_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.availablePhoneNumberAsync") availablePhoneNumberAsync

> Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.


```java
void availablePhoneNumberAsync(
        final AvailablePhoneNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numbertype |  ``` Required ```  | Number type either SMS,Voice or all |
| areacode |  ``` Required ```  | Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return. |


#### Example Usage

```java
AvailablePhoneNumberInput collect = new AvailablePhoneNumberInput();

NumberTypeEnum numbertype = NumberTypeEnum.fromString("ALL");
collect.setNumbertype(numbertype);

String areacode = "areacode";
collect.setAreacode(areacode);

String responseType = "json";
collect.setResponseType(responseType);

Integer pagesize = 10;
collect.setPagesize(pagesize);

// Invoking the API call with sample inputs
phoneNumber.availablePhoneNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="mass_release_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.massReleaseNumberAsync") massReleaseNumberAsync

> Remove a purchased Ytel number from your account.


```java
void massReleaseNumberAsync(
        final MassReleaseNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid Ytel comma separated numbers (E.164 format). |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
MassReleaseNumberInput collect = new MassReleaseNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.massReleaseNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_number_details_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.viewNumberDetailsAsync") viewNumberDetailsAsync

> Retrieve the details for a phone number by its number.


```java
void viewNumberDetailsAsync(
        final ViewNumberDetailsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid Ytel 10-digit phone number (E.164 format). |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewNumberDetailsInput collect = new ViewNumberDetailsInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.viewNumberDetailsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="release_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.releaseNumberAsync") releaseNumberAsync

> Remove a purchased Ytel number from your account.


```java
void releaseNumberAsync(
        final ReleaseNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid 10-digit Ytel number (E.164 format). |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ReleaseNumberInput collect = new ReleaseNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.releaseNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="buy_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.buyNumberAsync") buyNumberAsync

> Purchase a phone number to be used with your Ytel account


```java
void buyNumberAsync(
        final BuyNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid 10-digit Ytel number (E.164 format). |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
BuyNumberInput collect = new BuyNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.buyNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="update_phone_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.updatePhoneNumberAsync") updatePhoneNumberAsync

> Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.


```java
void updatePhoneNumberAsync(
        final UpdatePhoneNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid Ytel number (E.164 format). |
| voiceUrl |  ``` Required ```  | URL requested once the call connects |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| friendlyName |  ``` Optional ```  | Phone number friendly name description |
| voiceMethod |  ``` Optional ```  | Post or Get |
| voiceFallbackUrl |  ``` Optional ```  | URL requested if the voice URL is not available |
| voiceFallbackMethod |  ``` Optional ```  | Post or Get |
| hangupCallback |  ``` Optional ```  | callback url after a hangup occurs |
| hangupCallbackMethod |  ``` Optional ```  | Post or Get |
| heartbeatUrl |  ``` Optional ```  | URL requested once the call connects |
| heartbeatMethod |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed time |
| smsUrl |  ``` Optional ```  | URL requested when an SMS is received |
| smsMethod |  ``` Optional ```  | Post or Get |
| smsFallbackUrl |  ``` Optional ```  | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. |
| smsFallbackMethod |  ``` Optional ```  | The HTTP method Ytel will use when URL requested if the SmsUrl is not available. |


#### Example Usage

```java
UpdatePhoneNumberInput collect = new UpdatePhoneNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String voiceUrl = "VoiceUrl";
collect.setVoiceUrl(voiceUrl);

String responseType = "json";
collect.setResponseType(responseType);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

HttpActionEnum voiceMethod = HttpActionEnum.fromString("GET");
collect.setVoiceMethod(voiceMethod);

String voiceFallbackUrl = "VoiceFallbackUrl";
collect.setVoiceFallbackUrl(voiceFallbackUrl);

HttpActionEnum voiceFallbackMethod = HttpActionEnum.fromString("GET");
collect.setVoiceFallbackMethod(voiceFallbackMethod);

String hangupCallback = "HangupCallback";
collect.setHangupCallback(hangupCallback);

HttpActionEnum hangupCallbackMethod = HttpActionEnum.fromString("GET");
collect.setHangupCallbackMethod(hangupCallbackMethod);

String heartbeatUrl = "HeartbeatUrl";
collect.setHeartbeatUrl(heartbeatUrl);

HttpActionEnum heartbeatMethod = HttpActionEnum.fromString("GET");
collect.setHeartbeatMethod(heartbeatMethod);

String smsUrl = "SmsUrl";
collect.setSmsUrl(smsUrl);

HttpActionEnum smsMethod = HttpActionEnum.fromString("GET");
collect.setSmsMethod(smsMethod);

String smsFallbackUrl = "SmsFallbackUrl";
collect.setSmsFallbackUrl(smsFallbackUrl);

HttpActionEnum smsFallbackMethod = HttpActionEnum.fromString("GET");
collect.setSmsFallbackMethod(smsFallbackMethod);

// Invoking the API call with sample inputs
phoneNumber.updatePhoneNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="transfer_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.transferNumberAsync") transferNumberAsync

> Transfer phone number that has been purchased for from one account to another account.


```java
void transferNumberAsync(
        final TransferNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | A valid 10-digit Ytel number (E.164 format). |
| fromaccountsid |  ``` Required ```  | A specific Accountsid from where Number is getting transfer. |
| toaccountsid |  ``` Required ```  | A specific Accountsid to which Number is getting transfer. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
TransferNumberInput collect = new TransferNumberInput();

String phonenumber = "phonenumber";
collect.setPhonenumber(phonenumber);

String fromaccountsid = "fromaccountsid";
collect.setFromaccountsid(fromaccountsid);

String toaccountsid = "toaccountsid";
collect.setToaccountsid(toaccountsid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.transferNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.listNumberAsync") listNumberAsync

> Retrieve a list of purchased phones numbers associated with your Ytel account.


```java
void listNumberAsync(
        final ListNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| numberType |  ``` Optional ```  | The capability supported by the number.Number type either SMS,Voice or all |
| friendlyName |  ``` Optional ```  | A human-readable label added to the number object. |


#### Example Usage

```java
ListNumberInput collect = new ListNumberInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

NumberTypeEnum numberType = NumberTypeEnum.fromString("ALL");
collect.setNumberType(numberType);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

// Invoking the API call with sample inputs
phoneNumber.listNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="mass_update_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.massUpdateNumberAsync") massUpdateNumberAsync

> Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.


```java
void massUpdateNumberAsync(
        final MassUpdateNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid comma(,) separated Ytel numbers. (E.164 format). |
| voiceUrl |  ``` Required ```  | The URL returning InboundXML incoming calls should execute when connected. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| friendlyName |  ``` Optional ```  | A human-readable value for labeling the number. |
| voiceMethod |  ``` Optional ```  | Specifies the HTTP method used to request the VoiceUrl once incoming call connects. |
| voiceFallbackUrl |  ``` Optional ```  | URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url |
| voiceFallbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. |
| hangupCallback |  ``` Optional ```  | URL that can be requested to receive notification when and how incoming call has ended. |
| hangupCallbackMethod |  ``` Optional ```  | The HTTP method Ytel will use when requesting the HangupCallback URL. |
| heartbeatUrl |  ``` Optional ```  | URL that can be used to monitor the phone number. |
| heartbeatMethod |  ``` Optional ```  | The HTTP method Ytel will use when requesting the HeartbeatUrl. |
| smsUrl |  ``` Optional ```  | URL requested when an SMS is received. |
| smsMethod |  ``` Optional ```  | The HTTP method Ytel will use when requesting the SmsUrl. |
| smsFallbackUrl |  ``` Optional ```  | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. |
| smsFallbackMethod |  ``` Optional ```  | The HTTP method Ytel will use when URL requested if the SmsUrl is not available. |


#### Example Usage

```java
MassUpdateNumberInput collect = new MassUpdateNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String voiceUrl = "VoiceUrl";
collect.setVoiceUrl(voiceUrl);

String responseType = "json";
collect.setResponseType(responseType);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

HttpActionEnum voiceMethod = HttpActionEnum.fromString("GET");
collect.setVoiceMethod(voiceMethod);

String voiceFallbackUrl = "VoiceFallbackUrl";
collect.setVoiceFallbackUrl(voiceFallbackUrl);

HttpActionEnum voiceFallbackMethod = HttpActionEnum.fromString("GET");
collect.setVoiceFallbackMethod(voiceFallbackMethod);

String hangupCallback = "HangupCallback";
collect.setHangupCallback(hangupCallback);

HttpActionEnum hangupCallbackMethod = HttpActionEnum.fromString("GET");
collect.setHangupCallbackMethod(hangupCallbackMethod);

String heartbeatUrl = "HeartbeatUrl";
collect.setHeartbeatUrl(heartbeatUrl);

HttpActionEnum heartbeatMethod = HttpActionEnum.fromString("GET");
collect.setHeartbeatMethod(heartbeatMethod);

String smsUrl = "SmsUrl";
collect.setSmsUrl(smsUrl);

HttpActionEnum smsMethod = HttpActionEnum.fromString("GET");
collect.setSmsMethod(smsMethod);

String smsFallbackUrl = "SmsFallbackUrl";
collect.setSmsFallbackUrl(smsFallbackUrl);

HttpActionEnum smsFallbackMethod = HttpActionEnum.fromString("GET");
collect.setSmsFallbackMethod(smsFallbackMethod);

// Invoking the API call with sample inputs
phoneNumber.massUpdateNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="get_did_score_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.getDIDScoreNumberAsync") getDIDScoreNumberAsync

> Get DID Score Number


```java
void getDIDScoreNumberAsync(
        final GetDIDScoreNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | Specifies the multiple phone numbers for check updated spamscore . |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
GetDIDScoreNumberInput collect = new GetDIDScoreNumberInput();

String phonenumber = "Phonenumber";
collect.setPhonenumber(phonenumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.getDIDScoreNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="bulk_buy_number_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PhoneNumberController.bulkBuyNumberAsync") bulkBuyNumberAsync

> Purchase a selected number of DID's from specific area codes to be used with your Ytel account.


```java
void bulkBuyNumberAsync(
        final BulkBuyNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numberType |  ``` Required ```  | The capability the number supports. |
| areaCode |  ``` Required ```  | Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
| quantity |  ``` Required ```  | A positive integer that tells how many number you want to buy at a time. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| leftover |  ``` Optional ```  | If desired quantity is unavailable purchase what is available . |


#### Example Usage

```java
BulkBuyNumberInput collect = new BulkBuyNumberInput();

NumberTypeEnum numberType = NumberTypeEnum.fromString("ALL");
collect.setNumberType(numberType);

String areaCode = "AreaCode";
collect.setAreaCode(areaCode);

String quantity = "Quantity";
collect.setQuantity(quantity);

String responseType = "json";
collect.setResponseType(responseType);

String leftover = "Leftover";
collect.setLeftover(leftover);

// Invoking the API call with sample inputs
phoneNumber.bulkBuyNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="transcription_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.TranscriptionController") TranscriptionController

### Get singleton instance

The singleton instance of the ``` TranscriptionController ``` class can be accessed from the API Client.

```java
TranscriptionController transcription = client.getTranscription();
```

### <a name="view_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.TranscriptionController.viewTranscriptionAsync") viewTranscriptionAsync

> Retrieve information about a transaction by its TranscriptionSid.


```java
void viewTranscriptionAsync(
        final ViewTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transcriptionsid |  ``` Required ```  | The unique identifier for a transcription object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewTranscriptionInput collect = new ViewTranscriptionInput();

String transcriptionsid = "transcriptionsid";
collect.setTranscriptionsid(transcriptionsid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
transcription.viewTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="recording_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.TranscriptionController.recordingTranscriptionAsync") recordingTranscriptionAsync

> Transcribe a message360 recording by its RecordingSid.


```java
void recordingTranscriptionAsync(
        final RecordingTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | The unique identifier for a recording object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
RecordingTranscriptionInput collect = new RecordingTranscriptionInput();

String recordingSid = "recordingSid";
collect.setRecordingSid(recordingSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
transcription.recordingTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="audio_url_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.TranscriptionController.audioURLTranscriptionAsync") audioURLTranscriptionAsync

> Transcribe an audio recording from a file.


```java
void audioURLTranscriptionAsync(
        final AudioURLTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| audiourl |  ``` Required ```  | URL pointing to the location of the audio file that is to be transcribed. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
AudioURLTranscriptionInput collect = new AudioURLTranscriptionInput();

String audiourl = "audiourl";
collect.setAudiourl(audiourl);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
transcription.audioURLTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.TranscriptionController.listTranscriptionAsync") listTranscriptionAsync

> Retrieve a list of transcription objects for your Ytel account.


```java
void listTranscriptionAsync(
        final ListTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| status |  ``` Optional ```  | The state of the transcription. |
| dateTranscribed |  ``` Optional ```  | The date the transcription took place. |


#### Example Usage

```java
ListTranscriptionInput collect = new ListTranscriptionInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

StatusEnum status = StatusEnum.fromString("INPROGRESS");
collect.setStatus(status);

String dateTranscribed = "dateTranscribed";
collect.setDateTranscribed(dateTranscribed);

// Invoking the API call with sample inputs
transcription.listTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="recording_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.RecordingController") RecordingController

### Get singleton instance

The singleton instance of the ``` RecordingController ``` class can be accessed from the API Client.

```java
RecordingController recording = client.getRecording();
```

### <a name="view_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.RecordingController.viewRecordingAsync") viewRecordingAsync

> Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.


```java
void viewRecordingAsync(
        final ViewRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingsid |  ``` Required ```  | The unique identifier for the recording. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewRecordingInput collect = new ViewRecordingInput();

String recordingsid = "recordingsid";
collect.setRecordingsid(recordingsid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
recording.viewRecordingAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.RecordingController.deleteRecordingAsync") deleteRecordingAsync

> Remove a recording from your Ytel account.


```java
void deleteRecordingAsync(
        final DeleteRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingsid |  ``` Required ```  | The unique identifier for a recording. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
DeleteRecordingInput collect = new DeleteRecordingInput();

String recordingsid = "recordingsid";
collect.setRecordingsid(recordingsid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
recording.deleteRecordingAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.RecordingController.listRecordingAsync") listRecordingAsync

> Retrieve a list of recording objects.


```java
void listRecordingAsync(
        final ListRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| datecreated |  ``` Optional ```  | Filter results by creation date |
| callsid |  ``` Optional ```  | The unique identifier for a call. |


#### Example Usage

```java
ListRecordingInput collect = new ListRecordingInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String datecreated = "Datecreated";
collect.setDatecreated(datecreated);

String callsid = "callsid";
collect.setCallsid(callsid);

// Invoking the API call with sample inputs
recording.listRecordingAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="email_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.EmailController") EmailController

### Get singleton instance

The singleton instance of the ``` EmailController ``` class can be accessed from the API Client.

```java
EmailController email = client.getEmail();
```

### <a name="delete_spam_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.deleteSpamAsync") deleteSpamAsync

> Remove an email from the spam email list.


```java
void deleteSpamAsync(
        final DeleteSpamInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| email |  ``` Required ```  | A valid email address that is to be remove from the spam list. |


#### Example Usage

```java
DeleteSpamInput collect = new DeleteSpamInput();

String responseType = "json";
collect.setResponseType(responseType);

String email = "Email";
collect.setEmail(email);

// Invoking the API call with sample inputs
email.deleteSpamAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_block_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.deleteBlockAsync") deleteBlockAsync

> Remove an email from blocked emails list.


```java
void deleteBlockAsync(
        final DeleteBlockInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email address to be remove from the blocked list. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
DeleteBlockInput collect = new DeleteBlockInput();

String email = "Email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.deleteBlockAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="add_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.addUnsubscribesAsync") addUnsubscribesAsync

> Add an email to the unsubscribe list


```java
void addUnsubscribesAsync(
        final AddUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | A valid email address that is to be added to the unsubscribe list |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
AddUnsubscribesInput collect = new AddUnsubscribesInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.addUnsubscribesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="send_email_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.sendEmailAsync") sendEmailAsync

> Create and submit an email message to one or more email addresses.


```java
void sendEmailAsync(
        final SendEmailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | A valid address that will receive the email. Multiple addresses can be separated by using commas. |
| type |  ``` Required ```  ``` DefaultValue ```  | Specifies the type of email to be sent |
| subject |  ``` Required ```  | The subject of the mail. Must be a valid string. |
| message |  ``` Required ```  | The email message that is to be sent in the text. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| from |  ``` Optional ```  | A valid address that will send the email. |
| cc |  ``` Optional ```  | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. |
| bcc |  ``` Optional ```  | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. |
| attachment |  ``` Optional ```  | A file that is attached to the email. Must be less than 7 MB in size. |


#### Example Usage

```java
SendEmailInput collect = new SendEmailInput();

String to = "To";
collect.setTo(to);

SendEmailAsEnum type = SendEmailAsEnum.fromString("HTML");
collect.setType(type);

String subject = "Subject";
collect.setSubject(subject);

String message = "Message";
collect.setMessage(message);

String responseType = "json";
collect.setResponseType(responseType);

String from = "From";
collect.setFrom(from);

String cc = "Cc";
collect.setCc(cc);

String bcc = "Bcc";
collect.setBcc(bcc);

String attachment = "Attachment";
collect.setAttachment(attachment);

// Invoking the API call with sample inputs
email.sendEmailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.deleteUnsubscribesAsync") deleteUnsubscribesAsync

> Remove an email address from the list of unsubscribed emails.


```java
void deleteUnsubscribesAsync(
        final DeleteUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | A valid email address that is to be remove from the unsubscribe list. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
DeleteUnsubscribesInput collect = new DeleteUnsubscribesInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.deleteUnsubscribesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.listUnsubscribesAsync") listUnsubscribesAsync

> Retrieve a list of email addresses from the unsubscribe list.


```java
void listUnsubscribesAsync(
        final ListUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The starting point of the list of unsubscribed emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
ListUnsubscribesInput collect = new ListUnsubscribesInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.listUnsubscribesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_invalid_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.listInvalidAsync") listInvalidAsync

> Retrieve a list of invalid email addresses.


```java
void listInvalidAsync(
        final ListInvalidInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The starting point of the list of invalid emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
ListInvalidInput collect = new ListInvalidInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.listInvalidAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_bounces_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.deleteBouncesAsync") deleteBouncesAsync

> Remove an email address from the bounced list.


```java
void deleteBouncesAsync(
        final DeleteBouncesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| email |  ``` Required ```  | The email address to be remove from the bounced email list. |


#### Example Usage

```java
DeleteBouncesInput collect = new DeleteBouncesInput();

String responseType = "json";
collect.setResponseType(responseType);

String email = "Email";
collect.setEmail(email);

// Invoking the API call with sample inputs
email.deleteBouncesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_bounces_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.listBouncesAsync") listBouncesAsync

> Retrieve a list of emails that have bounced.


```java
void listBouncesAsync(
        final ListBouncesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The starting point of the list of bounced emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
ListBouncesInput collect = new ListBouncesInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.listBouncesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_spam_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.listSpamAsync") listSpamAsync

> Retrieve a list of emails that are on the spam list.


```java
void listSpamAsync(
        final ListSpamInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The starting point of the list of spam emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
ListSpamInput collect = new ListSpamInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.listSpamAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_blocks_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.listBlocksAsync") listBlocksAsync

> Retrieve a list of emails that have been blocked.


```java
void listBlocksAsync(
        final ListBlocksInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The starting point of the list of blocked emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
ListBlocksInput collect = new ListBlocksInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.listBlocksAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_invalid_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.EmailController.deleteInvalidAsync") deleteInvalidAsync

> Remove an email from the invalid email list.


```java
void deleteInvalidAsync(
        final DeleteInvalidInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | A valid email address that is to be remove from the invalid email list. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
DeleteInvalidInput collect = new DeleteInvalidInput();

String email = "Email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.deleteInvalidAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.SMSController") SMSController

### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

### <a name="send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SMSController.sendSMSAsync") sendSMSAsync

> Send an SMS from a Ytel number


```java
void sendSMSAsync(
        final SendSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. |
| to |  ``` Required ```  | The 10-digit phone number (E.164 format) that will receive the message. |
| body |  ``` Required ```  | The body message that is to be sent in the text. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once SMS sent. |
| messageStatusCallback |  ``` Optional ```  | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. |
| smartsms |  ``` Optional ```  ``` DefaultValue ```  | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. |
| deliveryStatus |  ``` Optional ```  ``` DefaultValue ```  | Delivery reports are a method to tell your system if the message has arrived on the destination phone. |


#### Example Usage

```java
SendSMSInput collect = new SendSMSInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String body = "Body";
collect.setBody(body);

String responseType = "json";
collect.setResponseType(responseType);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String messageStatusCallback = "MessageStatusCallback";
collect.setMessageStatusCallback(messageStatusCallback);

Boolean smartsms = false;
collect.setSmartsms(smartsms);

Boolean deliveryStatus = false;
collect.setDeliveryStatus(deliveryStatus);

// Invoking the API call with sample inputs
sMS.sendSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SMSController.viewSMSAsync") viewSMSAsync

> Retrieve a single SMS message object by its SmsSid.


```java
void viewSMSAsync(
        final ViewSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageSid |  ``` Required ```  | The unique identifier for a sms message. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewSMSInput collect = new ViewSMSInput();

String messageSid = "MessageSid";
collect.setMessageSid(messageSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sMS.viewSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SMSController.listSMSAsync") listSMSAsync

> Retrieve a list of Outbound SMS message objects.


```java
void listSMSAsync(
        final ListSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Filter SMS message objects from this valid 10-digit phone number (E.164 format). |
| to |  ``` Optional ```  | Filter SMS message objects to this valid 10-digit phone number (E.164 format). |
| dateSent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |


#### Example Usage

```java
ListSMSInput collect = new ListSMSInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String dateSent = "DateSent";
collect.setDateSent(dateSent);

// Invoking the API call with sample inputs
sMS.listSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SMSController.listInboundSMSAsync") listInboundSMSAsync

> Retrieve a list of Inbound SMS message objects.


```java
void listInboundSMSAsync(
        final ListInboundSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| from |  ``` Optional ```  | Filter SMS message objects from this valid 10-digit phone number (E.164 format). |
| to |  ``` Optional ```  | Filter SMS message objects to this valid 10-digit phone number (E.164 format). |
| dateSent |  ``` Optional ```  | Filter sms message objects by this date. |


#### Example Usage

```java
ListInboundSMSInput collect = new ListInboundSMSInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String dateSent = "DateSent";
collect.setDateSent(dateSent);

// Invoking the API call with sample inputs
sMS.listInboundSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_detail_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SMSController.viewDetailSMSAsync") viewDetailSMSAsync

> Retrieve a single SMS message object with details by its SmsSid.


```java
void viewDetailSMSAsync(
        final ViewDetailSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageSid |  ``` Required ```  | The unique identifier for a sms message. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewDetailSMSInput collect = new ViewDetailSMSInput();

String messageSid = "MessageSid";
collect.setMessageSid(messageSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sMS.viewDetailSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="call_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.CallController") CallController

### Get singleton instance

The singleton instance of the ``` CallController ``` class can be accessed from the API Client.

```java
CallController call = client.getCall();
```

### <a name="make_call_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.makeCallAsync") makeCallAsync

> You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json


```java
void makeCallAsync(
        final MakeCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
| to |  ``` Required ```  | To number |
| url |  ``` Required ```  | URL requested once the call connects |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallBackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| heartBeatUrl |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed tim |
| heartBeatMethod |  ``` Optional ```  | Specifies the HTTP method used to request HeartbeatUrl. |
| timeout |  ``` Optional ```  | Time (in seconds) Ytel should wait while the call is ringing before canceling the call |
| playDtmf |  ``` Optional ```  | DTMF Digits to play to the call once it connects. 0-9, #, or * |
| hideCallerId |  ``` Optional ```  | Specifies if the caller id will be hidden |
| record |  ``` Optional ```  | Specifies if the call should be recorded |
| recordCallBackUrl |  ``` Optional ```  | Recording parameters will be sent here upon completion |
| recordCallBackMethod |  ``` Optional ```  | Method used to request the RecordCallback URL. |
| transcribe |  ``` Optional ```  | Specifies if the call recording should be transcribed |
| transcribeCallBackUrl |  ``` Optional ```  | Transcription parameters will be sent here upon completion |
| ifMachine |  ``` Optional ```  | How Ytel should handle the receiving numbers voicemail machine |
| ifMachineUrl |  ``` Optional ```  | URL requested when IfMachine=continue |
| ifMachineMethod |  ``` Optional ```  | Method used to request the IfMachineUrl. |
| feedback |  ``` Optional ```  | Specify if survey should be enable or not |
| surveyId |  ``` Optional ```  | The unique identifier for the survey. |


#### Example Usage

```java
MakeCallInput collect = new MakeCallInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

String responseType = "json";
collect.setResponseType(responseType);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

HttpActionEnum statusCallBackMethod = HttpActionEnum.fromString("GET");
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallBackUrl = "FallBackUrl";
collect.setFallBackUrl(fallBackUrl);

HttpActionEnum fallBackMethod = HttpActionEnum.fromString("GET");
collect.setFallBackMethod(fallBackMethod);

String heartBeatUrl = "HeartBeatUrl";
collect.setHeartBeatUrl(heartBeatUrl);

HttpActionEnum heartBeatMethod = HttpActionEnum.fromString("GET");
collect.setHeartBeatMethod(heartBeatMethod);

Integer timeout = 41;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

Boolean hideCallerId = false;
collect.setHideCallerId(hideCallerId);

Boolean record = false;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

HttpActionEnum recordCallBackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = false;
collect.setTranscribe(transcribe);

String transcribeCallBackUrl = "TranscribeCallBackUrl";
collect.setTranscribeCallBackUrl(transcribeCallBackUrl);

IfMachineEnum ifMachine = IfMachineEnum.fromString("CONTINUE");
collect.setIfMachine(ifMachine);

String ifMachineUrl = "IfMachineUrl";
collect.setIfMachineUrl(ifMachineUrl);

HttpActionEnum ifMachineMethod = HttpActionEnum.fromString("GET");
collect.setIfMachineMethod(ifMachineMethod);

Boolean feedback = false;
collect.setFeedback(feedback);

String surveyId = "SurveyId";
collect.setSurveyId(surveyId);

// Invoking the API call with sample inputs
call.makeCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="play_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.playAudioAsync") playAudioAsync

> Play Dtmf and send the Digit


```java
void playAudioAsync(
        final PlayAudioInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| audioUrl |  ``` Required ```  | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav |
| sayText |  ``` Required ```  | Valid alphanumeric string that should be played to the In-progress call. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| length |  ``` Optional ```  | Time limit in seconds for audio play back |
| direction |  ``` Optional ```  | The leg of the call audio will be played to |
| mix |  ``` Optional ```  | If false, all other audio will be muted |


#### Example Usage

```java
PlayAudioInput collect = new PlayAudioInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String audioUrl = "AudioUrl";
collect.setAudioUrl(audioUrl);

String sayText = "SayText";
collect.setSayText(sayText);

String responseType = "json";
collect.setResponseType(responseType);

Integer length = 41;
collect.setLength(length);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Boolean mix = false;
collect.setMix(mix);

// Invoking the API call with sample inputs
call.playAudioAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="record_call_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.recordCallAsync") recordCallAsync

> Start or stop recording of an in-progress voice call.


```java
void recordCallAsync(
        final RecordCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| record |  ``` Required ```  | Set true to initiate recording or false to terminate recording |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response format, xml or json |
| direction |  ``` Optional ```  | The leg of the call to record |
| timeLimit |  ``` Optional ```  | Time in seconds the recording duration should not exceed |
| callBackUrl |  ``` Optional ```  | URL consulted after the recording completes |
| fileformat |  ``` Optional ```  | Format of the recording file. Can be .mp3 or .wav |


#### Example Usage

```java
RecordCallInput collect = new RecordCallInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

boolean record = false;
collect.setRecord(record);

String responseType = "json";
collect.setResponseType(responseType);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Integer timeLimit = 41;
collect.setTimeLimit(timeLimit);

String callBackUrl = "CallBackUrl";
collect.setCallBackUrl(callBackUrl);

AudioFormatEnum fileformat = AudioFormatEnum.fromString("mp3");
collect.setFileformat(fileformat);

// Invoking the API call with sample inputs
call.recordCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="voice_effect_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.voiceEffectAsync") voiceEffectAsync

> Add audio voice effects to the an in-progress voice call.


```java
void voiceEffectAsync(
        final VoiceEffectInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier for the in-progress voice call. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| audioDirection |  ``` Optional ```  | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. |
| pitchSemiTones |  ``` Optional ```  | Set the pitch in semitone (half-step) intervals. Value between -14 and 14 |
| pitchOctaves |  ``` Optional ```  | Set the pitch in octave intervals.. Value between -1 and 1 |
| pitch |  ``` Optional ```  | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 |
| rate |  ``` Optional ```  | Set the rate for audio. The lower the value, the lower the rate. value greater than 0 |
| tempo |  ``` Optional ```  | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 |


#### Example Usage

```java
VoiceEffectInput collect = new VoiceEffectInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String responseType = "json";
collect.setResponseType(responseType);

AudioDirectionEnum audioDirection = AudioDirectionEnum.fromString("IN");
collect.setAudioDirection(audioDirection);

Double pitchSemiTones = 41.298595765279;
collect.setPitchSemiTones(pitchSemiTones);

Double pitchOctaves = 41.298595765279;
collect.setPitchOctaves(pitchOctaves);

Double pitch = 41.298595765279;
collect.setPitch(pitch);

Double rate = 41.298595765279;
collect.setRate(rate);

Double tempo = 41.298595765279;
collect.setTempo(tempo);

// Invoking the API call with sample inputs
call.voiceEffectAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="send_digit_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.sendDigitAsync") sendDigitAsync

> Play Dtmf and send the Digit


```java
void sendDigitAsync(
        final SendDigitInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| playDtmf |  ``` Required ```  | DTMF digits to play to the call. 0-9, #, *, W, or w |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| playDtmfDirection |  ``` Optional ```  | The leg of the call DTMF digits should be sent to |


#### Example Usage

```java
SendDigitInput collect = new SendDigitInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

String responseType = "json";
collect.setResponseType(responseType);

DirectionEnum playDtmfDirection = DirectionEnum.fromString("IN");
collect.setPlayDtmfDirection(playDtmfDirection);

// Invoking the API call with sample inputs
call.sendDigitAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="interrupted_call_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.interruptedCallAsync") interruptedCallAsync

> Interrupt the Call by Call Sid


```java
void interruptedCallAsync(
        final InterruptedCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier for voice call that is in progress. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| url |  ``` Optional ```  | URL the in-progress call will be redirected to |
| method |  ``` Optional ```  | The method used to request the above Url parameter |
| status |  ``` Optional ```  | Status to set the in-progress call to |


#### Example Usage

```java
InterruptedCallInput collect = new InterruptedCallInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String responseType = "json";
collect.setResponseType(responseType);

String url = "Url";
collect.setUrl(url);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

InterruptedCallStatusEnum status = InterruptedCallStatusEnum.fromString("CANCELED");
collect.setStatus(status);

// Invoking the API call with sample inputs
call.interruptedCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_calls_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.listCallsAsync") listCallsAsync

> A list of calls associated with your Ytel account


```java
void listCallsAsync(
        final ListCallsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| to |  ``` Optional ```  | Filter calls that were sent to this 10-digit number (E.164 format). |
| from |  ``` Optional ```  | Filter calls that were sent from this 10-digit number (E.164 format). |
| dateCreated |  ``` Optional ```  | Return calls that are from a specified date. |


#### Example Usage

```java
ListCallsInput collect = new ListCallsInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String to = "To";
collect.setTo(to);

String from = "From";
collect.setFrom(from);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
call.listCallsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="send_ringless_vm_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.sendRinglessVMAsync") sendRinglessVMAsync

> Initiate an outbound Ringless Voicemail through Ytel.


```java
void sendRinglessVMAsync(
        final SendRinglessVMInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
| rVMCallerId |  ``` Required ```  | A required secondary Caller ID for RVM to work. |
| to |  ``` Required ```  | A valid number (E.164 format) that will receive the phone call. |
| voiceMailURL |  ``` Required ```  | The URL requested once the RVM connects. A set of default parameters will be sent here. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  ``` DefaultValue ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| statsCallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. |


#### Example Usage

```java
SendRinglessVMInput collect = new SendRinglessVMInput();

String from = "From";
collect.setFrom(from);

String rVMCallerId = "RVMCallerId";
collect.setRVMCallerId(rVMCallerId);

String to = "To";
collect.setTo(to);

String voiceMailURL = "VoiceMailURL";
collect.setVoiceMailURL(voiceMailURL);

String responseType = "json";
collect.setResponseType(responseType);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

HttpActionEnum statsCallBackMethod = HttpActionEnum.fromString("GET");
collect.setStatsCallBackMethod(statsCallBackMethod);

// Invoking the API call with sample inputs
call.sendRinglessVMAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_call_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.viewCallAsync") viewCallAsync

> Retrieve a single voice call’s information by its CallSid.


```java
void viewCallAsync(
        final ViewCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callsid |  ``` Required ```  | The unique identifier for the voice call. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewCallInput collect = new ViewCallInput();

String callsid = "callsid";
collect.setCallsid(callsid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.viewCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_call_detail_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.viewCallDetailAsync") viewCallDetailAsync

> Retrieve a single voice call’s information by its CallSid.


```java
void viewCallDetailAsync(
        final String callSid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier for the voice call. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
String callSid = "callSid";
String responseType = "json";
// Invoking the API call with sample inputs
call.viewCallDetailAsync(callSid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="group_call_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CallController.groupCallAsync") groupCallAsync

> Group Call


```java
void groupCallAsync(
        final GroupCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| to |  ``` Required ```  | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 |
| url |  ``` Required ```  | URL requested once the call connects |
| responseType |  ``` Required ```  ``` DefaultValue ```  | TODO: Add a parameter description |
| groupConfirmKey |  ``` Required ```  | Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * |
| groupConfirmFile |  ``` Required ```  | Specify the audio file you want to play when the called party picks up the call |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallBackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| heartBeatUrl |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. |
| heartBeatMethod |  ``` Optional ```  | Specifies the HTTP method used to request HeartbeatUrl. |
| timeout |  ``` Optional ```  | Time (in seconds) we should wait while the call is ringing before canceling the call |
| playDtmf |  ``` Optional ```  | DTMF Digits to play to the call once it connects. 0-9, #, or * |
| hideCallerId |  ``` Optional ```  | Specifies if the caller id will be hidden |
| record |  ``` Optional ```  | Specifies if the call should be recorded |
| recordCallBackUrl |  ``` Optional ```  | Recording parameters will be sent here upon completion |
| recordCallBackMethod |  ``` Optional ```  | Method used to request the RecordCallback URL. |
| transcribe |  ``` Optional ```  | Specifies if the call recording should be transcribed |
| transcribeCallBackUrl |  ``` Optional ```  | Transcription parameters will be sent here upon completion |


#### Example Usage

```java
GroupCallInput collect = new GroupCallInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

String responseType = "json";
collect.setResponseType(responseType);

String groupConfirmKey = "GroupConfirmKey";
collect.setGroupConfirmKey(groupConfirmKey);

AudioFormatEnum groupConfirmFile = AudioFormatEnum.fromString("mp3");
collect.setGroupConfirmFile(groupConfirmFile);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

HttpActionEnum statusCallBackMethod = HttpActionEnum.fromString("GET");
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallBackUrl = "FallBackUrl";
collect.setFallBackUrl(fallBackUrl);

HttpActionEnum fallBackMethod = HttpActionEnum.fromString("GET");
collect.setFallBackMethod(fallBackMethod);

String heartBeatUrl = "HeartBeatUrl";
collect.setHeartBeatUrl(heartBeatUrl);

HttpActionEnum heartBeatMethod = HttpActionEnum.fromString("GET");
collect.setHeartBeatMethod(heartBeatMethod);

Integer timeout = 41;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

String hideCallerId = "HideCallerId";
collect.setHideCallerId(hideCallerId);

Boolean record = false;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

HttpActionEnum recordCallBackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = false;
collect.setTranscribe(transcribe);

String transcribeCallBackUrl = "TranscribeCallBackUrl";
collect.setTranscribeCallBackUrl(transcribeCallBackUrl);

// Invoking the API call with sample inputs
call.groupCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="carrier_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.CarrierController") CarrierController

### Get singleton instance

The singleton instance of the ``` CarrierController ``` class can be accessed from the API Client.

```java
CarrierController carrier = client.getCarrier();
```

### <a name="carrier_lookup_list_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CarrierController.carrierLookupListAsync") carrierLookupListAsync

> Retrieve a list of carrier lookup objects.


```java
void carrierLookupListAsync(
        final CarrierLookupListInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |


#### Example Usage

```java
CarrierLookupListInput collect = new CarrierLookupListInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

// Invoking the API call with sample inputs
carrier.carrierLookupListAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="carrier_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.CarrierController.carrierLookupAsync") carrierLookupAsync

> Get the Carrier Lookup


```java
void carrierLookupAsync(
        final CarrierLookupInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid 10-digit number (E.164 format). |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CarrierLookupInput collect = new CarrierLookupInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
carrier.carrierLookupAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="address_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.AddressController") AddressController

### Get singleton instance

The singleton instance of the ``` AddressController ``` class can be accessed from the API Client.

```java
AddressController address = client.getAddress();
```

### <a name="create_address_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AddressController.createAddressAsync") createAddressAsync

> To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.


```java
void createAddressAsync(
        final CreateAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of user |
| address |  ``` Required ```  | Address of user. |
| country |  ``` Required ```  | Must be a 2 letter country short-name code (ISO 3166) |
| state |  ``` Required ```  | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. |
| city |  ``` Required ```  | City Name. |
| zip |  ``` Required ```  | Zip code of city. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type either json or xml |
| description |  ``` Optional ```  | Description of addresses. |
| email |  ``` Optional ```  | Email Id of user. |
| phone |  ``` Optional ```  | Phone number of user. |


#### Example Usage

```java
CreateAddressInput collect = new CreateAddressInput();

String name = "Name";
collect.setName(name);

String address = "Address";
collect.setAddress(address);

String country = "Country";
collect.setCountry(country);

String state = "State";
collect.setState(state);

String city = "City";
collect.setCity(city);

String zip = "Zip";
collect.setZip(zip);

String responseType = "json";
collect.setResponseType(responseType);

String description = "Description";
collect.setDescription(description);

String email = "email";
collect.setEmail(email);

String phone = "Phone";
collect.setPhone(phone);

// Invoking the API call with sample inputs
address.createAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_address_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AddressController.viewAddressAsync") viewAddressAsync

> View Address Specific address Book by providing the address id


```java
void viewAddressAsync(
        final ViewAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressid |  ``` Required ```  | The identifier of the address to be retrieved. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
ViewAddressInput collect = new ViewAddressInput();

String addressid = "addressid";
collect.setAddressid(addressid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.viewAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_address_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AddressController.listAddressAsync") listAddressAsync

> List All Address 


```java
void listAddressAsync(
        final ListAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | How many results to return, default is 10, max is 100, must be an integer |
| addressid |  ``` Optional ```  | addresses Sid |
| dateCreated |  ``` Optional ```  | date created address. |


#### Example Usage

```java
ListAddressInput collect = new ListAddressInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String addressid = "addressid";
collect.setAddressid(addressid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
address.listAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="verify_address_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AddressController.verifyAddressAsync") verifyAddressAsync

> Validates an address given.


```java
void verifyAddressAsync(
        final VerifyAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressid |  ``` Required ```  | The identifier of the address to be verified. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type either json or xml |


#### Example Usage

```java
VerifyAddressInput collect = new VerifyAddressInput();

String addressid = "addressid";
collect.setAddressid(addressid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.verifyAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_address_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AddressController.deleteAddressAsync") deleteAddressAsync

> To delete Address to your address book


```java
void deleteAddressAsync(
        final DeleteAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressid |  ``` Required ```  | The identifier of the address to be deleted. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type either json or xml |


#### Example Usage

```java
DeleteAddressInput collect = new DeleteAddressInput();

String addressid = "addressid";
collect.setAddressid(addressid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.deleteAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sub_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.SubAccountController") SubAccountController

### Get singleton instance

The singleton instance of the ``` SubAccountController ``` class can be accessed from the API Client.

```java
SubAccountController subAccount = client.getSubAccount();
```

### <a name="delete_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SubAccountController.deleteSubAccountAsync") deleteSubAccountAsync

> Delete sub account or merge numbers into parent


```java
void deleteSubAccountAsync(
        final DeleteSubAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be deleted |
| mergeNumber |  ``` Required ```  ``` DefaultValue ```  | 0 to delete or 1 to merge numbers to parent account. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
DeleteSubAccountInput collect = new DeleteSubAccountInput();

String subAccountSID = "SubAccountSID";
collect.setSubAccountSID(subAccountSID);

MergeNumberStatusEnum mergeNumber = MergeNumberStatusEnum.fromInteger(0);
collect.setMergeNumber(mergeNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
subAccount.deleteSubAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="suspend_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SubAccountController.suspendSubAccountAsync") suspendSubAccountAsync

> Suspend or unsuspend


```java
void suspendSubAccountAsync(
        final SuspendSubAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be activated or suspended |
| activate |  ``` Required ```  ``` DefaultValue ```  | 0 to suspend or 1 to activate |
| responseType |  ``` Required ```  ``` DefaultValue ```  | TODO: Add a parameter description |


#### Example Usage

```java
SuspendSubAccountInput collect = new SuspendSubAccountInput();

String subAccountSID = "SubAccountSID";
collect.setSubAccountSID(subAccountSID);

ActivateStatusEnum activate = ActivateStatusEnum.fromInteger(0);
collect.setActivate(activate);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
subAccount.suspendSubAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.SubAccountController.createSubAccountAsync") createSubAccountAsync

> Create a sub user account under the parent account


```java
void createSubAccountAsync(
        final CreateSubAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| firstName |  ``` Required ```  | Sub account user first name |
| lastName |  ``` Required ```  | sub account user last name |
| email |  ``` Required ```  | Sub account email address |
| friendlyName |  ``` Required ```  | Descriptive name of the sub account |
| password |  ``` Required ```  | The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateSubAccountInput collect = new CreateSubAccountInput();

String firstName = "FirstName";
collect.setFirstName(firstName);

String lastName = "LastName";
collect.setLastName(lastName);

String email = "Email";
collect.setEmail(email);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String password = "Password";
collect.setPassword(password);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
subAccount.createSubAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="account_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.AccountController") AccountController

### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

### <a name="view_account_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AccountController.viewAccountAsync") viewAccountAsync

> Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.


```java
void viewAccountAsync(
        final ViewAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| date |  ``` Required ```  | Filter account information based on date. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewAccountInput collect = new ViewAccountInput();

String date = "Date";
collect.setDate(date);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
account.viewAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="usage_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.UsageController") UsageController

### Get singleton instance

The singleton instance of the ``` UsageController ``` class can be accessed from the API Client.

```java
UsageController usage = client.getUsage();
```

### <a name="list_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.UsageController.listUsageAsync") listUsageAsync

> Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.


```java
void listUsageAsync(
        final ListUsageInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| productCode |  ``` Optional ```  ``` DefaultValue ```  | Filter usage results by product type. |
| startDate |  ``` Optional ```  ``` DefaultValue ```  | Filter usage objects by start date. |
| endDate |  ``` Optional ```  ``` DefaultValue ```  | Filter usage objects by end date. |
| includeSubAccounts |  ``` Optional ```  | Will include all subaccount usage data |


#### Example Usage

```java
ListUsageInput collect = new ListUsageInput();

String responseType = "json";
collect.setResponseType(responseType);

ProductCodeEnum productCode = ProductCodeEnum.fromInteger(0);
collect.setProductCode(productCode);

String startDate = "2016-09-06";
collect.setStartDate(startDate);

String endDate = "2016-09-06";
collect.setEndDate(endDate);

String includeSubAccounts = "IncludeSubAccounts";
collect.setIncludeSubAccounts(includeSubAccounts);

// Invoking the API call with sample inputs
usage.listUsageAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.ShortCodeController") ShortCodeController

### Get singleton instance

The singleton instance of the ``` ShortCodeController ``` class can be accessed from the API Client.

```java
ShortCodeController shortCode = client.getShortCode();
```

### <a name="send_dedicated_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ShortCodeController.sendDedicatedShortcodeAsync") sendDedicatedShortcodeAsync

> TODO: Add a method description


```java
void sendDedicatedShortcodeAsync(
        final SendDedicatedShortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | Your dedicated shortcode |
| to |  ``` Required ```  | The number to send your SMS to |
| body |  ``` Required ```  | The body of your message |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST |
| messagestatuscallback |  ``` Optional ```  | URL that can be requested to receive notification when Short Code message was sent. |


#### Example Usage

```java
SendDedicatedShortcodeInput collect = new SendDedicatedShortcodeInput();

int shortcode = 132;
collect.setShortcode(shortcode);

double to = 132.793877656941;
collect.setTo(to);

String body = "body";
collect.setBody(body);

String responseType = "json";
collect.setResponseType(responseType);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String messagestatuscallback = "messagestatuscallback";
collect.setMessagestatuscallback(messagestatuscallback);

// Invoking the API call with sample inputs
shortCode.sendDedicatedShortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ShortCodeController.viewShortcodeAsync") viewShortcodeAsync

> View a single Sms Short Code message.


```java
void viewShortcodeAsync(
        final ViewShortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageSid |  ``` Required ```  | The unique identifier for the sms resource |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewShortcodeInput collect = new ViewShortcodeInput();

String messageSid = "MessageSid";
collect.setMessageSid(messageSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
shortCode.viewShortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ShortCodeController.listShortcodeAsync") listShortcodeAsync

> Retrieve a list of Short Code message objects.


```java
void listShortcodeAsync(
        final ListShortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| shortcode |  ``` Optional ```  | Only list messages sent from this Short Code |
| to |  ``` Optional ```  | Only list messages sent to this number |
| dateSent |  ``` Optional ```  | Only list messages sent with the specified date |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |


#### Example Usage

```java
ListShortcodeInput collect = new ListShortcodeInput();

String responseType = "json";
collect.setResponseType(responseType);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String to = "To";
collect.setTo(to);

String dateSent = "DateSent";
collect.setDateSent(dateSent);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

// Invoking the API call with sample inputs
shortCode.listShortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_inbound_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ShortCodeController.listInboundShortcodeAsync") listInboundShortcodeAsync

> Retrive a list of inbound Sms Short Code messages associated with your Ytel account.


```java
void listInboundShortcodeAsync(
        final ListInboundShortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Only list SMS messages sent from this number |
| shortcode |  ``` Optional ```  | Only list SMS messages sent to Shortcode |
| datecreated |  ``` Optional ```  | Only list SMS messages sent in the specified date MAKE REQUEST |


#### Example Usage

```java
ListInboundShortcodeInput collect = new ListInboundShortcodeInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String from = "From";
collect.setFrom(from);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String datecreated = "Datecreated";
collect.setDatecreated(datecreated);

// Invoking the API call with sample inputs
shortCode.listInboundShortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_dedicated_shortcode_assignment_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ShortCodeController.viewDedicatedShortcodeAssignmentAsync") viewDedicatedShortcodeAssignmentAsync

> Retrieve a single Short Code object by its shortcode assignment.


```java
void viewDedicatedShortcodeAssignmentAsync(
        final ViewDedicatedShortcodeAssignmentInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid Dedicated Short Code to your Ytel account |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewDedicatedShortcodeAssignmentInput collect = new ViewDedicatedShortcodeAssignmentInput();

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
shortCode.viewDedicatedShortcodeAssignmentAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="update_dedicated_short_code_assignment_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ShortCodeController.updateDedicatedShortCodeAssignmentAsync") updateDedicatedShortCodeAssignmentAsync

> Update a dedicated shortcode.


```java
void updateDedicatedShortCodeAssignmentAsync(
        final UpdateDedicatedShortCodeAssignmentInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid dedicated shortcode to your Ytel account. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| friendlyName |  ``` Optional ```  | User generated name of the dedicated shortcode. |
| callbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. |
| callbackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| fallbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| fallbackUrl |  ``` Optional ```  | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. |


#### Example Usage

```java
UpdateDedicatedShortCodeAssignmentInput collect = new UpdateDedicatedShortCodeAssignmentInput();

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String responseType = "json";
collect.setResponseType(responseType);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String callbackMethod = "CallbackMethod";
collect.setCallbackMethod(callbackMethod);

String callbackUrl = "CallbackUrl";
collect.setCallbackUrl(callbackUrl);

String fallbackMethod = "FallbackMethod";
collect.setFallbackMethod(fallbackMethod);

String fallbackUrl = "FallbackUrl";
collect.setFallbackUrl(fallbackUrl);

// Invoking the API call with sample inputs
shortCode.updateDedicatedShortCodeAssignmentAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_short_code_assignment_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.ShortCodeController.listShortCodeAssignmentAsync") listShortCodeAssignmentAsync

> Retrieve a list of Short Code assignment associated with your Ytel account.


```java
void listShortCodeAssignmentAsync(
        final ListShortCodeAssignmentInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| shortcode |  ``` Optional ```  | Only list Short Code Assignment sent from this Short Code |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |


#### Example Usage

```java
ListShortCodeAssignmentInput collect = new ListShortCodeAssignmentInput();

String responseType = "json";
collect.setResponseType(responseType);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String page = "page";
collect.setPage(page);

String pagesize = "pagesize";
collect.setPagesize(pagesize);

// Invoking the API call with sample inputs
shortCode.listShortCodeAssignmentAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="post_card_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.PostCardController") PostCardController

### Get singleton instance

The singleton instance of the ``` PostCardController ``` class can be accessed from the API Client.

```java
PostCardController postCard = client.getPostCard();
```

### <a name="view_postcard_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PostCardController.viewPostcardAsync") viewPostcardAsync

> Retrieve a postcard object by its PostcardId.


```java
void viewPostcardAsync(
        final ViewPostcardInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postcardid |  ``` Required ```  | The unique identifier for a postcard object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
ViewPostcardInput collect = new ViewPostcardInput();

String postcardid = "postcardid";
collect.setPostcardid(postcardid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
postCard.viewPostcardAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_postcard_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PostCardController.createPostcardAsync") createPostcardAsync

> Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.


```java
void createPostcardAsync(
        final CreatePostcardInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | The AddressId or an object structured when creating an address by addresses/Create. |
| from |  ``` Required ```  | The AddressId or an object structured when creating an address by addresses/Create. |
| attachbyid |  ``` Required ```  | Set an existing postcard by attaching its PostcardId. |
| front |  ``` Required ```  | A 4.25"x6.25" or 6.25"x11.25" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. |
| back |  ``` Required ```  | A 4.25"x6.25" or 6.25"x11.25" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. |
| message |  ``` Required ```  | The message for the back of the postcard with a maximum of 350 characters. |
| setting |  ``` Required ```  | Code for the dimensions of the media to be printed. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| description |  ``` Optional ```  | A description for the postcard. |
| htmldata |  ``` Optional ```  | A string value that contains HTML markup. |


#### Example Usage

```java
CreatePostcardInput collect = new CreatePostcardInput();

String to = "to";
collect.setTo(to);

String from = "from";
collect.setFrom(from);

String attachbyid = "attachbyid";
collect.setAttachbyid(attachbyid);

String front = "front";
collect.setFront(front);

String back = "back";
collect.setBack(back);

String message = "message";
collect.setMessage(message);

String setting = "setting";
collect.setSetting(setting);

String responseType = "json";
collect.setResponseType(responseType);

String description = "description";
collect.setDescription(description);

String htmldata = "htmldata";
collect.setHtmldata(htmldata);

// Invoking the API call with sample inputs
postCard.createPostcardAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_postcards_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PostCardController.listPostcardsAsync") listPostcardsAsync

> Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.


```java
void listPostcardsAsync(
        final ListPostcardsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| postcardid |  ``` Optional ```  | The unique identifier for a postcard object. |
| dateCreated |  ``` Optional ```  | The date the postcard was created. |


#### Example Usage

```java
ListPostcardsInput collect = new ListPostcardsInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String postcardid = "postcardid";
collect.setPostcardid(postcardid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
postCard.listPostcardsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_postcard_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.PostCardController.deletePostcardAsync") deletePostcardAsync

> Remove a postcard object.


```java
void deletePostcardAsync(
        final DeletePostcardInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postcardid |  ``` Required ```  | The unique identifier of a postcard object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
DeletePostcardInput collect = new DeletePostcardInput();

String postcardid = "postcardid";
collect.setPostcardid(postcardid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
postCard.deletePostcardAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="letter_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.LetterController") LetterController

### Get singleton instance

The singleton instance of the ``` LetterController ``` class can be accessed from the API Client.

```java
LetterController letter = client.getLetter();
```

### <a name="view_letter_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.LetterController.viewLetterAsync") viewLetterAsync

> Retrieve a letter object by its LetterSid.


```java
void viewLetterAsync(
        final ViewLetterInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lettersid |  ``` Required ```  | The unique identifier for a letter object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
ViewLetterInput collect = new ViewLetterInput();

String lettersid = "lettersid";
collect.setLettersid(lettersid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
letter.viewLetterAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_letter_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.LetterController.createLetterAsync") createLetterAsync

> Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.


```java
void createLetterAsync(
        final CreateLetterInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | The AddressId or an object structured when creating an address by addresses/Create. |
| from |  ``` Required ```  | The AddressId or an object structured when creating an address by addresses/Create. |
| attachbyid |  ``` Required ```  | Set an existing letter by attaching its LetterId. |
| file |  ``` Required ```  | File can be a 8.5"x11" PDF uploaded file or URL that links to a file. |
| color |  ``` Required ```  | Specify if letter should be printed in color. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| description |  ``` Optional ```  | A description for the letter. |
| extraservice |  ``` Optional ```  | Add an extra service to your letter. Options are "certified" or "registered". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. |
| doublesided |  ``` Optional ```  | Specify if letter should be printed on both sides. |
| template |  ``` Optional ```  | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. |
| htmldata |  ``` Optional ```  | A string value that contains HTML markup. |


#### Example Usage

```java
CreateLetterInput collect = new CreateLetterInput();

String to = "to";
collect.setTo(to);

String from = "from";
collect.setFrom(from);

String attachbyid = "attachbyid";
collect.setAttachbyid(attachbyid);

String file = "file";
collect.setFile(file);

String color = "color";
collect.setColor(color);

String responseType = "json";
collect.setResponseType(responseType);

String description = "description";
collect.setDescription(description);

String extraservice = "extraservice";
collect.setExtraservice(extraservice);

String doublesided = "doublesided";
collect.setDoublesided(doublesided);

String template = "template";
collect.setTemplate(template);

String htmldata = "htmldata";
collect.setHtmldata(htmldata);

// Invoking the API call with sample inputs
letter.createLetterAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_letters_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.LetterController.listLettersAsync") listLettersAsync

> Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.


```java
void listLettersAsync(
        final ListLettersInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| lettersid |  ``` Optional ```  | The unique identifier for a letter object. |
| dateCreated |  ``` Optional ```  | The date the letter was created. |


#### Example Usage

```java
ListLettersInput collect = new ListLettersInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String lettersid = "lettersid";
collect.setLettersid(lettersid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
letter.listLettersAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_letter_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.LetterController.deleteLetterAsync") deleteLetterAsync

> Remove a letter object by its LetterId.


```java
void deleteLetterAsync(
        final DeleteLetterInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lettersid |  ``` Required ```  | The unique identifier for a letter object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
DeleteLetterInput collect = new DeleteLetterInput();

String lettersid = "lettersid";
collect.setLettersid(lettersid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
letter.deleteLetterAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="area_mail_controller"></a>![Class: ](https://apidocs.io/img/class.png "ytel.controllers.AreaMailController") AreaMailController

### Get singleton instance

The singleton instance of the ``` AreaMailController ``` class can be accessed from the API Client.

```java
AreaMailController areaMail = client.getAreaMail();
```

### <a name="create_area_mail_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AreaMailController.createAreaMailAsync") createAreaMailAsync

> Create a new AreaMail object.


```java
void createAreaMailAsync(
        final CreateAreaMailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| routes |  ``` Required ```  | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 |
| attachbyid |  ``` Required ```  | Set an existing areamail by attaching its AreamailId. |
| front |  ``` Required ```  | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required |
| back |  ``` Required ```  | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| description |  ``` Optional ```  | A string value to use as a description for this AreaMail item. |
| targettype |  ``` Optional ```  | The delivery location type. |
| htmldata |  ``` Optional ```  | A string value that contains HTML markup. |


#### Example Usage

```java
CreateAreaMailInput collect = new CreateAreaMailInput();

String routes = "routes";
collect.setRoutes(routes);

String attachbyid = "attachbyid";
collect.setAttachbyid(attachbyid);

String front = "front";
collect.setFront(front);

String back = "back";
collect.setBack(back);

String responseType = "json";
collect.setResponseType(responseType);

String description = "description";
collect.setDescription(description);

String targettype = "targettype";
collect.setTargettype(targettype);

String htmldata = "htmldata";
collect.setHtmldata(htmldata);

// Invoking the API call with sample inputs
areaMail.createAreaMailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="view_area_mail_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AreaMailController.viewAreaMailAsync") viewAreaMailAsync

> Retrieve an AreaMail object by its AreaMailId.


```java
void viewAreaMailAsync(
        final ViewAreaMailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| areamailid |  ``` Required ```  | The unique identifier for an AreaMail object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
ViewAreaMailInput collect = new ViewAreaMailInput();

String areamailid = "areamailid";
collect.setAreamailid(areamailid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
areaMail.viewAreaMailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="list_area_mail_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AreaMailController.listAreaMailAsync") listAreaMailAsync

> Retrieve a list of AreaMail objects.


```java
void listAreaMailAsync(
        final ListAreaMailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| areamailsid |  ``` Optional ```  | The unique identifier for an AreaMail object. |
| dateCreated |  ``` Optional ```  | The date the AreaMail was created. |


#### Example Usage

```java
ListAreaMailInput collect = new ListAreaMailInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String areamailsid = "areamailsid";
collect.setAreamailsid(areamailsid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
areaMail.listAreaMailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_area_mail_async"></a>![Method: ](https://apidocs.io/img/method.png "ytel.controllers.AreaMailController.deleteAreaMailAsync") deleteAreaMailAsync

> Remove an AreaMail object by its AreaMailId.


```java
void deleteAreaMailAsync(
        final DeleteAreaMailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| areamailid |  ``` Required ```  | The unique identifier for an AreaMail object. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
DeleteAreaMailInput collect = new DeleteAreaMailInput();

String areamailid = "areamailid";
collect.setAreamailid(areamailid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
areaMail.deleteAreaMailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)



