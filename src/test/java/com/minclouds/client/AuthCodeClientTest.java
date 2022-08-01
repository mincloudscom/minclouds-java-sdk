package com.minclouds.client;

import com.minclouds.ApiException;
import org.junit.Test;

public class AuthCodeClientTest {
    @Test
    public void createCommonAuthCodeTest() throws ApiException {
        SDK.init("", "");
        AuthCodeClient client = new AuthCodeClient();
        String authCode = client.createCommonAuthCode();
        System.out.println(authCode);
    }
}
