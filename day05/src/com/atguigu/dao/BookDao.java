package com.atguigu.dao;

import com.atguigu.entity.Book;

import java.util.List;

/**
 * @ClassName Book
 * @Description $
 * @Author 12468
 * @Date 2021/12/13 23:08
 * @Version 1.0
 */
public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void deleteBook(String id);

    int queryCount();

    Book queryBookForById(String id);

    List<Book> queryBookForList();

    void batchBook(List<Object[]> books);

    void batchUpdate(List<Object[]> books);

    void batchDeleteBook(List<Object[]> ids);
}
