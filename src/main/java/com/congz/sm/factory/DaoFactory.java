package com.congz.sm.factory;

import com.congz.sm.dao.AdminDao;
import com.congz.sm.dao.impl.AdminDaoImpl;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/16
 **/
public class DaoFactory {
    /**
     * 获得AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance() {
        return new AdminDaoImpl();
    }
}
