package com.galaxy.fym.test;

import com.galaxy.fym.queueandstack.TwoQueueToStack;
import com.galaxy.fym.queueandstack.TwoStackToQueue;

/**
 * Created by fengyiming on 2016/12/7.
 * 栈实现队列，队列实现栈
 */
public class Test3 {

    public static void main(String[] args){
        queue();
        stack();
    }

    private static void queue(){
        TwoStackToQueue twoStackToQueue = new TwoStackToQueue();
        for(int i = 1; i < 5; i++){
            String value = twoStackToQueue.pop();
            System.out.println("出队列：" + value);
        }
        for(int i = 0; i < 9; i++){
            System.out.println("入队列：" + i);
            twoStackToQueue.push(String.valueOf(i));
        }
        for(int i = 1; i < 5; i++){
            String value = twoStackToQueue.pop();
            System.out.println("出队列：" + value);
        }
        for(int i = 9; i < 19; i++){
            System.out.println("入队列：" + i);
            twoStackToQueue.push(String.valueOf(i));
        }
        for(int i = 5; i < 14; i++){
            String value = twoStackToQueue.pop();
            System.out.println("出队列：" + value);
        }
    }

    private static void stack(){
        TwoQueueToStack twoQueueToStack = new TwoQueueToStack();
        for(int i = 1; i < 5; i++){
            String value = twoQueueToStack.pop();
            System.out.println("出栈：" + value);
        }
        for(int i = 0; i < 9; i++){
            System.out.println("入栈：" + i);
            twoQueueToStack.push(String.valueOf(i));
        }
        for(int i = 1; i < 5; i++){
            String value = twoQueueToStack.pop();
            System.out.println("出栈：" + value);
        }
        for(int i = 9; i < 14; i++){
            System.out.println("入栈：" + i);
            twoQueueToStack.push(String.valueOf(i));
        }
        for(int i = 5; i < 20; i++){
            String value = twoQueueToStack.pop();
            System.out.println("出栈：" + value);
        }
    }
}

