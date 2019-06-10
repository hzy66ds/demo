package com.ivan.demo.main.controller;

import com.ivan.demo.main.model.Student;
import com.ivan.demo.main.myStudy.Guavatest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "guavacache测试相关接口")
public class GuavaController {


    @Autowired
    private Guavatest guavatest;

    @GetMapping("/guava/get")
    @ApiOperation("通过key获取缓存")
    public List<String> getFromGuavaCache(String key) {
        return guavatest.get(key);
    }

    @GetMapping("/student")
    @ApiOperation("获取students")
    public List<Student> getStudent(String key) {
        return new ArrayList<>();
    }
}
