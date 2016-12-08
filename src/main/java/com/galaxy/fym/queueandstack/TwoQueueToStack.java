package com.galaxy.fym.queueandstack;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by fengyiming on 2016/12/7.
 */
public class TwoQueueToStack {

    private Queue<String> queueTest1 = new ArrayBlockingQueue<String>(100);

    private Queue<String> queueTest2 = new ArrayBlockingQueue<String>(100);

    public void push(String value) {
        queueTest1.add(value);
    }

    /**
     * 寻找第一队列最后一个入队列的元素
     * @return
     */
    public String pop() {
        String value = null;
        if (queueTest1.size() == 0) {
            return value;
        }
        //计算第一个队列的元素总量，用于第二个队列的元素回归-1条数据回第一个队列
        int i = 0;
        //将第一队列按顺序移入第二队列，记住第一队列的最后一个值
        while (queueTest1.size() != 0) {
            String value1 = queueTest1.remove();
            queueTest2.add(value1);
            value = value1;
            i++;
        }
        //这里其实第二个队列已经是第一队列所有的值了，将第二队列里前-1条元素移会第一个队列
        while (i - 1 > 0) {
            String value1 = queueTest2.remove();
            queueTest1.add(value1);
            i--;
        }
        //清空第二个队列里所有元素
        queueTest2.clear();
        return value;
    }

}
