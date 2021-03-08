package com.njnx.linearsearch;

/**
 * @author xubr 2021/3/8
 */
public class Student {

    private String name;

    private Integer age;

    private Integer sex;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


    @Override
    public boolean equals(Object obj) {


        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        //如果两者类型不等
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Student another = (Student) obj;
        return this.name.equalsIgnoreCase(another.name);
    }
}
