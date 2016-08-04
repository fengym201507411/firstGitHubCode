package com.galaxy.fym.action.test;

import com.galaxy.fym.model.FieldAnnotation;
import com.galaxy.fym.model.FieldEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fengyiming on 2016/6/27.
 */
@Controller
@RequestMapping(value = "test",name = "主要的action测试类")
public class TestAction {

    private final static Logger logger = LoggerFactory.getLogger(TestAction.class);

    @FieldAnnotation(name = "SIZE参数",type = FieldEnum.UNKNOW)
    public final static Integer TEST_SIZE = 1;

    @FieldAnnotation(name = "公共参数",type = FieldEnum.UNKNOW)
    public String PUBLIC_TEST_ACTION = "publicTestAction";

    @FieldAnnotation(name = "私有参数",type = FieldEnum.UNKNOW)
    private String PRIVATE_TEST_ACTION = "privateTestAction";

    @RequestMapping(value = "test",name = "test")
    @ResponseBody
    public ModelMap test(){
        ModelMap mp = new ModelMap();
        mp.put("123",123);
        return mp;
    }

    @RequestMapping(value = "test1",name = "test1")
    public ModelAndView test1(String id){
        ModelAndView mp = new ModelAndView();
        mp.setViewName("test");
        return mp;
    }

    @RequestMapping(value = "test2",name = "test2")
    public ModelAndView test2(@RequestParam(value = "id123")String id){
        ModelAndView mp = new ModelAndView();
        mp.setViewName("test");
        return mp;
    }

    @RequestMapping(value = "test3",name = "test3")
    public ModelAndView test3(@RequestParam(required = true, defaultValue = "1")String id){
        ModelAndView mp = new ModelAndView();
        mp.setViewName("test");
        return mp;
    }

    @RequestMapping(value = "test4",name = "test4")
    public ModelAndView test4(@RequestParam(value = "id",required = false, defaultValue = "1")String id){
        ModelAndView mp = new ModelAndView();
        mp.setViewName("test");
        return mp;
    }

    @RequestMapping(value = "test5",name = "test5")
    public ModelAndView test5(@RequestParam(value = "id",required = false, defaultValue = "1",name = "id参数")String id,String name){
        ModelAndView mp = new ModelAndView();
        mp.setViewName("test");
        return mp;
    }
}
