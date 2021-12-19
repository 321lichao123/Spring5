package com.atguigu.webfluxdemo2;

import com.atguigu.webfluxdemo2.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @ClassName Client
 * @Description
 * @Author 12468
 * @Date 2021/12/19 22:53
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        WebClient webClient = WebClient.create("http://192.168.1.7:53282");
        // 根据id查询
        String id = "1";

        User block = webClient.get().uri("users/{id}", id).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class).block();
        System.out.println("block = " + block.getName());
    }
}
