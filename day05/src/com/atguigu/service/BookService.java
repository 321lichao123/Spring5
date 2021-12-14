package com.atguigu.service;

import com.atguigu.dao.BookDao;
import com.atguigu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BookService
 * @Description
 * @Author 12468
 * @Date 2021/12/13 23:08
 * @Version 1.0
 */
@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加方法
    public void addBook(Book book) {
        bookDao.add(book);
    }

    // 更新方法
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    // 删除方法
    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    // 查询数据个数
    public int queryCount() {
        return bookDao.queryCount();
    }

    // 查询数据返回查询的图书
    public Book queryForById(String id) {
        return bookDao.queryBookForById(id);
    }

    // 查询数据返回数据列表
    public List<Book> queryForList() {
        return bookDao.queryBookForList();
    }

    // 批量添加数组
    public void batchAdd(List<Object[]> books) {
        bookDao.batchBook(books);
    }

    // 批量修改
    public void batchUpdate(List<Object[]> books) {
        bookDao.batchUpdate(books);
    }

    // 批量删除
    public void batchDelete(List<Object[]> ids) {
        bookDao.batchDeleteBook(ids);
    }

}
