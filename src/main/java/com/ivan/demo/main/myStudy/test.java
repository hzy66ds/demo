package com.ivan.demo.main.myStudy;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * Class description
 *
 *
 * @version        Enter version here...
 * @author         zhiyuanhe
 * @date           19/05/20
 */
public class test {

    /**
     * Method description
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(get());
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public static int get() {
        int i = 0;

        try {
            throw new Exception();
        } catch (Exception e) {
            i += 1;

            return i;
        } finally {
            i += 2;

            return i;
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
