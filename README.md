# Getting started

message360 API version 3

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* Browse to locate the folder containing the source code. Select the location of the Message360 gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

## How to Use

The following section explains how to use the Message360 library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

In the following step naigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':Message360')``` to the dependencies section as shown in the illustration below.

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Message360&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > Message360 > androidTest > java)* from the project explorer.
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

message360.Configuration.initialize(appContext);
Message360Client client = new Message360Client(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [SharedShortCodeController](#shared_short_code_controller)
* [ConferenceController](#conference_controller)
* [TranscriptionController](#transcription_controller)
* [PhoneNumberController](#phone_number_controller)
* [UsageController](#usage_controller)
* [WebRTCController](#web_rtc_controller)
* [RecordingController](#recording_controller)
* [EmailController](#email_controller)
* [SMSController](#sms_controller)
* [CallController](#call_controller)
* [CarrierController](#carrier_controller)
* [AddressController](#address_controller)
* [SubAccountController](#sub_account_controller)
* [AccountController](#account_controller)
* [ShortCodeController](#short_code_controller)

## <a name="shared_short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.SharedShortCodeController") SharedShortCodeController

### Get singleton instance

The singleton instance of the ``` SharedShortCodeController ``` class can be accessed from the API Client.

```java
SharedShortCodeController sharedShortCode = client.getSharedShortCode();
```

### <a name="view_template_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.viewTemplateAsync") viewTemplateAsync

> View a Shared ShortCode Template


```java
void viewTemplateAsync(
        final ViewTemplateInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| templateid |  ``` Required ```  | The unique identifier for a template object |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewTemplateInput collect = new ViewTemplateInput();

UUID templateid = UUID.randomUUID();
collect.setTemplateid(templateid);

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


### <a name="view_shared_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.viewSharedShortcodesAsync") viewSharedShortcodesAsync

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


### <a name="list_outbound_shared_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.listOutboundSharedShortcodesAsync") listOutboundSharedShortcodesAsync

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
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Messages sent from this number |
| to |  ``` Optional ```  | Messages sent to this number |
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

String from = "from";
collect.setFrom(from);

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


### <a name="list_inbound_shared_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.listInboundSharedShortcodesAsync") listInboundSharedShortcodesAsync

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
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound ShortCode |
| shortcode |  ``` Optional ```  | Only list messages sent to this Short Code |
| dateReceived |  ``` Optional ```  | Only list messages sent with the specified date |


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

String dateReceived = "DateReceived";
collect.setDateReceived(dateReceived);

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


### <a name="send_shared_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.sendSharedShortcodeAsync") sendSharedShortcodeAsync

> Send an SMS from a message360 ShortCode


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


### <a name="list_templates_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.listTemplatesAsync") listTemplatesAsync

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


### <a name="view_keyword_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.viewKeywordAsync") viewKeywordAsync

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


### <a name="list_keyword_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.listKeywordAsync") listKeywordAsync

> Retrieve a list of keywords associated with your message360 account.


```java
void listKeywordAsync(
        final ListKeywordInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| keyword |  ``` Optional ```  | Only list keywords of keyword |
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |


#### Example Usage

```java
ListKeywordInput collect = new ListKeywordInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String keyword = "Keyword";
collect.setKeyword(keyword);

Integer shortcode = 201;
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


### <a name="view_assignement_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.viewAssignementAsync") viewAssignementAsync

> The response returned here contains all resource properties associated with the given Shortcode.


```java
void viewAssignementAsync(
        final ViewAssignementInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid Shortcode to your message360 account |
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


### <a name="list_assignment_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.listAssignmentAsync") listAssignmentAsync

> Retrieve a list of shortcode assignment associated with your message360 account.


```java
void listAssignmentAsync(
        final ListAssignmentInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |


#### Example Usage

```java
ListAssignmentInput collect = new ListAssignmentInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

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


### <a name="update_assignment_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SharedShortCodeController.updateAssignmentAsync") updateAssignmentAsync

> TODO: Add a method description


```java
void updateAssignmentAsync(
        final UpdateAssignmentInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid shortcode to your message360 account |
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

## <a name="conference_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.ConferenceController") ConferenceController

### Get singleton instance

The singleton instance of the ``` ConferenceController ``` class can be accessed from the API Client.

```java
ConferenceController conference = client.getConference();
```

### <a name="deaf_mute_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.deafMuteParticipantAsync") deafMuteParticipantAsync

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


### <a name="view_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.viewParticipantAsync") viewParticipantAsync

> View Participant


```java
void viewParticipantAsync(
        final ViewParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | unique conference sid |
| participantSid |  ``` Required ```  | TODO: Add a parameter description |
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


### <a name="add_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.addParticipantAsync") addParticipantAsync

> Add Participant in conference 


```java
void addParticipantAsync(
        final AddParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferencesid |  ``` Required ```  | Unique Conference Sid |
| participantnumber |  ``` Required ```  | Particiant Number |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| muted |  ``` Optional ```  | add muted |
| deaf |  ``` Optional ```  | add without volume |


#### Example Usage

```java
AddParticipantInput collect = new AddParticipantInput();

String conferencesid = "conferencesid";
collect.setConferencesid(conferencesid);

String participantnumber = "participantnumber";
collect.setParticipantnumber(participantnumber);

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


### <a name="view_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.viewConferenceAsync") viewConferenceAsync

> View Conference


```java
void viewConferenceAsync(
        final ViewConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferencesid |  ``` Required ```  | The unique identifier of each conference resource |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewConferenceInput collect = new ViewConferenceInput();

String conferencesid = "conferencesid";
collect.setConferencesid(conferencesid);

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


### <a name="create_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.createConferenceAsync") createConferenceAsync

> Here you can experiment with initiating a conference call through message360 and view the request response generated when doing so.


```java
void createConferenceAsync(
        final CreateConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| to |  ``` Required ```  | To number |
| url |  ``` Required ```  | URL requested once the call connects |
| method |  ``` Required ```  ``` DefaultValue ```  | Specifies the HTTP method used to request the required URL once call connects. |
| recordCallbackUrl |  ``` Required ```  | Recording parameters will be sent here upon completion. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| statusCallBackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallBackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| record |  ``` Optional ```  | Specifies if the conference should be recorded. |
| recordCallbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once conference connects. |
| schdeuleTime |  ``` Optional ```  | Schedule conference in future. Schedule time must be greater than current time |
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

HttpActionEnum method = HttpActionEnum.fromString("POST");
collect.setMethod(method);

String recordCallbackUrl = "RecordCallbackUrl";
collect.setRecordCallbackUrl(recordCallbackUrl);

String responseType = "json";
collect.setResponseType(responseType);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

HttpActionEnum statusCallBackMethod = HttpActionEnum.fromString("GET");
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallBackUrl = "FallBackUrl";
collect.setFallBackUrl(fallBackUrl);

HttpActionEnum fallBackMethod = HttpActionEnum.fromString("GET");
collect.setFallBackMethod(fallBackMethod);

Boolean record = true;
collect.setRecord(record);

HttpActionEnum recordCallbackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallbackMethod(recordCallbackMethod);

String schdeuleTime = "SchdeuleTime";
collect.setSchdeuleTime(schdeuleTime);

Integer timeout = 201;
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


### <a name="hangup_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.hangupParticipantAsync") hangupParticipantAsync

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


### <a name="play_conference_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.playConferenceAudioAsync") playConferenceAudioAsync

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


### <a name="list_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.listParticipantAsync") listParticipantAsync

> List Participant


```java
void listParticipantAsync(
        final ListParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | unique conference sid |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response format, xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | page number |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Amount of records to return per page |
| muted |  ``` Optional ```  | Participants that are muted |
| deaf |  ``` Optional ```  | Participants cant hear |


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


### <a name="list_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.listConferenceAsync") listConferenceAsync

> List Conference


```java
void listConferenceAsync(
        final ListConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| friendlyName |  ``` Optional ```  | Only return conferences with the specified FriendlyName |
| dateCreated |  ``` Optional ```  | Conference created date |


#### Example Usage

```java
ListConferenceInput collect = new ListConferenceInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

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

## <a name="transcription_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.TranscriptionController") TranscriptionController

### Get singleton instance

The singleton instance of the ``` TranscriptionController ``` class can be accessed from the API Client.

```java
TranscriptionController transcription = client.getTranscription();
```

### <a name="list_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.listTranscriptionAsync") listTranscriptionAsync

> Get All transcriptions


```java
void listTranscriptionAsync(
        final ListTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | page number |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Amount of data per page |
| status |  ``` Optional ```  | Transcription status |
| dateTranscribed |  ``` Optional ```  | Transcription date |


#### Example Usage

```java
ListTranscriptionInput collect = new ListTranscriptionInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

StatusEnum status = StatusEnum.fromString("INPROGRESS");
collect.setStatus(status);

String dateTranscribed = "DateTranscribed";
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


### <a name="view_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.viewTranscriptionAsync") viewTranscriptionAsync

> View Specific Transcriptions


```java
void viewTranscriptionAsync(
        final ViewTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transcriptionSid |  ``` Required ```  | Unique Transcription ID |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewTranscriptionInput collect = new ViewTranscriptionInput();

String transcriptionSid = "TranscriptionSid";
collect.setTranscriptionSid(transcriptionSid);

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


### <a name="recording_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.recordingTranscriptionAsync") recordingTranscriptionAsync

> Recording Transcriptions


```java
void recordingTranscriptionAsync(
        final RecordingTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Unique Recording sid |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
RecordingTranscriptionInput collect = new RecordingTranscriptionInput();

String recordingSid = "RecordingSid";
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


### <a name="audio_url_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.audioURLTranscriptionAsync") audioURLTranscriptionAsync

> Audio URL Transcriptions


```java
void audioURLTranscriptionAsync(
        final AudioURLTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| audioUrl |  ``` Required ```  | Audio url |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
AudioURLTranscriptionInput collect = new AudioURLTranscriptionInput();

String audioUrl = "AudioUrl";
collect.setAudioUrl(audioUrl);

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


[Back to List of Controllers](#list_of_controllers)

## <a name="phone_number_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.PhoneNumberController") PhoneNumberController

### Get singleton instance

The singleton instance of the ``` PhoneNumberController ``` class can be accessed from the API Client.

```java
PhoneNumberController phoneNumber = client.getPhoneNumber();
```

### <a name="available_phone_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.availablePhoneNumberAsync") availablePhoneNumberAsync

> Available Phone Number


```java
void availablePhoneNumberAsync(
        final AvailablePhoneNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numberType |  ``` Required ```  | Number type either SMS,Voice or all |
| areaCode |  ``` Required ```  | Phone Number Area Code |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Page Size |


#### Example Usage

```java
AvailablePhoneNumberInput collect = new AvailablePhoneNumberInput();

NumberTypeEnum numberType = NumberTypeEnum.fromString("ALL");
collect.setNumberType(numberType);

String areaCode = "AreaCode";
collect.setAreaCode(areaCode);

String responseType = "json";
collect.setResponseType(responseType);

Integer pageSize = 10;
collect.setPageSize(pageSize);

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


### <a name="list_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.listNumberAsync") listNumberAsync

> List Account's Phone number details


```java
void listNumberAsync(
        final ListNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| numberType |  ``` Optional ```  | SMS or Voice |
| friendlyName |  ``` Optional ```  | Friendly name of the number |


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


### <a name="view_number_details_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.viewNumberDetailsAsync") viewNumberDetailsAsync

> Get Phone Number Details


```java
void viewNumberDetailsAsync(
        final ViewNumberDetailsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Get Phone number Detail |
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


### <a name="release_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.releaseNumberAsync") releaseNumberAsync

> Release number from account


```java
void releaseNumberAsync(
        final ReleaseNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Phone number to be relase |
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


### <a name="buy_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.buyNumberAsync") buyNumberAsync

> Buy Phone Number 


```java
void buyNumberAsync(
        final BuyNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Phone number to be purchase |
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


### <a name="update_phone_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.updatePhoneNumberAsync") updatePhoneNumberAsync

> Update Phone Number Details


```java
void updatePhoneNumberAsync(
        final UpdatePhoneNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | The phone number to update |
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
| smsFallbackUrl |  ``` Optional ```  | URL requested once the call connects |
| smsFallbackMethod |  ``` Optional ```  | URL requested if the sms URL is not available |


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


[Back to List of Controllers](#list_of_controllers)

## <a name="usage_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.UsageController") UsageController

### Get singleton instance

The singleton instance of the ``` UsageController ``` class can be accessed from the API Client.

```java
UsageController usage = client.getUsage();
```

### <a name="list_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.UsageController.listUsageAsync") listUsageAsync

> Get all usage 


```java
void listUsageAsync(
        final ListUsageInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| productCode |  ``` Optional ```  ``` DefaultValue ```  | Product Code |
| startDate |  ``` Optional ```  ``` DefaultValue ```  | Start Usage Date |
| endDate |  ``` Optional ```  ``` DefaultValue ```  | End Usage Date |


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

## <a name="web_rtc_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.WebRTCController") WebRTCController

### Get singleton instance

The singleton instance of the ``` WebRTCController ``` class can be accessed from the API Client.

```java
WebRTCController webRTC = client.getWebRTC();
```

### <a name="check_funds_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.WebRTCController.checkFundsAsync") checkFundsAsync

> TODO: Add a method description


```java
void checkFundsAsync(
        final CheckFundsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSid |  ``` Required ```  | Your message360 Account SID |
| authToken |  ``` Required ```  | Your message360 Token |


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


### <a name="create_token_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.WebRTCController.createTokenAsync") createTokenAsync

> message360 webrtc


```java
void createTokenAsync(
        final CreateTokenInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSid |  ``` Required ```  | Your message360 Account SID |
| authToken |  ``` Required ```  | Your message360 Token |
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


[Back to List of Controllers](#list_of_controllers)

## <a name="recording_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.RecordingController") RecordingController

### Get singleton instance

The singleton instance of the ``` RecordingController ``` class can be accessed from the API Client.

```java
RecordingController recording = client.getRecording();
```

### <a name="view_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.RecordingController.viewRecordingAsync") viewRecordingAsync

> View a specific Recording


```java
void viewRecordingAsync(
        final ViewRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Search Recording sid |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewRecordingInput collect = new ViewRecordingInput();

String recordingSid = "RecordingSid";
collect.setRecordingSid(recordingSid);

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


### <a name="delete_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.RecordingController.deleteRecordingAsync") deleteRecordingAsync

> Delete Recording Record


```java
void deleteRecordingAsync(
        final DeleteRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Unique Recording Sid to be delete |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
DeleteRecordingInput collect = new DeleteRecordingInput();

String recordingSid = "RecordingSid";
collect.setRecordingSid(recordingSid);

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


### <a name="list_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.RecordingController.listRecordingAsync") listRecordingAsync

> List out Recordings


```java
void listRecordingAsync(
        final ListRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| dateCreated |  ``` Optional ```  | Recording date |
| callSid |  ``` Optional ```  | Call ID |


#### Example Usage

```java
ListRecordingInput collect = new ListRecordingInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

String callSid = "CallSid";
collect.setCallSid(callSid);

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

## <a name="email_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.EmailController") EmailController

### Get singleton instance

The singleton instance of the ``` EmailController ``` class can be accessed from the API Client.

```java
EmailController email = client.getEmail();
```

### <a name="delete_spam_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.deleteSpamAsync") deleteSpamAsync

> Deletes a email address marked as spam from the spam list


```java
void deleteSpamAsync(
        final DeleteSpamInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| email |  ``` Required ```  | Email address |


#### Example Usage

```java
DeleteSpamInput collect = new DeleteSpamInput();

String responseType = "json";
collect.setResponseType(responseType);

String email = "email";
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


### <a name="delete_block_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.deleteBlockAsync") deleteBlockAsync

> Deletes a blocked email


```java
void deleteBlockAsync(
        final DeleteBlockInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | Email address to remove from block list |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
DeleteBlockInput collect = new DeleteBlockInput();

String email = "email";
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


### <a name="add_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.addUnsubscribesAsync") addUnsubscribesAsync

> Add an email to the unsubscribe list


```java
void addUnsubscribesAsync(
        final AddUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email to add to the unsubscribe list |
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


### <a name="send_email_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.sendEmailAsync") sendEmailAsync

> Send out an email


```java
void sendEmailAsync(
        final SendEmailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | The to email address |
| from |  ``` Required ```  | The from email address |
| type |  ``` Required ```  ``` DefaultValue ```  | email format type, html or text |
| subject |  ``` Required ```  | Email subject |
| message |  ``` Required ```  | The body of the email message |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| cc |  ``` Optional ```  | CC Email address |
| bcc |  ``` Optional ```  | BCC Email address |
| attachment |  ``` Optional ```  | File to be attached.File must be less than 7MB. |


#### Example Usage

```java
SendEmailInput collect = new SendEmailInput();

String to = "to";
collect.setTo(to);

String from = "from";
collect.setFrom(from);

SendEmailAsEnum type = SendEmailAsEnum.fromString("HTML");
collect.setType(type);

String subject = "subject";
collect.setSubject(subject);

String message = "message";
collect.setMessage(message);

String responseType = "json";
collect.setResponseType(responseType);

String cc = "cc";
collect.setCc(cc);

String bcc = "bcc";
collect.setBcc(bcc);

String attachment = "attachment";
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


### <a name="delete_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.deleteUnsubscribesAsync") deleteUnsubscribesAsync

> Delete emails from the unsubscribe list


```java
void deleteUnsubscribesAsync(
        final DeleteUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email to remove from the unsubscribe list |
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


### <a name="list_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.listUnsubscribesAsync") listUnsubscribesAsync

> List all unsubscribed email addresses


```java
void listUnsubscribesAsync(
        final ListUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | Starting record of the list |
| limit |  ``` Optional ```  | Maximum number of records to be returned |


#### Example Usage

```java
ListUnsubscribesInput collect = new ListUnsubscribesInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
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


### <a name="list_invalid_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.listInvalidAsync") listInvalidAsync

> List out all invalid email addresses


```java
void listInvalidAsync(
        final ListInvalidInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offet |  ``` Optional ```  | Starting record for listing out emails |
| limit |  ``` Optional ```  | Maximum number of records to return |


#### Example Usage

```java
ListInvalidInput collect = new ListInvalidInput();

String responseType = "json";
collect.setResponseType(responseType);

String offet = "offet";
collect.setOffet(offet);

String limit = "limit";
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


### <a name="delete_bounces_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.deleteBouncesAsync") deleteBouncesAsync

> Delete an email address from the bounced address list


```java
void deleteBouncesAsync(
        final DeleteBouncesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| email |  ``` Required ```  | The email address to remove from the bounce list |


#### Example Usage

```java
DeleteBouncesInput collect = new DeleteBouncesInput();

String responseType = "json";
collect.setResponseType(responseType);

String email = "email";
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


### <a name="list_bounces_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.listBouncesAsync") listBouncesAsync

> List out all email addresses that have bounced


```java
void listBouncesAsync(
        final ListBouncesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The record to start the list at |
| limit |  ``` Optional ```  | The maximum number of records to return |


#### Example Usage

```java
ListBouncesInput collect = new ListBouncesInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
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


### <a name="list_spam_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.listSpamAsync") listSpamAsync

> List out all email addresses marked as spam


```java
void listSpamAsync(
        final ListSpamInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The record number to start the list at |
| limit |  ``` Optional ```  | Maximum number of records to return |


#### Example Usage

```java
ListSpamInput collect = new ListSpamInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
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


### <a name="list_blocks_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.listBlocksAsync") listBlocksAsync

> Outputs email addresses on your blocklist


```java
void listBlocksAsync(
        final ListBlocksInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | Where to start in the output list |
| limit |  ``` Optional ```  | Maximum number of records to return |


#### Example Usage

```java
ListBlocksInput collect = new ListBlocksInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
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


### <a name="delete_invalid_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.deleteInvalidAsync") deleteInvalidAsync

> This endpoint allows you to delete entries in the Invalid Emails list.


```java
void deleteInvalidAsync(
        final DeleteInvalidInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | Email that was marked invalid |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Json or xml |


#### Example Usage

```java
DeleteInvalidInput collect = new DeleteInvalidInput();

String email = "email";
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

## <a name="sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.SMSController") SMSController

### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

### <a name="send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.sendSMSAsync") sendSMSAsync

> Send an SMS from a message360 number


```java
void sendSMSAsync(
        final SendSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | SMS enabled Message360 number to send this message from |
| to |  ``` Required ```  | Number to send the SMS to |
| body |  ``` Required ```  | Text Message To Send |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once SMS sent. |
| messagestatuscallback |  ``` Optional ```  | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. |
| smartsms |  ``` Optional ```  ``` DefaultValue ```  | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. |


#### Example Usage

```java
SendSMSInput collect = new SendSMSInput();

String from = "from";
collect.setFrom(from);

String to = "to";
collect.setTo(to);

String body = "body";
collect.setBody(body);

String responseType = "json";
collect.setResponseType(responseType);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String messagestatuscallback = "messagestatuscallback";
collect.setMessagestatuscallback(messagestatuscallback);

Boolean smartsms = false;
collect.setSmartsms(smartsms);

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


### <a name="view_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.viewSMSAsync") viewSMSAsync

> View a Particular SMS


```java
void viewSMSAsync(
        final ViewSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messagesid |  ``` Required ```  | Message sid |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
ViewSMSInput collect = new ViewSMSInput();

String messagesid = "messagesid";
collect.setMessagesid(messagesid);

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


### <a name="list_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.listSMSAsync") listSMSAsync

> List All SMS


```java
void listSMSAsync(
        final ListSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Messages sent from this number |
| to |  ``` Optional ```  | Messages sent to this number |
| datesent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |


#### Example Usage

```java
ListSMSInput collect = new ListSMSInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String from = "from";
collect.setFrom(from);

String to = "to";
collect.setTo(to);

String datesent = "datesent";
collect.setDatesent(datesent);

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


### <a name="list_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.listInboundSMSAsync") listInboundSMSAsync

> List All Inbound SMS


```java
void listInboundSMSAsync(
        final ListInboundSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound SMS |
| to |  ``` Optional ```  | To Number to get Inbound SMS |
| dateSent |  ``` Optional ```  | Filter sms message objects by this date. |


#### Example Usage

```java
ListInboundSMSInput collect = new ListInboundSMSInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String from = "from";
collect.setFrom(from);

String to = "to";
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


[Back to List of Controllers](#list_of_controllers)

## <a name="call_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.CallController") CallController

### Get singleton instance

The singleton instance of the ``` CallController ``` class can be accessed from the API Client.

```java
CallController call = client.getCall();
```

### <a name="make_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.makeCallAsync") makeCallAsync

> You can experiment with initiating a call through Message360 and view the request response generated when doing so and get the response in json


```java
void makeCallAsync(
        final MakeCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| to |  ``` Required ```  | To number |
| url |  ``` Required ```  | URL requested once the call connects |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallBackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| heartBeatUrl |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed tim |
| heartBeatMethod |  ``` Optional ```  | Specifies the HTTP method used to request HeartbeatUrl. |
| timeout |  ``` Optional ```  | Time (in seconds) Message360 should wait while the call is ringing before canceling the call |
| playDtmf |  ``` Optional ```  | DTMF Digits to play to the call once it connects. 0-9, #, or * |
| hideCallerId |  ``` Optional ```  | Specifies if the caller id will be hidden |
| record |  ``` Optional ```  | Specifies if the call should be recorded |
| recordCallBackUrl |  ``` Optional ```  | Recording parameters will be sent here upon completion |
| recordCallBackMethod |  ``` Optional ```  | Method used to request the RecordCallback URL. |
| transcribe |  ``` Optional ```  | Specifies if the call recording should be transcribed |
| transcribeCallBackUrl |  ``` Optional ```  | Transcription parameters will be sent here upon completion |
| ifMachine |  ``` Optional ```  | How Message360 should handle the receiving numbers voicemail machine |
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

Integer timeout = 159;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

Boolean hideCallerId = true;
collect.setHideCallerId(hideCallerId);

Boolean record = true;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

HttpActionEnum recordCallBackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = true;
collect.setTranscribe(transcribe);

String transcribeCallBackUrl = "TranscribeCallBackUrl";
collect.setTranscribeCallBackUrl(transcribeCallBackUrl);

IfMachineEnum ifMachine = IfMachineEnum.fromString("CONTINUE");
collect.setIfMachine(ifMachine);

String ifMachineUrl = "IfMachineUrl";
collect.setIfMachineUrl(ifMachineUrl);

HttpActionEnum ifMachineMethod = HttpActionEnum.fromString("GET");
collect.setIfMachineMethod(ifMachineMethod);

Boolean feedback = true;
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


### <a name="play_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.playAudioAsync") playAudioAsync

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

Integer length = 159;
collect.setLength(length);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Boolean mix = true;
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


### <a name="record_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.recordCallAsync") recordCallAsync

> Record a Call


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

boolean record = true;
collect.setRecord(record);

String responseType = "json";
collect.setResponseType(responseType);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Integer timeLimit = 159;
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


### <a name="voice_effect_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.voiceEffectAsync") voiceEffectAsync

> Voice Effect


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
| pitchSemiTones |  ``` Optional ```  | value between -14 and 14 |
| pitchOctaves |  ``` Optional ```  | value between -1 and 1 |
| pitch |  ``` Optional ```  | value greater than 0 |
| rate |  ``` Optional ```  | value greater than 0 |
| tempo |  ``` Optional ```  | value greater than 0 |


#### Example Usage

```java
VoiceEffectInput collect = new VoiceEffectInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String responseType = "json";
collect.setResponseType(responseType);

AudioDirectionEnum audioDirection = AudioDirectionEnum.fromString("IN");
collect.setAudioDirection(audioDirection);

Double pitchSemiTones = 159.568140860446;
collect.setPitchSemiTones(pitchSemiTones);

Double pitchOctaves = 159.568140860446;
collect.setPitchOctaves(pitchOctaves);

Double pitch = 159.568140860446;
collect.setPitch(pitch);

Double rate = 159.568140860446;
collect.setRate(rate);

Double tempo = 159.568140860446;
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


### <a name="send_digit_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.sendDigitAsync") sendDigitAsync

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


### <a name="interrupted_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.interruptedCallAsync") interruptedCallAsync

> Interrupt the Call by Call Sid


```java
void interruptedCallAsync(
        final InterruptedCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | Call SId |
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


### <a name="group_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.groupCallAsync") groupCallAsync

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
| statusCallBackUrl |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallBackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| heartBeatUrl |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed tim |
| heartBeatMethod |  ``` Optional ```  | Specifies the HTTP method used to request HeartbeatUrl. |
| timeout |  ``` Optional ```  | Time (in seconds) Message360 should wait while the call is ringing before canceling the call |
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

Integer timeout = 159;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

String hideCallerId = "HideCallerId";
collect.setHideCallerId(hideCallerId);

Boolean record = true;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

HttpActionEnum recordCallBackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = true;
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


### <a name="list_calls_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.listCallsAsync") listCallsAsync

> A list of calls associated with your Message360 account


```java
void listCallsAsync(
        final ListCallsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| to |  ``` Optional ```  | Only list calls to this number |
| from |  ``` Optional ```  | Only list calls from this number |
| dateCreated |  ``` Optional ```  | Only list calls starting within the specified date range |


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


### <a name="send_ringless_vm_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.sendRinglessVMAsync") sendRinglessVMAsync

> API endpoint used to send a Ringless Voicemail


```java
void sendRinglessVMAsync(
        final SendRinglessVMInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| rVMCallerId |  ``` Required ```  | Alternate caller ID required for RVM |
| to |  ``` Required ```  | To number |
| voiceMailURL |  ``` Required ```  | URL to an audio file |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| method |  ``` Optional ```  ``` DefaultValue ```  | Not currently used in this version |
| statusCallBackUrl |  ``` Optional ```  | URL to post the status of the Ringless request |
| statsCallBackMethod |  ``` Optional ```  | POST or GET |


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


### <a name="view_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.viewCallAsync") viewCallAsync

> View Call Response


```java
void viewCallAsync(
        final ViewCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callsid |  ``` Required ```  | Call Sid id for particular Call |
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


[Back to List of Controllers](#list_of_controllers)

## <a name="carrier_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.CarrierController") CarrierController

### Get singleton instance

The singleton instance of the ``` CarrierController ``` class can be accessed from the API Client.

```java
CarrierController carrier = client.getCarrier();
```

### <a name="carrier_lookup_list_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CarrierController.carrierLookupListAsync") carrierLookupListAsync

> Get the All Purchase Number's Carrier lookup


```java
void carrierLookupListAsync(
        final CarrierLookupListInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Page Number |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Page Size |


#### Example Usage

```java
CarrierLookupListInput collect = new CarrierLookupListInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

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


### <a name="carrier_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CarrierController.carrierLookupAsync") carrierLookupAsync

> Get the Carrier Lookup


```java
void carrierLookupAsync(
        final CarrierLookupInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | The number to lookup |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CarrierLookupInput collect = new CarrierLookupInput();

String phonenumber = "phonenumber";
collect.setPhonenumber(phonenumber);

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

## <a name="address_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.AddressController") AddressController

### Get singleton instance

The singleton instance of the ``` AddressController ``` class can be accessed from the API Client.

```java
AddressController address = client.getAddress();
```

### <a name="create_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.createAddressAsync") createAddressAsync

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


### <a name="view_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.viewAddressAsync") viewAddressAsync

> View Address Specific address Book by providing the address id


```java
void viewAddressAsync(
        final ViewAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressSID |  ``` Required ```  | The identifier of the address to be retrieved. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
ViewAddressInput collect = new ViewAddressInput();

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

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


### <a name="list_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.listAddressAsync") listAddressAsync

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
| page |  ``` Optional ```  ``` DefaultValue ```  | Return requested # of items starting the value, default=0, must be an integer |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | How many results to return, default is 10, max is 100, must be an integer |
| addressSID |  ``` Optional ```  | addresses Sid |
| dateCreated |  ``` Optional ```  | date created address. |


#### Example Usage

```java
ListAddressInput collect = new ListAddressInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

String dateCreated = "DateCreated";
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


### <a name="verify_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.verifyAddressAsync") verifyAddressAsync

> Validates an address given.


```java
void verifyAddressAsync(
        final VerifyAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressSID |  ``` Required ```  | The identifier of the address to be verified. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type either json or xml |


#### Example Usage

```java
VerifyAddressInput collect = new VerifyAddressInput();

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

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


### <a name="delete_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.deleteAddressAsync") deleteAddressAsync

> To delete Address to your address book


```java
void deleteAddressAsync(
        final DeleteAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressSID |  ``` Required ```  | The identifier of the address to be deleted. |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type either json or xml |


#### Example Usage

```java
DeleteAddressInput collect = new DeleteAddressInput();

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

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

## <a name="sub_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.SubAccountController") SubAccountController

### Get singleton instance

The singleton instance of the ``` SubAccountController ``` class can be accessed from the API Client.

```java
SubAccountController subAccount = client.getSubAccount();
```

### <a name="delete_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SubAccountController.deleteSubAccountAsync") deleteSubAccountAsync

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


### <a name="suspend_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SubAccountController.suspendSubAccountAsync") suspendSubAccountAsync

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


### <a name="create_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SubAccountController.createSubAccountAsync") createSubAccountAsync

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

## <a name="account_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.AccountController") AccountController

### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

### <a name="view_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AccountController.viewAccountAsync") viewAccountAsync

> Display Account Description


```java
void viewAccountAsync(
        final ViewAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| date |  ``` Required ```  | TODO: Add a parameter description |
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

## <a name="short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.ShortCodeController") ShortCodeController

### Get singleton instance

The singleton instance of the ``` ShortCodeController ``` class can be accessed from the API Client.

```java
ShortCodeController shortCode = client.getShortCode();
```

### <a name="send_dedicated_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.sendDedicatedShortcodeAsync") sendDedicatedShortcodeAsync

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
| method |  ``` Optional ```  | Callback status method, POST or GET |
| messagestatuscallback |  ``` Optional ```  | Callback url for SMS status |


#### Example Usage

```java
SendDedicatedShortcodeInput collect = new SendDedicatedShortcodeInput();

int shortcode = 159;
collect.setShortcode(shortcode);

double to = 159.568140860446;
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


### <a name="view_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.viewShortcodeAsync") viewShortcodeAsync

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


### <a name="list_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.listShortcodeAsync") listShortcodeAsync

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


### <a name="list_inbound_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.listInboundShortcodeAsync") listInboundShortcodeAsync

> Retrive a list of inbound Sms Short Code messages associated with your message360 account.


```java
void listInboundShortcodeAsync(
        final ListInboundShortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Only list SMS messages sent from this number |
| shortcode |  ``` Optional ```  | Only list SMS messages sent to Shortcode |
| dateReceived |  ``` Optional ```  | Only list SMS messages sent in the specified date MAKE REQUEST |


#### Example Usage

```java
ListInboundShortcodeInput collect = new ListInboundShortcodeInput();

String responseType = "json";
collect.setResponseType(responseType);

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String from = "From";
collect.setFrom(from);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String dateReceived = "DateReceived";
collect.setDateReceived(dateReceived);

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


[Back to List of Controllers](#list_of_controllers)



