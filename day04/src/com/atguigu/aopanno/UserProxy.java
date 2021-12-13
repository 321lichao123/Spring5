package com.atguigu.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserProxy
 * @Description 增强类
 * @Author 12468
 * @Date 2021/12/13 21:39
 * @Version 1.0
 */
@Component
@Aspect
@Order(2)
public class UserProxy {

    // 抽取相同切入点
    @Pointcut(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void pointDom() {

    }

    @Before(value = "pointDom()")
    public void before() {
        System.out.println("User before....");
    }

    @AfterReturning(value = "pointDom()")
    public void afterReturning() {
        // 执行这个方法return之前执行 返回通知
        System.out.println("afterReturning.....");
    }

    @After(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void after() {
        // 执行这个方法之后执行，不管是否有异常都会通知 最终通知
        System.out.println("after.....");
    }

    // 异常执行
    @AfterThrowing(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("AfterThrowing.....");
    }

    // 环绕通知
    @Around(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("环绕之前.....");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕之后");
    }

}
