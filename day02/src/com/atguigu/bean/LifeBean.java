package com.atguigu.bean;

public class LifeBean {
    public LifeBean() {
        System.out.println("第一步 通过构造器创建bean实例");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 通过set方法为bean实例属性设置值");
    }

    // 创建bean需要调用的初始化方法（初始化方法需要手动创建）
    public void initMethod() {
        System.out.println("第三步 对bean的初始化方法进行配置");
    }

    public void destroyMethod() {
        System.out.println("第三步 对bean销毁");
    }

}
