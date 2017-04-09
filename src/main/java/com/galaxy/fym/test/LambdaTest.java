package com.galaxy.fym.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fengyiming on 2017/3/13.
 */
public class LambdaTest {


    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Integer num : nums) {
            map.put(num, num);
        }
        System.out.println(map.get(1L));

    }
}
