package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.newEntity.Log;
import com.example.springboot.mapper.newMapper.LogMapper;
import com.example.springboot.service.newService.ILogService;

public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {
}
