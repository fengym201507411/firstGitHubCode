package com.galaxy.fym.test;

import java.time.LocalDate;

/**
 * Created by fengyiming on 2017/4/12.
 */
public class FinallyTest {

    public static void main(String[] args) {
        while (true){
            System.out.println(1);
        }
    }

    private static String re() {
        try {
            String a = "a";
            int b = Integer.valueOf(a);
            return "re";
        } catch (Exception e) {
            return "exception";
        } finally {
            return "finally";
        }
    }
}
