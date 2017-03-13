package com.galaxy.fym.thread;

/**
 * Created by fengyiming on 2017/2/25.
 */
public class ThreadModel2 extends Thread {

    public String number;

    public String[] res;

    public ThreadModel2() {

    }

    public ThreadModel2(String number, String[] res) {
        this.number = number;
        this.res = res;
    }

    public void run() {
        synchronized (res) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("------线程" + Thread.currentThread().getName() + "第" + (i + 1) + "次获得锁，输出" + number);
                    System.out.println("------线程" + Thread.currentThread().getName() + "通知所有线程释放资源");
                    res.notifyAll();
                    System.out.println("------线程" + Thread.currentThread().getName() + "等待资源释放");
                    if (i == 9) {
                        System.out.println("-----------------------------------------第" + Thread.currentThread().getName() + "-end-----------");
                    }
                    res.wait();
                }
            } catch (Exception e) {

            }
        }
    }
}
