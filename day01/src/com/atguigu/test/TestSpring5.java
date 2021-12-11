package com.atguigu.test;

import com.atguigu.srping5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring5
 * @Description
 * @Author 12468
 * @Date 2021/12/12 0:08
 * @Version 1.0
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
        // 1、加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
