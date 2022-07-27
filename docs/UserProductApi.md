# UserProductApi

All URIs are relative to *https://www.minclouds.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserProduct**](UserProductApi.md#getUserProduct) | **POST** /aas/api/getUserProduct | 获取平台上用户产品的定价


<a name="getUserProduct"></a>
# **getUserProduct**
> Product getUserProduct(userProduct)

获取平台上用户产品的定价

获取平台上用户产品的定价

### Example
```java
// Import classes:
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.auth.*;
import com.minclouds.models.*;
import com.minclouds.api.UserProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.minclouds.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    UserProductApi apiInstance = new UserProductApi(defaultClient);
    UserProduct userProduct = new UserProduct(); // UserProduct | userProduct
    try {
      Product result = apiInstance.getUserProduct(userProduct);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProductApi#getUserProduct");
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
 **userProduct** | [**UserProduct**](UserProduct.md)| userProduct |

### Return type

[**Product**](Product.md)

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

