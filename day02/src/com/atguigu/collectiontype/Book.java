package com.atguigu.collectiontype;

import java.util.List;

/**
 * @ClassName Book
 * @Description
 * @Author 12468
 * @Date 2021/12/12 22:46
 * @Version 1.0
 */
public class Book {

    private List<String> bookName;

    public void setBookName(List<String> bookName) {
        this.bookName = bookName;
    }

    public void getBookDetail() {
        System.out.println(bookName);
    }
}
