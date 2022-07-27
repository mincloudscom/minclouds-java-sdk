package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.IPhoneApi;
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
        Minclouds.init("AkLUYYbNEU1W", "4290bd77728daac510ad1fb634cc54f3");
        client.register("X4gNs01", "d00865d577d69049b616e106f70bb66c88ed68b4");
    }
}