package com.wangyh.crm.query;

import com.wangyh.crm.base.BaseQuery;

/**
 *客户订单的查询类
 */
public class CustomerOrderQuery extends BaseQuery {

    private Integer cusId; //客户ID

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }
}
