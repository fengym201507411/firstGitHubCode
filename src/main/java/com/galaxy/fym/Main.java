package com.galaxy.fym;

import com.galaxy.fym.mvc.common.SpringMVCAnnotationUtils;
import com.galaxy.fym.mvc.model.ClassDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by fengyiming on 2016/6/24.
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void out() throws ClassNotFoundException {
        Class.forName("asdasd");
    }

    public static void main(String[] args) throws IOException {
        List<ClassDocument> list = SpringMVCAnnotationUtils.getAllController("com.galaxy.fym");
    }

}
