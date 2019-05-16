package com.ivan.demo.main.controller;


import com.ivan.demo.main.User;
import com.ivan.demo.main.service.MongoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private MongoDbService mongoDbService;

    @GetMapping("/mongo/findOne")
    public User findOne(@RequestParam String id) {
        return mongoDbService.getUserById(id);
    }

    @GetMapping("/mongo/findOne2")
    public List<User> findOneByOne(@RequestParam String sex) {
        return mongoDbService.getUserBySex(sex);
    }

    @GetMapping("/mongo/exist")
    public List<User> exist(@RequestParam String filed) {
        return mongoDbService.exists(filed);
    }

    @GetMapping("/mongo/findList")
    public List<User> findByFields(@RequestParam String sex1, @RequestParam String sex2) {
        return mongoDbService.findByFields(sex1, sex2);
    }

    @GetMapping("/mongo/insert")
    public User insert() {
        return mongoDbService.insert();
    }

    @GetMapping("/test")
    public String test() {
        try {
            test1();
            return "";
        } catch (Exception e) {
            return e + e.getMessage();
        }
    }

    private void test1() {
        throw new IllegalArgumentException("error!");
    }
}
