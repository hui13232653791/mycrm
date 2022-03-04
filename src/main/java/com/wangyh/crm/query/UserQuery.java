package com.wangyh.crm.query;

import com.wangyh.crm.base.BaseQuery;

/**
 * 用户的查询类
 */
public class UserQuery extends BaseQuery {

    private String userName; //用户名
    private String email; //邮箱
    private String phone; //手机号

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
