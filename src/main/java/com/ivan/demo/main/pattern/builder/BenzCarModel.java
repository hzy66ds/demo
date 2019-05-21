package com.ivan.demo.main.pattern.builder;

public class BenzCarModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停车");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车按喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎声");
    }
}
