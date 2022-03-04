package com.wangyh.crm.query;

import com.wangyh.crm.base.BaseQuery;

/**
 * 客户订详情的查询类
 */
public class OrderDetailsQuery extends BaseQuery {

    private Integer orderId; //订单ID

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
