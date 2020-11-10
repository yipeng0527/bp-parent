package com.bp.business.po;

import com.bp.business.util.GsonUtil;

/**
 * @Author yipeng
 * @Date 2020/11/10 15:08
 * @Version 1.0
 * @Desc
 */
public class MerchantPO {

    private String name;

    private String address;

    public MerchantPO() {
    }

    public MerchantPO(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public MerchantPO setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public MerchantPO setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
