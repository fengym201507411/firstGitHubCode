package com.galaxy.fym.test;

/**
 * Created by fengyiming on 2016/12/13.
 * String的intern方法
 */
public class Test5 {


    public static void main(String[] agrs){
        System.gc();
        print1();
        System.gc();
        print2();
    }

    public static void print1(){
        //JVM常量池里没有helloworld常量，所以第一次在做intern()的时候会先将helloworld放入到常量池中，再返回该对象的引用，此时比较的是两个对象的地址，所以是true
        String s1 = new StringBuffer("hello").append("world").toString();
        System.out.println(s1.intern() == s1);
        //JVM常量池一直都有java常量，所以intern()会返回常量池的地址与s2对象的地址比较，所以是false
        String s2 = new StringBuffer("ja").append("va").toString();
        System.out.println(s2.intern() == s2);;
    }

    public static void print2(){
        //先往常量池生成hellowprld常量，这样，下面再比较的时候就会返回常量池的地址与对象比较
        String STRING_1 = "helloworld";
        String s1 = new StringBuffer("hello").append("world").toString();
        System.out.println(s1.intern() == s1);
    }
}
