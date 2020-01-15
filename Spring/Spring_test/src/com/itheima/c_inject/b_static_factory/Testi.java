package com.itheima.c_inject.b_static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testi {
    @org.junit.Test       //声明测试，则不需要写main
    public void demo01(){
        //无Spring写法
        UserService test1 = TestStaticFactory.createService();
        test1.addUser();
        //spring方法
        ApplicationContext testContext = new ClassPathXmlApplicationContext("com/itheima/c_inject/b_static_factory/beans.xml");
        UserService test2 = (UserService) testContext.getBean("UserServiceID");
        test2.addUser();
    }
}
