package com.atguigu.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable  // 将当前类作为配置类，替换xml配置文件
@ComponentScan(basePackages = {"com.atguigu"}) // 相当于xml配置文件中context:component-scan的作用
public class SpringConfig {
}
