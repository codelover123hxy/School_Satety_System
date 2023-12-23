package com.example.springboot.entity.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("alarm")
public class Alarm {
    private Integer alarmId;
    private String name;
    private Integer frequency;
}
