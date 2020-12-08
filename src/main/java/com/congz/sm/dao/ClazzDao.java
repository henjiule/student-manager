package com.congz.sm.dao;

import com.congz.sm.entity.Clazz;

import java.sql.SQLException;
import java.util.List;

public interface ClazzDao {
    /**
     *
     * @param departmentId  院系id
     * @return List<CClass> 院系班级集合
     * @throws SQLException 异常
     */

    List<Clazz> selectByDepartmentId(int departmentId) throws SQLException;


    /**
     * 新增班级
     *
     * @param clazz 入参班级实体
     * @return int
     * @throws SQLException 异常
     */
    int insertClazz(Clazz clazz) throws SQLException;
}
