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

import com.minclouds.ApiException;
import com.minclouds.model.CodeRequest;
import com.minclouds.model.UdidInstall;
import com.minclouds.model.UdidProduct;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UdidApi
 */
@Ignore
public class UdidApiTest {

    private final UdidApi api = new UdidApi();

    
    /**
     * 增加授权码个数
     *
     * 增加授权码个数
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void budCodeTest() throws ApiException {
        CodeRequest codeRequest = null;
        Integer response = api.budCode(codeRequest);

        // TODO: test validations
    }
    
    /**
     * UDID付费安装检查
     *
     * UDID付费安装检查
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkUdidTest() throws ApiException {
        UdidInstall udidInstall = null;
        Integer response = api.checkUdid(udidInstall);

        // TODO: test validations
    }
    
    /**
     * UDID付费产品价格
     *
     * UDID付费产品价格
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUdidProductTest() throws ApiException {
        String userUuid = null;
        UdidProduct response = api.getUdidProduct(userUuid);

        // TODO: test validations
    }
    
}
