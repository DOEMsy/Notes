package com.itheima.c_inject.c_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testi {
    @org.junit.Test       //声明测试，则不需要写main
    public void demo01(){
        //无Spring写法
        TestFactory testFactory = new TestFactory();    //通过实例工厂获得实例对象
        UserService test1 = testFactory.createService();

        //spring方法
        ApplicationContext testContext = new ClassPathXmlApplicationContext("com/itheima/c_inject/c_factory/beans.xml");
        UserService test2 = (UserService) testContext.getBean("UserServiceID");
        test2.addUser();
    }
}
