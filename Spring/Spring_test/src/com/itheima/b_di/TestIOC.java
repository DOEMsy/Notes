package com.itheima.b_di;

import com.itheima.a_ioc.UserService;
import com.itheima.a_ioc.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test       //声明测试，则不需要写main？？？
    public void demo00(){
        ApplicationContext testContext = new ClassPathXmlApplicationContext("com/itheima/b_di/beans.xml");
        BookService test1 = (BookService) testContext.getBean("BookServiceID");
        test1.addBook();
    }
}
