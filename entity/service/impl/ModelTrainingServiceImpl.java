package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.ModelTraining;
import com.example.springboot.entity.mapper.ModelTrainingMapper;
import com.example.springboot.entity.service.IModelTrainingService;
import org.springframework.stereotype.Service;

@Service
public class ModelTrainingServiceImpl extends ServiceImpl<ModelTrainingMapper, ModelTraining> implements IModelTrainingService {

}
