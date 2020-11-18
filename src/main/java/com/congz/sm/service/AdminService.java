package com.congz.sm.service;

import com.congz.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/16
 **/
public interface AdminService {
    /**
     * 管理员登入
     *
     * @param account   : 账号
     * @param password: 密码
     * @return ResultEntity: 返回结果
     */
    ResultEntity adminLogin(String account,String password);
}
