package com.atguigu.webfluxdemo2.entity;

/**
 * @ClassName User
 * @Description
 * @Author 12468
 * @Date 2021/12/19 20:30
 * @Version 1.0
 */
public class User {
    private String name;
    private String gender;
    private Integer age;



    public User(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
