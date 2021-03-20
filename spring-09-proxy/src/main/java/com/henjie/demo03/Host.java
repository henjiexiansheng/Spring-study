package com.henjie.demo03;

/**
 * @Description: 真实角色：房东，房东需要租房
 */
public class Host implements Rent {
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
