package com.henjie.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: henjie
 * @Date: 2021/2/24 - 02 - 24 - 10:58
 * @Description: com.henjie.pojo
 * @version: 1.0
 */
public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
