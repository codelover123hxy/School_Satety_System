package com.example.springboot.entity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.entity.DangerSituation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DangerSituationMapper extends BaseMapper<DangerSituation> {
}
