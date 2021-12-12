package com.atguigu.collectiontype;

/**
 * @ClassName Course
 * @Description
 * @Author 12468
 * @Date 2021/12/12 22:39
 * @Version 1.0
 */
public class Course {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
