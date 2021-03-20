package com.henjie.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//组件，等价于<bean id="user" class="com.henjie.pojo.User"/>
@Scope("singleton")
@Component
public class User {

    //注入属性，等价于<property name="name" value="迟鑫"/>
    @Value("XXX")
    public String name;

}
