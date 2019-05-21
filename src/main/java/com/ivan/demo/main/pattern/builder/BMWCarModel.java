package com.ivan.demo.main.pattern.builder;

public class BMWCarModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马车启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车按喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎声");
    }
}
