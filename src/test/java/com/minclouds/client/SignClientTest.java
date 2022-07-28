package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.IPhoneApi;
import com.minclouds.api.UdidApi;
import com.minclouds.model.UdidProduct;
import org.junit.Test;

public class SignClientTest {

    private final IPhoneApi api = new IPhoneApi();


    /**
     * iPhone设备注册
     * <p>
     * iPhone设备注册
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerTest() throws ApiException {
        SignClient client = new SignClient(api);
        Minclouds.init("", "");
        client.register("", "");
    }

    @Test
    public void getUdidProductTest() throws ApiException {
        Minclouds.init("", "");
        UdidApi udidApi = new UdidApi();
        String userUuid = "";
        UdidProduct response = udidApi.getUdidProduct(userUuid);
        System.out.println(response);
    }
}