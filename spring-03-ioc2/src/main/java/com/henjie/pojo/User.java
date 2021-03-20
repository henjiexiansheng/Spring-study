package com.henjie.pojo;

/**
 * @Auther: henjie
 * @Date: 2021/2/17 - 02 - 17 - 10:49
 * @Description: com.henjie.pojo
 * @version: 1.0
 */
public class User {
    private String name;

//    public User() {
//        System.out.println("User的无参构造");
//    }

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void show(){
       System.out.println("name="+name);
   }
}
