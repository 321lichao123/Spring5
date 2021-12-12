package com.atguigu.bean;

/**
 * @ClassName Dept
 * @Description
 * @Author 12468
 * @Date 2021/12/12 21:44
 * @Version 1.0
 */
public class Dept {
    private String deptName;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
