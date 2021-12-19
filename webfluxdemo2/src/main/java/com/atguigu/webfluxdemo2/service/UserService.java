package com.atguigu.webfluxdemo2.service;

import com.atguigu.webfluxdemo2.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @ClassName UserService
 * @Description $
 * @Author 12468
 * @Date 2021/12/19 20:34
 * @Version 1.0
 */
public interface UserService {
    // 根据id查询用户
    Mono<User> getUserById(int id);

    // 查询所有用户
    Flux<User> getAllUser();

    // 添加用户
    Mono<Void> saveUserInfo(Mono<User> user);
}
