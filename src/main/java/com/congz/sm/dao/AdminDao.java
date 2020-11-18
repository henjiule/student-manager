package com.congz.sm.dao;

import com.congz.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName 管理员接口
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/16
 **/
public interface AdminDao {
    /**
     *根据账号查找管理员
     *
     * @param account:账号入参
     * @return Admin:管理员信息
     * @throws java.sql.SQLException： 该方法会抛出SQL异常
     */
    Admin findAdminByAccount(String account) throws SQLException;

}
