# EndpointApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEndpoint**](EndpointApi.md#getEndpoint) | **POST** /endpoint/getEndpoint | 获取签名节点入口


<a name="getEndpoint"></a>
# **getEndpoint**
> List&lt;Endpoint&gt; getEndpoint(param)

获取签名节点入口

获取签名节点入口

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    Map<String, String> param = new HashMap(); // Map<String, String> | param
    try {
      List<Endpoint> result = apiInstance.getEndpoint(param);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getEndpoint");
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

[**List&lt;Endpoint&gt;**](Endpoint.md)

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

