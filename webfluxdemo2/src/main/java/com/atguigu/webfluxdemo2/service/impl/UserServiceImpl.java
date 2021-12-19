package com.atguigu.webfluxdemo2.service.impl;

import com.atguigu.webfluxdemo2.entity.User;
import com.atguigu.webfluxdemo2.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author 12468
 * @Date 2021/12/19 20:37
 * @Version 1.0
 */
@Repository
public class UserServiceImpl implements UserService {

    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User("lucy", "nan", 20));
        this.users.put(2, new User("mary", "nv", 22));
        this.users.put(3, new User("jack", "nan", 24));
    }

    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(user -> {
            int id = users.size() + 1;
            users.put(id, user);
        }).thenEmpty(Mono.empty());
    }
}
