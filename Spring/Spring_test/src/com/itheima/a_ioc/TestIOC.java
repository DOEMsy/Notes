package com.itheima.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class TestIOC {
    @Test       //声明测试，则不需要写main
    public void demo01(){
        //之前获取实例
        UserService test1 = new UserServiceImpl();
        test1.addUser();

        //Spring方法
            //1获得容器
        String beansxmlPath = "com/itheima/a_ioc/beans.xml";
        ApplicationContext testContext = new ClassPathXmlApplicationContext(beansxmlPath);
            //2创建实例
        UserService test2 = (UserService) testContext.getBean("UserServiceID"); //从容器中获取实例，需要强转
        test2.addUser();

    }
}
