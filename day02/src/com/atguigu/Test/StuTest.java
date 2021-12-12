package com.atguigu.Test;

import com.atguigu.collectiontype.Book;
import com.atguigu.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName StuTest
 * @Description
 * @Author 12468
 * @Date 2021/12/12 22:22
 * @Version 1.0
 */
public class StuTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.getStuDetail();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        book.getBookDetail();
    }
}
