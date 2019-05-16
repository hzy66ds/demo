package com.ivan.demo.main.myStudy;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        Map<Long, Integer> idMap = new HashMap<>();
        idMap.put(1l,1);
        idMap.put(2l,2);
        String str = JSONObject.toJSONString(idMap);
        System.out.println(str);
    }
}
