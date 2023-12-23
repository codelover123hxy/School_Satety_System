package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.entity.SaftyStaff;
import com.example.springboot.service.ISaftyStaffService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/safty_staff")
public class SaftyStaffController {

    @Resource
    private ISaftyStaffService saftyStaffService;

    //新增或者更新
    @PostMapping
    public Result save(@RequestBody SaftyStaff saftyStaff){
        saftyStaffService.saveOrUpdate(saftyStaff);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(@PathVariable Integer modelId) {
        saftyStaffService.removeById(modelId);
        return Result.success();
    }

    @GetMapping
    public Result findAll() { return Result.success(saftyStaffService.list());}

    @GetMapping("/{modelId}")
    public Result findOne(@PathVariable Integer modelId){
        return Result.success(saftyStaffService.getById(modelId));
    }

}
