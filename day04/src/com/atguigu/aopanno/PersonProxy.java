package com.atguigu.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName PersonProxy
 * @Description
 * @Author 12468
 * @Date 2021/12/13 22:22
 * @Version 1.0
 */
@Component
@Aspect
@Order(1) // 数值越小优先级越大
public class PersonProxy {
    @Before(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person before.....");
    }
}
