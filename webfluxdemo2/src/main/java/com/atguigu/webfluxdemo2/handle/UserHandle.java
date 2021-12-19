package com.atguigu.webfluxdemo2.handle;

import com.atguigu.webfluxdemo2.entity.User;
import com.atguigu.webfluxdemo2.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

/**
 * @ClassName UserHandle
 * @Description
 * @Author 12468
 * @Date 2021/12/19 21:51
 * @Version 1.0
 */
public class UserHandle {

    private final UserService userService;

    public UserHandle(UserService userService) {
        this.userService = userService;
    }

    // 根据id查询
    public Mono<ServerResponse> getUserById(ServerRequest request) {
        // 获取id值
        int id = Integer.parseInt(request.pathVariable("id"));
        // 空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        // 调用service方法得到数据
        Mono<User> userMono = this.userService.getUserById(id);
        // 使用Reactor操作符flatMap,把userMono继续转换
        return userMono
                .flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .body(fromObject(person))).switchIfEmpty(notFound);
    }

    // 查询所有
    public Mono<ServerResponse> getAllUsers(ServerRequest request) {
        // 调用service得到结果
        Flux<User> users = this.userService.getAllUser();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(users, User.class);
    }

    // 添加
    public Mono<ServerResponse> saveUser(ServerRequest request) {
        // 得到user对象
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.saveUserInfo(userMono));
    }
}
