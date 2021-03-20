package com.henjie.demo02;

//客户
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();    //客户想要调用服务
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);      //客户通过代理，帮助他完成服务
        proxy.add();

    }
}
