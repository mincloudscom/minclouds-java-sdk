package com.minclouds.client;

import com.minclouds.ApiClient;
import com.minclouds.ApiException;
import com.minclouds.Configuration;
import com.minclouds.api.OauthApi;
import com.minclouds.client.util.StringUtils;

public class SDK {

    public static final String type_md5 = "md5";
    public static final String type_aes = "aes";

    private static String accessKey;
    private static String accessSecret;

    private static String type;

    private static String version;

    static ApiClient client = null;

    public static void init(String accessKey, String accessSecret) throws ApiException {
        init(null, accessKey, accessSecret);
    }

    public static void init(String basePath, String accessKey, String accessSecret) throws ApiException {
        SDK.accessKey = accessKey;
        SDK.accessSecret = accessSecret;
        client = new ApiClient(basePath, accessKey, accessSecret, null);
        client.setUserAgent("minclouds-java-sdk-1.0");
        Configuration.setDefaultApiClient(client);
        OauthApi oauthApi = new OauthApi();
        String token = oauthApi.getToken(accessKey, accessSecret);
        client.setAccessToken(token);
    }

    public static String getAccessKey() {
        return accessKey;
    }

    public static String getAccessSecret() {
        return accessSecret;
    }

    public static String getType() {
        if (StringUtils.isBlank(type))
            type = type_aes;
        return type;
    }

    public static void setType(String type) {
        SDK.type = type;
    }

    public static String getVersion() {
        if (StringUtils.isBlank(version))
            version = "1";
        return version;
    }

    public static void setVersion(String version) {
        SDK.version = version;
    }
}
