package com.ivan.demo.main.pattern;


import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class patternTest {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = null;
        System.out.println(CollectionUtils.isNotEmpty(list2));
    }

}
