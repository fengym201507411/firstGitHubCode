package com.galaxy.fym.test;

/**
 * Created by fengyiming on 2016/12/7.
 */
public class Test2 {

    public volatile static int TEST_VALUE = 0;

    public static void main(String[] args) throws Exception {
        thread1();
        thread2();
    }

    public static void thread1() throws Exception {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    TEST_VALUE++;
                    System.out.println("thread11111:" + TEST_VALUE);
                }
            }
        };
        runnable.run();
    }

    public static void thread2() throws Exception {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    TEST_VALUE++;
                    System.out.println("thread2:" + TEST_VALUE);
                }
            }
        };
        runnable.run();
    }
}
