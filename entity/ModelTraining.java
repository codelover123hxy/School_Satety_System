package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("model_training")
public class ModelTraining {
    private Integer modelId;
    private Integer alarmId;
    private String desc;
    private String method;
    private String dataset;
    private String model;
    private String proportion;
}
