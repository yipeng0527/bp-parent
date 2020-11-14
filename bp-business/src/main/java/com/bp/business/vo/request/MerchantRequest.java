package com.bp.business.vo.request;

import com.bp.business.util.GsonUtil;

import java.io.Serializable;

/**
 * @Author yipeng
 * @Date 2020/11/14 16:39
 * @Version 1.0
 * @Desc
 */
public class MerchantRequest implements Serializable {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
