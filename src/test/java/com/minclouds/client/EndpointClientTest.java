package com.minclouds.client;

import com.minclouds.ApiException;
import com.minclouds.api.EndpointApi;
import com.minclouds.model.Endpoint;
import org.junit.Test;

import java.util.List;

public class EndpointClientTest {
    private final EndpointApi api = new EndpointApi();


    /**
     * 获取签名节点入口
     * <p>
     * 获取签名节点入口
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEndpointTest() throws ApiException {
        Minclouds.init("AkLUYYbNEU1W", "4290bd77728daac510ad1fb634cc54f3");
        EndpointClient client = new EndpointClient(api);
        List<Endpoint> endpoints = client.getEndpoint();
        System.out.println(endpoints);
    }
}
