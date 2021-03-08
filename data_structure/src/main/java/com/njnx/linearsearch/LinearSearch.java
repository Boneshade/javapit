package com.njnx.linearsearch;

/**
 * @author xubr 2021/3/8
 */
public class LinearSearch {

    public static <E> int search(E[] arr, E target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

//        int res = LinearSearch.search(data, 16);
//        System.out.println(res);
//
//        int res2 = LinearSearch.search(data, 666);
//        System.out.println(res2);


        Student[] students = {new Student("xubr"), new Student("kk"), new Student("jbk")};
        Student kk = new Student("KK");
        int res = LinearSearch.search(students, kk);
        System.out.println(res);


    }

}
