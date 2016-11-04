package com.galaxy.fym.test;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by Administrator on 2016/10/23.
 * 检索速度比较的程序
 */
public class Test1 {

    private static BigDecimal[] itemList = new BigDecimal[10000000];

    private static Random random = new Random();

    private static BigDecimal INDEX_VALUE = new BigDecimal(888);

    public static void setItemList() {
        itemList[0] = new BigDecimal(500);
        for (int i = 1; i < itemList.length; i++) {
            if(itemList[i-1].compareTo(BigDecimal.ZERO) == 0){
                itemList[i] = BigDecimal.ONE;
            }else if(itemList[i-1].compareTo(new BigDecimal(1000)) == 0){
                itemList[i] = new BigDecimal(999);
            }else {
                itemList[i] = itemList[i - 1].add(new BigDecimal((random.nextInt(2) == 0 ? 1 : -1)));
            }
        }
    }

    public static void getIndex(BigDecimal[] itemList){
        int size = 0;
        for (int i = 0; i < itemList.length; i++) {
            if(INDEX_VALUE.compareTo(itemList[i]) == 0){
                size++;
            }else{
                i = i - 1 + INDEX_VALUE.subtract(itemList[i]).abs().intValue();
            }
        }
        System.out.println("总共" + size + "与指定值相同");
    }
    public static int abs(int value){
        if(value >= 0){
            return value;
        }else{
            return (-value);
        }
    }

    public static void main(String args[]) {
        setItemList();
        Long start = System.currentTimeMillis();
        int size = 0;
        for(BigDecimal i : itemList){
            if(INDEX_VALUE.compareTo(i) == 0){
                size++;
            }
        }
        System.out.println("总共" + size + "与指定值相同");
        Long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start) + "ms");

        start = System.currentTimeMillis();
        getIndex(itemList);
        end = System.currentTimeMillis();
        System.out.print("用时：" + (end - start) + "ms");
    }
}
