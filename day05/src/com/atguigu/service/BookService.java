package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BookService
 * @Description
 * @Author 12468
 * @Date 2021/12/13 23:08
 * @Version 1.0
 */
@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;


}
