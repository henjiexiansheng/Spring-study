package com.henjie.pojo;

/**
 * @Auther: henjie
 * @Date: 2021/2/17 - 02 - 17 - 9:43
 * @Description: com.henjie.pojo
 * @version: 1.0
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
