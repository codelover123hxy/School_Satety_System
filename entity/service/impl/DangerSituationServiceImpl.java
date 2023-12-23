package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.DangerSituation;
import com.example.springboot.entity.mapper.DangerSituationMapper;
import com.example.springboot.entity.service.IDangerSituationService;
import org.springframework.stereotype.Service;

@Service
public class DangerSituationServiceImpl extends ServiceImpl<DangerSituationMapper, DangerSituation> implements IDangerSituationService {

}
