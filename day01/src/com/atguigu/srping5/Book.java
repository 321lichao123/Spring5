package com.atguigu.srping5;

/**
 * @ClassName Book
 * @Description 演示使用set方法进行注入属性
 * @Author 12468
 * @Date 2021/12/12 20:47
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private String address;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getBookDetail() {
        System.out.println(bookName + ":" + author + ":" + address);
    }
}
