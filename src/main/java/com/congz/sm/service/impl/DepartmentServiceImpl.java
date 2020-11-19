package com.congz.sm.service.impl;

import com.congz.sm.dao.DepartmentDao;
import com.congz.sm.entity.Department;
import com.congz.sm.factory.DaoFactory;
import com.congz.sm.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/18
 **/
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        } catch (SQLException e) {
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;
    }
}
