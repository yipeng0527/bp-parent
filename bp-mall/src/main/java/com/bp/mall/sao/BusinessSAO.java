package com.bp.mall.sao;

import com.bp.mall.sao.impl.BusinessFallback;
import com.bp.mall.sao.impl.BusinessFallbackFactory;
import com.bp.mall.util.BusinessResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author yipeng
 * @Date 2020/11/10 16:01
 * @Version 1.0
 * @Desc
 */
@FeignClient(name = "bp-business",fallback = BusinessFallback.class)
public interface BusinessSAO {

    @RequestMapping("/bp-business/merchant/list")
    BusinessResponse getBusinessList();
}
