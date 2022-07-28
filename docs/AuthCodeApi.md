# AuthCodeApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthCode**](AuthCodeApi.md#createAuthCode) | **POST** /app/createAuthCode | 创建APP授权码


<a name="createAuthCode"></a>
# **createAuthCode**
> Map&lt;String, Object&gt; createAuthCode(appUuid, codeType)

创建APP授权码

创建APP授权码

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.AuthCodeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    AuthCodeApi apiInstance = new AuthCodeApi(defaultClient);
    String appUuid = "appUuid_example"; // String | appUuid
    String codeType = "codeType_example"; // String | codeType
    try {
      Map<String, Object> result = apiInstance.createAuthCode(appUuid, codeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthCodeApi#createAuthCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appUuid** | **String**| appUuid | [optional]
 **codeType** | **String**| codeType | [optional] [enum: all, app, link, udid]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

