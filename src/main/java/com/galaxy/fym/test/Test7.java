package com.galaxy.fym.test;

import com.galaxy.fym.mvc.model.ClassDocument;

import java.lang.reflect.Field;

/**
 * Created by fengyiming on 2017/4/9.
 */
public class Test7 {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        Class docu = Class.forName("com.galaxy.fym.mvc.model.ClassDocument");
        ClassDocument classDocument = new ClassDocument();
        Field[] fields = docu.getDeclaredFields();
        for (Field field : fields) {
            if ("index".equals(field.getName())) {
                field.setAccessible(true);
                field.set(classDocument, null);
            }
        }
        System.out.print(classDocument.getIndex());
    }
}
