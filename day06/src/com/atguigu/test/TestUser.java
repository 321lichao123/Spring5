package com.atguigu.test;

import com.atguigu.entity.User;
import com.atguigu.serive.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestUser
 * @Description
 * @Author 12468
 * @Date 2021/12/14 23:24
 * @Version 1.0
 */
public class TestUser {
    @Test
    public void accountTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void accountTest2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        System.out.println("context = " + context);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
