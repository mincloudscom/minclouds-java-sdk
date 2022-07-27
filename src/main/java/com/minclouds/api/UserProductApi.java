/*
 * 云小朵开发者服务平台
 * 云小朵开发者服务平台应用程序接口文档
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: minclouds@163.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.minclouds.api;

import com.minclouds.ApiCallback;
import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.ApiResponse;
import com.minclouds.Configuration;
import com.minclouds.Pair;
import com.minclouds.ProgressRequestBody;
import com.minclouds.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.minclouds.model.Product;
import com.minclouds.model.UserProduct;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserProductApi {
    private ApiClient localVarApiClient;

    public UserProductApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserProductApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getUserProduct
     * @param userProduct userProduct (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserProductCall(UserProduct userProduct, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userProduct;

        // create path and map variables
        String localVarPath = "/aas/api/getUserProduct";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserProductValidateBeforeCall(UserProduct userProduct, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userProduct' is set
        if (userProduct == null) {
            throw new ApiException("Missing the required parameter 'userProduct' when calling getUserProduct(Async)");
        }
        

        okhttp3.Call localVarCall = getUserProductCall(userProduct, _callback);
        return localVarCall;

    }

    /**
     * 获取平台上用户产品的定价
     * 获取平台上用户产品的定价
     * @param userProduct userProduct (required)
     * @return Product
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public Product getUserProduct(UserProduct userProduct) throws ApiException {
        ApiResponse<Product> localVarResp = getUserProductWithHttpInfo(userProduct);
        return localVarResp.getData();
    }

    /**
     * 获取平台上用户产品的定价
     * 获取平台上用户产品的定价
     * @param userProduct userProduct (required)
     * @return ApiResponse&lt;Product&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Product> getUserProductWithHttpInfo(UserProduct userProduct) throws ApiException {
        okhttp3.Call localVarCall = getUserProductValidateBeforeCall(userProduct, null);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取平台上用户产品的定价 (asynchronously)
     * 获取平台上用户产品的定价
     * @param userProduct userProduct (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserProductAsync(UserProduct userProduct, final ApiCallback<Product> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserProductValidateBeforeCall(userProduct, _callback);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
