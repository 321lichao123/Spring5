package com.atguigu.entity;

/**
 * @ClassName User
 * @Description
 * @Author 12468
 * @Date 2021/12/14 23:18
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private Integer money;

    public User() {
    }

    public User(Integer id, String username, Integer money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
