package com.atguigu.bean;

/**
 * @ClassName Emp
 * @Description
 * @Author 12468
 * @Date 2021/12/12 21:45
 * @Version 1.0
 */
public class Emp {
    private String empName;
    private String empGender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void getEmpDetail() {
        System.out.println(empName + ":" + empGender + ":" + dept);
    }
}
