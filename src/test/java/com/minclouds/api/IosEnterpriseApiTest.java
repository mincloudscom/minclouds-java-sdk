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
import com.minclouds.model.BuyMonthRequest;
import com.minclouds.model.BuyMonthResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IosEnterpriseApi
 */
@Ignore
public class IosEnterpriseApiTest {

    private final IosEnterpriseApi api = new IosEnterpriseApi();

    
    /**
     * 包年包月服务购买
     *
     * IOS企业签名包年包月服务购买
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void buyMonthTest() throws ApiException {
        BuyMonthRequest request = null;
        BuyMonthResponse response = api.buyMonth(request);

        // TODO: test validations
    }
    
    /**
     * 检查企业签名包年包月服务是否可用
     *
     * 检查企业签名包年包月服务是否可用：当用户没有企业证书的时候，将不可用
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkMonthTest() throws ApiException {
        BuyMonthRequest request = null;
        BuyMonthResponse response = api.checkMonth(request);

        // TODO: test validations
    }
    
    /**
     * 查询是否偶可用的企业证书
     *
     * 查询是否偶可用的企业证书
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hasValidCertTest() throws ApiException {
        String userUuid = null;
        Boolean response = api.hasValidCert(userUuid);

        // TODO: test validations
    }
    
    /**
     * 校验P12证书的接口
     *
     * 校验P12证书的接口，当重签用户进入签名流程，如果之前签名的安装包数据还存在，通过该接口可以校验P12证书是否有效，如果有效，则直接使用之前的包分发，否则进入重签获取证书流程
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isValidCertTest() throws ApiException {
        String certUuid = null;
        Boolean response = api.isValidCert(certUuid);

        // TODO: test validations
    }
    
}
