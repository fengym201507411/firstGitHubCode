package com.galaxy.fym.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fengyiming on 2016/12/8.
 * 分析简单数据类型和它的封装类的== equal的比较
 */
public class Test4 {

    public static void main(String[] args) throws Exception {

        BigDecimal s = new BigDecimal("1.23");
        System.out.print(new BigDecimal(10D/3D));
    }

    private static void change(Integer a) {
        a = 6;
    }

    public static void equal() {
        int intValue = 10;
        int otherIntVlue = 10;
        System.out.println("two same int ==:" + (intValue == otherIntVlue));
        intValue = 128;
        otherIntVlue = 128;
        System.out.println("when int value > 127 ,two same int ==:" + (intValue == otherIntVlue));
        StringBuffer a = new StringBuffer();
        String stringValue = new String("123");
        String otherStringValue = new String("123");
        System.out.println("two same new string ==:" + (stringValue == otherStringValue));
        System.out.println("two same new string equal:" + (stringValue.equals(otherStringValue)));
        stringValue = "123";
        otherStringValue = "123";
        System.out.println("two same string ==:" + (stringValue == otherStringValue));
        System.out.println("two same string equal:" + (stringValue.equals(otherStringValue)));
        Integer integerValue = 10;
        Integer otherIntegerVlue = 10;
        System.out.println("two same integer ==:" + (integerValue == otherIntegerVlue));
        integerValue = new Integer(10);
        otherIntegerVlue = new Integer(10);
        System.out.println("two same new integer ==:" + (integerValue == otherIntegerVlue));
        System.out.println("two same new integer equal:" + (integerValue.equals(otherIntegerVlue)));
        integerValue = 128;
        otherIntegerVlue = 128;
        System.out.println("when integer value > 127 ,two same integer ==:" + (integerValue == otherIntegerVlue));
        System.out.println("when integer value > 127 ,two same integer equal:" + (integerValue.equals(otherIntegerVlue)));
        intValue = 10;
        integerValue = 10;
        System.out.println("two same int and integer ==:" + (intValue == integerValue));
        integerValue = new Integer(10);
        System.out.println("two same int and new integer ==:" + (intValue == integerValue));
        otherIntVlue = 128;
        otherIntegerVlue = new Integer(128);
        System.out.println("when integer value > 127 ,two same int and new new integer ==:" + (otherIntVlue == otherIntegerVlue));
        double doubleValue = 10d;
        double otherDoubleValue = 10d;
        System.out.println("two same double ==:" + (doubleValue == otherDoubleValue));
        Double doubleValue1 = 10d;
        Double otherDoubleValue1 = 10d;
        System.out.println("two same Double ==:" + (doubleValue1 == otherDoubleValue1));
        System.out.println("two same double and Double ==:" + (doubleValue == doubleValue1));
        doubleValue1 = new Double(10);
        System.out.println("two same double and new Double ==:" + (doubleValue == doubleValue1));
    }
}
