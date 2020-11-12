package com.bp.mall.sao.impl;

import com.bp.mall.sao.BusinessSAO;
import com.bp.mall.util.BusinessResponse;
import org.springframework.stereotype.Component;

/**
 * @Author yipeng
 * @Date 2020/11/11 11:54
 * @Version 1.0
 * @Desc
 */

@Component
public class BusinessFallback implements BusinessSAO {
    @Override
    public BusinessResponse getBusinessList() {
        return BusinessResponse.fail(BusinessResponse.RESPONSE_ERROR,"服务降级了");
    }
}
