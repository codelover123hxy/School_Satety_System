package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.entity.Alarm;
import com.example.springboot.service.IAlarmService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/alarm")
public class AlarmController {
    @Resource
    private IAlarmService alarmService;

    //新增或者更新
    @PostMapping
    public Result save(@RequestBody Alarm alarm){
        alarmService.saveOrUpdate(alarm);
        return Result.success();
    }

    @DeleteMapping("/{alarmId}")
    public Result deleteAlarm(@PathVariable Integer alarmId) {
        alarmService.removeById(alarmId);
        return Result.success();
    }
    @GetMapping
    public Result findAll() { return Result.success(alarmService.list()); }

    @GetMapping("/{alarmId}")
    public Result findOne(@PathVariable Integer alarmId) {
        return Result.success(alarmService.getById(alarmId));
    }

}
