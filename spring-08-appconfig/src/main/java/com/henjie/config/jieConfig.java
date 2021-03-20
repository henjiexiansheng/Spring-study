package com.henjie.config;

import com.henjie.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//与@Component一样，也会被Spring容器托管，注册到容器中，因为他本来就是一个@Component
//@Configuration就是一个配置类，跟beans.xml一样
@Configuration
@ComponentScan("com.henjie.pojo")
@Import(jieConfig.class)
public class jieConfig {

    //注册一个bean，相当于之前的bean标签
    //这个方法的名字就是bean标签中的id属性
    //方法的返回值，相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();  //就是返回要注入到bean的对象
    }
}
