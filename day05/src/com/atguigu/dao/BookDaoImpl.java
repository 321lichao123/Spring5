package com.atguigu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName BookDaoImpl
 * @Description
 * @Author 12468
 * @Date 2021/12/13 23:09
 * @Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao{

    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
