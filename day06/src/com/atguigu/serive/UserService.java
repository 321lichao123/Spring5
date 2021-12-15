package com.atguigu.serive;

import com.atguigu.dao.UserDao;
import com.atguigu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserService
 * @Description
 * @Author 12468
 * @Date 2021/12/14 23:11
 * @Version 1.0
 */
@Service
@Transactional(propagation = Propagation.REQUIRED) // 可以添加到类上也可以添加到方法上
public class UserService {

    // 注入dao
    @Autowired
    private UserDao userDao;

    public void accountMoney() {
        //try {
            // 第一步 开启事务

            // 第二步 进行业务操作
            userDao.reduceMoney("Lucy");
            // 模拟异常
            int i = 12 /0;
            userDao.addMoney("Mary");
            // 第三步 如果没有异常提交事务
        //} catch (Exception e) {
            // 第四步 如果出现异常事务回滚

        //}
    }
}
