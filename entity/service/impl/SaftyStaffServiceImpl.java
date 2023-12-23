package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.SaftyStaff;
import com.example.springboot.entity.mapper.SaftyStaffMapper;
import com.example.springboot.entity.service.ISaftyStaffService;
import org.springframework.stereotype.Service;

@Service
public class SaftyStaffServiceImpl extends ServiceImpl<SaftyStaffMapper, SaftyStaff> implements ISaftyStaffService {
}
