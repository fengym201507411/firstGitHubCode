package com.galaxy.fym.serviceimpl;

import com.galaxy.fym.service.ServiceTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by fengyiming on 2016/7/29.
 */
@Service
public class ServiceImplTest implements ServiceTest {

    private final static Logger logger = LoggerFactory.getLogger(ServiceImplTest.class);

    public final static String NAME = "ServiceImplTest";

    public void out() {
        logger.debug("ServiceTest debug");
        logger.info("ServiceTest info");
        logger.warn("ServiceTest warm");
        logger.error("ServiceTest error");
        System.out.print("ServiceImplTest1111111111111111");
    }
}
