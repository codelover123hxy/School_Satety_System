package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.entity.DangerSituation;
import com.example.springboot.service.IDangerSituationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/danger_situation")
public class DangerSituationController {

    @Resource
    private IDangerSituationService dangerSituationService;

    //新增或者更新
    @PostMapping
    public Result save(@RequestBody DangerSituation dangerSituation) {
        dangerSituationService.saveOrUpdate(dangerSituation);
        return Result.success();
    }

    @DeleteMapping("/{dangerId}")
    public Result delete(@PathVariable Integer dangerId) {
        dangerSituationService.removeById(dangerId);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(dangerSituationService.list());
    }

    @GetMapping("/{dangerId}")
    public Result findOne(@PathVariable Integer dangerId) {
        return Result.success(dangerSituationService.getById(dangerId));
    }
}
