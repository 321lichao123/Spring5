package com.atguigu.demoreactor.controller;

import com.atguigu.demoreactor.entity.User;
import com.atguigu.demoreactor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @ClassName UserController
 * @Description
 * @Author 12468
 * @Date 2021/12/19 21:08
 * @Version 1.0
 */
@RestController
public class UserController {

    // 注入service
    @Autowired
    private UserService userService;

    // id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable int id) {
        return userService.getUserById(id);
    }

    // 查询所有
    @GetMapping("/user")
    public Flux<User> getUsers() {
        return userService.getAllUser();
    }

    // 添加
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@RequestBody User user) {
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }
}
