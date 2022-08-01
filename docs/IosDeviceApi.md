# IosDeviceApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableDevice**](IosDeviceApi.md#disableDevice) | **POST** /aas/api/disableDevice | iPhone设备禁用
[**disableDeviceApp**](IosDeviceApi.md#disableDeviceApp) | **POST** /aas/api/disableDeviceApp | iPhone APP 禁用
[**enableDevice**](IosDeviceApi.md#enableDevice) | **POST** /aas/api/enableDevice | iPhone设备解禁
[**enableDeviceApp**](IosDeviceApi.md#enableDeviceApp) | **POST** /aas/api/enableDeviceApp | iPhone APP 解禁
[**enableUdid**](IosDeviceApi.md#enableUdid) | **POST** /aas/api/enableUdid | UDID设备解禁
[**getDeviceRegistry**](IosDeviceApi.md#getDeviceRegistry) | **POST** /aas/api/getDeviceRegistry | 获取设备注册的相关信息
[**getJumpMobileProvision**](IosDeviceApi.md#getJumpMobileProvision) | **POST** /aas/api/getJumpMobileProvision | 获取安装跳转文件的地址
[**getPublicPrice**](IosDeviceApi.md#getPublicPrice) | **POST** /aas/api/getPublicPrice | 获取当前共享证书的最低价格
[**getSignTool**](IosDeviceApi.md#getSignTool) | **POST** /aas/api/getSignTool | 获取签名工具的地址
[**getUdidStatus**](IosDeviceApi.md#getUdidStatus) | **POST** /aas/api/getUdidStatus | 获取UDID的状态
[**isUdidEnabled**](IosDeviceApi.md#isUdidEnabled) | **POST** /aas/api/isUdidEnabled | UDID合格性校验
[**isValidKey**](IosDeviceApi.md#isValidKey) | **POST** /aas/api/isValidKey | 校验P8证书的接口
[**register**](IosDeviceApi.md#register) | **POST** /app/register | IosDevice设备注册API调用
[**register1**](IosDeviceApi.md#register1) | **GET** /app/register | IosDevice设备注册API调用
[**register2**](IosDeviceApi.md#register2) | **POST** /aas/api/register | iOS设备注册请求


<a name="disableDevice"></a>
# **disableDevice**
> Boolean disableDevice(udid)

iPhone设备禁用

iPhone设备禁用，手动禁用设备调用

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      Boolean result = apiInstance.disableDevice(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#disableDevice");
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
 **udid** | **String**| udid |

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

<a name="disableDeviceApp"></a>
# **disableDeviceApp**
> Boolean disableDeviceApp(data)

iPhone APP 禁用

iPhone APP 禁用，手动禁用APP

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    AppUserData data = new AppUserData(); // AppUserData | data
    try {
      Boolean result = apiInstance.disableDeviceApp(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#disableDeviceApp");
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
 **data** | [**AppUserData**](AppUserData.md)| data |

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

<a name="enableDevice"></a>
# **enableDevice**
> Boolean enableDevice(udid)

iPhone设备解禁

iPhone设备解禁，设备禁用后重新启用

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      Boolean result = apiInstance.enableDevice(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#enableDevice");
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
 **udid** | **String**| udid |

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

<a name="enableDeviceApp"></a>
# **enableDeviceApp**
> Boolean enableDeviceApp(data)

iPhone APP 解禁

iPhone APP 解禁，APP禁用后重新启用

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    AppUserData data = new AppUserData(); // AppUserData | data
    try {
      Boolean result = apiInstance.enableDeviceApp(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#enableDeviceApp");
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
 **data** | [**AppUserData**](AppUserData.md)| data |

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

<a name="enableUdid"></a>
# **enableUdid**
> Boolean enableUdid(udid)

UDID设备解禁

UDID设备解禁，如果UDID被禁用有需要重新启用，可以手动解除禁用

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      Boolean result = apiInstance.enableUdid(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#enableUdid");
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
 **udid** | **String**| udid |

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

<a name="getDeviceRegistry"></a>
# **getDeviceRegistry**
> DeviceRegistryResponse getDeviceRegistry(udid)

获取设备注册的相关信息

IOS设备注册后的描述文件，签名所需的P12证书，以及P12证书的密码, 如果该UDID未注册成功将返回null

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      DeviceRegistryResponse result = apiInstance.getDeviceRegistry(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#getDeviceRegistry");
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
 **udid** | **String**| udid |

### Return type

[**DeviceRegistryResponse**](DeviceRegistryResponse.md)

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

<a name="getJumpMobileProvision"></a>
# **getJumpMobileProvision**
> String getJumpMobileProvision()

获取安装跳转文件的地址

安装跳转文件用来在网页上直接跳转到设备管理里面安装描述文件

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    try {
      String result = apiInstance.getJumpMobileProvision();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#getJumpMobileProvision");
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

<a name="getPublicPrice"></a>
# **getPublicPrice**
> BigDecimal getPublicPrice()

获取当前共享证书的最低价格

用户在获取证书的时候，可以调用该接口获取当前注册个人UDID的共享证书的最低价格

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    try {
      BigDecimal result = apiInstance.getPublicPrice();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#getPublicPrice");
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

[**BigDecimal**](BigDecimal.md)

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

<a name="getSignTool"></a>
# **getSignTool**
> String getSignTool(osType)

获取签名工具的地址

签名工具是用来进行对IPA重新签名的工具程序

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String osType = "osType_example"; // String | osType
    try {
      String result = apiInstance.getSignTool(osType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#getSignTool");
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
 **osType** | **String**| osType |

### Return type

**String**

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

<a name="getUdidStatus"></a>
# **getUdidStatus**
> String getUdidStatus(udid)

获取UDID的状态

获取系统保存的UDID的状态：如果系统保存了该UDID,在返回该UDID的状态，如果系统没有该UDID，返回：ENABLED状态

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      String result = apiInstance.getUdidStatus(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#getUdidStatus");
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
 **udid** | **String**| udid |

### Return type

**String**

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

<a name="isUdidEnabled"></a>
# **isUdidEnabled**
> Boolean isUdidEnabled(udid)

UDID合格性校验

UDID合格性校验，在调用签名前先校验UDID的合法性，防止注册设备损失

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      Boolean result = apiInstance.isUdidEnabled(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#isUdidEnabled");
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
 **udid** | **String**| udid |

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

<a name="isValidKey"></a>
# **isValidKey**
> Boolean isValidKey(connectKeyInfo)

校验P8证书的接口

校验P8证书有效性的接口，当重签用户进入签名流程，如果之前签名的安装包数据还存在，通过该接口可以校验P8证书是否有效，如果有效，则直接使用之前的包分发，否则进入重签获取证书流程

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    ConnectKeyInfo connectKeyInfo = new ConnectKeyInfo(); // ConnectKeyInfo | connectKeyInfo
    try {
      Boolean result = apiInstance.isValidKey(connectKeyInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#isValidKey");
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
 **connectKeyInfo** | [**ConnectKeyInfo**](ConnectKeyInfo.md)| connectKeyInfo |

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

<a name="register"></a>
# **register**
> register(param)

IosDevice设备注册API调用

IosDevice设备注册API调用

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    Map<String, String> param = new HashMap(); // Map<String, String> | param
    try {
      apiInstance.register(param);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#register");
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
 **param** | [**Map&lt;String, String&gt;**](String.md)| param |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="register1"></a>
# **register1**
> register1(param)

IosDevice设备注册API调用

IosDevice设备注册API调用

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    String param = "param_example"; // String | param
    try {
      apiInstance.register1(param);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#register1");
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
 **param** | **String**| param | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="register2"></a>
# **register2**
> Map&lt;String, Object&gt; register2(registryRequest)

iOS设备注册请求

iOS设备注册请求

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.IosDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    IosDeviceApi apiInstance = new IosDeviceApi(defaultClient);
    DeviceRegistryRequest registryRequest = new DeviceRegistryRequest(); // DeviceRegistryRequest | registryRequest
    try {
      Map<String, Object> result = apiInstance.register2(registryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IosDeviceApi#register2");
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
 **registryRequest** | [**DeviceRegistryRequest**](DeviceRegistryRequest.md)| registryRequest |

### Return type

**Map&lt;String, Object&gt;**

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

