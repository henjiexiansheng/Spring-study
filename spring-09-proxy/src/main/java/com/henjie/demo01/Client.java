package com.henjie.demo01;

/**
 * @Description: 客户：租房的人
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();  //租客要找房东
        //代理
        Proxy proxy = new Proxy(host);  //通过中介找房东
        proxy.rent();
    }
}
