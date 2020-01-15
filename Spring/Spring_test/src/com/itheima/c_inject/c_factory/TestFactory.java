package com.itheima.c_inject.c_factory;

public class TestFactory {
    public  UserService createService(){
        return new UserServiceImpl();
    }
}
