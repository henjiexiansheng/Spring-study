package com.henjie.demo02;

//代理角色
public class UserServiceProxy implements UserService{
    //代理角色代理的是真实角色，所以要引进实体类
    private UserServiceImpl userService;


    //Spring推荐使用set方法注入
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceProxy() {
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg){
        System.out.println("[Debug] 使用了"+msg+"方法");
    }
}
