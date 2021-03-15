package com.njnx.seletionsort;

/**
 * @author xubr 2021/3/15
 * <h1>选择排序算法<h1/>
 */
public class SelectionSort {

    private SelectionSort() {
    }

    /**
     * <h2>方法上继承是调用接口<h2/>
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                //表明arr[j]比arr[minIndex]小
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    //student类的思路:arr[minIndex]会比arr[j]小,则,minIndex放的是大值,则是重小到大排序
                    minIndex = j;

            }

            swap(arr, i, minIndex);
        }
    }

    /**
     * <h2>先将当前第一层循环的值放在临时变量,
     * 再将当前最小位置的值放入第一层循环的i中,再将临时变量放入以前所以为的最小值中<h2/>
     * @param arr
     * @param i
     * @param minIndex
     * @param <E>
     */
    private static <E> void swap(E[] arr, int i, int minIndex) {
        E temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {

        Integer[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        for (int e : arr)
            System.out.print(e + " ");
            System.out.println();


        Student[] students = {new Student("Alice", 98),
                new Student("Bobo", 100),
                new Student("Charles", 66)};
        SelectionSort.sort(students);
        for (Student student : students)
            System.out.print(student + " ");
            System.out.println();

    }


}
