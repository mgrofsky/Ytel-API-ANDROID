# Getting started

Ytel API version 3

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

* Browse to locate the folder containing the source code. Select the location of the YtelAPIV3 gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

## How to Use

The following section explains how to use the YtelAPIV3 library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

In the following step navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':YtelAPIV3Lib')``` to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Ytel%20API%20V3&workspaceName=YtelAPIV3&projectName=YtelAPIV3Lib&rootNamespace=com.ytel.api)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > YtelAPIV3Lib > androidTest > java)* from the project explorer.
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

com.ytel.api.Configuration.initialize(appContext);
YtelAPIV3Client client = new YtelAPIV3Client(basicAuthUserName, basicAuthPassword);
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

## <a name="short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.ShortCodeController") ShortCodeController

### Get singleton instance

The singleton instance of the ``` ShortCodeController ``` class can be accessed from the API Client.

```java
ShortCodeController shortCode = client.getShortCode();
```

### <a name="create_list_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ShortCodeController.createListShortcodesAsync") createListShortcodesAsync

> Retrieve a list of Short Code assignment associated with your Ytel account.


```java
void createListShortcodesAsync(
        final String shortcode,
        final String page,
        final String pagesize,
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
String shortcode = "Shortcode";
String page = "page";
String pagesize = "pagesize";
// Invoking the API call with sample inputs
shortCode.createListShortcodesAsync(shortcode, page, pagesize, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ShortCodeController.createViewSMSAsync") createViewSMSAsync

> Retrieve a single Short Code object by its shortcode assignment.


```java
void createViewSMSAsync(
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
shortCode.createViewSMSAsync(shortcode, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ShortCodeController.createViewSMSAsync") createViewSMSAsync

> View a single Sms Short Code message.


```java
void createViewSMSAsync(
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
shortCode.createViewSMSAsync(messageSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ShortCodeController.createListSMSAsync") createListSMSAsync

> Retrieve a list of Short Code messages.


```java
void createListSMSAsync(
        final String shortcode,
        final String to,
        final String dateSent,
        final Integer page,
        final Integer pageSize,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Optional ```  | Only list messages sent from this Short Code |
| to |  ``` Optional ```  | Only list messages sent to this number |
| dateSent |  ``` Optional ```  | Only list messages sent with the specified date |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  | The count of objects to return per page. |


#### Example Usage

```java
String shortcode = "Shortcode";
String to = "To";
String dateSent = "DateSent";
Integer page = 233;
Integer pageSize = 233;
// Invoking the API call with sample inputs
shortCode.createListSMSAsync(shortcode, to, dateSent, page, pageSize, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ShortCodeController.createSendSMSAsync") createSendSMSAsync

> Send Dedicated Shortcode


```java
void createSendSMSAsync(
        final int shortcode,
        final double to,
        final String body,
        final String method,
        final String messagestatuscallback,
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
int shortcode = 233;
double to = 233.219640796641;
String body = "body";
String method = "method";
String messagestatuscallback = "messagestatuscallback";
// Invoking the API call with sample inputs
shortCode.createSendSMSAsync(shortcode, to, body, method, messagestatuscallback, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ShortCodeController.createListInboundSMSAsync") createListInboundSMSAsync

> Retrive a list of inbound Sms Short Code messages associated with your Ytel account.


```java
void createListInboundSMSAsync(
        final Integer page,
        final Integer pagesize,
        final String from,
        final String shortcode,
        final String datecreated,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Only list SMS messages sent from this number |
| shortcode |  ``` Optional ```  | Only list SMS messages sent to Shortcode |
| datecreated |  ``` Optional ```  | Only list SMS messages sent in the specified date MAKE REQUEST |


#### Example Usage

```java
Integer page = 233;
Integer pagesize = 233;
String from = "From";
String shortcode = "Shortcode";
String datecreated = "Datecreated";
// Invoking the API call with sample inputs
shortCode.createListInboundSMSAsync(page, pagesize, from, shortcode, datecreated, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ShortCodeController.updateShortcodeAsync") updateShortcodeAsync

> Update a dedicated shortcode.


```java
void updateShortcodeAsync(
        final String shortcode,
        final String friendlyName,
        final String callbackMethod,
        final String callbackUrl,
        final String fallbackMethod,
        final String fallbackUrl,
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
String shortcode = "Shortcode";
String friendlyName = "FriendlyName";
String callbackMethod = "CallbackMethod";
String callbackUrl = "CallbackUrl";
String fallbackMethod = "FallbackMethod";
String fallbackUrl = "FallbackUrl";
// Invoking the API call with sample inputs
shortCode.updateShortcodeAsync(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="area_mail_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.AreaMailController") AreaMailController

### Get singleton instance

The singleton instance of the ``` AreaMailController ``` class can be accessed from the API Client.

```java
AreaMailController areaMail = client.getAreaMail();
```

### <a name="create_delete_area_mail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AreaMailController.createDeleteAreaMailAsync") createDeleteAreaMailAsync

> Remove an AreaMail object by its AreaMailId.


```java
void createDeleteAreaMailAsync(
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
areaMail.createDeleteAreaMailAsync(areamailid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_area_mail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AreaMailController.createViewAreaMailAsync") createViewAreaMailAsync

> Retrieve an AreaMail object by its AreaMailId.


```java
void createViewAreaMailAsync(
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
areaMail.createViewAreaMailAsync(areamailid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_area_mails_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AreaMailController.createListAreaMailsAsync") createListAreaMailsAsync

> Retrieve a list of AreaMail objects.


```java
void createListAreaMailsAsync(
        final Integer page,
        final Integer pagesize,
        final String areamailsid,
        final String dateCreated,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |
| areamailsid |  ``` Optional ```  | The unique identifier for an AreaMail object. |
| dateCreated |  ``` Optional ```  | The date the AreaMail was created. |


#### Example Usage

```java
Integer page = 233;
Integer pagesize = 233;
String areamailsid = "areamailsid";
String dateCreated = "dateCreated";
// Invoking the API call with sample inputs
areaMail.createListAreaMailsAsync(page, pagesize, areamailsid, dateCreated, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_area_mail_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AreaMailController.createAreaMailAsync") createAreaMailAsync

> Create a new AreaMail object.


```java
void createAreaMailAsync(
        final String routes,
        final String attachbyid,
        final String front,
        final String back,
        final String description,
        final String targettype,
        final String htmldata,
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
String routes = "routes";
String attachbyid = "attachbyid";
String front = "front";
String back = "back";
String description = "description";
String targettype = "targettype";
String htmldata = "htmldata";
// Invoking the API call with sample inputs
areaMail.createAreaMailAsync(routes, attachbyid, front, back, description, targettype, htmldata, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="post_card_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.PostCardController") PostCardController

### Get singleton instance

The singleton instance of the ``` PostCardController ``` class can be accessed from the API Client.

```java
PostCardController postCard = client.getPostCard();
```

### <a name="create_delete_postcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PostCardController.createDeletePostcardAsync") createDeletePostcardAsync

> Remove a postcard object.


```java
void createDeletePostcardAsync(
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
postCard.createDeletePostcardAsync(postcardid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_postcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PostCardController.createViewPostcardAsync") createViewPostcardAsync

> Retrieve a postcard object by its PostcardId.


```java
void createViewPostcardAsync(
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
postCard.createViewPostcardAsync(postcardid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_postcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PostCardController.createPostcardAsync") createPostcardAsync

> Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.


```java
void createPostcardAsync(
        final String to,
        final String from,
        final String attachbyid,
        final String front,
        final String back,
        final String message,
        final String setting,
        final String description,
        final String htmldata,
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
String to = "to";
String from = "from";
String attachbyid = "attachbyid";
String front = "front";
String back = "back";
String message = "message";
String setting = "setting";
String description = "description";
String htmldata = "htmldata";
// Invoking the API call with sample inputs
postCard.createPostcardAsync(to, from, attachbyid, front, back, message, setting, description, htmldata, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_postcards_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PostCardController.createListPostcardsAsync") createListPostcardsAsync

> Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.


```java
void createListPostcardsAsync(
        final Integer page,
        final Integer pagesize,
        final String postcardid,
        final String dateCreated,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |
| postcardid |  ``` Optional ```  | The unique identifier for a postcard object. |
| dateCreated |  ``` Optional ```  | The date the postcard was created. |


#### Example Usage

```java
Integer page = 233;
Integer pagesize = 233;
String postcardid = "postcardid";
String dateCreated = "dateCreated";
// Invoking the API call with sample inputs
postCard.createListPostcardsAsync(page, pagesize, postcardid, dateCreated, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="letter_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.LetterController") LetterController

### Get singleton instance

The singleton instance of the ``` LetterController ``` class can be accessed from the API Client.

```java
LetterController letter = client.getLetter();
```

### <a name="create_delete_letter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.LetterController.createDeleteLetterAsync") createDeleteLetterAsync

> Remove a letter object by its LetterId.


```java
void createDeleteLetterAsync(
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
letter.createDeleteLetterAsync(lettersid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_letter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.LetterController.createViewLetterAsync") createViewLetterAsync

> Retrieve a letter object by its LetterSid.


```java
void createViewLetterAsync(
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
letter.createViewLetterAsync(lettersid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_letter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.LetterController.createLetterAsync") createLetterAsync

> Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.


```java
void createLetterAsync(
        final String to,
        final String from,
        final String attachbyid,
        final String file,
        final String color,
        final String description,
        final String extraservice,
        final String doublesided,
        final String template,
        final String htmldata,
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
String to = "to";
String from = "from";
String attachbyid = "attachbyid";
String file = "file";
String color = "color";
String description = "description";
String extraservice = "extraservice";
String doublesided = "doublesided";
String template = "template";
String htmldata = "htmldata";
// Invoking the API call with sample inputs
letter.createLetterAsync(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_letters_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.LetterController.createListLettersAsync") createListLettersAsync

> Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.


```java
void createListLettersAsync(
        final Integer page,
        final Integer pagesize,
        final String lettersid,
        final String dateCreated,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |
| lettersid |  ``` Optional ```  | The unique identifier for a letter object. |
| dateCreated |  ``` Optional ```  | The date the letter was created. |


#### Example Usage

```java
Integer page = 233;
Integer pagesize = 233;
String lettersid = "lettersid";
String dateCreated = "dateCreated";
// Invoking the API call with sample inputs
letter.createListLettersAsync(page, pagesize, lettersid, dateCreated, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="call_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.CallController") CallController

### Get singleton instance

The singleton instance of the ``` CallController ``` class can be accessed from the API Client.

```java
CallController call = client.getCall();
```

### <a name="create_view_call1_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createViewCall1Async") createViewCall1Async

> Retrieve a single voice call’s information by its CallSid.


```java
void createViewCall1Async(
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
call.createViewCall1Async(callSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_call_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createViewCallAsync") createViewCallAsync

> Retrieve a single voice call’s information by its CallSid.


```java
void createViewCallAsync(
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
call.createViewCallAsync(callsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_play_dtmf_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createPlayDTMFAsync") createPlayDTMFAsync

> Play Dtmf and send the Digit


```java
void createPlayDTMFAsync(
        final String callSid,
        final String playDtmf,
        final PlayDtmfDirectionEnum playDtmfDirection,
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
String callSid = "CallSid";
String playDtmf = "PlayDtmf";
PlayDtmfDirectionEnum playDtmfDirection = PlayDtmfDirectionEnum.fromString("in");
// Invoking the API call with sample inputs
call.createPlayDTMFAsync(callSid, playDtmf, playDtmfDirection, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_make_call_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createMakeCallAsync") createMakeCallAsync

> You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json


```java
void createMakeCallAsync(
        final String from,
        final String to,
        final String url,
        final String method,
        final String statusCallBackUrl,
        final String statusCallBackMethod,
        final String fallBackUrl,
        final String fallBackMethod,
        final String heartBeatUrl,
        final String heartBeatMethod,
        final Integer timeout,
        final String playDtmf,
        final Boolean hideCallerId,
        final Boolean record,
        final String recordCallBackUrl,
        final String recordCallBackMethod,
        final Boolean transcribe,
        final String transcribeCallBackUrl,
        final IfMachineEnum ifMachine,
        final String ifMachineUrl,
        final String ifMachineMethod,
        final Boolean feedback,
        final String surveyId,
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
String from = "From";
String to = "To";
String url = "Url";
String method = "Method";
String statusCallBackUrl = "StatusCallBackUrl";
String statusCallBackMethod = "StatusCallBackMethod";
String fallBackUrl = "FallBackUrl";
String fallBackMethod = "FallBackMethod";
String heartBeatUrl = "HeartBeatUrl";
String heartBeatMethod = "HeartBeatMethod";
Integer timeout = 233;
String playDtmf = "PlayDtmf";
Boolean hideCallerId = true;
Boolean record = true;
String recordCallBackUrl = "RecordCallBackUrl";
String recordCallBackMethod = "RecordCallBackMethod";
Boolean transcribe = true;
String transcribeCallBackUrl = "TranscribeCallBackUrl";
IfMachineEnum ifMachine = IfMachineEnum.fromString("continue");
String ifMachineUrl = "IfMachineUrl";
String ifMachineMethod = "IfMachineMethod";
Boolean feedback = true;
String surveyId = "SurveyId";
// Invoking the API call with sample inputs
call.createMakeCallAsync(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_play_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createPlayAudioAsync") createPlayAudioAsync

> Play Audio from a url


```java
void createPlayAudioAsync(
        final String callSid,
        final String audioUrl,
        final String sayText,
        final Integer length,
        final DirectionEnum direction,
        final Boolean mix,
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
String callSid = "CallSid";
String audioUrl = "AudioUrl";
String sayText = "SayText";
Integer length = 233;
DirectionEnum direction = DirectionEnum.fromString("in");
Boolean mix = true;
// Invoking the API call with sample inputs
call.createPlayAudioAsync(callSid, audioUrl, sayText, length, direction, mix, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_record_call_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createRecordCallAsync") createRecordCallAsync

> Start or stop recording of an in-progress voice call.


```java
void createRecordCallAsync(
        final String callSid,
        final boolean record,
        final Direction4Enum direction,
        final Integer timeLimit,
        final String callBackUrl,
        final FileformatEnum fileformat,
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
String callSid = "CallSid";
boolean record = true;
Direction4Enum direction = Direction4Enum.fromString("in");
Integer timeLimit = 233;
String callBackUrl = "CallBackUrl";
FileformatEnum fileformat = FileformatEnum.fromString("mp3");
// Invoking the API call with sample inputs
call.createRecordCallAsync(callSid, record, direction, timeLimit, callBackUrl, fileformat, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_voice_effect_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createVoiceEffectAsync") createVoiceEffectAsync

> Add audio voice effects to the an in-progress voice call.


```java
void createVoiceEffectAsync(
        final String callSid,
        final AudioDirectionEnum audioDirection,
        final Double pitchSemiTones,
        final Double pitchOctaves,
        final Double pitch,
        final Double rate,
        final Double tempo,
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
String callSid = "CallSid";
AudioDirectionEnum audioDirection = AudioDirectionEnum.fromString("in");
Double pitchSemiTones = 233.219640796641;
Double pitchOctaves = 233.219640796641;
Double pitch = 233.219640796641;
Double rate = 233.219640796641;
Double tempo = 233.219640796641;
// Invoking the API call with sample inputs
call.createVoiceEffectAsync(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_interrupt_call_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createInterruptCallAsync") createInterruptCallAsync

> Interrupt the Call by Call Sid


```java
void createInterruptCallAsync(
        final String callSid,
        final String url,
        final String method,
        final StatusEnum status,
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
String callSid = "CallSid";
String url = "Url";
String method = "Method";
StatusEnum status = StatusEnum.fromString("canceled");
// Invoking the API call with sample inputs
call.createInterruptCallAsync(callSid, url, method, status, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_calls_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createListCallsAsync") createListCallsAsync

> A list of calls associated with your Ytel account


```java
void createListCallsAsync(
        final Integer page,
        final Integer pageSize,
        final String to,
        final String from,
        final String dateCreated,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| to |  ``` Optional ```  | Filter calls that were sent to this 10-digit number (E.164 format). |
| from |  ``` Optional ```  | Filter calls that were sent from this 10-digit number (E.164 format). |
| dateCreated |  ``` Optional ```  | Return calls that are from a specified date. |


#### Example Usage

```java
Integer page = 233;
Integer pageSize = 233;
String to = "To";
String from = "From";
String dateCreated = "DateCreated";
// Invoking the API call with sample inputs
call.createListCallsAsync(page, pageSize, to, from, dateCreated, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_send_rvm_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createSendRVMAsync") createSendRVMAsync

> Initiate an outbound Ringless Voicemail through Ytel.


```java
void createSendRVMAsync(
        final String from,
        final String rVMCallerId,
        final String to,
        final String voiceMailURL,
        final String method,
        final String statusCallBackUrl,
        final String statsCallBackMethod,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| from |  ``` Required ```  | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
| rVMCallerId |  ``` Required ```  | A required secondary Caller ID for RVM to work. |
| to |  ``` Required ```  | A valid number (E.164 format) that will receive the phone call. |
| voiceMailURL |  ``` Required ```  | The URL requested once the RVM connects. A set of default parameters will be sent here. |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. |
| statsCallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. |


#### Example Usage

```java
String from = "From";
String rVMCallerId = "RVMCallerId";
String to = "To";
String voiceMailURL = "VoiceMailURL";
String method = "Method";
String statusCallBackUrl = "StatusCallBackUrl";
String statsCallBackMethod = "StatsCallBackMethod";
// Invoking the API call with sample inputs
call.createSendRVMAsync(from, rVMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_group_call_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CallController.createGroupCallAsync") createGroupCallAsync

> Group Call


```java
void createGroupCallAsync(
        final String from,
        final String to,
        final String url,
        final String groupConfirmKey,
        final GroupConfirmFileEnum groupConfirmFile,
        final String method,
        final String statusCallBackUrl,
        final String statusCallBackMethod,
        final String fallBackUrl,
        final String fallBackMethod,
        final String heartBeatUrl,
        final String heartBeatMethod,
        final Integer timeout,
        final String playDtmf,
        final String hideCallerId,
        final Boolean record,
        final String recordCallBackUrl,
        final String recordCallBackMethod,
        final Boolean transcribe,
        final String transcribeCallBackUrl,
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
String from = "From";
String to = "To";
String url = "Url";
String groupConfirmKey = "GroupConfirmKey";
GroupConfirmFileEnum groupConfirmFile = GroupConfirmFileEnum.fromString("mp3");
String method = "Method";
String statusCallBackUrl = "StatusCallBackUrl";
String statusCallBackMethod = "StatusCallBackMethod";
String fallBackUrl = "FallBackUrl";
String fallBackMethod = "FallBackMethod";
String heartBeatUrl = "HeartBeatUrl";
String heartBeatMethod = "HeartBeatMethod";
Integer timeout = 141;
String playDtmf = "PlayDtmf";
String hideCallerId = "HideCallerId";
Boolean record = true;
String recordCallBackUrl = "RecordCallBackUrl";
String recordCallBackMethod = "RecordCallBackMethod";
Boolean transcribe = true;
String transcribeCallBackUrl = "TranscribeCallBackUrl";
// Invoking the API call with sample inputs
call.createGroupCallAsync(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="phone_number_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.PhoneNumberController") PhoneNumberController

### Get singleton instance

The singleton instance of the ``` PhoneNumberController ``` class can be accessed from the API Client.

```java
PhoneNumberController phoneNumber = client.getPhoneNumber();
```

### <a name="create_get_did_score_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createGetDIDScoreAsync") createGetDIDScoreAsync

> Get DID Score Number


```java
void createGetDIDScoreAsync(
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
phoneNumber.createGetDIDScoreAsync(phonenumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_move_number_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createMoveNumberAsync") createMoveNumberAsync

> Transfer phone number that has been purchased for from one account to another account.


```java
void createMoveNumberAsync(
        final String phonenumber,
        final String fromaccountsid,
        final String toaccountsid,
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
String phonenumber = "phonenumber";
String fromaccountsid = "fromaccountsid";
String toaccountsid = "toaccountsid";
// Invoking the API call with sample inputs
phoneNumber.createMoveNumberAsync(phonenumber, fromaccountsid, toaccountsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_purchase_number_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createPurchaseNumberAsync") createPurchaseNumberAsync

> Purchase a phone number to be used with your Ytel account


```java
void createPurchaseNumberAsync(
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
phoneNumber.createPurchaseNumberAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_release_number_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createReleaseNumberAsync") createReleaseNumberAsync

> Remove a purchased Ytel number from your account.


```java
void createReleaseNumberAsync(
        final String responseType,
        final String phoneNumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Required ```  | Response type format xml or json |
| phoneNumber |  ``` Required ```  | A valid 10-digit Ytel number (E.164 format). |


#### Example Usage

```java
String responseType = "ResponseType";
String phoneNumber = "PhoneNumber";
// Invoking the API call with sample inputs
phoneNumber.createReleaseNumberAsync(responseType, phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_details_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createViewDetailsAsync") createViewDetailsAsync

> Retrieve the details for a phone number by its number.


```java
void createViewDetailsAsync(
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
phoneNumber.createViewDetailsAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_bulk_release_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createBulkReleaseAsync") createBulkReleaseAsync

> Remove a purchased Ytel number from your account.


```java
void createBulkReleaseAsync(
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
phoneNumber.createBulkReleaseAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_available_numbers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createAvailableNumbersAsync") createAvailableNumbersAsync

> Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.


```java
void createAvailableNumbersAsync(
        final NumbertypeEnum numbertype,
        final String areacode,
        final Integer pagesize,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numbertype |  ``` Required ```  | Number type either SMS,Voice or all |
| areacode |  ``` Required ```  | Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
| pagesize |  ``` Optional ```  | The count of objects to return. |


#### Example Usage

```java
NumbertypeEnum numbertype = NumbertypeEnum.fromString("all");
String areacode = "areacode";
Integer pagesize = 141;
// Invoking the API call with sample inputs
phoneNumber.createAvailableNumbersAsync(numbertype, areacode, pagesize, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_number_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.updateNumberAsync") updateNumberAsync

> Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.


```java
void updateNumberAsync(
        final String phoneNumber,
        final String voiceUrl,
        final String friendlyName,
        final String voiceMethod,
        final String voiceFallbackUrl,
        final String voiceFallbackMethod,
        final String hangupCallback,
        final String hangupCallbackMethod,
        final String heartbeatUrl,
        final String heartbeatMethod,
        final String smsUrl,
        final String smsMethod,
        final String smsFallbackUrl,
        final String smsFallbackMethod,
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
String phoneNumber = "PhoneNumber";
String voiceUrl = "VoiceUrl";
String friendlyName = "FriendlyName";
String voiceMethod = "VoiceMethod";
String voiceFallbackUrl = "VoiceFallbackUrl";
String voiceFallbackMethod = "VoiceFallbackMethod";
String hangupCallback = "HangupCallback";
String hangupCallbackMethod = "HangupCallbackMethod";
String heartbeatUrl = "HeartbeatUrl";
String heartbeatMethod = "HeartbeatMethod";
String smsUrl = "SmsUrl";
String smsMethod = "SmsMethod";
String smsFallbackUrl = "SmsFallbackUrl";
String smsFallbackMethod = "SmsFallbackMethod";
// Invoking the API call with sample inputs
phoneNumber.updateNumberAsync(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_numbers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createListNumbersAsync") createListNumbersAsync

> Retrieve a list of purchased phones numbers associated with your Ytel account.


```java
void createListNumbersAsync(
        final Integer page,
        final Integer pageSize,
        final NumberType14Enum numberType,
        final String friendlyName,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| numberType |  ``` Optional ```  | The capability supported by the number.Number type either SMS,Voice or all |
| friendlyName |  ``` Optional ```  | A human-readable label added to the number object. |


#### Example Usage

```java
Integer page = 141;
Integer pageSize = 141;
NumberType14Enum numberType = NumberType14Enum.fromString("all");
String friendlyName = "FriendlyName";
// Invoking the API call with sample inputs
phoneNumber.createListNumbersAsync(page, pageSize, numberType, friendlyName, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_bulk_update_numbers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createBulkUpdateNumbersAsync") createBulkUpdateNumbersAsync

> Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.


```java
void createBulkUpdateNumbersAsync(
        final String phoneNumber,
        final String voiceUrl,
        final String friendlyName,
        final String voiceMethod,
        final String voiceFallbackUrl,
        final String voiceFallbackMethod,
        final String hangupCallback,
        final String hangupCallbackMethod,
        final String heartbeatUrl,
        final String heartbeatMethod,
        final String smsUrl,
        final String smsMethod,
        final String smsFallbackUrl,
        final String smsFallbackMethod,
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
String phoneNumber = "PhoneNumber";
String voiceUrl = "VoiceUrl";
String friendlyName = "FriendlyName";
String voiceMethod = "VoiceMethod";
String voiceFallbackUrl = "VoiceFallbackUrl";
String voiceFallbackMethod = "VoiceFallbackMethod";
String hangupCallback = "HangupCallback";
String hangupCallbackMethod = "HangupCallbackMethod";
String heartbeatUrl = "HeartbeatUrl";
String heartbeatMethod = "HeartbeatMethod";
String smsUrl = "SmsUrl";
String smsMethod = "SmsMethod";
String smsFallbackUrl = "SmsFallbackUrl";
String smsFallbackMethod = "SmsFallbackMethod";
// Invoking the API call with sample inputs
phoneNumber.createBulkUpdateNumbersAsync(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_bulk_buy_numbers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.PhoneNumberController.createBulkBuyNumbersAsync") createBulkBuyNumbersAsync

> Purchase a selected number of DID's from specific area codes to be used with your Ytel account.


```java
void createBulkBuyNumbersAsync(
        final NumberType15Enum numberType,
        final String areaCode,
        final String quantity,
        final String leftover,
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
NumberType15Enum numberType = NumberType15Enum.fromString("all");
String areaCode = "AreaCode";
String quantity = "Quantity";
String leftover = "Leftover";
// Invoking the API call with sample inputs
phoneNumber.createBulkBuyNumbersAsync(numberType, areaCode, quantity, leftover, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.SMSController") SMSController

### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

### <a name="create_view_sms1_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SMSController.createViewSMS1Async") createViewSMS1Async

> Retrieve a single SMS message object with details by its SmsSid.


```java
void createViewSMS1Async(
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
sMS.createViewSMS1Async(messageSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SMSController.createViewSMSAsync") createViewSMSAsync

> Retrieve a single SMS message object by its SmsSid.


```java
void createViewSMSAsync(
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
sMS.createViewSMSAsync(messageSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SMSController.createSendSMSAsync") createSendSMSAsync

> Send an SMS from a Ytel number


```java
void createSendSMSAsync(
        final String from,
        final String to,
        final String body,
        final String method,
        final String messageStatusCallback,
        final Boolean smartsms,
        final Boolean deliveryStatus,
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
| smartsms |  ``` Optional ```  | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. |
| deliveryStatus |  ``` Optional ```  | Delivery reports are a method to tell your system if the message has arrived on the destination phone. |


#### Example Usage

```java
String from = "From";
String to = "To";
String body = "Body";
String method = "Method";
String messageStatusCallback = "MessageStatusCallback";
Boolean smartsms = true;
Boolean deliveryStatus = true;
// Invoking the API call with sample inputs
sMS.createSendSMSAsync(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SMSController.createListSMSAsync") createListSMSAsync

> Retrieve a list of Outbound SMS message objects.


```java
void createListSMSAsync(
        final Integer page,
        final Integer pageSize,
        final String from,
        final String to,
        final String dateSent,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Filter SMS message objects from this valid 10-digit phone number (E.164 format). |
| to |  ``` Optional ```  | Filter SMS message objects to this valid 10-digit phone number (E.164 format). |
| dateSent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |


#### Example Usage

```java
Integer page = 141;
Integer pageSize = 141;
String from = "From";
String to = "To";
String dateSent = "DateSent";
// Invoking the API call with sample inputs
sMS.createListSMSAsync(page, pageSize, from, to, dateSent, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SMSController.createListInboundSMSAsync") createListInboundSMSAsync

> Retrieve a list of Inbound SMS message objects.


```java
void createListInboundSMSAsync(
        final Integer page,
        final Integer pageSize,
        final String from,
        final String to,
        final String dateSent,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  | The count of objects to return per page. |
| from |  ``` Optional ```  | Filter SMS message objects from this valid 10-digit phone number (E.164 format). |
| to |  ``` Optional ```  | Filter SMS message objects to this valid 10-digit phone number (E.164 format). |
| dateSent |  ``` Optional ```  | Filter sms message objects by this date. |


#### Example Usage

```java
Integer page = 141;
Integer pageSize = 141;
String from = "From";
String to = "To";
String dateSent = "DateSent";
// Invoking the API call with sample inputs
sMS.createListInboundSMSAsync(page, pageSize, from, to, dateSent, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="shared_short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.SharedShortCodeController") SharedShortCodeController

### Get singleton instance

The singleton instance of the ``` SharedShortCodeController ``` class can be accessed from the API Client.

```java
SharedShortCodeController sharedShortCode = client.getSharedShortCode();
```

### <a name="create_view_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createViewShortcodeAsync") createViewShortcodeAsync

> The response returned here contains all resource properties associated with the given Shortcode.


```java
void createViewShortcodeAsync(
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
sharedShortCode.createViewShortcodeAsync(shortcode, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_keyword_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createViewKeywordAsync") createViewKeywordAsync

> View a set of properties for a single keyword.


```java
void createViewKeywordAsync(
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
sharedShortCode.createViewKeywordAsync(keywordid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_template_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createViewTemplateAsync") createViewTemplateAsync

> View a Shared ShortCode Template


```java
void createViewTemplateAsync(
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
sharedShortCode.createViewTemplateAsync(templateId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createListInboundSMSAsync") createListInboundSMSAsync

> List All Inbound ShortCode


```java
void createListInboundSMSAsync(
        final String datecreated,
        final Integer page,
        final Integer pagesize,
        final String from,
        final String shortcode,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| datecreated |  ``` Optional ```  | Only list messages sent with the specified date |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound ShortCode |
| shortcode |  ``` Optional ```  | Only list messages sent to this Short Code |


#### Example Usage

```java
String datecreated = "Datecreated";
Integer page = 141;
Integer pagesize = 141;
String from = "from";
String shortcode = "Shortcode";
// Invoking the API call with sample inputs
sharedShortCode.createListInboundSMSAsync(datecreated, page, pagesize, from, shortcode, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createSendSMSAsync") createSendSMSAsync

> Send an SMS from a Ytel ShortCode


```java
void createSendSMSAsync(
        final String shortcode,
        final String to,
        final UUID templateid,
        final String data,
        final String method,
        final String messageStatusCallback,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | The Short Code number that is the sender of this message |
| to |  ``` Required ```  | A valid 10-digit number that should receive the message |
| templateid |  ``` Required ```  | The unique identifier for the template used for the message |
| data |  ``` Required ```  | format of your data, example: {companyname}:test,{otpcode}:1234 |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once the Short Code message is sent. |
| messageStatusCallback |  ``` Optional ```  | URL that can be requested to receive notification when Short Code message was sent. |


#### Example Usage

```java
String shortcode = "shortcode";
String to = "to";
UUID templateid = UUID.randomUUID();
String data = "data";
String method = "Method";
String messageStatusCallback = "MessageStatusCallback";
// Invoking the API call with sample inputs
sharedShortCode.createSendSMSAsync(shortcode, to, templateid, data, method, messageStatusCallback, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_templates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createListTemplatesAsync") createListTemplatesAsync

> List Shortcode Templates by Type


```java
void createListTemplatesAsync(
        final String type,
        final Integer page,
        final Integer pagesize,
        final String shortcode,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Optional ```  | The type (category) of template Valid values: marketing, authorization |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |
| shortcode |  ``` Optional ```  | Only list templates of type |


#### Example Usage

```java
String type = "type";
Integer page = 141;
Integer pagesize = 141;
String shortcode = "Shortcode";
// Invoking the API call with sample inputs
sharedShortCode.createListTemplatesAsync(type, page, pagesize, shortcode, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_keywords_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createListKeywordsAsync") createListKeywordsAsync

> Retrieve a list of keywords associated with your Ytel account.


```java
void createListKeywordsAsync(
        final Integer page,
        final Integer pagesize,
        final String keyword,
        final Integer shortcode,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| keyword |  ``` Optional ```  | Only list keywords of keyword |
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |


#### Example Usage

```java
Integer page = 50;
Integer pagesize = 50;
String keyword = "Keyword";
Integer shortcode = 50;
// Invoking the API call with sample inputs
sharedShortCode.createListKeywordsAsync(page, pagesize, keyword, shortcode, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_shortcodes_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.createListShortcodesAsync") createListShortcodesAsync

> Retrieve a list of shortcode assignment associated with your Ytel account.


```java
void createListShortcodesAsync(
        final String shortcode,
        final Integer page,
        final Integer pagesize,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Optional ```  | Only list keywords of shortcode |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |


#### Example Usage

```java
String shortcode = "Shortcode";
Integer page = 50;
Integer pagesize = 50;
// Invoking the API call with sample inputs
sharedShortCode.createListShortcodesAsync(shortcode, page, pagesize, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_shortcode_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SharedShortCodeController.updateShortcodeAsync") updateShortcodeAsync

> Update Assignment


```java
void updateShortcodeAsync(
        final String shortcode,
        final String friendlyName,
        final String callbackUrl,
        final String callbackMethod,
        final String fallbackUrl,
        final String fallbackUrlMethod,
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
String shortcode = "Shortcode";
String friendlyName = "FriendlyName";
String callbackUrl = "CallbackUrl";
String callbackMethod = "CallbackMethod";
String fallbackUrl = "FallbackUrl";
String fallbackUrlMethod = "FallbackUrlMethod";
// Invoking the API call with sample inputs
sharedShortCode.updateShortcodeAsync(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="conference_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.ConferenceController") ConferenceController

### Get singleton instance

The singleton instance of the ``` ConferenceController ``` class can be accessed from the API Client.

```java
ConferenceController conference = client.getConference();
```

### <a name="create_play_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createPlayAudioAsync") createPlayAudioAsync

> Play an audio file during a conference.


```java
void createPlayAudioAsync(
        final String conferenceSid,
        final String participantSid,
        final AudioUrlEnum audioUrl,
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
String conferenceSid = "ConferenceSid";
String participantSid = "ParticipantSid";
AudioUrlEnum audioUrl = AudioUrlEnum.fromString("mp3");
// Invoking the API call with sample inputs
conference.createPlayAudioAsync(conferenceSid, participantSid, audioUrl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_hangup_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createHangupParticipantAsync") createHangupParticipantAsync

> Remove a participant from a conference.


```java
void createHangupParticipantAsync(
        final String participantSid,
        final String conferenceSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |


#### Example Usage

```java
String participantSid = "ParticipantSid";
String conferenceSid = "ConferenceSid";
// Invoking the API call with sample inputs
conference.createHangupParticipantAsync(participantSid, conferenceSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createViewConferenceAsync") createViewConferenceAsync

> Retrieve information about a conference by its ConferenceSid.


```java
void createViewConferenceAsync(
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
conference.createViewConferenceAsync(conferenceSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createViewParticipantAsync") createViewParticipantAsync

> Retrieve information about a participant by its ParticipantSid.


```java
void createViewParticipantAsync(
        final String conferenceSid,
        final String participantSid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference object. |
| participantSid |  ``` Required ```  | The unique identifier for a participant object. |


#### Example Usage

```java
String conferenceSid = "ConferenceSid";
String participantSid = "ParticipantSid";
// Invoking the API call with sample inputs
conference.createViewParticipantAsync(conferenceSid, participantSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_silence_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createSilenceParticipantAsync") createSilenceParticipantAsync

> Deaf Mute Participant


```java
void createSilenceParticipantAsync(
        final String conferenceSid,
        final String participantSid,
        final Boolean muted,
        final Boolean deaf,
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
String conferenceSid = "conferenceSid";
String participantSid = "ParticipantSid";
Boolean muted = false;
Boolean deaf = false;
// Invoking the API call with sample inputs
conference.createSilenceParticipantAsync(conferenceSid, participantSid, muted, deaf, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="add_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.addParticipantAsync") addParticipantAsync

> Add Participant in conference 


```java
void addParticipantAsync(
        final String conferenceSid,
        final String participantNumber,
        final Boolean muted,
        final Boolean deaf,
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
String conferenceSid = "ConferenceSid";
String participantNumber = "ParticipantNumber";
Boolean muted = false;
Boolean deaf = false;
// Invoking the API call with sample inputs
conference.addParticipantAsync(conferenceSid, participantNumber, muted, deaf, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createConferenceAsync") createConferenceAsync

> Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.


```java
void createConferenceAsync(
        final String url,
        final String from,
        final String to,
        final String method,
        final String statusCallBackUrl,
        final String statusCallBackMethod,
        final String fallbackUrl,
        final String fallbackMethod,
        final Boolean record,
        final String recordCallBackUrl,
        final String recordCallBackMethod,
        final String scheduleTime,
        final Integer timeout,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| url |  ``` Required ```  | URL requested once the conference connects |
| from |  ``` Required ```  | A valid 10-digit number (E.164 format) that will be initiating the conference call. |
| to |  ``` Required ```  | A valid 10-digit number (E.164 format) that is to receive the conference call. |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
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
String url = "Url";
String from = "From";
String to = "To";
String method = "Method";
String statusCallBackUrl = "StatusCallBackUrl";
String statusCallBackMethod = "StatusCallBackMethod";
String fallbackUrl = "FallbackUrl";
String fallbackMethod = "FallbackMethod";
Boolean record = false;
String recordCallBackUrl = "RecordCallBackUrl";
String recordCallBackMethod = "RecordCallBackMethod";
String scheduleTime = "ScheduleTime";
Integer timeout = 50;
// Invoking the API call with sample inputs
conference.createConferenceAsync(url, from, to, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_participants_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createListParticipantsAsync") createListParticipantsAsync

> Retrieve a list of participants for an in-progress conference.


```java
void createListParticipantsAsync(
        final String conferenceSid,
        final Integer page,
        final Integer pagesize,
        final Boolean muted,
        final Boolean deaf,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | The unique identifier for a conference. |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |
| muted |  ``` Optional ```  | Specifies if participant should be muted. |
| deaf |  ``` Optional ```  | Specifies if the participant should hear audio in the conference. |


#### Example Usage

```java
String conferenceSid = "ConferenceSid";
Integer page = 50;
Integer pagesize = 50;
Boolean muted = false;
Boolean deaf = false;
// Invoking the API call with sample inputs
conference.createListParticipantsAsync(conferenceSid, page, pagesize, muted, deaf, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_conferences_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.ConferenceController.createListConferencesAsync") createListConferencesAsync

> Retrieve a list of conference objects.


```java
void createListConferencesAsync(
        final Integer page,
        final Integer pagesize,
        final String friendlyName,
        final String dateCreated,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| friendlyName |  ``` Optional ```  | Only return conferences with the specified FriendlyName |
| dateCreated |  ``` Optional ```  | Conference created date |


#### Example Usage

```java
Integer page = 50;
Integer pagesize = 50;
String friendlyName = "FriendlyName";
String dateCreated = "DateCreated";
// Invoking the API call with sample inputs
conference.createListConferencesAsync(page, pagesize, friendlyName, dateCreated, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="carrier_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.CarrierController") CarrierController

### Get singleton instance

The singleton instance of the ``` CarrierController ``` class can be accessed from the API Client.

```java
CarrierController carrier = client.getCarrier();
```

### <a name="create_lookup_carrier_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CarrierController.createLookupCarrierAsync") createLookupCarrierAsync

> Get the Carrier Lookup


```java
void createLookupCarrierAsync(
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
carrier.createLookupCarrierAsync(phoneNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_carrier_results_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.CarrierController.createCarrierResultsAsync") createCarrierResultsAsync

> Retrieve a list of carrier lookup objects.


```java
void createCarrierResultsAsync(
        final Integer page,
        final Integer pageSize,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pageSize |  ``` Optional ```  | The count of objects to return per page. |


#### Example Usage

```java
Integer page = 50;
Integer pageSize = 50;
// Invoking the API call with sample inputs
carrier.createCarrierResultsAsync(page, pageSize, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="email_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.EmailController") EmailController

### Get singleton instance

The singleton instance of the ``` EmailController ``` class can be accessed from the API Client.

```java
EmailController email = client.getEmail();
```

### <a name="create_remove_invalid_email_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createRemoveInvalidEmailAsync") createRemoveInvalidEmailAsync

> Remove an email from the invalid email list.


```java
void createRemoveInvalidEmailAsync(
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
email.createRemoveInvalidEmailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_blocked_emails_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createBlockedEmailsAsync") createBlockedEmailsAsync

> Retrieve a list of emails that have been blocked.


```java
void createBlockedEmailsAsync(
        final String offset,
        final String limit,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of blocked emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
String offset = "Offset";
String limit = "Limit";
// Invoking the API call with sample inputs
email.createBlockedEmailsAsync(offset, limit, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_spam_emails_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createSpamEmailsAsync") createSpamEmailsAsync

> Retrieve a list of emails that are on the spam list.


```java
void createSpamEmailsAsync(
        final String offset,
        final String limit,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of spam emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
String offset = "Offset";
String limit = "Limit";
// Invoking the API call with sample inputs
email.createSpamEmailsAsync(offset, limit, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_bounced_emails_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createBouncedEmailsAsync") createBouncedEmailsAsync

> Retrieve a list of emails that have bounced.


```java
void createBouncedEmailsAsync(
        final String offset,
        final String limit,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of bounced emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
String offset = "Offset";
String limit = "Limit";
// Invoking the API call with sample inputs
email.createBouncedEmailsAsync(offset, limit, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_remove_bounced_email_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createRemoveBouncedEmailAsync") createRemoveBouncedEmailAsync

> Remove an email address from the bounced list.


```java
void createRemoveBouncedEmailAsync(
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
email.createRemoveBouncedEmailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_invalid_emails_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createInvalidEmailsAsync") createInvalidEmailsAsync

> Retrieve a list of invalid email addresses.


```java
void createInvalidEmailsAsync(
        final String offset,
        final String limit,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of invalid emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
String offset = "Offset";
String limit = "Limit";
// Invoking the API call with sample inputs
email.createInvalidEmailsAsync(offset, limit, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_unsubscribed_emails_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createListUnsubscribedEmailsAsync") createListUnsubscribedEmailsAsync

> Retrieve a list of email addresses from the unsubscribe list.


```java
void createListUnsubscribedEmailsAsync(
        final String offset,
        final String limit,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | The starting point of the list of unsubscribed emails that should be returned. |
| limit |  ``` Optional ```  | The count of results that should be returned. |


#### Example Usage

```java
String offset = "Offset";
String limit = "Limit";
// Invoking the API call with sample inputs
email.createListUnsubscribedEmailsAsync(offset, limit, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_remove_unsubscribed_email_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createRemoveUnsubscribedEmailAsync") createRemoveUnsubscribedEmailAsync

> Remove an email address from the list of unsubscribed emails.


```java
void createRemoveUnsubscribedEmailAsync(
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
email.createRemoveUnsubscribedEmailAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="add_email_unsubscribe_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.addEmailUnsubscribeAsync") addEmailUnsubscribeAsync

> Add an email to the unsubscribe list


```java
void addEmailUnsubscribeAsync(
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
email.addEmailUnsubscribeAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_remove_blocked_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createRemoveBlockedAddressAsync") createRemoveBlockedAddressAsync

> Remove an email from blocked emails list.


```java
void createRemoveBlockedAddressAsync(
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
email.createRemoveBlockedAddressAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_remove_spam_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createRemoveSpamAddressAsync") createRemoveSpamAddressAsync

> Remove an email from the spam email list.


```java
void createRemoveSpamAddressAsync(
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
email.createRemoveSpamAddressAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_send_email_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.EmailController.createSendEmailAsync") createSendEmailAsync

> Create and submit an email message to one or more email addresses.


```java
void createSendEmailAsync(
        final String to,
        final TypeEnum type,
        final String subject,
        final String message,
        final String from,
        final String cc,
        final String bcc,
        final String attachment,
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
String to = "To";
TypeEnum type = TypeEnum.fromString("text");
String subject = "Subject";
String message = "Message";
String from = "From";
String cc = "Cc";
String bcc = "Bcc";
String attachment = "Attachment";
// Invoking the API call with sample inputs
email.createSendEmailAsync(to, type, subject, message, from, cc, bcc, attachment, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="account_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.AccountController") AccountController

### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

### <a name="create_view_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AccountController.createViewAccountAsync") createViewAccountAsync

> Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.


```java
void createViewAccountAsync(
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
account.createViewAccountAsync(date, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sub_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.SubAccountController") SubAccountController

### Get singleton instance

The singleton instance of the ``` SubAccountController ``` class can be accessed from the API Client.

```java
SubAccountController subAccount = client.getSubAccount();
```

### <a name="create_toggle_subaccount_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SubAccountController.createToggleSubaccountStatusAsync") createToggleSubaccountStatusAsync

> Suspend or unsuspend


```java
void createToggleSubaccountStatusAsync(
        final String subAccountSID,
        final MActivateEnum mActivate,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be activated or suspended |
| mActivate |  ``` Required ```  | 0 to suspend or 1 to activate |


#### Example Usage

```java
String subAccountSID = "SubAccountSID";
MActivateEnum mActivate = MActivateEnum.fromInteger(1);
// Invoking the API call with sample inputs
subAccount.createToggleSubaccountStatusAsync(subAccountSID, mActivate, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_delete_subaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SubAccountController.createDeleteSubaccountAsync") createDeleteSubaccountAsync

> Delete sub account or merge numbers into parent


```java
void createDeleteSubaccountAsync(
        final String subAccountSID,
        final MergeNumberEnum mergeNumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be deleted |
| mergeNumber |  ``` Required ```  | 0 to delete or 1 to merge numbers to parent account. |


#### Example Usage

```java
String subAccountSID = "SubAccountSID";
MergeNumberEnum mergeNumber = MergeNumberEnum.fromInteger(0);
// Invoking the API call with sample inputs
subAccount.createDeleteSubaccountAsync(subAccountSID, mergeNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_subaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.SubAccountController.createSubaccountAsync") createSubaccountAsync

> Create a sub user account under the parent account


```java
void createSubaccountAsync(
        final String firstName,
        final String lastName,
        final String email,
        final String friendlyName,
        final String password,
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
String firstName = "FirstName";
String lastName = "LastName";
String email = "Email";
String friendlyName = "FriendlyName";
String password = "Password";
// Invoking the API call with sample inputs
subAccount.createSubaccountAsync(firstName, lastName, email, friendlyName, password, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="address_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.AddressController") AddressController

### Get singleton instance

The singleton instance of the ``` AddressController ``` class can be accessed from the API Client.

```java
AddressController address = client.getAddress();
```

### <a name="create_delete_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AddressController.createDeleteAddressAsync") createDeleteAddressAsync

> To delete Address to your address book


```java
void createDeleteAddressAsync(
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
address.createDeleteAddressAsync(addressid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_verify_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AddressController.createVerifyAddressAsync") createVerifyAddressAsync

> Validates an address given.


```java
void createVerifyAddressAsync(
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
address.createVerifyAddressAsync(addressid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AddressController.createViewAddressAsync") createViewAddressAsync

> View Address Specific address Book by providing the address id


```java
void createViewAddressAsync(
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
address.createViewAddressAsync(addressid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_addresses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AddressController.createListAddressesAsync") createListAddressesAsync

> List All Address 


```java
void createListAddressesAsync(
        final Integer page,
        final Integer pagesize,
        final String addressid,
        final String dateCreated,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | How many results to return, default is 10, max is 100, must be an integer |
| addressid |  ``` Optional ```  | addresses Sid |
| dateCreated |  ``` Optional ```  | date created address. |


#### Example Usage

```java
Integer page = 50;
Integer pagesize = 50;
String addressid = "addressid";
String dateCreated = "dateCreated";
// Invoking the API call with sample inputs
address.createListAddressesAsync(page, pagesize, addressid, dateCreated, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.AddressController.createAddressAsync") createAddressAsync

> To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.


```java
void createAddressAsync(
        final String name,
        final String address,
        final String country,
        final String state,
        final String city,
        final String zip,
        final String description,
        final String email,
        final String phone,
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
String name = "Name";
String address = "Address";
String country = "Country";
String state = "State";
String city = "City";
String zip = "Zip";
String description = "Description";
String email = "email";
String phone = "Phone";
// Invoking the API call with sample inputs
address.createAddressAsync(name, address, country, state, city, zip, description, email, phone, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="recording_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.RecordingController") RecordingController

### Get singleton instance

The singleton instance of the ``` RecordingController ``` class can be accessed from the API Client.

```java
RecordingController recording = client.getRecording();
```

### <a name="create_delete_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.RecordingController.createDeleteRecordingAsync") createDeleteRecordingAsync

> Remove a recording from your Ytel account.


```java
void createDeleteRecordingAsync(
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
recording.createDeleteRecordingAsync(recordingsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.RecordingController.createViewRecordingAsync") createViewRecordingAsync

> Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.


```java
void createViewRecordingAsync(
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
recording.createViewRecordingAsync(recordingsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_recordings_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.RecordingController.createListRecordingsAsync") createListRecordingsAsync

> Retrieve a list of recording objects.


```java
void createListRecordingsAsync(
        final Integer page,
        final Integer pagesize,
        final String datecreated,
        final String callsid,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |
| datecreated |  ``` Optional ```  | Filter results by creation date |
| callsid |  ``` Optional ```  | The unique identifier for a call. |


#### Example Usage

```java
Integer page = 50;
Integer pagesize = 50;
String datecreated = "Datecreated";
String callsid = "callsid";
// Invoking the API call with sample inputs
recording.createListRecordingsAsync(page, pagesize, datecreated, callsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="transcription_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.TranscriptionController") TranscriptionController

### Get singleton instance

The singleton instance of the ``` TranscriptionController ``` class can be accessed from the API Client.

```java
TranscriptionController transcription = client.getTranscription();
```

### <a name="create_transcribe_audio_url_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.TranscriptionController.createTranscribeAudioURLAsync") createTranscribeAudioURLAsync

> Transcribe an audio recording from a file.


```java
void createTranscribeAudioURLAsync(
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
transcription.createTranscribeAudioURLAsync(audiourl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_transcribe_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.TranscriptionController.createTranscribeRecordingAsync") createTranscribeRecordingAsync

> Transcribe a recording by its RecordingSid.


```java
void createTranscribeRecordingAsync(
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
transcription.createTranscribeRecordingAsync(recordingSid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_view_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.TranscriptionController.createViewTranscriptionAsync") createViewTranscriptionAsync

> Retrieve information about a transaction by its TranscriptionSid.


```java
void createViewTranscriptionAsync(
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
transcription.createViewTranscriptionAsync(transcriptionsid, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_list_transcriptions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.TranscriptionController.createListTranscriptionsAsync") createListTranscriptionsAsync

> Retrieve a list of transcription objects for your Ytel account.


```java
void createListTranscriptionsAsync(
        final Integer page,
        final Integer pagesize,
        final Status12Enum status,
        final String dateTranscribed,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  | The count of objects to return per page. |
| status |  ``` Optional ```  | The state of the transcription. |
| dateTranscribed |  ``` Optional ```  | The date the transcription took place. |


#### Example Usage

```java
Integer page = 50;
Integer pagesize = 50;
Status12Enum status = Status12Enum.fromString("inprogress");
String dateTranscribed = "dateTranscribed";
// Invoking the API call with sample inputs
transcription.createListTranscriptionsAsync(page, pagesize, status, dateTranscribed, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="usage_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.ytel.api.controllers.UsageController") UsageController

### Get singleton instance

The singleton instance of the ``` UsageController ``` class can be accessed from the API Client.

```java
UsageController usage = client.getUsage();
```

### <a name="create_list_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.ytel.api.controllers.UsageController.createListUsageAsync") createListUsageAsync

> Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.


```java
void createListUsageAsync(
        final ProductCodeEnum productCode,
        final String startDate,
        final String endDate,
        final String includeSubAccounts,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| productCode |  ``` Optional ```  | Filter usage results by product type. |
| startDate |  ``` Optional ```  | Filter usage objects by start date. |
| endDate |  ``` Optional ```  | Filter usage objects by end date. |
| includeSubAccounts |  ``` Optional ```  | Will include all subaccount usage data |


#### Example Usage

```java
ProductCodeEnum productCode = ProductCodeEnum.fromInteger(0);
String startDate = "startDate";
String endDate = "endDate";
String includeSubAccounts = "IncludeSubAccounts";
// Invoking the API call with sample inputs
usage.createListUsageAsync(productCode, startDate, endDate, includeSubAccounts, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



