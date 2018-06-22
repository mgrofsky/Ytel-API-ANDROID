# Getting started

Ytel API version 3

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

* Browse to locate the folder containing the source code. Select the location of the YtelAPI gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

## How to Use

The following section explains how to use the YtelAPI library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

In the following step navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':YtelAPILib')``` to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Ytel%20API&workspaceName=YtelAPI&projectName=YtelAPILib&rootNamespace=com.message360.api)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > YtelAPILib > androidTest > java)* from the project explorer.
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

com.message360.api.Configuration.initialize(appContext);
YtelAPIClient client = new YtelAPIClient(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [ShortCodeController](#short_code_controller)
* [AreaMailController](#area_mail_controller)
* [PostCardController](#post_card_controller)
* [LetterController](#letter_controller)
* [CallController](#call_controller)
* [PhoneNumberController](#phone_number_controller)
* [SMSController](#sms_controller)
* [SharedShortCodeController](#shared_short_code_controller)
* [ConferenceController](#conference_controller)
* [CarrierController](#carrier_controller)
* [EmailController](#email_controller)
* [AccountController](#account_controller)
* [SubAccountController](#sub_account_controller)
* [AddressController](#address_controller)
* [RecordingController](#recording_controller)
* [TranscriptionController](#transcription_controller)
* [UsageController](#usage_controller)

## <a name="short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.ShortCodeController") ShortCodeController

### Get singleton instance

The singleton instance of the ``` ShortCodeController ``` class can be accessed from the API Client.

```java
ShortCodeController shortCode = client.getShortCode();
```

### <a name="create_dedicatedshortcode_listshortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ShortCodeController.createDedicatedshortcodeListshortcodeAsync") createDedicatedshortcodeListshortcodeAsync

> Retrieve a list of Short Code assignment associated with your Ytel account.


```java
void createDedicatedshortcodeListshortcodeAsync(
        final CreateDedicatedshortcodeListshortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Optional ```  | Only list Short Code Assignment sent from this Short Code |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |


#### Example Usage

```java
CreateDedicatedshortcodeListshortcodeInput collect = new CreateDedicatedshortcodeListshortcodeInput();

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String page = "page";
collect.setPage(page);

String pagesize = "pagesize";
collect.setPagesize(pagesize);

// Invoking the API call with sample inputs
shortCode.createDedicatedshortcodeListshortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_dedicatedshortcode_updateshortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ShortCodeController.createDedicatedshortcodeUpdateshortcodeAsync") createDedicatedshortcodeUpdateshortcodeAsync

> Update a dedicated shortcode.


```java
void createDedicatedshortcodeUpdateshortcodeAsync(
        final CreateDedicatedshortcodeUpdateshortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid dedicated shortcode to your Ytel account. |
| friendlyName |  ``` Optional ```  | User generated name of the dedicated shortcode. |
| callbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. |
| callbackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| fallbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| fallbackUrl |  ``` Optional ```  | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. |


#### Example Usage

```java
CreateDedicatedshortcodeUpdateshortcodeInput collect = new CreateDedicatedshortcodeUpdateshortcodeInput();

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

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
shortCode.createDedicatedshortcodeUpdateshortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_dedicatedshortcode_viewshortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ShortCodeController.createDedicatedshortcodeViewshortcodeAsync") createDedicatedshortcodeViewshortcodeAsync

> Retrieve a single Short Code object by its shortcode assignment.


```java
void createDedicatedshortcodeViewshortcodeAsync(
        final String shortcode,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid Dedicated Short Code to your Ytel account |


#### Example Usage

```java
String shortcode = "Shortcode";
// Invoking the API call with sample inputs
shortCode.createDedicatedshortcodeViewshortcodeAsync(shortcode, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_shortcode_viewsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ShortCodeController.createShortcodeViewsmsAsync") createShortcodeViewsmsAsync

> View a single Sms Short Code message.


```java
void createShortcodeViewsmsAsync(
        final String messageSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageSid |  ``` Required ```  | The unique identifier for the sms resource |


#### Example Usage

```java
String messageSid = "MessageSid";
// Invoking the API call with sample inputs
shortCode.createShortcodeViewsmsAsync(messageSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_dedicatedshortcode_getinboundsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ShortCodeController.createDedicatedshortcodeGetinboundsmsAsync") createDedicatedshortcodeGetinboundsmsAsync

> Retrive a list of inbound Sms Short Code messages associated with your Ytel account.


```java
void createDedicatedshortcodeGetinboundsmsAsync(
        final CreateDedicatedshortcodeGetinboundsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Only list SMS messages sent from this number |
| shortcode |  ``` Optional ```  | Only list SMS messages sent to Shortcode |
| datecreated |  ``` Optional ```  | Only list SMS messages sent in the specified date MAKE REQUEST |


#### Example Usage

```java
CreateDedicatedshortcodeGetinboundsmsInput collect = new CreateDedicatedshortcodeGetinboundsmsInput();

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
shortCode.createDedicatedshortcodeGetinboundsmsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_dedicatedshortcode_sendsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ShortCodeController.createDedicatedshortcodeSendsmsAsync") createDedicatedshortcodeSendsmsAsync

> Send Dedicated Shortcode


```java
void createDedicatedshortcodeSendsmsAsync(
        final CreateDedicatedshortcodeSendsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | Your dedicated shortcode |
| to |  ``` Required ```  | The number to send your SMS to |
| body |  ``` Required ```  | The body of your message |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST |
| messagestatuscallback |  ``` Optional ```  | URL that can be requested to receive notification when Short Code message was sent. |


#### Example Usage

```java
CreateDedicatedshortcodeSendsmsInput collect = new CreateDedicatedshortcodeSendsmsInput();

int shortcode = 12;
collect.setShortcode(shortcode);

double to = 12.3602690023185;
collect.setTo(to);

String body = "body";
collect.setBody(body);

String method = "method";
collect.setMethod(method);

String messagestatuscallback = "messagestatuscallback";
collect.setMessagestatuscallback(messagestatuscallback);

// Invoking the API call with sample inputs
shortCode.createDedicatedshortcodeSendsmsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_shortcode_listsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ShortCodeController.createShortcodeListsmsAsync") createShortcodeListsmsAsync

> Retrieve a list of Short Code messages.


```java
void createShortcodeListsmsAsync(
        final CreateShortcodeListsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Optional ```  | Only list messages sent from this Short Code |
| to |  ``` Optional ```  | Only list messages sent to this number |
| dateSent |  ``` Optional ```  | Only list messages sent with the specified date |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |


#### Example Usage

```java
CreateShortcodeListsmsInput collect = new CreateShortcodeListsmsInput();

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
shortCode.createShortcodeListsmsAsync(collect, new APICallBack<String>() {
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

## <a name="area_mail_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.AreaMailController") AreaMailController

### Get singleton instance

The singleton instance of the ``` AreaMailController ``` class can be accessed from the API Client.

```java
AreaMailController areaMail = client.getAreaMail();
```

### <a name="create_areamail_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AreaMailController.createAreamailDeleteAsync") createAreamailDeleteAsync

> Remove an AreaMail object by its AreaMailId.


```java
void createAreamailDeleteAsync(
        final String areamailid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| areamailid |  ``` Required ```  | The unique identifier for an AreaMail object. |


#### Example Usage

```java
String areamailid = "areamailid";
// Invoking the API call with sample inputs
areaMail.createAreamailDeleteAsync(areamailid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_areamail_create_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AreaMailController.createAreamailCreateAsync") createAreamailCreateAsync

> Create a new AreaMail object.


```java
void createAreamailCreateAsync(
        final CreateAreamailCreateInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| routes |  ``` Required ```  | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 |
| attachbyid |  ``` Required ```  | Set an existing areamail by attaching its AreamailId. |
| front |  ``` Required ```  | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required |
| back |  ``` Required ```  | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. |
| description |  ``` Optional ```  | A string value to use as a description for this AreaMail item. |
| targettype |  ``` Optional ```  | The delivery location type. |
| htmldata |  ``` Optional ```  | A string value that contains HTML markup. |


#### Example Usage

```java
CreateAreamailCreateInput collect = new CreateAreamailCreateInput();

String routes = "routes";
collect.setRoutes(routes);

String attachbyid = "attachbyid";
collect.setAttachbyid(attachbyid);

String front = "front";
collect.setFront(front);

String back = "back";
collect.setBack(back);

String description = "description";
collect.setDescription(description);

String targettype = "targettype";
collect.setTargettype(targettype);

String htmldata = "htmldata";
collect.setHtmldata(htmldata);

// Invoking the API call with sample inputs
areaMail.createAreamailCreateAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_areamail_view_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AreaMailController.createAreamailViewAsync") createAreamailViewAsync

> Retrieve an AreaMail object by its AreaMailId.


```java
void createAreamailViewAsync(
        final String areamailid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| areamailid |  ``` Required ```  | The unique identifier for an AreaMail object. |


#### Example Usage

```java
String areamailid = "areamailid";
// Invoking the API call with sample inputs
areaMail.createAreamailViewAsync(areamailid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_areamail_lists_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AreaMailController.createAreamailListsAsync") createAreamailListsAsync

> Retrieve a list of AreaMail objects.


```java
void createAreamailListsAsync(
        final CreateAreamailListsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| areamailsid |  ``` Optional ```  | The unique identifier for an AreaMail object. |
| dateCreated |  ``` Optional ```  | The date the AreaMail was created. |


#### Example Usage

```java
CreateAreamailListsInput collect = new CreateAreamailListsInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String areamailsid = "areamailsid";
collect.setAreamailsid(areamailsid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
areaMail.createAreamailListsAsync(collect, new APICallBack<String>() {
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

## <a name="post_card_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.PostCardController") PostCardController

### Get singleton instance

The singleton instance of the ``` PostCardController ``` class can be accessed from the API Client.

```java
PostCardController postCard = client.getPostCard();
```

### <a name="postcard_deletepostcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PostCardController.postcardDeletepostcardAsync") postcardDeletepostcardAsync

> Remove a postcard object.


```java
void postcardDeletepostcardAsync(
        final String postcardid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postcardid |  ``` Required ```  | The unique identifier of a postcard object. |


#### Example Usage

```java
String postcardid = "postcardid";
// Invoking the API call with sample inputs
postCard.postcardDeletepostcardAsync(postcardid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="postcard_viewpostcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PostCardController.postcardViewpostcardAsync") postcardViewpostcardAsync

> Retrieve a postcard object by its PostcardId.


```java
void postcardViewpostcardAsync(
        final String postcardid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postcardid |  ``` Required ```  | The unique identifier for a postcard object. |


#### Example Usage

```java
String postcardid = "postcardid";
// Invoking the API call with sample inputs
postCard.postcardViewpostcardAsync(postcardid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="postcard_listpostcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PostCardController.postcardListpostcardAsync") postcardListpostcardAsync

> Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.


```java
void postcardListpostcardAsync(
        final PostcardListpostcardInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| postcardid |  ``` Optional ```  | The unique identifier for a postcard object. |
| dateCreated |  ``` Optional ```  | The date the postcard was created. |


#### Example Usage

```java
PostcardListpostcardInput collect = new PostcardListpostcardInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String postcardid = "postcardid";
collect.setPostcardid(postcardid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
postCard.postcardListpostcardAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="postcard_createpostcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PostCardController.postcardCreatepostcardAsync") postcardCreatepostcardAsync

> Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.


```java
void postcardCreatepostcardAsync(
        final PostcardCreatepostcardInput input,
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
| description |  ``` Optional ```  | A description for the postcard. |
| htmldata |  ``` Optional ```  | A string value that contains HTML markup. |


#### Example Usage

```java
PostcardCreatepostcardInput collect = new PostcardCreatepostcardInput();

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

String description = "description";
collect.setDescription(description);

String htmldata = "htmldata";
collect.setHtmldata(htmldata);

// Invoking the API call with sample inputs
postCard.postcardCreatepostcardAsync(collect, new APICallBack<String>() {
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

## <a name="letter_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.LetterController") LetterController

### Get singleton instance

The singleton instance of the ``` LetterController ``` class can be accessed from the API Client.

```java
LetterController letter = client.getLetter();
```

### <a name="create_letter_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.LetterController.createLetterDeleteAsync") createLetterDeleteAsync

> Remove a letter object by its LetterId.


```java
void createLetterDeleteAsync(
        final String lettersid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lettersid |  ``` Required ```  | The unique identifier for a letter object. |


#### Example Usage

```java
String lettersid = "lettersid";
// Invoking the API call with sample inputs
letter.createLetterDeleteAsync(lettersid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_letter_viewletter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.LetterController.createLetterViewletterAsync") createLetterViewletterAsync

> Retrieve a letter object by its LetterSid.


```java
void createLetterViewletterAsync(
        final String lettersid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lettersid |  ``` Required ```  | The unique identifier for a letter object. |


#### Example Usage

```java
String lettersid = "lettersid";
// Invoking the API call with sample inputs
letter.createLetterViewletterAsync(lettersid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_letter_listsletter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.LetterController.createLetterListsletterAsync") createLetterListsletterAsync

> Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.


```java
void createLetterListsletterAsync(
        final CreateLetterListsletterInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| lettersid |  ``` Optional ```  | The unique identifier for a letter object. |
| dateCreated |  ``` Optional ```  | The date the letter was created. |


#### Example Usage

```java
CreateLetterListsletterInput collect = new CreateLetterListsletterInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String lettersid = "lettersid";
collect.setLettersid(lettersid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
letter.createLetterListsletterAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_letter_create_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.LetterController.createLetterCreateAsync") createLetterCreateAsync

> Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.


```java
void createLetterCreateAsync(
        final CreateLetterCreateInput input,
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
| description |  ``` Optional ```  | A description for the letter. |
| extraservice |  ``` Optional ```  | Add an extra service to your letter. Options are "certified" or "registered". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. |
| doublesided |  ``` Optional ```  | Specify if letter should be printed on both sides. |
| template |  ``` Optional ```  | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. |
| htmldata |  ``` Optional ```  | A string value that contains HTML markup. |


#### Example Usage

```java
CreateLetterCreateInput collect = new CreateLetterCreateInput();

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
letter.createLetterCreateAsync(collect, new APICallBack<String>() {
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

## <a name="call_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.CallController") CallController

### Get singleton instance

The singleton instance of the ``` CallController ``` class can be accessed from the API Client.

```java
CallController call = client.getCall();
```

### <a name="create_calls_viewcalldetail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsViewcalldetailAsync") createCallsViewcalldetailAsync

> Retrieve a single voice call’s information by its CallSid.


```java
void createCallsViewcalldetailAsync(
        final String callSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier for the voice call. |


#### Example Usage

```java
String callSid = "callSid";
// Invoking the API call with sample inputs
call.createCallsViewcalldetailAsync(callSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_calls_viewcalls_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsViewcallsAsync") createCallsViewcallsAsync

> Retrieve a single voice call’s information by its CallSid.


```java
void createCallsViewcallsAsync(
        final String callsid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callsid |  ``` Required ```  | The unique identifier for the voice call. |


#### Example Usage

```java
String callsid = "callsid";
// Invoking the API call with sample inputs
call.createCallsViewcallsAsync(callsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_calls_senddigits_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsSenddigitsAsync") createCallsSenddigitsAsync

> Play Dtmf and send the Digit


```java
void createCallsSenddigitsAsync(
        final CreateCallsSenddigitsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| playDtmf |  ``` Required ```  | DTMF digits to play to the call. 0-9, #, *, W, or w |
| playDtmfDirection |  ``` Optional ```  | The leg of the call DTMF digits should be sent to |


#### Example Usage

```java
CreateCallsSenddigitsInput collect = new CreateCallsSenddigitsInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

PlayDtmfDirectionEnum playDtmfDirection = PlayDtmfDirectionEnum.fromString("IN");
collect.setPlayDtmfDirection(playDtmfDirection);

// Invoking the API call with sample inputs
call.createCallsSenddigitsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_makervm_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsMakervmAsync") createCallsMakervmAsync

> Initiate an outbound Ringless Voicemail through Ytel.


```java
void createCallsMakervmAsync(
        final CreateCallsMakervmInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
| rVMCallerId |  ``` Required ```  | A required secondary Caller ID for RVM to work. |
| to |  ``` Required ```  | A valid number (E.164 format) that will receive the phone call. |
| voiceMailURL |  ``` Required ```  | The URL requested once the RVM connects. A set of default parameters will be sent here. |
| method |  ``` Optional ```  ``` DefaultValue ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| statsCallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. |


#### Example Usage

```java
CreateCallsMakervmInput collect = new CreateCallsMakervmInput();

String from = "From";
collect.setFrom(from);

String rVMCallerId = "RVMCallerId";
collect.setRVMCallerId(rVMCallerId);

String to = "To";
collect.setTo(to);

String voiceMailURL = "VoiceMailURL";
collect.setVoiceMailURL(voiceMailURL);

String method = "GET";
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

String statsCallBackMethod = "StatsCallBackMethod";
collect.setStatsCallBackMethod(statsCallBackMethod);

// Invoking the API call with sample inputs
call.createCallsMakervmAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_listcalls_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsListcallsAsync") createCallsListcallsAsync

> A list of calls associated with your Ytel account


```java
void createCallsListcallsAsync(
        final CreateCallsListcallsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| to |  ``` Optional ```  | Filter calls that were sent to this 10-digit number (E.164 format). |
| from |  ``` Optional ```  | Filter calls that were sent from this 10-digit number (E.164 format). |
| dateCreated |  ``` Optional ```  | Return calls that are from a specified date. |


#### Example Usage

```java
CreateCallsListcallsInput collect = new CreateCallsListcallsInput();

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
call.createCallsListcallsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_interruptcalls_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsInterruptcallsAsync") createCallsInterruptcallsAsync

> Interrupt the Call by Call Sid


```java
void createCallsInterruptcallsAsync(
        final CreateCallsInterruptcallsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier for voice call that is in progress. |
| url |  ``` Optional ```  | URL the in-progress call will be redirected to |
| method |  ``` Optional ```  | The method used to request the above Url parameter |
| status |  ``` Optional ```  | Status to set the in-progress call to |


#### Example Usage

```java
CreateCallsInterruptcallsInput collect = new CreateCallsInterruptcallsInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String url = "Url";
collect.setUrl(url);

String method = "Method";
collect.setMethod(method);

Status24Enum status = Status24Enum.fromString("CANCELED");
collect.setStatus(status);

// Invoking the API call with sample inputs
call.createCallsInterruptcallsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_recordcalls_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsRecordcallsAsync") createCallsRecordcallsAsync

> Start or stop recording of an in-progress voice call.


```java
void createCallsRecordcallsAsync(
        final CreateCallsRecordcallsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| record |  ``` Required ```  | Set true to initiate recording or false to terminate recording |
| direction |  ``` Optional ```  | The leg of the call to record |
| timeLimit |  ``` Optional ```  | Time in seconds the recording duration should not exceed |
| callBackUrl |  ``` Optional ```  | URL consulted after the recording completes |
| fileformat |  ``` Optional ```  | Format of the recording file. Can be .mp3 or .wav |


#### Example Usage

```java
CreateCallsRecordcallsInput collect = new CreateCallsRecordcallsInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

boolean record = false;
collect.setRecord(record);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Integer timeLimit = 12;
collect.setTimeLimit(timeLimit);

String callBackUrl = "CallBackUrl";
collect.setCallBackUrl(callBackUrl);

FileformatEnum fileformat = FileformatEnum.fromString("mp3");
collect.setFileformat(fileformat);

// Invoking the API call with sample inputs
call.createCallsRecordcallsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_playaudios_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsPlayaudiosAsync") createCallsPlayaudiosAsync

> Play Audio from a url


```java
void createCallsPlayaudiosAsync(
        final CreateCallsPlayaudiosInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| audioUrl |  ``` Required ```  | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav |
| sayText |  ``` Required ```  | Valid alphanumeric string that should be played to the In-progress call. |
| length |  ``` Optional ```  | Time limit in seconds for audio play back |
| direction |  ``` Optional ```  | The leg of the call audio will be played to |
| mix |  ``` Optional ```  | If false, all other audio will be muted |


#### Example Usage

```java
CreateCallsPlayaudiosInput collect = new CreateCallsPlayaudiosInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String audioUrl = "AudioUrl";
collect.setAudioUrl(audioUrl);

String sayText = "SayText";
collect.setSayText(sayText);

Integer length = 12;
collect.setLength(length);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Boolean mix = false;
collect.setMix(mix);

// Invoking the API call with sample inputs
call.createCallsPlayaudiosAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_voiceeffect_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsVoiceeffectAsync") createCallsVoiceeffectAsync

> Add audio voice effects to the an in-progress voice call.


```java
void createCallsVoiceeffectAsync(
        final CreateCallsVoiceeffectInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier for the in-progress voice call. |
| audioDirection |  ``` Optional ```  | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. |
| pitchSemiTones |  ``` Optional ```  | Set the pitch in semitone (half-step) intervals. Value between -14 and 14 |
| pitchOctaves |  ``` Optional ```  | Set the pitch in octave intervals.. Value between -1 and 1 |
| pitch |  ``` Optional ```  | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 |
| rate |  ``` Optional ```  | Set the rate for audio. The lower the value, the lower the rate. value greater than 0 |
| tempo |  ``` Optional ```  | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 |


#### Example Usage

```java
CreateCallsVoiceeffectInput collect = new CreateCallsVoiceeffectInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

AudioDirectionEnum audioDirection = AudioDirectionEnum.fromString("IN");
collect.setAudioDirection(audioDirection);

Double pitchSemiTones = 12.3602690023185;
collect.setPitchSemiTones(pitchSemiTones);

Double pitchOctaves = 12.3602690023185;
collect.setPitchOctaves(pitchOctaves);

Double pitch = 12.3602690023185;
collect.setPitch(pitch);

Double rate = 12.3602690023185;
collect.setRate(rate);

Double tempo = 12.3602690023185;
collect.setTempo(tempo);

// Invoking the API call with sample inputs
call.createCallsVoiceeffectAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_groupcall_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsGroupcallAsync") createCallsGroupcallAsync

> Group Call


```java
void createCallsGroupcallAsync(
        final CreateCallsGroupcallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| to |  ``` Required ```  | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 |
| url |  ``` Required ```  | URL requested once the call connects |
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
CreateCallsGroupcallInput collect = new CreateCallsGroupcallInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

String groupConfirmKey = "GroupConfirmKey";
collect.setGroupConfirmKey(groupConfirmKey);

GroupConfirmFileEnum groupConfirmFile = GroupConfirmFileEnum.fromString("mp3");
collect.setGroupConfirmFile(groupConfirmFile);

String method = "Method";
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

String statusCallBackMethod = "StatusCallBackMethod";
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallBackUrl = "FallBackUrl";
collect.setFallBackUrl(fallBackUrl);

String fallBackMethod = "FallBackMethod";
collect.setFallBackMethod(fallBackMethod);

String heartBeatUrl = "HeartBeatUrl";
collect.setHeartBeatUrl(heartBeatUrl);

String heartBeatMethod = "HeartBeatMethod";
collect.setHeartBeatMethod(heartBeatMethod);

Integer timeout = 12;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

String hideCallerId = "HideCallerId";
collect.setHideCallerId(hideCallerId);

Boolean record = false;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

String recordCallBackMethod = "RecordCallBackMethod";
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = false;
collect.setTranscribe(transcribe);

String transcribeCallBackUrl = "TranscribeCallBackUrl";
collect.setTranscribeCallBackUrl(transcribeCallBackUrl);

// Invoking the API call with sample inputs
call.createCallsGroupcallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_calls_makecall_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CallController.createCallsMakecallAsync") createCallsMakecallAsync

> You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json


```java
void createCallsMakecallAsync(
        final CreateCallsMakecallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
| to |  ``` Required ```  | To number |
| url |  ``` Required ```  | URL requested once the call connects |
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
CreateCallsMakecallInput collect = new CreateCallsMakecallInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

String method = "Method";
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

String statusCallBackMethod = "StatusCallBackMethod";
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallBackUrl = "FallBackUrl";
collect.setFallBackUrl(fallBackUrl);

String fallBackMethod = "FallBackMethod";
collect.setFallBackMethod(fallBackMethod);

String heartBeatUrl = "HeartBeatUrl";
collect.setHeartBeatUrl(heartBeatUrl);

String heartBeatMethod = "HeartBeatMethod";
collect.setHeartBeatMethod(heartBeatMethod);

Integer timeout = 12;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

Boolean hideCallerId = false;
collect.setHideCallerId(hideCallerId);

Boolean record = false;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

String recordCallBackMethod = "RecordCallBackMethod";
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = false;
collect.setTranscribe(transcribe);

String transcribeCallBackUrl = "TranscribeCallBackUrl";
collect.setTranscribeCallBackUrl(transcribeCallBackUrl);

IfMachineEnum ifMachine = IfMachineEnum.fromString("CONTINUE");
collect.setIfMachine(ifMachine);

String ifMachineUrl = "IfMachineUrl";
collect.setIfMachineUrl(ifMachineUrl);

String ifMachineMethod = "IfMachineMethod";
collect.setIfMachineMethod(ifMachineMethod);

Boolean feedback = false;
collect.setFeedback(feedback);

String surveyId = "SurveyId";
collect.setSurveyId(surveyId);

// Invoking the API call with sample inputs
call.createCallsMakecallAsync(collect, new APICallBack<String>() {
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

## <a name="phone_number_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.PhoneNumberController") PhoneNumberController

### Get singleton instance

The singleton instance of the ``` PhoneNumberController ``` class can be accessed from the API Client.

```java
PhoneNumberController phoneNumber = client.getPhoneNumber();
```

### <a name="create_incomingphone_getdidscore_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneGetdidscoreAsync") createIncomingphoneGetdidscoreAsync

> Get DID Score Number


```java
void createIncomingphoneGetdidscoreAsync(
        final String phonenumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | Specifies the multiple phone numbers for check updated spamscore . |


#### Example Usage

```java
String phonenumber = "Phonenumber";
// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneGetdidscoreAsync(phonenumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_incomingphone_bulkbuy_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneBulkbuyAsync") createIncomingphoneBulkbuyAsync

> Purchase a selected number of DID's from specific area codes to be used with your Ytel account.


```java
void createIncomingphoneBulkbuyAsync(
        final CreateIncomingphoneBulkbuyInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numberType |  ``` Required ```  | The capability the number supports. |
| areaCode |  ``` Required ```  | Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
| quantity |  ``` Required ```  | A positive integer that tells how many number you want to buy at a time. |
| leftover |  ``` Optional ```  | If desired quantity is unavailable purchase what is available . |


#### Example Usage

```java
CreateIncomingphoneBulkbuyInput collect = new CreateIncomingphoneBulkbuyInput();

Numbertype16Enum numberType = Numbertype16Enum.fromString("ALL");
collect.setNumberType(numberType);

String areaCode = "AreaCode";
collect.setAreaCode(areaCode);

String quantity = "Quantity";
collect.setQuantity(quantity);

String leftover = "Leftover";
collect.setLeftover(leftover);

// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneBulkbuyAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_incomingphone_listnumber_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneListnumberAsync") createIncomingphoneListnumberAsync

> Retrieve a list of purchased phones numbers associated with your Ytel account.


```java
void createIncomingphoneListnumberAsync(
        final CreateIncomingphoneListnumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | Which page of the overall response will be returned. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| numberType |  ``` Optional ```  | The capability supported by the number.Number type either SMS,Voice or all |
| friendlyName |  ``` Optional ```  | A human-readable label added to the number object. |


#### Example Usage

```java
CreateIncomingphoneListnumberInput collect = new CreateIncomingphoneListnumberInput();

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

Numbertype16Enum numberType = Numbertype16Enum.fromString("ALL");
collect.setNumberType(numberType);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneListnumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_incomingphone_buynumber_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneBuynumberAsync") createIncomingphoneBuynumberAsync

> Purchase a phone number to be used with your Ytel account


```java
void createIncomingphoneBuynumberAsync(
        final String phoneNumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid 10-digit Ytel number (E.164 format). |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneBuynumberAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_incomingphone_releasenumber_by_response_type_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneReleasenumberByResponseTypePostAsync") createIncomingphoneReleasenumberByResponseTypePostAsync

> Remove a purchased Ytel number from your account.


```java
void createIncomingphoneReleasenumberByResponseTypePostAsync(
        final CreateIncomingphoneReleasenumberByResponseTypePostInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid 10-digit Ytel number (E.164 format). |
| responseType |  ``` Required ```  | Response type format xml or json |


#### Example Usage

```java
CreateIncomingphoneReleasenumberByResponseTypePostInput collect = new CreateIncomingphoneReleasenumberByResponseTypePostInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "ResponseType";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneReleasenumberByResponseTypePostAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_incomingphone_viewnumber_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneViewnumberAsync") createIncomingphoneViewnumberAsync

> Retrieve the details for a phone number by its number.


```java
void createIncomingphoneViewnumberAsync(
        final String phoneNumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid Ytel 10-digit phone number (E.164 format). |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneViewnumberAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_incomingphone_transferphonenumbers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneTransferphonenumbersAsync") createIncomingphoneTransferphonenumbersAsync

> Transfer phone number that has been purchased for from one account to another account.


```java
void createIncomingphoneTransferphonenumbersAsync(
        final CreateIncomingphoneTransferphonenumbersInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | A valid 10-digit Ytel number (E.164 format). |
| fromaccountsid |  ``` Required ```  | A specific Accountsid from where Number is getting transfer. |
| toaccountsid |  ``` Required ```  | A specific Accountsid to which Number is getting transfer. |


#### Example Usage

```java
CreateIncomingphoneTransferphonenumbersInput collect = new CreateIncomingphoneTransferphonenumbersInput();

String phonenumber = "phonenumber";
collect.setPhonenumber(phonenumber);

String fromaccountsid = "fromaccountsid";
collect.setFromaccountsid(fromaccountsid);

String toaccountsid = "toaccountsid";
collect.setToaccountsid(toaccountsid);

// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneTransferphonenumbersAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_incomingphone_massreleasenumber_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneMassreleasenumberAsync") createIncomingphoneMassreleasenumberAsync

> Remove a purchased Ytel number from your account.


```java
void createIncomingphoneMassreleasenumberAsync(
        final String phoneNumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid Ytel comma separated numbers (E.164 format). |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneMassreleasenumberAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_incomingphone_massupdatenumber_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneMassupdatenumberAsync") createIncomingphoneMassupdatenumberAsync

> Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.


```java
void createIncomingphoneMassupdatenumberAsync(
        final CreateIncomingphoneMassupdatenumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid comma(,) separated Ytel numbers. (E.164 format). |
| voiceUrl |  ``` Required ```  | The URL returning InboundXML incoming calls should execute when connected. |
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
CreateIncomingphoneMassupdatenumberInput collect = new CreateIncomingphoneMassupdatenumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String voiceUrl = "VoiceUrl";
collect.setVoiceUrl(voiceUrl);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String voiceMethod = "VoiceMethod";
collect.setVoiceMethod(voiceMethod);

String voiceFallbackUrl = "VoiceFallbackUrl";
collect.setVoiceFallbackUrl(voiceFallbackUrl);

String voiceFallbackMethod = "VoiceFallbackMethod";
collect.setVoiceFallbackMethod(voiceFallbackMethod);

String hangupCallback = "HangupCallback";
collect.setHangupCallback(hangupCallback);

String hangupCallbackMethod = "HangupCallbackMethod";
collect.setHangupCallbackMethod(hangupCallbackMethod);

String heartbeatUrl = "HeartbeatUrl";
collect.setHeartbeatUrl(heartbeatUrl);

String heartbeatMethod = "HeartbeatMethod";
collect.setHeartbeatMethod(heartbeatMethod);

String smsUrl = "SmsUrl";
collect.setSmsUrl(smsUrl);

String smsMethod = "SmsMethod";
collect.setSmsMethod(smsMethod);

String smsFallbackUrl = "SmsFallbackUrl";
collect.setSmsFallbackUrl(smsFallbackUrl);

String smsFallbackMethod = "SmsFallbackMethod";
collect.setSmsFallbackMethod(smsFallbackMethod);

// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneMassupdatenumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_incomingphone_updatenumber_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneUpdatenumberAsync") createIncomingphoneUpdatenumberAsync

> Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.


```java
void createIncomingphoneUpdatenumberAsync(
        final CreateIncomingphoneUpdatenumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid Ytel number (E.164 format). |
| voiceUrl |  ``` Required ```  | URL requested once the call connects |
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
CreateIncomingphoneUpdatenumberInput collect = new CreateIncomingphoneUpdatenumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String voiceUrl = "VoiceUrl";
collect.setVoiceUrl(voiceUrl);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String voiceMethod = "VoiceMethod";
collect.setVoiceMethod(voiceMethod);

String voiceFallbackUrl = "VoiceFallbackUrl";
collect.setVoiceFallbackUrl(voiceFallbackUrl);

String voiceFallbackMethod = "VoiceFallbackMethod";
collect.setVoiceFallbackMethod(voiceFallbackMethod);

String hangupCallback = "HangupCallback";
collect.setHangupCallback(hangupCallback);

String hangupCallbackMethod = "HangupCallbackMethod";
collect.setHangupCallbackMethod(hangupCallbackMethod);

String heartbeatUrl = "HeartbeatUrl";
collect.setHeartbeatUrl(heartbeatUrl);

String heartbeatMethod = "HeartbeatMethod";
collect.setHeartbeatMethod(heartbeatMethod);

String smsUrl = "SmsUrl";
collect.setSmsUrl(smsUrl);

String smsMethod = "SmsMethod";
collect.setSmsMethod(smsMethod);

String smsFallbackUrl = "SmsFallbackUrl";
collect.setSmsFallbackUrl(smsFallbackUrl);

String smsFallbackMethod = "SmsFallbackMethod";
collect.setSmsFallbackMethod(smsFallbackMethod);

// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneUpdatenumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_incomingphone_availablenumber_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.PhoneNumberController.createIncomingphoneAvailablenumberAsync") createIncomingphoneAvailablenumberAsync

> Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.


```java
void createIncomingphoneAvailablenumberAsync(
        final CreateIncomingphoneAvailablenumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numbertype |  ``` Required ```  | Number type either SMS,Voice or all |
| areacode |  ``` Required ```  | Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return. |


#### Example Usage

```java
CreateIncomingphoneAvailablenumberInput collect = new CreateIncomingphoneAvailablenumberInput();

Numbertype16Enum numbertype = Numbertype16Enum.fromString("ALL");
collect.setNumbertype(numbertype);

String areacode = "areacode";
collect.setAreacode(areacode);

Integer pagesize = 10;
collect.setPagesize(pagesize);

// Invoking the API call with sample inputs
phoneNumber.createIncomingphoneAvailablenumberAsync(collect, new APICallBack<String>() {
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

## <a name="sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.SMSController") SMSController

### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

### <a name="create_sms_viewdetailsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SMSController.createSmsViewdetailsmsAsync") createSmsViewdetailsmsAsync

> Retrieve a single SMS message object with details by its SmsSid.


```java
void createSmsViewdetailsmsAsync(
        final String messageSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageSid |  ``` Required ```  | The unique identifier for a sms message. |


#### Example Usage

```java
String messageSid = "MessageSid";
// Invoking the API call with sample inputs
sMS.createSmsViewdetailsmsAsync(messageSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_sms_viewsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SMSController.createSmsViewsmsAsync") createSmsViewsmsAsync

> Retrieve a single SMS message object by its SmsSid.


```java
void createSmsViewsmsAsync(
        final String messageSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageSid |  ``` Required ```  | The unique identifier for a sms message. |


#### Example Usage

```java
String messageSid = "MessageSid";
// Invoking the API call with sample inputs
sMS.createSmsViewsmsAsync(messageSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_sms_getinboundsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SMSController.createSmsGetinboundsmsAsync") createSmsGetinboundsmsAsync

> Retrieve a list of Inbound SMS message objects.


```java
void createSmsGetinboundsmsAsync(
        final CreateSmsGetinboundsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| from |  ``` Optional ```  | Filter SMS message objects from this valid 10-digit phone number (E.164 format). |
| to |  ``` Optional ```  | Filter SMS message objects to this valid 10-digit phone number (E.164 format). |
| dateSent |  ``` Optional ```  | Filter sms message objects by this date. |


#### Example Usage

```java
CreateSmsGetinboundsmsInput collect = new CreateSmsGetinboundsmsInput();

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
sMS.createSmsGetinboundsmsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_sms_listsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SMSController.createSmsListsmsAsync") createSmsListsmsAsync

> Retrieve a list of Outbound SMS message objects.


```java
void createSmsListsmsAsync(
        final CreateSmsListsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Filter SMS message objects from this valid 10-digit phone number (E.164 format). |
| to |  ``` Optional ```  | Filter SMS message objects to this valid 10-digit phone number (E.164 format). |
| dateSent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |


#### Example Usage

```java
CreateSmsListsmsInput collect = new CreateSmsListsmsInput();

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
sMS.createSmsListsmsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_sms_sendsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SMSController.createSmsSendsmsAsync") createSmsSendsmsAsync

> Send an SMS from a Ytel number


```java
void createSmsSendsmsAsync(
        final CreateSmsSendsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. |
| to |  ``` Required ```  | The 10-digit phone number (E.164 format) that will receive the message. |
| body |  ``` Required ```  | The body message that is to be sent in the text. |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once SMS sent. |
| messageStatusCallback |  ``` Optional ```  | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. |
| smartsms |  ``` Optional ```  ``` DefaultValue ```  | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. |
| deliveryStatus |  ``` Optional ```  ``` DefaultValue ```  | Delivery reports are a method to tell your system if the message has arrived on the destination phone. |


#### Example Usage

```java
CreateSmsSendsmsInput collect = new CreateSmsSendsmsInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String body = "Body";
collect.setBody(body);

String method = "Method";
collect.setMethod(method);

String messageStatusCallback = "MessageStatusCallback";
collect.setMessageStatusCallback(messageStatusCallback);

Boolean smartsms = false;
collect.setSmartsms(smartsms);

Boolean deliveryStatus = false;
collect.setDeliveryStatus(deliveryStatus);

// Invoking the API call with sample inputs
sMS.createSmsSendsmsAsync(collect, new APICallBack<String>() {
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

## <a name="shared_short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.SharedShortCodeController") SharedShortCodeController

### Get singleton instance

The singleton instance of the ``` SharedShortCodeController ``` class can be accessed from the API Client.

```java
SharedShortCodeController sharedShortCode = client.getSharedShortCode();
```

### <a name="create_shortcode_viewshortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createShortcodeViewshortcodeAsync") createShortcodeViewshortcodeAsync

> The response returned here contains all resource properties associated with the given Shortcode.


```java
void createShortcodeViewshortcodeAsync(
        final String shortcode,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid Shortcode to your Ytel account |


#### Example Usage

```java
String shortcode = "Shortcode";
// Invoking the API call with sample inputs
sharedShortCode.createShortcodeViewshortcodeAsync(shortcode, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_keyword_view_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createKeywordViewAsync") createKeywordViewAsync

> View a set of properties for a single keyword.


```java
void createKeywordViewAsync(
        final String keywordid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| keywordid |  ``` Required ```  | The unique identifier of each keyword |


#### Example Usage

```java
String keywordid = "Keywordid";
// Invoking the API call with sample inputs
sharedShortCode.createKeywordViewAsync(keywordid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_shortcode_updateshortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createShortcodeUpdateshortcodeAsync") createShortcodeUpdateshortcodeAsync

> Update Assignment


```java
void createShortcodeUpdateshortcodeAsync(
        final CreateShortcodeUpdateshortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | List of valid shortcode to your Ytel account |
| friendlyName |  ``` Optional ```  | User generated name of the shortcode |
| callbackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| callbackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. |
| fallbackUrl |  ``` Optional ```  | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. |
| fallbackUrlMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |


#### Example Usage

```java
CreateShortcodeUpdateshortcodeInput collect = new CreateShortcodeUpdateshortcodeInput();

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String callbackUrl = "CallbackUrl";
collect.setCallbackUrl(callbackUrl);

String callbackMethod = "CallbackMethod";
collect.setCallbackMethod(callbackMethod);

String fallbackUrl = "FallbackUrl";
collect.setFallbackUrl(fallbackUrl);

String fallbackUrlMethod = "FallbackUrlMethod";
collect.setFallbackUrlMethod(fallbackUrlMethod);

// Invoking the API call with sample inputs
sharedShortCode.createShortcodeUpdateshortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_template_view_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createTemplateViewAsync") createTemplateViewAsync

> View a Shared ShortCode Template


```java
void createTemplateViewAsync(
        final UUID templateId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| templateId |  ``` Required ```  | The unique identifier for a template object |


#### Example Usage

```java
UUID templateId = UUID.randomUUID();
// Invoking the API call with sample inputs
sharedShortCode.createTemplateViewAsync(templateId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_shortcode_listshortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createShortcodeListshortcodeAsync") createShortcodeListshortcodeAsync

> Retrieve a list of shortcode assignment associated with your Ytel account.


```java
void createShortcodeListshortcodeAsync(
        final CreateShortcodeListshortcodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |


#### Example Usage

```java
CreateShortcodeListshortcodeInput collect = new CreateShortcodeListshortcodeInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

// Invoking the API call with sample inputs
sharedShortCode.createShortcodeListshortcodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_keyword_lists_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createKeywordListsAsync") createKeywordListsAsync

> Retrieve a list of keywords associated with your Ytel account.


```java
void createKeywordListsAsync(
        final CreateKeywordListsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| keyword |  ``` Optional ```  | Only list keywords of keyword |
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |


#### Example Usage

```java
CreateKeywordListsInput collect = new CreateKeywordListsInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String keyword = "Keyword";
collect.setKeyword(keyword);

Integer shortcode = 12;
collect.setShortcode(shortcode);

// Invoking the API call with sample inputs
sharedShortCode.createKeywordListsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_template_lists_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createTemplateListsAsync") createTemplateListsAsync

> List Shortcode Templates by Type


```java
void createTemplateListsAsync(
        final CreateTemplateListsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Optional ```  ``` DefaultValue ```  | The type (category) of template Valid values: marketing, authorization |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| shortcode |  ``` Optional ```  | Only list templates of type |


#### Example Usage

```java
CreateTemplateListsInput collect = new CreateTemplateListsInput();

String type = "authorization";
collect.setType(type);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

// Invoking the API call with sample inputs
sharedShortCode.createTemplateListsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_shortcode_sendsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createShortcodeSendsmsAsync") createShortcodeSendsmsAsync

> Send an SMS from a Ytel ShortCode


```java
void createShortcodeSendsmsAsync(
        final CreateShortcodeSendsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | The Short Code number that is the sender of this message |
| to |  ``` Required ```  | A valid 10-digit number that should receive the message |
| templateid |  ``` Required ```  | The unique identifier for the template used for the message |
| data |  ``` Required ```  | format of your data, example: {companyname}:test,{otpcode}:1234 |
| method |  ``` Optional ```  ``` DefaultValue ```  | Specifies the HTTP method used to request the required URL once the Short Code message is sent. |
| messageStatusCallback |  ``` Optional ```  | URL that can be requested to receive notification when Short Code message was sent. |


#### Example Usage

```java
CreateShortcodeSendsmsInput collect = new CreateShortcodeSendsmsInput();

String shortcode = "shortcode";
collect.setShortcode(shortcode);

String to = "to";
collect.setTo(to);

UUID templateid = UUID.randomUUID();
collect.setTemplateid(templateid);

String data = "data";
collect.setData(data);

String method = "GET";
collect.setMethod(method);

String messageStatusCallback = "MessageStatusCallback";
collect.setMessageStatusCallback(messageStatusCallback);

// Invoking the API call with sample inputs
sharedShortCode.createShortcodeSendsmsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_shortcode_getinboundsms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SharedShortCodeController.createShortcodeGetinboundsmsAsync") createShortcodeGetinboundsmsAsync

> List All Inbound ShortCode


```java
void createShortcodeGetinboundsmsAsync(
        final CreateShortcodeGetinboundsmsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound ShortCode |
| shortcode |  ``` Optional ```  | Only list messages sent to this Short Code |
| datecreated |  ``` Optional ```  | Only list messages sent with the specified date |


#### Example Usage

```java
CreateShortcodeGetinboundsmsInput collect = new CreateShortcodeGetinboundsmsInput();

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
sharedShortCode.createShortcodeGetinboundsmsAsync(collect, new APICallBack<String>() {
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

## <a name="conference_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.ConferenceController") ConferenceController

### Get singleton instance

The singleton instance of the ``` ConferenceController ``` class can be accessed from the API Client.

```java
ConferenceController conference = client.getConference();
```

### <a name="create_conferences_play_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesPlayAudioAsync") createConferencesPlayAudioAsync

> Play an audio file during a conference.


```java
void createConferencesPlayAudioAsync(
        final CreateConferencesPlayAudioInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |
| audioUrl |  ``` Required ```  | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. |


#### Example Usage

```java
CreateConferencesPlayAudioInput collect = new CreateConferencesPlayAudioInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

AudioUrlEnum audioUrl = AudioUrlEnum.fromString("mp3");
collect.setAudioUrl(audioUrl);

// Invoking the API call with sample inputs
conference.createConferencesPlayAudioAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conferences_hangup_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesHangupParticipantAsync") createConferencesHangupParticipantAsync

> Remove a participant from a conference.


```java
void createConferencesHangupParticipantAsync(
        final CreateConferencesHangupParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |


#### Example Usage

```java
CreateConferencesHangupParticipantInput collect = new CreateConferencesHangupParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

// Invoking the API call with sample inputs
conference.createConferencesHangupParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conferences_viewconference_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesViewconferenceAsync") createConferencesViewconferenceAsync

> Retrieve information about a conference by its ConferenceSid.


```java
void createConferencesViewconferenceAsync(
        final String conferenceSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier of each conference resource |


#### Example Usage

```java
String conferenceSid = "ConferenceSid";
// Invoking the API call with sample inputs
conference.createConferencesViewconferenceAsync(conferenceSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_conferences_listconference_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesListconferenceAsync") createConferencesListconferenceAsync

> Retrieve a list of conference objects.


```java
void createConferencesListconferenceAsync(
        final CreateConferencesListconferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| friendlyName |  ``` Optional ```  | Only return conferences with the specified FriendlyName |
| dateCreated |  ``` Optional ```  | Conference created date |


#### Example Usage

```java
CreateConferencesListconferenceInput collect = new CreateConferencesListconferenceInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
conference.createConferencesListconferenceAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conferences_list_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesListParticipantAsync") createConferencesListParticipantAsync

> Retrieve a list of participants for an in-progress conference.


```java
void createConferencesListParticipantAsync(
        final CreateConferencesListParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference. |
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| muted |  ``` Optional ```  | Specifies if participant should be muted. |
| deaf |  ``` Optional ```  | Specifies if the participant should hear audio in the conference. |


#### Example Usage

```java
CreateConferencesListParticipantInput collect = new CreateConferencesListParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

Boolean muted = true;
collect.setMuted(muted);

Boolean deaf = true;
collect.setDeaf(deaf);

// Invoking the API call with sample inputs
conference.createConferencesListParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conferences_view_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesViewParticipantAsync") createConferencesViewParticipantAsync

> Retrieve information about a participant by its ParticipantSid.


```java
void createConferencesViewParticipantAsync(
        final CreateConferencesViewParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |


#### Example Usage

```java
CreateConferencesViewParticipantInput collect = new CreateConferencesViewParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

// Invoking the API call with sample inputs
conference.createConferencesViewParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conferences_add_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesAddParticipantAsync") createConferencesAddParticipantAsync

> Add Participant in conference 


```java
void createConferencesAddParticipantAsync(
        final CreateConferencesAddParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantNumber |  ``` Required ```  | The phone number of the participant to be added. |
| muted |  ``` Optional ```  | Specifies if participant should be muted. |
| deaf |  ``` Optional ```  | Specifies if the participant should hear audio in the conference. |


#### Example Usage

```java
CreateConferencesAddParticipantInput collect = new CreateConferencesAddParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantNumber = "ParticipantNumber";
collect.setParticipantNumber(participantNumber);

Boolean muted = true;
collect.setMuted(muted);

Boolean deaf = true;
collect.setDeaf(deaf);

// Invoking the API call with sample inputs
conference.createConferencesAddParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conferences_create_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesCreateConferenceAsync") createConferencesCreateConferenceAsync

> Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.


```java
void createConferencesCreateConferenceAsync(
        final CreateConferencesCreateConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | A valid 10-digit number (E.164 format) that will be initiating the conference call. |
| to |  ``` Required ```  | A valid 10-digit number (E.164 format) that is to receive the conference call. |
| url |  ``` Required ```  | URL requested once the conference connects |
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
CreateConferencesCreateConferenceInput collect = new CreateConferencesCreateConferenceInput();

String from = "From";
collect.setFrom(from);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

String method = "POST";
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

String statusCallBackMethod = "StatusCallBackMethod";
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallbackUrl = "FallbackUrl";
collect.setFallbackUrl(fallbackUrl);

String fallbackMethod = "FallbackMethod";
collect.setFallbackMethod(fallbackMethod);

Boolean record = true;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

String recordCallBackMethod = "RecordCallBackMethod";
collect.setRecordCallBackMethod(recordCallBackMethod);

String scheduleTime = "ScheduleTime";
collect.setScheduleTime(scheduleTime);

Integer timeout = 225;
collect.setTimeout(timeout);

// Invoking the API call with sample inputs
conference.createConferencesCreateConferenceAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_conferences_deaf_mute_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.ConferenceController.createConferencesDeafMuteParticipantAsync") createConferencesDeafMuteParticipantAsync

> Deaf Mute Participant


```java
void createConferencesDeafMuteParticipantAsync(
        final CreateConferencesDeafMuteParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | ID of the active conference |
| participantSid |  ``` Required ```  | ID of an active participant |
| muted |  ``` Optional ```  | Mute a participant |
| deaf |  ``` Optional ```  | Make it so a participant cant hear |


#### Example Usage

```java
CreateConferencesDeafMuteParticipantInput collect = new CreateConferencesDeafMuteParticipantInput();

String conferenceSid = "conferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

Boolean muted = true;
collect.setMuted(muted);

Boolean deaf = true;
collect.setDeaf(deaf);

// Invoking the API call with sample inputs
conference.createConferencesDeafMuteParticipantAsync(collect, new APICallBack<String>() {
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

## <a name="carrier_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.CarrierController") CarrierController

### Get singleton instance

The singleton instance of the ``` CarrierController ``` class can be accessed from the API Client.

```java
CarrierController carrier = client.getCarrier();
```

### <a name="create_carrier_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CarrierController.createCarrierLookupAsync") createCarrierLookupAsync

> Get the Carrier Lookup


```java
void createCarrierLookupAsync(
        final String phoneNumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | A valid 10-digit number (E.164 format). |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
// Invoking the API call with sample inputs
carrier.createCarrierLookupAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_carrier_lookuplist_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.CarrierController.createCarrierLookuplistAsync") createCarrierLookuplistAsync

> Retrieve a list of carrier lookup objects.


```java
void createCarrierLookuplistAsync(
        final CreateCarrierLookuplistInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |


#### Example Usage

```java
CreateCarrierLookuplistInput collect = new CreateCarrierLookuplistInput();

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

// Invoking the API call with sample inputs
carrier.createCarrierLookuplistAsync(collect, new APICallBack<String>() {
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

## <a name="email_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.EmailController") EmailController

### Get singleton instance

The singleton instance of the ``` EmailController ``` class can be accessed from the API Client.

```java
EmailController email = client.getEmail();
```

### <a name="create_email_deleteinvalidemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailDeleteinvalidemailAsync") createEmailDeleteinvalidemailAsync

> Remove an email from the invalid email list.


```java
void createEmailDeleteinvalidemailAsync(
        final String email,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | A valid email address that is to be remove from the invalid email list. |


#### Example Usage

```java
String email = "Email";
// Invoking the API call with sample inputs
email.createEmailDeleteinvalidemailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_email_listblockemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailListblockemailAsync") createEmailListblockemailAsync

> Retrieve a list of emails that have been blocked.


```java
void createEmailListblockemailAsync(
        final CreateEmailListblockemailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of blocked emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
CreateEmailListblockemailInput collect = new CreateEmailListblockemailInput();

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createEmailListblockemailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_email_listspamemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailListspamemailAsync") createEmailListspamemailAsync

> Retrieve a list of emails that are on the spam list.


```java
void createEmailListspamemailAsync(
        final CreateEmailListspamemailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of spam emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
CreateEmailListspamemailInput collect = new CreateEmailListspamemailInput();

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createEmailListspamemailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_email_listbounceemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailListbounceemailAsync") createEmailListbounceemailAsync

> Retrieve a list of emails that have bounced.


```java
void createEmailListbounceemailAsync(
        final CreateEmailListbounceemailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of bounced emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
CreateEmailListbounceemailInput collect = new CreateEmailListbounceemailInput();

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createEmailListbounceemailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_email_deletebouncesemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailDeletebouncesemailAsync") createEmailDeletebouncesemailAsync

> Remove an email address from the bounced list.


```java
void createEmailDeletebouncesemailAsync(
        final String email,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email address to be remove from the bounced email list. |


#### Example Usage

```java
String email = "Email";
// Invoking the API call with sample inputs
email.createEmailDeletebouncesemailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_email_listinvalidemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailListinvalidemailAsync") createEmailListinvalidemailAsync

> Retrieve a list of invalid email addresses.


```java
void createEmailListinvalidemailAsync(
        final CreateEmailListinvalidemailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of invalid emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
CreateEmailListinvalidemailInput collect = new CreateEmailListinvalidemailInput();

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createEmailListinvalidemailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_email_listunsubscribedemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailListunsubscribedemailAsync") createEmailListunsubscribedemailAsync

> Retrieve a list of email addresses from the unsubscribe list.


```java
void createEmailListunsubscribedemailAsync(
        final CreateEmailListunsubscribedemailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of unsubscribed emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
CreateEmailListunsubscribedemailInput collect = new CreateEmailListunsubscribedemailInput();

String offset = "Offset";
collect.setOffset(offset);

String limit = "Limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createEmailListunsubscribedemailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_email_deleteunsubscribedemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailDeleteunsubscribedemailAsync") createEmailDeleteunsubscribedemailAsync

> Remove an email address from the list of unsubscribed emails.


```java
void createEmailDeleteunsubscribedemailAsync(
        final String email,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | A valid email address that is to be remove from the unsubscribe list. |


#### Example Usage

```java
String email = "email";
// Invoking the API call with sample inputs
email.createEmailDeleteunsubscribedemailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_email_addunsubscribesemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailAddunsubscribesemailAsync") createEmailAddunsubscribesemailAsync

> Add an email to the unsubscribe list


```java
void createEmailAddunsubscribesemailAsync(
        final String email,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | A valid email address that is to be added to the unsubscribe list |


#### Example Usage

```java
String email = "email";
// Invoking the API call with sample inputs
email.createEmailAddunsubscribesemailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_email_deleteblocksemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailDeleteblocksemailAsync") createEmailDeleteblocksemailAsync

> Remove an email from blocked emails list.


```java
void createEmailDeleteblocksemailAsync(
        final String email,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email address to be remove from the blocked list. |


#### Example Usage

```java
String email = "Email";
// Invoking the API call with sample inputs
email.createEmailDeleteblocksemailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_email_deletespamemail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailDeletespamemailAsync") createEmailDeletespamemailAsync

> Remove an email from the spam email list.


```java
void createEmailDeletespamemailAsync(
        final String email,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | A valid email address that is to be remove from the spam list. |


#### Example Usage

```java
String email = "Email";
// Invoking the API call with sample inputs
email.createEmailDeletespamemailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_email_sendemails_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.EmailController.createEmailSendemailsAsync") createEmailSendemailsAsync

> Create and submit an email message to one or more email addresses.


```java
void createEmailSendemailsAsync(
        final CreateEmailSendemailsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | A valid address that will receive the email. Multiple addresses can be separated by using commas. |
| type |  ``` Required ```  | Specifies the type of email to be sent |
| subject |  ``` Required ```  | The subject of the mail. Must be a valid string. |
| message |  ``` Required ```  | The email message that is to be sent in the text. |
| from |  ``` Optional ```  | A valid address that will send the email. |
| cc |  ``` Optional ```  | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. |
| bcc |  ``` Optional ```  | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. |
| attachment |  ``` Optional ```  | A file that is attached to the email. Must be less than 7 MB in size. |


#### Example Usage

```java
CreateEmailSendemailsInput collect = new CreateEmailSendemailsInput();

String to = "To";
collect.setTo(to);

TypeEnum type = TypeEnum.fromString("TEXT");
collect.setType(type);

String subject = "Subject";
collect.setSubject(subject);

String message = "Message";
collect.setMessage(message);

String from = "From";
collect.setFrom(from);

String cc = "Cc";
collect.setCc(cc);

String bcc = "Bcc";
collect.setBcc(bcc);

String attachment = "Attachment";
collect.setAttachment(attachment);

// Invoking the API call with sample inputs
email.createEmailSendemailsAsync(collect, new APICallBack<String>() {
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

## <a name="account_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.AccountController") AccountController

### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

### <a name="create_accounts_viewaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AccountController.createAccountsViewaccountAsync") createAccountsViewaccountAsync

> Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.


```java
void createAccountsViewaccountAsync(
        final String date,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| date |  ``` Required ```  | Filter account information based on date. |


#### Example Usage

```java
String date = "Date";
// Invoking the API call with sample inputs
account.createAccountsViewaccountAsync(date, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sub_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.SubAccountController") SubAccountController

### Get singleton instance

The singleton instance of the ``` SubAccountController ``` class can be accessed from the API Client.

```java
SubAccountController subAccount = client.getSubAccount();
```

### <a name="create_user_subaccountactivation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SubAccountController.createUserSubaccountactivationAsync") createUserSubaccountactivationAsync

> Suspend or unsuspend


```java
void createUserSubaccountactivationAsync(
        final CreateUserSubaccountactivationInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be activated or suspended |
| mActivate |  ``` Required ```  | 0 to suspend or 1 to activate |


#### Example Usage

```java
CreateUserSubaccountactivationInput collect = new CreateUserSubaccountactivationInput();

String subAccountSID = "SubAccountSID";
collect.setSubAccountSID(subAccountSID);

MActivateEnum mActivate = MActivateEnum.fromInteger(1);
collect.setMActivate(mActivate);

// Invoking the API call with sample inputs
subAccount.createUserSubaccountactivationAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_user_deletesubaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SubAccountController.createUserDeletesubaccountAsync") createUserDeletesubaccountAsync

> Delete sub account or merge numbers into parent


```java
void createUserDeletesubaccountAsync(
        final CreateUserDeletesubaccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be deleted |
| mergeNumber |  ``` Required ```  | 0 to delete or 1 to merge numbers to parent account. |


#### Example Usage

```java
CreateUserDeletesubaccountInput collect = new CreateUserDeletesubaccountInput();

String subAccountSID = "SubAccountSID";
collect.setSubAccountSID(subAccountSID);

MergeNumberEnum mergeNumber = MergeNumberEnum.fromInteger(0);
collect.setMergeNumber(mergeNumber);

// Invoking the API call with sample inputs
subAccount.createUserDeletesubaccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="create_user_createsubaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.SubAccountController.createUserCreatesubaccountAsync") createUserCreatesubaccountAsync

> Create a sub user account under the parent account


```java
void createUserCreatesubaccountAsync(
        final CreateUserCreatesubaccountInput input,
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


#### Example Usage

```java
CreateUserCreatesubaccountInput collect = new CreateUserCreatesubaccountInput();

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

// Invoking the API call with sample inputs
subAccount.createUserCreatesubaccountAsync(collect, new APICallBack<String>() {
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

## <a name="address_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.AddressController") AddressController

### Get singleton instance

The singleton instance of the ``` AddressController ``` class can be accessed from the API Client.

```java
AddressController address = client.getAddress();
```

### <a name="address_deleteaddress_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AddressController.addressDeleteaddressAsync") addressDeleteaddressAsync

> To delete Address to your address book


```java
void addressDeleteaddressAsync(
        final String addressid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressid |  ``` Required ```  | The identifier of the address to be deleted. |


#### Example Usage

```java
String addressid = "addressid";
// Invoking the API call with sample inputs
address.addressDeleteaddressAsync(addressid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="address_verifyaddress_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AddressController.addressVerifyaddressAsync") addressVerifyaddressAsync

> Validates an address given.


```java
void addressVerifyaddressAsync(
        final String addressid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressid |  ``` Required ```  | The identifier of the address to be verified. |


#### Example Usage

```java
String addressid = "addressid";
// Invoking the API call with sample inputs
address.addressVerifyaddressAsync(addressid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="address_viewaddress_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AddressController.addressViewaddressAsync") addressViewaddressAsync

> View Address Specific address Book by providing the address id


```java
void addressViewaddressAsync(
        final String addressid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressid |  ``` Required ```  | The identifier of the address to be retrieved. |


#### Example Usage

```java
String addressid = "addressid";
// Invoking the API call with sample inputs
address.addressViewaddressAsync(addressid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="address_createaddress_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AddressController.addressCreateaddressAsync") addressCreateaddressAsync

> To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.


```java
void addressCreateaddressAsync(
        final AddressCreateaddressInput input,
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
| description |  ``` Optional ```  | Description of addresses. |
| email |  ``` Optional ```  | Email Id of user. |
| phone |  ``` Optional ```  | Phone number of user. |


#### Example Usage

```java
AddressCreateaddressInput collect = new AddressCreateaddressInput();

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

String description = "Description";
collect.setDescription(description);

String email = "email";
collect.setEmail(email);

String phone = "Phone";
collect.setPhone(phone);

// Invoking the API call with sample inputs
address.addressCreateaddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="address_listaddress_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.AddressController.addressListaddressAsync") addressListaddressAsync

> List All Address 


```java
void addressListaddressAsync(
        final AddressListaddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | How many results to return, default is 10, max is 100, must be an integer |
| addressid |  ``` Optional ```  | addresses Sid |
| dateCreated |  ``` Optional ```  | date created address. |


#### Example Usage

```java
AddressListaddressInput collect = new AddressListaddressInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String addressid = "addressid";
collect.setAddressid(addressid);

String dateCreated = "dateCreated";
collect.setDateCreated(dateCreated);

// Invoking the API call with sample inputs
address.addressListaddressAsync(collect, new APICallBack<String>() {
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

## <a name="recording_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.RecordingController") RecordingController

### Get singleton instance

The singleton instance of the ``` RecordingController ``` class can be accessed from the API Client.

```java
RecordingController recording = client.getRecording();
```

### <a name="create_recording_deleterecording_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.RecordingController.createRecordingDeleterecordingAsync") createRecordingDeleterecordingAsync

> Remove a recording from your Ytel account.


```java
void createRecordingDeleterecordingAsync(
        final String recordingsid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingsid |  ``` Required ```  | The unique identifier for a recording. |


#### Example Usage

```java
String recordingsid = "recordingsid";
// Invoking the API call with sample inputs
recording.createRecordingDeleterecordingAsync(recordingsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_recording_viewrecording_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.RecordingController.createRecordingViewrecordingAsync") createRecordingViewrecordingAsync

> Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.


```java
void createRecordingViewrecordingAsync(
        final String recordingsid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingsid |  ``` Required ```  | The unique identifier for the recording. |


#### Example Usage

```java
String recordingsid = "recordingsid";
// Invoking the API call with sample inputs
recording.createRecordingViewrecordingAsync(recordingsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_recording_listrecording_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.RecordingController.createRecordingListrecordingAsync") createRecordingListrecordingAsync

> Retrieve a list of recording objects.


```java
void createRecordingListrecordingAsync(
        final CreateRecordingListrecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| datecreated |  ``` Optional ```  | Filter results by creation date |
| callsid |  ``` Optional ```  | The unique identifier for a call. |


#### Example Usage

```java
CreateRecordingListrecordingInput collect = new CreateRecordingListrecordingInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String datecreated = "Datecreated";
collect.setDatecreated(datecreated);

String callsid = "callsid";
collect.setCallsid(callsid);

// Invoking the API call with sample inputs
recording.createRecordingListrecordingAsync(collect, new APICallBack<String>() {
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

## <a name="transcription_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.TranscriptionController") TranscriptionController

### Get singleton instance

The singleton instance of the ``` TranscriptionController ``` class can be accessed from the API Client.

```java
TranscriptionController transcription = client.getTranscription();
```

### <a name="create_transcriptions_audiourltranscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.TranscriptionController.createTranscriptionsAudiourltranscriptionAsync") createTranscriptionsAudiourltranscriptionAsync

> Transcribe an audio recording from a file.


```java
void createTranscriptionsAudiourltranscriptionAsync(
        final String audiourl,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| audiourl |  ``` Required ```  | URL pointing to the location of the audio file that is to be transcribed. |


#### Example Usage

```java
String audiourl = "audiourl";
// Invoking the API call with sample inputs
transcription.createTranscriptionsAudiourltranscriptionAsync(audiourl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_transcriptions_recordingtranscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.TranscriptionController.createTranscriptionsRecordingtranscriptionAsync") createTranscriptionsRecordingtranscriptionAsync

> Transcribe a recording by its RecordingSid.


```java
void createTranscriptionsRecordingtranscriptionAsync(
        final String recordingSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | The unique identifier for a recording object. |


#### Example Usage

```java
String recordingSid = "recordingSid";
// Invoking the API call with sample inputs
transcription.createTranscriptionsRecordingtranscriptionAsync(recordingSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_transcriptions_viewtranscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.TranscriptionController.createTranscriptionsViewtranscriptionAsync") createTranscriptionsViewtranscriptionAsync

> Retrieve information about a transaction by its TranscriptionSid.


```java
void createTranscriptionsViewtranscriptionAsync(
        final String transcriptionsid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transcriptionsid |  ``` Required ```  | The unique identifier for a transcription object. |


#### Example Usage

```java
String transcriptionsid = "transcriptionsid";
// Invoking the API call with sample inputs
transcription.createTranscriptionsViewtranscriptionAsync(transcriptionsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_transcriptions_listtranscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.TranscriptionController.createTranscriptionsListtranscriptionAsync") createTranscriptionsListtranscriptionAsync

> Retrieve a list of transcription objects for your Ytel account.


```java
void createTranscriptionsListtranscriptionAsync(
        final CreateTranscriptionsListtranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| status |  ``` Optional ```  | The state of the transcription. |
| dateTranscribed |  ``` Optional ```  | The date the transcription took place. |


#### Example Usage

```java
CreateTranscriptionsListtranscriptionInput collect = new CreateTranscriptionsListtranscriptionInput();

Integer page = 1;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

StatusEnum status = StatusEnum.fromString("INPROGRESS");
collect.setStatus(status);

String dateTranscribed = "dateTranscribed";
collect.setDateTranscribed(dateTranscribed);

// Invoking the API call with sample inputs
transcription.createTranscriptionsListtranscriptionAsync(collect, new APICallBack<String>() {
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

## <a name="usage_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.message360.api.controllers.UsageController") UsageController

### Get singleton instance

The singleton instance of the ``` UsageController ``` class can be accessed from the API Client.

```java
UsageController usage = client.getUsage();
```

### <a name="create_usage_listusage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.message360.api.controllers.UsageController.createUsageListusageAsync") createUsageListusageAsync

> Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.


```java
void createUsageListusageAsync(
        final CreateUsageListusageInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| productCode |  ``` Optional ```  ``` DefaultValue ```  | Filter usage results by product type. |
| startDate |  ``` Optional ```  ``` DefaultValue ```  | Filter usage objects by start date. |
| endDate |  ``` Optional ```  ``` DefaultValue ```  | Filter usage objects by end date. |
| includeSubAccounts |  ``` Optional ```  | Will include all subaccount usage data |


#### Example Usage

```java
CreateUsageListusageInput collect = new CreateUsageListusageInput();

ProductCode27Enum productCode = ProductCode27Enum.fromInteger(0);
collect.setProductCode(productCode);

String startDate = "2016-09-06";
collect.setStartDate(startDate);

String endDate = "2016-09-06";
collect.setEndDate(endDate);

String includeSubAccounts = "IncludeSubAccounts";
collect.setIncludeSubAccounts(includeSubAccounts);

// Invoking the API call with sample inputs
usage.createUsageListusageAsync(collect, new APICallBack<String>() {
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



