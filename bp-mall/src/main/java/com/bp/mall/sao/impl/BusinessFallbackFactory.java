package com.bp.mall.sao.impl;

import com.bp.mall.sao.BusinessSAO;
import com.bp.mall.util.BusinessResponse;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author yipeng
 * @Date 2020/11/11 11:58
 * @Version 1.0
 * @Desc
 */
@Component
public class BusinessFallbackFactory implements FallbackFactory<BusinessSAO> {

    private static Logger logger = LoggerFactory.getLogger(BusinessFallbackFactory.class);

    @Override
    public BusinessSAO create(Throwable throwable) {
        return new BusinessSAO() {
            @Override
            public BusinessResponse getBusinessList() {
                logger.info(throwable.getMessage());
                return BusinessResponse.fail(BusinessResponse.RESPONSE_ERROR, "服务降级的方法");
            }
        };
    }
}
