# InternalTestSystemApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](InternalTestSystemApi.md#delete) | **POST** /aas/api/delete | 删除系统
[**getLatestIosVersion**](InternalTestSystemApi.md#getLatestIosVersion) | **POST** /aas/api/getLatestIosVersion | 获取内测系统最新发布版本号
[**getQuota**](InternalTestSystemApi.md#getQuota) | **POST** /aas/api/getQuota | 获取内测系统的配额
[**getTestSystem**](InternalTestSystemApi.md#getTestSystem) | **POST** /aas/api/getTestSystem | 获取内测系统的信息
[**pause**](InternalTestSystemApi.md#pause) | **POST** /aas/api/pause | 暂停系统
[**restart**](InternalTestSystemApi.md#restart) | **POST** /aas/api/restart | 重启系统
[**start**](InternalTestSystemApi.md#start) | **POST** /aas/api/start | 启动系统
[**upgrade**](InternalTestSystemApi.md#upgrade) | **POST** /aas/api/upgrade | 升级系统


<a name="delete"></a>
# **delete**
> Boolean delete(uuid)

删除系统

删除系统

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
      Boolean result = apiInstance.delete(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#delete");
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

<a name="getLatestIosVersion"></a>
# **getLatestIosVersion**
> String getLatestIosVersion()

获取内测系统最新发布版本号

获取内测系统最新发布版本号

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
    try {
      String result = apiInstance.getLatestIosVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#getLatestIosVersion");
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

**String**

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

<a name="pause"></a>
# **pause**
> Boolean pause(uuid)

暂停系统

暂停系统

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
      Boolean result = apiInstance.pause(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#pause");
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

<a name="restart"></a>
# **restart**
> Boolean restart(uuid)

重启系统

重启系统

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
      Boolean result = apiInstance.restart(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#restart");
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

<a name="start"></a>
# **start**
> Boolean start(uuid)

启动系统

启动系统

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
      Boolean result = apiInstance.start(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#start");
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

<a name="upgrade"></a>
# **upgrade**
> Boolean upgrade(uuid)

升级系统

升级系统

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
      Boolean result = apiInstance.upgrade(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTestSystemApi#upgrade");
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

