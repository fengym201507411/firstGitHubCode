package com.galaxy.fym.algorithm.maxsublist;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengyiming on 2017/2/16.
 * @author fengyiming 对int集合转化成所有可能的递增子集合
 */
public class Search {

    public static List<List<Integer>> search(List<Integer> list) {
        List<List<Integer>> allList = new ArrayList<List<Integer>>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int value = list.get(i);
            //这个集合用来存储如果当前value被加入到其他子集合的时候保存被加入的子集合的原值
            List<List<Integer>> newAllList = new ArrayList<List<Integer>>(allList.size());
            //对已存在的子集合集合遍历，判断当前元素是否小于子集合，是的话就加在结尾，另外保存当前子集合
            if(CollectionUtils.isNotEmpty(allList)) {
                for (List<Integer> subList : allList) {
                    int subSize = subList.size();
                    if (subList.get(subSize - 1) < value) {
                        newAllList.add(new ArrayList<Integer>(subList));
                        subList.add(value);
                    }
                }
            }
            //将被加入元素的子集合的原值放入到所有子集合里
            if(CollectionUtils.isNotEmpty(newAllList)){
                allList.addAll(newAllList);
            }
            //新建一个仅含当前元素的子集合
            List<Integer> newSubList = new ArrayList<Integer>(size - 1);
            newSubList.add(value);
            allList.add(newSubList);
        }
        return allList;
    }

    public static List<List<Integer>> getMaxList(List<List<Integer>> allList){
        System.out.println("---------------所有递增子集合-------------");
        int max = 0;
        List<List<Integer>> allSubList = new ArrayList<List<Integer>>();
        for (List<Integer> subList : allList) {
            for (Integer value : subList) {
                //System.out.print(value + " ");
            }
            if (subList.size() > max) {
                max = subList.size();
                allSubList = new ArrayList<List<Integer>>();
                allSubList.add(subList);
            } else if (subList.size() == max) {
                allSubList.add(subList);
            }
            //System.out.println();
        }
        System.out.println("---------------最长的子集合-------------");
        for (List<Integer> subList : allSubList) {
            for (Integer value : subList) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        return allList;
    }
}
