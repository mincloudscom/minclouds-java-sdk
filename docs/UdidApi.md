# UdidApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budCode**](UdidApi.md#budCode) | **POST** /aas/api/budCode | 增加授权码个数
[**buyUdid**](UdidApi.md#buyUdid) | **POST** /aas/api/buyUdid | UDID付费服务购买
[**checkUdid**](UdidApi.md#checkUdid) | **POST** /aas/api/checkUdid | UDID付费安装检查
[**getUdidProduct**](UdidApi.md#getUdidProduct) | **POST** /aas/api/getUdidProduct | UDID付费产品价格


<a name="budCode"></a>
# **budCode**
> Integer budCode(codeRequest)

增加授权码个数

增加授权码个数

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.UdidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    UdidApi apiInstance = new UdidApi(defaultClient);
    CodeRequest codeRequest = new CodeRequest(); // CodeRequest | codeRequest
    try {
      Integer result = apiInstance.budCode(codeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdidApi#budCode");
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
 **codeRequest** | [**CodeRequest**](CodeRequest.md)| codeRequest |

### Return type

**Integer**

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

<a name="buyUdid"></a>
# **buyUdid**
> Long buyUdid(payData)

UDID付费服务购买

UDID付费服务购买

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.UdidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    UdidApi apiInstance = new UdidApi(defaultClient);
    UdidPayData payData = new UdidPayData(); // UdidPayData | payData
    try {
      Long result = apiInstance.buyUdid(payData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdidApi#buyUdid");
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
 **payData** | [**UdidPayData**](UdidPayData.md)| payData |

### Return type

**Long**

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

<a name="checkUdid"></a>
# **checkUdid**
> Integer checkUdid(udidInstall)

UDID付费安装检查

UDID付费安装检查

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.UdidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    UdidApi apiInstance = new UdidApi(defaultClient);
    UdidInstall udidInstall = new UdidInstall(); // UdidInstall | udidInstall
    try {
      Integer result = apiInstance.checkUdid(udidInstall);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdidApi#checkUdid");
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
 **udidInstall** | [**UdidInstall**](UdidInstall.md)| udidInstall |

### Return type

**Integer**

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

<a name="getUdidProduct"></a>
# **getUdidProduct**
> UdidProduct getUdidProduct(userUuid)

UDID付费产品价格

UDID付费产品价格

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.UdidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    UdidApi apiInstance = new UdidApi(defaultClient);
    String userUuid = "userUuid_example"; // String | userUuid
    try {
      UdidProduct result = apiInstance.getUdidProduct(userUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdidApi#getUdidProduct");
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
 **userUuid** | **String**| userUuid |

### Return type

[**UdidProduct**](UdidProduct.md)

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

