package com.galaxy.fym.serviceimpl;

import com.galaxy.fym.service.ServiceTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fengyiming on 2016/8/25.
 * 带@Service注解的同一个接口不能有两个实现类
 */
public class ServiceImplTest2 implements ServiceTest {

    private final static Logger logger = LoggerFactory.getLogger(ServiceImplTest.class);

    public void out() {
        logger.debug("ServiceTest 2222 debug");
        logger.info("ServiceTest 2222 info");
        logger.warn("ServiceTest 2222 warm");
        logger.error("ServiceTest 2222 error");
        System.out.print("ServiceImplTest2222222222222222");
    }
}
