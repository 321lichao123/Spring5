package com.atguigu.Test;

import com.atguigu.autowire.Emp;
import com.atguigu.bean.LifeBean;
import com.atguigu.collectiontype.Book;
import com.atguigu.collectiontype.Course;
import com.atguigu.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.AbstractDocument;

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
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        //book.getBookDetail();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Course mybean = context.getBean("mybean", Course.class);
        System.out.println(mybean);
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        LifeBean lifeBean = context.getBean("lifeBean", LifeBean.class);
        System.out.println("第四步 获取bean对象");
        System.out.println(lifeBean);

        // bean销毁需要手动调用, ApplicationContext没有close方法因此需要强转为ClassPathXmlApplicationContext()
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println("emp = " + emp);
    }
}
