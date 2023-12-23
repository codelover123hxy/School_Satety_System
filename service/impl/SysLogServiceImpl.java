package com.example.springboot.service.impl;

import com.example.springboot.entity.SysLog;
import com.example.springboot.mapper.SysLogMapper;
import com.example.springboot.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 青哥哥
 * @since 2023-01-07
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
