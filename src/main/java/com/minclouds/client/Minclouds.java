package com.minclouds.client;

import com.minclouds.ApiClient;
import com.minclouds.Configuration;
import com.minclouds.util.StringUtils;

public class Minclouds {

    public static final String type_md5 = "md5";
    public static final String type_aes = "aes";

    private static String accessKey;
    private static String accessSecret;

    private static String type;

    private static String version;

    static ApiClient client = Configuration.getDefaultApiClient();

    public static void init(String accessKey, String accessSecret) {
        init(null, accessKey, accessSecret);
    }

    public static void init(String basePath, String accessKey, String accessSecret) {
        if (StringUtils.isNotBlank(basePath)) {
            client.setBasePath(basePath);
        }
        Minclouds.accessKey = accessKey;
        Minclouds.accessSecret = accessSecret;
        client.setUserAgent("minclouds-java-sdk-1.0");
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
        Minclouds.type = type;
    }

    public static String getVersion() {
        if (StringUtils.isBlank(version))
            version = "1";
        return version;
    }

    public static void setVersion(String version) {
        Minclouds.version = version;
    }
}
