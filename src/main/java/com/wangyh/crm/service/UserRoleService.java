package com.wangyh.crm.service;

import com.wangyh.crm.base.BaseService;
import com.wangyh.crm.dao.UserRoleMapper;
import com.wangyh.crm.vo.UserRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserRoleService extends BaseService<UserRole,Integer> {

    @Resource
    private UserRoleMapper userRoleMapper;
}
