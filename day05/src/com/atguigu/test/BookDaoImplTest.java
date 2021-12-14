package com.atguigu.test;

import com.atguigu.entity.Book;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import static org.junit.Assert.*;

public class BookDaoImplTest {

    @Test
    public void addJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook(new Book("2", "html", "售出"));
    }

    @Test
    public void updateJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.updateBook(new Book("1", "java从入门到放弃111", "售出"));
    }

    @Test
    public void deleteJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("1");
    }

    @Test
    public void queryCountJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int i = bookService.queryCount();
        System.out.println("i = " + i);
    }

    @Test
    public void queryBookForByIdTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.queryForById("1");
        System.out.println("book = " + book);
    }

    @Test
    public void queryForListTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> books = bookService.queryForList();
        System.out.println(books);
    }

    @Test
    public void batchAddTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchsList = new ArrayList<>();
        Object[] o1 = {"3", "aa", "aa"};
        Object[] o2 = {"4", "bb", "bb"};
        Object[] o3 = {"5", "cc", "cc"};
        batchsList.add(o1);
        batchsList.add(o2);
        batchsList.add(o3);
        bookService.batchAdd(batchsList);
    }

    @Test
    public void batchUpdateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchsList = new ArrayList<>();
        Object[] o1 = {"aaaa", "aaaa", "3"};
        Object[] o2 = {"bbbb", "bbbb", "4"};
        Object[] o3 = {"cccc", "cccc", "5"};
        batchsList.add(o1);
        batchsList.add(o2);
        batchsList.add(o3);
        bookService.batchUpdate(batchsList);
    }

    @Test
    public void batchdeleteTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchsList = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchsList.add(o1);
        batchsList.add(o2);
        batchsList.add(o3);
        bookService.batchDelete(batchsList);
    }
}