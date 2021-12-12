package com.atguigu.test;

import com.atguigu.bean.Emp;
import com.atguigu.service.UserService;
import com.atguigu.srping5.Book;
import com.atguigu.srping5.Order;
import com.atguigu.srping5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
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
        /*
         ApplicationContext是BeanFactory接口的子接口，提供更多强大的功能，
         一般有开发人员进行使用。
         ApplicationContext是在加载配置文件的时候就会创建对象

        */
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        /*
            BeanFactory是spring内部的使用，不提供开发人员进行使用，
            加载配置文件时候不会创建对象，在使用对象的时候才会创建对象
         */
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.getBookDetail();
    }

    @Test
    public void testOrder() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        order.getOrderDetail();
    }

    @Test
    public void testBookP() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book1 = context.getBean("book1", Book.class);
        book1.getBookDetail();
    }

    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    
    @Test
    public void testBea2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //Emp emp = context.getBean("emp", Emp.class);
        //Emp emp = context.getBean("emp1", Emp.class);
        Emp emp = context.getBean("emp2", Emp.class);
        emp.getEmpDetail();
    }
}
