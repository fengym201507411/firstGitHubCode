package com.galaxy.fym.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by fengyiming on 2017/2/25.
 */
public class ThreadLock extends Thread{
    private ReentrantLock lock;

    public ThreadLock() {

    }

    public ThreadLock(ReentrantLock lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "执行代码，输出" + i);
                sleep(500l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
