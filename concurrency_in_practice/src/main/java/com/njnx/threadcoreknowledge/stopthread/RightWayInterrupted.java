package com.njnx.threadcoreknowledge.stopthread;

/**
 * @author xubr 2021/3/10
 */
public class RightWayInterrupted {

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){

                }
            }
        });

        //启动线程
        threadOne.start();
        //设置中断标志
        threadOne.interrupt();
        //获取中断标志
        System.out.println("isInterrupted:"+threadOne.isInterrupted());
        //获取中断标志并重置
        System.out.println("isInterrupted: " + Thread.interrupted());

        System.out.println("isInterrupted: " + threadOne.isInterrupted());
    }

}
