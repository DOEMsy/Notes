package com.itheima.c_inject.b_static_factory;

public class TestStaticFactory {
    public static UserService createService(){
        return new UserServiceImpl();
    }
}
