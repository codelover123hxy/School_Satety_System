package com.example.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.annotation.MyLog;
import com.example.springboot.common.Result;
import com.example.springboot.entity.GovernmentClient;
import com.example.springboot.service.IGovernmentClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/government_client")
public class GovernmentClientController {
    @Resource
    private IGovernmentClientService governmentClientService;

    //新增或者更新
    @MyLog(value = "新增政府管理员")
    @PostMapping
    public Result save(@RequestBody GovernmentClient governmentClient) {
        governmentClientService.saveOrUpdate(governmentClient);
        return Result.success();
    }

    @MyLog(value = "删除政府管理员")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        governmentClientService.removeById(id);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(governmentClientService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@RequestParam Integer id) {
        return Result.success(governmentClientService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam String name,
                           @RequestParam Integer pageSize) {
        QueryWrapper<GovernmentClient> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(governmentClientService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

}
