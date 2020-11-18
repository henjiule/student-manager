package com.congz.sm.factory;

import com.congz.sm.service.AdminService;
import com.congz.sm.service.impl.AdminServiceImpl;

/**
 * @ClassName ServiceFactory
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/16
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();

    }
}
