package com.baidu.test;

import com.baidu.service.UserService;
import com.baidu.service.imp.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void run(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService service = ac.getBean("userService", UserServiceImpl.class);
        service.login();
    }
}
