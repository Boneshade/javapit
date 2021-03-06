package com.njnx.base;

/**
 * @author xubr 2021/3/6
 * 测试 使用匿名内部类 + 实例化代码块儿 = 使用两个大括号进行初始化
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student("徐博然"){
            @Override
            public String getName() {
                return super.getName()+"6b";
            }
        };
        System.out.println(student.getName());
    }

}
