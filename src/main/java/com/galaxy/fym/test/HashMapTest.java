package com.galaxy.fym.test;

import com.galaxy.fym.mvc.model.ClassDocument;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by fengyiming on 2017/2/8.
 */
public class HashMapTest {


    public static void main(String[] args) {
        final Map map = new HashMap(10);
        Runnable thread1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(i, i);
                    System.out.println("1111 add" + i);
                }
            }
        };
        Runnable thread2 = new Runnable() {
            public void run() {
                for (int i = 100000; i < 150000; i++) {
                    map.put(i, i);
                    System.out.println("2222 add" + i);
                }
            }
        };
        thread1.run();
        thread2.run();
    }

    private static void map(){
        Map map = new HashMap(10);
        ClassDocument classDocument1 = new ClassDocument();
        ClassDocument classDocument2 = new ClassDocument();
        classDocument1.setIndex(1);
        classDocument2.setIndex(1);
        map.put("111", 111);
        map.put("222", "123");
        map.put("333", 333);
        map.put("111", "4444");
        map.put(classDocument1, 11111);
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        System.out.println(map.get(classDocument2));
        System.out.println(map.get("333"));
        System.out.println(map.size());
        for (int i = 0; i < 50; i++) {
            map.put(i, i);
        }
        Map hashtable = new Hashtable();
    }
}
