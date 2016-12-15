package com.galaxy.fym.test;

import com.galaxy.fym.common.sta.StaticTest;

/**
 * Created by fengyiming on 2016/12/14.
 */
public class Test6 {

    public static void main(String args[]) {
        printStatciMethod();
    }

    public static void printStatciFiel(){
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

    public static void printStatciMethod(){
        StaticTest test1 = new StaticTest();
        test1.print();
        StaticTest test2 = new StaticTest();
    }
}
