# OauthApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken**](OauthApi.md#getToken) | **POST** /oauth2/token | 获取Token
[**userInfo**](OauthApi.md#userInfo) | **GET** /oauth2/userInfo | 获取用户信息
[**userInfo1**](OauthApi.md#userInfo1) | **POST** /oauth2/userInfo | 获取用户信息


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

<a name="userInfo"></a>
# **userInfo**
> HttpEntity userInfo()

获取用户信息

获取用户信息

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OauthApi apiInstance = new OauthApi(defaultClient);
    try {
      HttpEntity result = apiInstance.userInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#userInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HttpEntity**](HttpEntity.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="userInfo1"></a>
# **userInfo1**
> HttpEntity userInfo1()

获取用户信息

获取用户信息

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OauthApi apiInstance = new OauthApi(defaultClient);
    try {
      HttpEntity result = apiInstance.userInfo1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#userInfo1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HttpEntity**](HttpEntity.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

