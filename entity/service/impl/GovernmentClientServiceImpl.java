package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.GovernmentClient;
import com.example.springboot.entity.mapper.GovernmentClientMapper;
import com.example.springboot.entity.service.IGovernmentClientService;
import org.springframework.stereotype.Service;

@Service
public class GovernmentClientServiceImpl extends ServiceImpl<GovernmentClientMapper, GovernmentClient> implements IGovernmentClientService {
}
