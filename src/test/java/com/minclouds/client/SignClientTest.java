package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.IosDeviceApi;
import com.minclouds.api.UdidApi;
import com.minclouds.model.UdidProduct;
import org.junit.Test;

public class SignClientTest {

    private final IosDeviceApi api = new IosDeviceApi();

    @Test
    public void registerTest() throws ApiException {
        SignClient client = new SignClient(api);
        SDK.init("", "");
        client.register("", "");
    }

    @Test
    public void getUdidProductTest() throws ApiException {
        SDK.init("", "");
        UdidApi udidApi = new UdidApi();
        String userUuid = "";
        UdidProduct response = udidApi.getUdidProduct(userUuid);
        System.out.println(response);
    }
}