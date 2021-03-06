package com.njnx.threadcoreknowledge.createthreads.wrongways;

/**
 * @author xubr 2021/3/7
 * @Description: 匿名内部类的方式
 */
public class AnonymousInnerClassDemo {

    public static void main(String[] args) {

        //继承Thread
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}
