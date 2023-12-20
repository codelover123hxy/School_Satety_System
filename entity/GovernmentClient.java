package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("government_client")
public class GovernmentClient {
    private Integer id;
    private String clientNumber;
    private String role;
    private String nickname;
    private String phone;
    private String email;
    private String address;
    private String avatarURL;
    private String password;
}
