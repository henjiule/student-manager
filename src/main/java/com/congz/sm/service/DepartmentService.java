package com.congz.sm.service;

import com.congz.sm.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> selectAll();

    /**
     *
     * @param department 入参
     * @return int
     */
    int addDepatrment(Department department);
}


