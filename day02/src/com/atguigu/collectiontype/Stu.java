package com.atguigu.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Stu
 * @Description
 * @Author 12468
 * @Date 2021/12/12 22:19
 * @Version 1.0
 */
public class Stu {
    private String[] arr;
    private List<String > list;
    private Map<String, String> map;
    private Set<String> set;
    private List<Course> courses;

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void getStuDetail() {
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(courses);
    }
}
