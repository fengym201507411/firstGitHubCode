package com.galaxy.fym.algorithm.maxsublist;

import java.util.*;

/**
 * Created by fengyiming on 2017/2/16.
 */
public class Test {

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        /*List<List<Integer>> allList = Search.search(Arrays.asList(2, 7, 3, 13, 6, 8));*/
        List<Integer> radomList = getRadomList();
        System.out.println("---------------随机数列-------------");
        for (Integer value : radomList) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("---------------随机数列-------------");
        List<List<Integer>> allList = Search.search(radomList);
        long after = System.currentTimeMillis();
        System.out.println("消耗时间" + (after - before) + "ms");
        //之前发现有很多重复的集合数据，后来发现是因为随机数重复了
        System.out.println("总集合长度" + allList.size());
        Set<List<Integer>> listSet = new HashSet<List<Integer>>(allList);
        System.out.println("去重后集合长度" + listSet.size());
        System.out.println("重复元素数量" + (allList.size() - listSet.size()));
        List<List<Integer>> maxList = Search.getMaxList(allList);
    }

    /**
     * 产生随机数,我产生的是0-10 10-20 20-30 30-40 每段内5个随机数
     *
     * @return
     */
    public static List<Integer> getRadomList() {
        Random random = new Random();
        int radomSize = 4;
        int scope = 10;
        int radomNum = 5;
        int size = radomSize * scope;
        List<Integer> list = new ArrayList<Integer>(size);
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>(size);
        for (int j = 0; j < radomSize; j++) {
            scope = scope + 10;
            for (int i = 0; i < radomNum; i++) {
                int value = random.nextInt(scope);
                while (map.get(value) != null) {
                    value = random.nextInt(scope);
                }
                map.put(value, true);
                list.add(value);
            }
        }
        return list;
    }
}
