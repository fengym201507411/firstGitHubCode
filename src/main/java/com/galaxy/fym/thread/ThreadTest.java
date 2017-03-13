package com.galaxy.fym.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by fengyiming on 2017/2/25.
 */
public class ThreadTest {


    public static void main(String[] args)  {
        lock();
    }

    public static void test1() {
        ThreadModle modle1 = new ThreadModle("THREAD111", 500);
        ThreadModle modle2 = new ThreadModle("THREAD222", 1000, modle1);
        modle1.start();
        modle2.start();
        try {
            modle1.join();
        } catch (Exception e) {

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("main add" + i);
        }
    }

    public static void test2() {
        final String[] a = {"0","1"};//以该对象为共享资源
        new Thread(new ThreadModel2("1", a), "1").start();
        new Thread(new ThreadModel2("2", a), "2").start();
        new Thread(new ThreadModel2("3", a), "3").start();
        new Thread(new ThreadModel2("4", a), "4").start();
        new Thread(new ThreadModel2("5", a), "5").start();
        new Thread(new ThreadModel2("6", a), "6").start();
    }

    public static void lock(){
        ReentrantLock lock = new ReentrantLock();
        new Thread(new ThreadLock(lock), "2").start();
        new Thread(new ThreadLock(lock), "1").start();
        new Thread(new ThreadLock(lock), "3").start();
    }
}
