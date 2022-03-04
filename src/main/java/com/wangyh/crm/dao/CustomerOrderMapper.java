package com.wangyh.crm.dao;

import com.wangyh.crm.base.BaseMapper;
import com.wangyh.crm.vo.CustomerOrder;

import java.util.Map;

public interface CustomerOrderMapper extends BaseMapper<CustomerOrder, Integer> {

    //通过订单ID查询对应的订单记录
    Map<String, Object> queryOrderById(Integer orderId);

    //通过客户ID查询最后一条订单记录
    CustomerOrder queryLossCustomerOrderByCustomerId(Integer customerId);
}