package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("school_client")
public class SchoolClient {
    private Integer id;
    private String clientNumber;
    private String schoolName;
    private String personName;
    private String password;
    private String phone;
    private String role;
    private String nickname;
    private String email;
    private String address;
    private String avatarURL;
}
