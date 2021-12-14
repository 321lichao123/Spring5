package com.atguigu.dao;

/**
 * @ClassName UserDao
 * @Description $
 * @Author 12468
 * @Date 2021/12/14 23:12
 * @Version 1.0
 */
public interface UserDao {

    void addMoney(String username);
    void reduceMoney(String username);
}
