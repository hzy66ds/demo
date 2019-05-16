package com.ivan.demo.main.controller;

import com.ivan.demo.main.myStudy.Guavatest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuavaController {


    @Autowired
    private Guavatest guavatest;

    @GetMapping("/guava/get")
    public Integer getFromGuavaCache(String key){
        return guavatest.get(key);
    }
}
