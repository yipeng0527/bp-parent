package com.bp.business.dao;

import com.bp.business.po.MerchantPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author yipeng
 * @Date 2020/11/14 16:06
 * @Version 1.0
 * @Desc
 */
@Repository
public interface MerchantDAO {

    /**
     * 获取商户列表
     * @return
     */
    List<MerchantPO> getMerchantList();

    /**
     * 插入商户信息
     * @param merchatPO
     * @return
     */
    int insert(MerchantPO merchatPO);
}
