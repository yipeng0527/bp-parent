package com.bp.business.convers;

import com.bp.business.po.MerchantPO;
import com.bp.business.vo.request.MerchantRequest;

import java.util.UUID;

/**
 * @Author yipeng
 * @Date 2020/11/14 16:43
 * @Version 1.0
 * @Desc
 */
public class MerchantConver {
    public static MerchantPO getMerchantPO(MerchantRequest request) {
        MerchantPO merchantPO = new MerchantPO();
        merchantPO.setName(request.getName());
        merchantPO.setAddress(request.getAddress());
        return merchantPO;
    }
}
