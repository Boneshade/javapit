package com.njnx.synchronized_;

/**
 * @Author:scott
 * @Description：
 * @Date: 2020-10-25
 */
@SuppressWarnings("all")
public class Main {


    public static void main(String[] args) {
//        Active active = new Active();
//        SubActive subActive = new SubActive();
//
//        Thread thread1 = new Thread(active, "thread1");
//        Thread thread2 = new Thread(active, "thread2");
//        Thread thread3 = new Thread(active, "thread3");
//        Thread thread4 = new Thread(active, "thread4");
//        Thread thread5 = new Thread(active, "thread5");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();

        synchronized (Main.class) {
            System.out.println("synchronized");
        }
    }


}
