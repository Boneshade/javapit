package com.njnx.threadcoreknowledge.createthreads.wrongways;

/**
 * @author xubr 2021/3/7
 * @Description: Lambda表达式创建线程
 */
public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

}
