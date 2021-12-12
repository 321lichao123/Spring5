package com.atguigu.service;

import com.atguigu.dao.UserDao;

/**
 * @ClassName UserService
 * @Description
 * @Author 12468
 * @Date 2021/12/12 21:29
 * @Version 1.0
 */
public class UserService {

    private UserDao userDao;

    public void add() {
        System.out.println("add........");
        userDao.updata();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
