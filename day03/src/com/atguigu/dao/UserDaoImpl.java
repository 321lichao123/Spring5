package com.atguigu.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("userDaoImpl add......");
    }
}
