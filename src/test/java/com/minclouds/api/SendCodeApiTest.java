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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SendCodeApi
 */
@Ignore
public class SendCodeApiTest {

    private final SendCodeApi api = new SendCodeApi();

    
    /**
     * SendCode发送验证码
     *
     * SendCode发送验证码
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendCodeTest() throws ApiException {
        String name = null;
        String response = api.sendCode(name);

        // TODO: test validations
    }
    
}
