package com.wangyh.crm.query;

import com.wangyh.crm.base.BaseQuery;

/**
 * 流失客户暂缓表的查询类
 */
public class CustomerReprieveQuery extends BaseQuery {

    // 流失客户ID
    private Integer lossId;

    public Integer getLossId() {
        return lossId;
    }

    public void setLossId(Integer lossId) {
        this.lossId = lossId;
    }
}
