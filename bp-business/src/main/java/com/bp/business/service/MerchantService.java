package com.bp.business.service;

import com.bp.business.util.BusinessResponse;
import com.bp.business.vo.request.MerchantRequest;

/**
 * @Author yipeng
 * @Date 2020/11/10 15:05
 * @Version 1.0
 * @Desc
 */
public interface MerchantService {
    /**
     * 得到商户列表
     * @return
     */
    BusinessResponse getMerchantList();

    /**
     * 新增商户信息
     * @param request
     * @return
     */
    BusinessResponse addMerchant(MerchantRequest request);
}
