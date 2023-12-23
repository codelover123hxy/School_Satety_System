package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.SchoolClient;
import com.example.springboot.entity.mapper.SchoolClientMapper;
import com.example.springboot.entity.service.ISchoolClientService;
import org.springframework.stereotype.Service;

@Service
public class SchoolClientServiceImpl extends ServiceImpl<SchoolClientMapper, SchoolClient> implements ISchoolClientService {
}
