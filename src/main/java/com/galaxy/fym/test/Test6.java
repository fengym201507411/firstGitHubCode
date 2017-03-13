package com.galaxy.fym.test;

import com.alibaba.fastjson.JSONObject;
import com.galaxy.fym.common.sta.StaticTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by fengyiming on 2016/12/14.
 */
public class Test6 {

    public static void main(String args[]) {
        List list = new ArrayList();
        Set set = new HashSet(list);
        list = new ArrayList(set);
        yunsuanfu();
        JSONObject object = new JSONObject();
        Object o = new Object();
    }

    public static void printStatciFiel() {
        System.out.println("statictest 里的static属性值为：" + StaticTest.STATIC_VALUE);
        StaticTest.STATIC_VALUE++;
        System.out.println("外部操作加1后，statictest 里的static属性值为：" + StaticTest.STATIC_VALUE);
        StaticTest test1 = new StaticTest();
        test1.STATIC_VALUE++;
        System.out.println("test1操作加1后，statictest 里的static属性值为：" + test1.STATIC_VALUE);
        StaticTest test2 = new StaticTest();
        test2.STATIC_VALUE++;
        System.out.println("test2操作加1后，statictest 里的static属性值为：" + test1.STATIC_VALUE);
        System.out.println("statictest 里的static属性值为：" + test1.STATIC_VALUE);
    }

    public static void printStatciMethod() {
        StaticTest test1 = new StaticTest();
        test1.print();
        StaticTest test2 = new StaticTest();
    }


    /**
     * 运算符测试代码
     */
    public static void yunsuanfu() {
        int a = -7;
        int b = 8;
        System.out.println("a 与 b：" + (a & b));
        System.out.println("a 或 b：" + (a | b));
        System.out.println("a 异或 b：" + (a ^ b));
        System.out.println("a 取反：" + (~a));
        System.out.println("a 左移两位：" + (a << 2));
        System.out.println("a 右移两位：" + (a >> 2));
    }
}
