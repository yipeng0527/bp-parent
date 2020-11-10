package com.bp.mall.service.impl;

import com.bp.mall.sao.BusinessSAO;
import com.bp.mall.service.MallService;
import com.bp.mall.util.BusinessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author yipeng
 * @Date 2020/11/10 15:30
 * @Version 1.0
 * @Desc
 */
@Service
public class MallServiceImpl implements MallService {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BusinessSAO businessSAO;

    @Override
    public BusinessResponse getMallList() {
//        List<ServiceInstance> list = discoveryClient.getInstances("bp-business");
//        String targetUrl = list.stream().map(si -> si.getUri() + "/bp-business/merchant/list").findFirst().get();
//        BusinessResponse response = restTemplate.getForObject(targetUrl, BusinessResponse.class);

        BusinessResponse response = businessSAO.getBusinessList();
        return response;
    }
}
