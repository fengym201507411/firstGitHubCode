package com.galaxy.fym;

/**
 * Created by fengyiming on 2016/12/15.
 */
public class Base {

    public static int BASE_VALUE  = 1;

    {
        System.out.println("代码块执行");
    }

    static {
        System.out.println("静态代码块执行");
    }

    public void print(){
        System.out.println("普通方法输出");
    }

    public static void staticPrint(){
        System.out.println("静态方法输出");
    }
}
