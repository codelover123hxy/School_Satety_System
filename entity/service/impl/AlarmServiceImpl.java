package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.Alarm;
import com.example.springboot.entity.mapper.AlarmMapper;
import com.example.springboot.entity.service.IAlarmService;
import org.springframework.stereotype.Service;

@Service
public class AlarmServiceImpl extends ServiceImpl<AlarmMapper, Alarm> implements IAlarmService {

}
