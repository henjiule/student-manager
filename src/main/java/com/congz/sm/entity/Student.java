package com.congz.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Student
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/8
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String id;
    private Integer classId;
    private String studentName;
    private String phone;
    private Short gender;
    private Date birthday;
    private String avatar;
    private String address;
}