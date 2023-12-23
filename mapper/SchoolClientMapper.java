package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.SchoolClient;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchoolClientMapper extends BaseMapper<SchoolClient> {
}
