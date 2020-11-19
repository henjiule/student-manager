package com.congz.sm.dao.impl;

import com.congz.sm.dao.DepartmentDao;
import com.congz.sm.entity.Department;
import com.congz.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DepartmentDaoImpl
 * @Description 院系DAO实现类
 * @Author zhangcong
 * @Date 2020/11/18
 **/
public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public List<Department> getAll() throws SQLException {
        JdbcUtil jdbcUtil =  JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT * FROM t_department";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Department> departmentList = new ArrayList<>();
        while (rs.next()) {
        Department department = new Department();
        department.setId(rs.getInt("id"));
        department.setDepartmentName(rs.getString("department_name"));
        department.setLogo(rs.getString("logo"));
        departmentList.add(department);
    }
    rs.close();
    pstmt.close();
    JdbcUtil.closeConnection();
    return departmentList;
}
}
