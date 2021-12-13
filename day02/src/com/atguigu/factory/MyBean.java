package com.atguigu.factory;

import com.atguigu.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {
    // 可以修改返回类的类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
