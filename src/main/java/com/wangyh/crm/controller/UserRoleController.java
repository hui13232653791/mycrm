package com.wangyh.crm.controller;

import com.wangyh.crm.base.BaseController;
import com.wangyh.crm.service.UserRoleService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserRoleController extends BaseController {

    @Resource
    private UserRoleService userRoleService;

}
