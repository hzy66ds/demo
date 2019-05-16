package com.ivan.demo.main;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class User {
    @Id
    private String id;
    private String name;
    private int age;
    private List<String> sex;
    private List<String> sex2;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSex() {
        return sex;
    }

    public void setSex(List<String> sex) {
        this.sex = sex;
    }

    public List<String> getSex2() {
        return sex2;
    }

    public void setSex2(List<String> sex2) {
        this.sex2 = sex2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
