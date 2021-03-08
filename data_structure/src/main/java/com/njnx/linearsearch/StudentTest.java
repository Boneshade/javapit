package com.njnx.linearsearch;

/**
 * @author xubr 2021/3/8
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student("kk");
        student.setAge(129);
        student.setName("xubr");
        student.setSex(0);
        System.out.println(student.equals(129));
    }


}
