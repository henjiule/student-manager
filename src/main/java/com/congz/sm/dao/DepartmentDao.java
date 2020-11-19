package com.congz.sm.dao;

import com.congz.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/18
 **/
public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws java.sql.SQLException 异常
     */
    List<Department> getAll() throws SQLException;
}
