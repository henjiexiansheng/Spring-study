package com.henjie.pojo;

/**
 * @Auther: henjie
 * @Date: 2021/2/24 - 02 - 24 - 9:09
 * @Description: com.henjie.pojo
 * @version: 1.0
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
