package com.njnx.threadcoreknowledge.stopthread.volatiledemo;

/**
 * @author xubr 2021/3/13
 * 演示用volatile的局限,part1看似可行
 */
public class WrongWayVolatile implements Runnable {

    private volatile boolean canceled = false;

    @Override
    public void run() {
        int num = 0;
        try {
            while (num <= 100000 && !false) {
                if (num % 100 == 0) {
                    System.out.println(num + "是100的倍数");
                }
                num++;
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WrongWayVolatile r = new WrongWayVolatile();
        Thread thread = new Thread();
        thread.start();
        Thread.sleep(5000);
        r.canceled = true;
    }

}
