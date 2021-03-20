package com.henjie.demo01;

/**
 * @Description: 代理角色：中介
 */
public class Proxy implements Rent{
    private Host host;  //组合优于继承原则

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        seeHome();
        host.rent();    //代理帮助房东租房子
        fare();
        hetong();
    }

    //中介提供的其他服务
    //看房
    public void seeHome(){
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

    //签合同
    public void hetong(){
        System.out.println("签租赁合同");
    }
}
