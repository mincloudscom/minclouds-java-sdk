# OauthApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken**](OauthApi.md#getToken) | **POST** /oauth2/token | 获取Token


<a name="getToken"></a>
# **getToken**
> String getToken(clientId, clientSecret)

获取Token

获取Token

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.models.*;
import com.minclouds.api.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");

    OauthApi apiInstance = new OauthApi(defaultClient);
    String clientId = "clientId_example"; // String | client_id
    String clientSecret = "clientSecret_example"; // String | client_secret
    try {
      String result = apiInstance.getToken(clientId, clientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#getToken");
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
 **clientId** | **String**| client_id |
 **clientSecret** | **String**| client_secret |

### Return type

**String**

### Authorization

No authorization required

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

