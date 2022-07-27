package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.EndpointApi;
import com.minclouds.model.Endpoint;
import com.minclouds.util.AES;
import com.minclouds.util.Md5;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointClient {
    EndpointApi api;

    public EndpointClient() {
        this.api = new EndpointApi();
    }

    public EndpointClient(EndpointApi api) {
        this.api = api;
    }

    public List<Endpoint> getEndpoint() throws ApiException {
        Map<String, String> param = new HashMap<>();
        String accessKey = Minclouds.getAccessKey();
        String secret = Minclouds.getAccessSecret();
        String version = Minclouds.getVersion();
        String type = Minclouds.getType();
        String timestamp = String.valueOf(System.currentTimeMillis());
        String source = accessKey + version + timestamp + secret;
        String data = "";
        if (type.equals("md5"))
            data = Md5.md5(source.getBytes(StandardCharsets.UTF_8));
        else
            data = AES.encrypt(source, secret);
        param.put("access_key", accessKey);
        param.put("version", version);
        param.put("type", type);
        param.put("data", data);
        param.put("timestamp", timestamp);
        return api.getEndpoint(param);
    }
}