package com.example.springboot.entity.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("safty_staff")
public class SaftyStaff {
    private Integer modelId;
    private String staffNumber;
    private String username;
    private String nickname;
    private String password;
    private String phone;
    private String grade;
    private String createTime;
    private String role;
    private String email;
    private String address;
    private String area;
}
