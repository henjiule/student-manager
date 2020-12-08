package com.congz.sm.service.impl;

import com.congz.sm.entity.Clazz;
import com.congz.sm.factory.DaoFactory;
import com.congz.sm.service.ClazzService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ClazzServiceImpl
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/8
 **/
public class ClazzServiceImpl implements ClazzService {
    @Override
    public List<Clazz> getClazzByDepId(int depId) {
        List<Clazz> list = null;
        try {
            list = DaoFactory.getClazzDaoInstance().selectByDepartmentId(depId);
        } catch (SQLException e) {
            System.err.println("根据院系id查询班级列表出现异常");
        }
        return list;
    }

    @Override
    public List<Clazz> selectAll() {
        return null;


    }

    @Override
    public int addClazz(Clazz clazz) {
        int n = 0;
        try {
            n = DaoFactory.getClazzDaoInstance().insertClazz(clazz);
        } catch (SQLException throwables) {
            System.err.println("新增班级出现异常");
        }
        return n;
    }

    @Override
    public int deleteClazz(int clazzId) {
        return 0;
    }


}
