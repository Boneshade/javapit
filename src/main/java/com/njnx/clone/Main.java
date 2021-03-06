package com.njnx.clone;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:scott
 * @Description
 * @Date: 2020-10-24
 */
public class Main implements Cloneable {

    private static void canNotClone() throws CloneNotSupportedException {
        Main main = new Main();
        Object cloned = main.clone();
    }


    private static void copyTest() {
        Worker worker1 = new Worker(
                "xubr", 18, "m", "南京理工大学继续教育学院", "2000"
        );
        System.out.println("原始对象: " + worker1.getEducationInfo().getSchool());

        Worker worker2 = (Worker) worker1.clone();
        System.out.println("拷贝对象: " + worker2.getEducationInfo().getSchool());

        worker2.getEducationInfo().setSchool("南京邮电大学");
        System.out.println("原始对象: " + worker1.getEducationInfo().getSchool());
        System.out.println("拷贝对象: " + worker2.getEducationInfo().getSchool());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        //没有实现cloneAble接口会报错
//        canNotClone();

        List<Integer> test1=new ArrayList<>();
        test1.add(1);
        test1.add(2);
        test1.add(3);


        List<Integer> test2=new ArrayList<>();
        test2.add(2);
        test2.add(3);
        test2.add(4);

        System.out.println(CollectionUtils.intersection(test1,test2));


//        copyTest();
    }






}
