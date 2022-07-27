# IosEnterpriseApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buyMonth**](IosEnterpriseApi.md#buyMonth) | **POST** /aas/api/buyMonth | 包年包月服务购买
[**checkMonth**](IosEnterpriseApi.md#checkMonth) | **POST** /aas/api/checkMonth | 检查企业签名包年包月服务是否可用
[**hasValidCert**](IosEnterpriseApi.md#hasValidCert) | **POST** /aas/api/hasValidCert | 查询是否偶可用的企业证书
[**isValidCert**](IosEnterpriseApi.md#isValidCert) | **POST** /aas/api/isValidCert | 校验P12证书的接口


<a name="buyMonth"></a>
# **buyMonth**
> BuyMonthResponse buyMonth(request)

包年包月服务购买

IOS企业签名包年包月服务购买

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosEnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosEnterpriseApi apiInstance = new IosEnterpriseApi(defaultClient);
    BuyMonthRequest request = new BuyMonthRequest(); // BuyMonthRequest | request
    try {
      BuyMonthResponse result = apiInstance.buyMonth(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosEnterpriseApi#buyMonth");
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
 **request** | [**BuyMonthRequest**](BuyMonthRequest.md)| request |

### Return type

[**BuyMonthResponse**](BuyMonthResponse.md)

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

<a name="checkMonth"></a>
# **checkMonth**
> BuyMonthResponse checkMonth(request)

检查企业签名包年包月服务是否可用

检查企业签名包年包月服务是否可用：当用户没有企业证书的时候，将不可用

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosEnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosEnterpriseApi apiInstance = new IosEnterpriseApi(defaultClient);
    BuyMonthRequest request = new BuyMonthRequest(); // BuyMonthRequest | request
    try {
      BuyMonthResponse result = apiInstance.checkMonth(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosEnterpriseApi#checkMonth");
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
 **request** | [**BuyMonthRequest**](BuyMonthRequest.md)| request |

### Return type

[**BuyMonthResponse**](BuyMonthResponse.md)

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

<a name="hasValidCert"></a>
# **hasValidCert**
> Boolean hasValidCert(userUuid)

查询是否偶可用的企业证书

查询是否偶可用的企业证书

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosEnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosEnterpriseApi apiInstance = new IosEnterpriseApi(defaultClient);
    String userUuid = "userUuid_example"; // String | userUuid
    try {
      Boolean result = apiInstance.hasValidCert(userUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosEnterpriseApi#hasValidCert");
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

**Boolean**

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

<a name="isValidCert"></a>
# **isValidCert**
> Boolean isValidCert(certUuid)

校验P12证书的接口

校验P12证书的接口，当重签用户进入签名流程，如果之前签名的安装包数据还存在，通过该接口可以校验P12证书是否有效，如果有效，则直接使用之前的包分发，否则进入重签获取证书流程

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosEnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosEnterpriseApi apiInstance = new IosEnterpriseApi(defaultClient);
    String certUuid = "certUuid_example"; // String | certUuid
    try {
      Boolean result = apiInstance.isValidCert(certUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosEnterpriseApi#isValidCert");
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
 **certUuid** | **String**| certUuid |

### Return type

**Boolean**

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

