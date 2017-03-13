package com.galaxy.fym.thread;

/**
 * Created by fengyiming on 2017/2/25.
 */
public class ThreadModle extends Thread {

    private String threadName;

    private Thread otherThread;

    private long sleepTime;

    public ThreadModle() {

    }

    public ThreadModle(String name, long sleepTime) {
        this.threadName = name;
        this.sleepTime = sleepTime;
    }


    public ThreadModle(String name, long sleepTime, Thread otherThread) {
        this.threadName = name;
        this.sleepTime = sleepTime;
        this.otherThread = otherThread;
    }

    public void run() {
        try {
            if (otherThread != null) {
                otherThread.join();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + " add" + i);
                sleep(sleepTime);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }
}
