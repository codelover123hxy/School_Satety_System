package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.SchoolStaff;
import com.example.springboot.entity.mapper.SchoolStaffMapper;
import com.example.springboot.entity.service.ISchoolStaffService;
import org.springframework.stereotype.Service;

@Service
public class SchoolStaffServiceImpl extends ServiceImpl<SchoolStaffMapper, SchoolStaff> implements ISchoolStaffService {
}
