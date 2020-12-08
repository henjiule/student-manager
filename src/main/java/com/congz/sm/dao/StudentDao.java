package com.congz.sm.dao;

import com.congz.sm.vo.StudentVo;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    /**
     * 查询所有学生（视图对象）
     *
     * @return 学生视图列表数据
     * @throws SQLException 异常
     */
    List<StudentVo> selectAll() throws SQLException;
}
