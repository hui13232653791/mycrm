package com.wangyh.crm.query;

import com.wangyh.crm.base.BaseQuery;

/**
 * 角色的查询类
 */
public class RoleQuery extends BaseQuery {

    private String roleName; //角色名

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
