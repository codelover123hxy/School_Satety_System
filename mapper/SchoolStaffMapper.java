package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.SchoolStaff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchoolStaffMapper extends BaseMapper<SchoolStaff> {
}
