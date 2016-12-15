package com.galaxy.fym.test;

/**
 * Created by fengyiming on 2016/12/14.
 */
public class Test6 {

    public static void main(String args[]) {
//        System.out.println(0.05 + 0.01);
//        System.out.println(1.0 - 0.42);
//        System.out.println(4.015 * 100);
//        System.out.println(123.3 / 100);
        double a = 5.9;
        double b = 0.1;
        System.out.println(a * b);
    }

    public static String getHexString(double d) {
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < 18; i++) {
            double x = d * 2;
            if (x >= 1) {
                s.append(1);
            } else {
                s.append(0);
            }
            d = x;
        }
        return s.toString();
    }
}
