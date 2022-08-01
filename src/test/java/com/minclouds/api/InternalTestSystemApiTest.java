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
import java.math.BigDecimal;
import com.minclouds.model.PluginEntry;
import com.minclouds.model.TestSystem;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InternalTestSystemApi
 */
@Ignore
public class InternalTestSystemApiTest {

    private final InternalTestSystemApi api = new InternalTestSystemApi();

    
    /**
     * 删除系统
     *
     * 删除系统
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String uuid = null;
        Boolean response = api.delete(uuid);

        // TODO: test validations
    }
    
    /**
     * 获取内测系统最新发布版本号
     *
     * 获取内测系统最新发布版本号
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestIosVersionTest() throws ApiException {
        String response = api.getLatestIosVersion();

        // TODO: test validations
    }
    
    /**
     * 获取内测系统的插件列表
     *
     * 获取内测系统的插件列表
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPluginsTest() throws ApiException {
        String uuid = null;
        List<PluginEntry> response = api.getPlugins(uuid);

        // TODO: test validations
    }
    
    /**
     * 获取内测系统的配额
     *
     * 内测系统配额适用于使用平台提供的镜像自动或手动部署系统，该配额在充值过程中消耗，当配额不足是可以在云小朵官方后台充值
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQuotaTest() throws ApiException {
        String systemUuid = null;
        BigDecimal response = api.getQuota(systemUuid);

        // TODO: test validations
    }
    
    /**
     * 获取内测系统的信息
     *
     * 获取内测系统的信息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestSystemTest() throws ApiException {
        String uuid = null;
        TestSystem response = api.getTestSystem(uuid);

        // TODO: test validations
    }
    
    /**
     * 暂停系统
     *
     * 暂停系统
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pauseTest() throws ApiException {
        String uuid = null;
        Boolean response = api.pause(uuid);

        // TODO: test validations
    }
    
    /**
     * 重启系统
     *
     * 重启系统
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restartTest() throws ApiException {
        String uuid = null;
        Boolean response = api.restart(uuid);

        // TODO: test validations
    }
    
    /**
     * 启动系统
     *
     * 启动系统
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startTest() throws ApiException {
        String uuid = null;
        Boolean response = api.start(uuid);

        // TODO: test validations
    }
    
    /**
     * 升级系统
     *
     * 升级系统
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upgradeTest() throws ApiException {
        String uuid = null;
        Boolean response = api.upgrade(uuid);

        // TODO: test validations
    }
    
}
