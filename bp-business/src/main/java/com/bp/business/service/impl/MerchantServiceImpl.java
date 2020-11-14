package com.bp.business.service.impl;

import com.bp.business.convers.MerchantConver;
import com.bp.business.dao.MerchantDAO;
import com.bp.business.po.MerchantPO;
import com.bp.business.service.MerchantService;
import com.bp.business.util.BusinessResponse;
import com.bp.business.vo.request.MerchantRequest;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author yipeng
 * @Date 2020/11/10 15:05
 * @Version 1.0
 * @Desc
 */
@Service
public class MerchantServiceImpl implements MerchantService {

    private final static Logger logger = LoggerFactory.getLogger(MerchantServiceImpl.class);

    @Autowired
    private MerchantDAO merchantDAO;

    @Override
    public BusinessResponse getMerchantList() {
        List<MerchantPO> list = this.merchantDAO.getMerchantList();
        return BusinessResponse.ok(list);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BusinessResponse addMerchant(MerchantRequest request) {
        MerchantPO merchatPO = MerchantConver.getMerchantPO(request);
        int result = this.merchantDAO.insert(merchatPO);
        logger.info("addMerchant result:{}", result);
        return BusinessResponse.ok(null);
    }
}
