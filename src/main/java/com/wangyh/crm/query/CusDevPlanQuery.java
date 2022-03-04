package com.wangyh.crm.query;

import com.wangyh.crm.base.BaseQuery;

/**
 * 客户开发计划的查询类
 */
public class CusDevPlanQuery extends BaseQuery {

    private Integer saleChanceId; //营销机会主键

    public Integer getSaleChanceId() {
        return saleChanceId;
    }

    public void setSaleChanceId(Integer saleChanceId) {
        this.saleChanceId = saleChanceId;
    }
}
