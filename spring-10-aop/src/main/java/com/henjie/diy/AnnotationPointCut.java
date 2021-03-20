package com.henjie.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解方式实现AOP
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.henjie.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }

    @After("execution(* com.henjie.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.henjie.service.UserServiceImpl.*(..))")
    public void around(){
        System.out.println();
    }
}
