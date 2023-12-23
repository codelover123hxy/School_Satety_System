package com.example.springboot.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.entity.File;
import com.example.springboot.entity.mapper.FileMapper;
import com.example.springboot.entity.service.IFileService;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
