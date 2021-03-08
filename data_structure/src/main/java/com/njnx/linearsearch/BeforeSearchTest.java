package com.njnx.linearsearch;

/**
 * @author xubr 2021/3/8
 */
public class BeforeSearchTest {

    public static void main(String[] args) {
        Integer[] arr = {14, 89, 14, 35, 32, 26};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 16) {
                System.out.println("找到了");
                return;
            }
        }
        System.out.println("-1");
    }

}
