# IosAppApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppDetail**](IosAppApi.md#getAppDetail) | **POST** /ios/api/getAppDetail | 获取APP详细信息的接口
[**getAppDetails**](IosAppApi.md#getAppDetails) | **POST** /ios/api/getAppDetails | 获取该用户所有APP的详细信息
[**getAppInfo**](IosAppApi.md#getAppInfo) | **POST** /ios/api/getAppInfo | 获取APP基本信息的接口
[**getAppInfos**](IosAppApi.md#getAppInfos) | **POST** /ios/api/getAppInfos | 获取该用户所有APP的基本信息
[**getSeparates**](IosAppApi.md#getSeparates) | **POST** /ios/api/getSeparates | 获取APP应用分身信息的接口


<a name="getAppDetail"></a>
# **getAppDetail**
> AppDetail getAppDetail(appUuid)

获取APP详细信息的接口

获取APP详细信息的接口

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosAppApi apiInstance = new IosAppApi(defaultClient);
    String appUuid = "appUuid_example"; // String | appUuid
    try {
      AppDetail result = apiInstance.getAppDetail(appUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosAppApi#getAppDetail");
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
 **appUuid** | **String**| appUuid |

### Return type

[**AppDetail**](AppDetail.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getAppDetails"></a>
# **getAppDetails**
> List&lt;AppDetail&gt; getAppDetails()

获取该用户所有APP的详细信息

获取该用户所有APP的详细信息

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosAppApi apiInstance = new IosAppApi(defaultClient);
    try {
      List<AppDetail> result = apiInstance.getAppDetails();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosAppApi#getAppDetails");
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

[**List&lt;AppDetail&gt;**](AppDetail.md)

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

<a name="getAppInfo"></a>
# **getAppInfo**
> AppInfo getAppInfo(appUuid)

获取APP基本信息的接口

获取APP基本信息的接口

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosAppApi apiInstance = new IosAppApi(defaultClient);
    String appUuid = "appUuid_example"; // String | appUuid
    try {
      AppInfo result = apiInstance.getAppInfo(appUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosAppApi#getAppInfo");
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
 **appUuid** | **String**| appUuid |

### Return type

[**AppInfo**](AppInfo.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getAppInfos"></a>
# **getAppInfos**
> List&lt;AppInfo&gt; getAppInfos()

获取该用户所有APP的基本信息

获取该用户所有APP的基本信息

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosAppApi apiInstance = new IosAppApi(defaultClient);
    try {
      List<AppInfo> result = apiInstance.getAppInfos();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosAppApi#getAppInfos");
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

[**List&lt;AppInfo&gt;**](AppInfo.md)

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

<a name="getSeparates"></a>
# **getSeparates**
> List&lt;AppSeparate&gt; getSeparates(appUuid)

获取APP应用分身信息的接口

获取APP应用分身信息的接口

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosAppApi apiInstance = new IosAppApi(defaultClient);
    String appUuid = "appUuid_example"; // String | appUuid
    try {
      List<AppSeparate> result = apiInstance.getSeparates(appUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosAppApi#getSeparates");
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
 **appUuid** | **String**| appUuid |

### Return type

[**List&lt;AppSeparate&gt;**](AppSeparate.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

