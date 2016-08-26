package com.galaxy.fym.test;


import com.galaxy.fym.service.ServiceTest;
import com.galaxy.fym.serviceimpl.ServiceImplTest2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fengyiming on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class FirstTest {

    private ServiceTest serviceTest = new ServiceImplTest2();

    @Test
    public void test(){
        serviceTest.out();
    }
}