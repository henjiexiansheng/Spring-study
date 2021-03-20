package com.henjie.demo04;

import com.henjie.demo02.UserService;
import com.henjie.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色：不存在
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(userService);     //设置代理的对象
        UserService proxy = (UserService) handler.getProxy();   //动态生成代理类
        proxy.add();
    }
}
