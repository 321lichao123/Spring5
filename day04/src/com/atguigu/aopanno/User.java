package com.atguigu.aopanno;

import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description 被增强类
 * @Author 12468
 * @Date 2021/12/13 21:38
 * @Version 1.0
 */
@Component
public class User {
    public void add() {
        System.out.println("add.....");
    }
}
