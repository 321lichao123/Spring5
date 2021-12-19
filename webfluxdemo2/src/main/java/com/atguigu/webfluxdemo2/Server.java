package com.atguigu.webfluxdemo2;

import com.atguigu.webfluxdemo2.handle.UserHandle;
import com.atguigu.webfluxdemo2.service.UserService;
import com.atguigu.webfluxdemo2.service.impl.UserServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;

import java.io.IOException;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @ClassName Server
 * @Description
 * @Author 12468
 * @Date 2021/12/19 22:18
 * @Version 1.0
 */
public class Server {

    public static void main(String[] args) throws Exception {
        Server server = new Server();
        server.createReactorServer();
        System.out.println("enter to exit");
        System.in.read();
    }

    // 1、创建Router路由
    public RouterFunction<ServerResponse> routerFunction() {
        // 创建handle对象
        UserService userService = new UserServiceImpl();
        UserHandle handle = new UserHandle(userService);
        // 设置路由
        return RouterFunctions.route(
                GET("/users/{id}").and(accept(MediaType.APPLICATION_JSON)), handle::getUserById
        ).andRoute(GET("/users").and(accept(MediaType.APPLICATION_JSON)), handle::getAllUsers);
    }

    // 创建服务器完成适配
    public void createReactorServer() throws IOException {
        // 路由和handler适配
        RouterFunction<ServerResponse> router = routerFunction();
        HttpHandler httpHandler = toHttpHandler(router);
        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);

        // 创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(adapter).bindNow();
    }
}
