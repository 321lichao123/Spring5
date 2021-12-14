package com.atguigu.dao;

import com.atguigu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BookDaoImpl
 * @Description
 * @Author 12468
 * @Date 2021/12/13 23:09
 * @Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {

    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book(`user_id`, `username`, `ustatus`) values(?, ?, ?)";
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("update = " + update);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username = ?, ustatus = ? where user_id = ? ";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("update = " + update);
    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println("update = " + update);
    }

    @Override
    public int queryCount() {
        String sql = "select count(*) from t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book queryBookForById(String id) {
        String sql = "select * from t_book where user_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    @Override
    public List<Book> queryBookForList() {
        String sql = "SELECT * FROM t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public void batchBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book(`user_id`, `username`, `ustatus`) values(?, ?, ?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        for (Object[] objects : batchArgs) {
            System.out.println(Arrays.toString(objects));
        }
        String sql = "update t_book set username = ?, ustatus = ? where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints);
    }

    @Override
    public void batchDeleteBook(List<Object[]> ids) {
        String sql = "delete from t_book where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, ids);
        System.out.println("ints = " + ints);
    }
}
