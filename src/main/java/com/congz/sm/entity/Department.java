package com.congz.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Department
 * @Description 院系实体类
 * @Author zhangcong
 * @Date 2020/11/18
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    private Integer id;
    private String departmentName;
    private String logo;

    @Override
    public String toString() {
        return this.departmentName;
    }

}
