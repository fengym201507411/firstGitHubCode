package com.galaxy.fym;

import com.galaxy.fym.common.CommonTest;
import com.galaxy.fym.front.FrontTest;
import com.galaxy.fym.job.JobTest;
import com.galaxy.fym.pay.Pay;
import com.galaxy.fym.remote.RemoteTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fengyiming on 2016/6/24.
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void out(){
        logger.debug("Main debug");
        logger.info("Main info");
        logger.warn("Main warm");
        logger.error("Main error");
    }

    public static void main(String[] args){
        Main.out();
        CommonTest.out();
        FrontTest.out();
        JobTest.out();
        RemoteTest.out();
        Pay.out();
    }
}
