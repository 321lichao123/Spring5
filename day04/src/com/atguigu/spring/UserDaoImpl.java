package com.atguigu.spring;

/**
 * @ClassName UserDaoImpl
 * @Description
 * @Author 12468
 * @Date 2021/12/13 20:41
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a +b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
