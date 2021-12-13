package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 在注解里面value属性值可以省略不写
// 默认值是类名，首字母小写
@Service(value = "userService") // 相当于<bean id="userService"></bean>,其中value就是相当于bean标签中的id
public class UserService {
    @Value(value = "abc")
    private String name;

    // 1、添加类型属性 2、不需要添加set方法  3、添加属性注解
    //@Autowired // 根据类型进行注入
    //@Qualifier(value = "userDaoImpl1") // 根据名称进行注解，但是要根上面的@Autowired一起使用，因为一个接口有多个实现类
    //@Resource // 根据类型进行注解
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    public void add() {
        System.out.println("add......." + name);
        userDao.add();
    }
}
