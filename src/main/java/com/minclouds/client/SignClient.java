package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.IPhoneApi;
import com.minclouds.util.AES;
import com.minclouds.util.Md5;

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

    /**
     * @param shortenOrAppUuid: 支持短码或者APP的Uuid
     * @param udid              注册设备的UDID
     * @throws ApiException
     */
    public void register(String shortenOrAppUuid, String udid) throws ApiException {
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
        api.register(param);
    }
}
