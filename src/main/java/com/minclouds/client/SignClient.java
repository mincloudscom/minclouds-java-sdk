package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.IPhoneApi;
import com.minclouds.util.AES;
import com.minclouds.util.Md5;
import com.minclouds.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class SignClient {
    IPhoneApi api;

    public SignClient() {
    }

    public SignClient(IPhoneApi api) {
        this.api = api;
    }

    public void register(String shortenOrAppUuid, String udid) throws ApiException {
        register(shortenOrAppUuid, udid, null, null, null, null);
    }

    /**
     * @param shortenOrAppUuid: 支持短码或者APP的Uuid
     * @param udid              注册设备的UDID
     * @throws ApiException
     */
    public void register(String shortenOrAppUuid, String udid, String authCode, String separate, String channelName, String channelValue) throws ApiException {
        Map<String, String> param = new HashMap<>();
        String accessKey = Minclouds.getAccessKey();
        String timestamp = String.valueOf(System.currentTimeMillis());
        String version = Minclouds.getVersion();
        String secret = Minclouds.getAccessSecret();
        String type = Minclouds.getType();
        String source = accessKey + shortenOrAppUuid + udid + version + timestamp + secret;
        String data = "";
        if (type.equals("md5"))
            data = Md5.md5(source.getBytes(StandardCharsets.UTF_8));
        else
            data = AES.encrypt(source, secret);
        param.put("access_key", accessKey);
        param.put("shorten", shortenOrAppUuid);
        param.put("udid", udid);
        param.put("version", version);
        param.put("type", type);
        param.put("data", data);
        param.put("timestamp", timestamp);
        if (StringUtils.isNotBlank(authCode)) {
            param.put("auth_code", authCode);
        }
        if (StringUtils.isNotBlank(separate)) {
            param.put("separate", separate);
        }
        if (StringUtils.isNotBlank(authCode)) {
            param.put("channel_name", channelName);
        }
        if (StringUtils.isNotBlank(authCode)) {
            param.put("channel_value", channelValue);
        }
        api.register(param);
    }
}
