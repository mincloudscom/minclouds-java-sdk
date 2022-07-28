package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.AuthCodeApi;
import com.minclouds.model.CodeType;

import java.util.Map;

public class AuthCodeClient {
    AuthCodeApi authCodeApi;

    public AuthCodeClient() {
        init();
    }

    public AuthCodeClient(AuthCodeApi authCodeApi) {
        this.authCodeApi = authCodeApi;
        init();
    }

    public void init() {
        if (null == authCodeApi)
            authCodeApi = new AuthCodeApi();
    }

    public String createAuthCode(String appUuid, CodeType codeType) throws ApiException {
        Map<String, Object> objectMap = authCodeApi.createAuthCode(appUuid, codeType.name());
        Object code = objectMap.get("code");
        int c = 0;
        if (code instanceof Integer) {
            c = (Integer) code;
        }
        if (code instanceof Double) {
            c = ((Double) code).intValue();
        }
        if (code instanceof Float) {
            c = ((Float) code).intValue();
        }
        if (c == 0 && objectMap.containsKey("data")) {
            return (String) objectMap.get("data");
        }
        return "";
    }

    /**
     * 创建APP授权码
     *
     * @param appUuid APP的UUID
     * @return
     * @throws ApiException
     */
    public String createAppAuthCode(String appUuid) throws ApiException {
        return createAuthCode(appUuid, CodeType.app);
    }

    /**
     * 创建通用授权码
     *
     * @return
     * @throws ApiException
     */
    public String createCommonAuthCode() throws ApiException {
        return createAuthCode(null, CodeType.all);
    }
}
