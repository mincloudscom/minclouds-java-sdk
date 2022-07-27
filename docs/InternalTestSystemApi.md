# InternalTestSystemApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQuota**](InternalTestSystemApi.md#getQuota) | **POST** /aas/api/getQuota | 获取内测系统的配额
[**getTestSystem**](InternalTestSystemApi.md#getTestSystem) | **POST** /aas/api/getTestSystem | 获取内测系统的信息


<a name="getQuota"></a>
# **getQuota**
> BigDecimal getQuota(systemUuid)

获取内测系统的配额

内测系统配额适用于使用平台提供的镜像自动或手动部署系统，该配额在充值过程中消耗，当配额不足是可以在云小朵官方后台充值

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.InternalTestSystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    InternalTestSystemApi apiInstance = new InternalTestSystemApi(defaultClient);
    String systemUuid = "systemUuid_example"; // String | systemUuid
    try {
      BigDecimal result = apiInstance.getQuota(systemUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#getQuota");
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
 **systemUuid** | **String**| systemUuid |

### Return type

[**BigDecimal**](BigDecimal.md)

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

<a name="getTestSystem"></a>
# **getTestSystem**
> TestSystem getTestSystem(uuid)

获取内测系统的信息

获取内测系统的信息

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.InternalTestSystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    InternalTestSystemApi apiInstance = new InternalTestSystemApi(defaultClient);
    String uuid = "uuid_example"; // String | uuid
    try {
      TestSystem result = apiInstance.getTestSystem(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#getTestSystem");
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
 **uuid** | **String**| uuid |

### Return type

[**TestSystem**](TestSystem.md)

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

