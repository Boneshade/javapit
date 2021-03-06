package com.njnx.base;

/**
 * @author xubr 2021/3/6
 */
public class Student {

    private String name;

    {
        System.out.println("看看你啥时候执行");
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
        System.out.println("构造方法执行");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
