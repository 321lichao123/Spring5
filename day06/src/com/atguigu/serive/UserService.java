package com.atguigu.serive;

import com.atguigu.dao.UserDao;
import com.atguigu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description
 * @Author 12468
 * @Date 2021/12/14 23:11
 * @Version 1.0
 */
@Service
public class UserService {

    // 注入dao
    @Autowired
    private UserDao userDao;

    public void accountMoney() {
        userDao.reduceMoney("Lucy");
        int i = 12 /0;
        userDao.addMoney("Mary");
    }
}
