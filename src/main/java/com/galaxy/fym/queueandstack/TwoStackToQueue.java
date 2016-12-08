package com.galaxy.fym.queueandstack;

/**
 * Created by fengyiming on 2016/12/7.
 */
public class TwoStackToQueue {

    private StackTest stackTest1 = new StackTest();

    private StackTest stackTest2 = new StackTest();


    public void push(String value){
        stackTest1.push(value);
    }

    /**
     * 寻找第一个栈栈底
     * @return
     */
    public String pop(){
        //本次出队列的值
        String value = null;
        if(stackTest1.size() == 0){
            return value;
        }
        //将第一个栈的数据全部按栈的方式压入第二个栈，这样第二个栈出栈就是入队列的顺序的
        while (stackTest1.size() != 0) {
            String value1 = stackTest1.pop();
            stackTest2.push(value1);
        }
        //第二个栈顶出，相当于队列出最先入的那个元素
        value = stackTest2.pop();
        //再把第二个栈全部压入一个栈
        while (stackTest2.size() != 0){
            String value2 = stackTest2.pop();
            stackTest1.push(value2);
        }
        return value;
    }

}
