package com.example.springboot.entity.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("log")
public class Log {
    private Integer id;
    private String staffNumber;
    private String username;
    private String operation;
    private String method;
    private String params;
    private String ip;
    private String createDate;
    private Boolean isDelete;
}
