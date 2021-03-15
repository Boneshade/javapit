package com.njnx.seletionsort;

/**
 * @author xubr 2021/3/15
 */
public class Student implements Comparable<Student> {

    private String name;

    private Integer score;


    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another) {
        return another.score - this.score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s,score: %d)", name, score);
    }
}
