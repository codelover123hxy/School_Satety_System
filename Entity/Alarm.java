package com.example.springboot.entity.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("alarm")
public class Alarm {
    private Integer alarmId;
    private String name;
    private Integer frequency;
}
