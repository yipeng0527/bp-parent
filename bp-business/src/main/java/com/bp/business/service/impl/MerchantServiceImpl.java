package com.bp.business.service.impl;

import com.bp.business.po.MerchantPO;
import com.bp.business.service.MerchantService;
import com.bp.business.util.BusinessResponse;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yipeng
 * @Date 2020/11/10 15:05
 * @Version 1.0
 * @Desc
 */
@Service
public class MerchantServiceImpl implements MerchantService {
    @Override
    public BusinessResponse getMerchantList() {
        List<MerchantPO> list = Lists.newArrayList(new MerchantPO("麦当劳","深圳"),new MerchantPO("欢乐谷","武汉"));
        return BusinessResponse.ok(list);
    }
}
