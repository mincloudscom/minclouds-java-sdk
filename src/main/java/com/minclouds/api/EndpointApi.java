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


import com.minclouds.model.Endpoint;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointApi {
    private ApiClient localVarApiClient;

    public EndpointApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EndpointApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getEndpoint
     * @param param param (required)
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
    public okhttp3.Call getEndpointCall(Map<String, String> param, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = param;

        // create path and map variables
        String localVarPath = "/endpoint/getEndpoint";

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
    private okhttp3.Call getEndpointValidateBeforeCall(Map<String, String> param, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'param' is set
        if (param == null) {
            throw new ApiException("Missing the required parameter 'param' when calling getEndpoint(Async)");
        }
        

        okhttp3.Call localVarCall = getEndpointCall(param, _callback);
        return localVarCall;

    }

    /**
     * 获取签名节点入口
     * 获取签名节点入口
     * @param param param (required)
     * @return List&lt;Endpoint&gt;
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
    public List<Endpoint> getEndpoint(Map<String, String> param) throws ApiException {
        ApiResponse<List<Endpoint>> localVarResp = getEndpointWithHttpInfo(param);
        return localVarResp.getData();
    }

    /**
     * 获取签名节点入口
     * 获取签名节点入口
     * @param param param (required)
     * @return ApiResponse&lt;List&lt;Endpoint&gt;&gt;
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
    public ApiResponse<List<Endpoint>> getEndpointWithHttpInfo(Map<String, String> param) throws ApiException {
        okhttp3.Call localVarCall = getEndpointValidateBeforeCall(param, null);
        Type localVarReturnType = new TypeToken<List<Endpoint>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取签名节点入口 (asynchronously)
     * 获取签名节点入口
     * @param param param (required)
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
    public okhttp3.Call getEndpointAsync(Map<String, String> param, final ApiCallback<List<Endpoint>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEndpointValidateBeforeCall(param, _callback);
        Type localVarReturnType = new TypeToken<List<Endpoint>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
