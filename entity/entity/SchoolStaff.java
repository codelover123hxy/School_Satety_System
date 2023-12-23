package com.example.springboot.entity.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("school_staff")
public class SchoolStaff {
    private Integer id;
    private String schoolClientNumber;
    private String staffNumber;
}
