package com.congz.sm.factory;

import com.congz.sm.service.AdminService;
import com.congz.sm.service.ClazzService;
import com.congz.sm.service.DepartmentService;
import com.congz.sm.service.impl.AdminServiceImpl;
import com.congz.sm.service.impl.ClazzServiceImpl;
import com.congz.sm.service.impl.DepartmentServiceImpl;

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
public static DepartmentService getDepartmentServiceInstance() {
        return new DepartmentServiceImpl();
}
    public static ClazzService getClazzServiceInstance() {

        return new ClazzServiceImpl();
    }
}
