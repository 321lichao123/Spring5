package com.atguigu.dao;

import com.atguigu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description
 * @Author 12468
 * @Date 2021/12/14 23:12
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao{

    // 注入jdbcTemplate
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney(String username) {
        String sql = "update t_account set money = money + 100 where username = ?";
        int update = jdbcTemplate.update(sql, username);
        System.out.println(update);
    }

    @Override
    public void reduceMoney(String username) {
        String sql = "update t_account set money = money - 100 where username = ?";
        int update = jdbcTemplate.update(sql, username);
        System.out.println(update);
    }
}
