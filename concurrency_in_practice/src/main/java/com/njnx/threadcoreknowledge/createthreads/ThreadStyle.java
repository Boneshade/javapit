package com.njnx.threadcoreknowledge.createthreads;

/**
 * @author xubr 2021/3/6
 * @Description: 用 Thread方式来实现线程
 *
 * 继承中重写是重写父类中的方法,所以相当于是彻底将run方法给改掉了
 * 实现中的
 */
public class ThreadStyle extends Thread{

    @Override
    public void run() {
        System.out.println("调用Thread 方法来实现继承");
    }

    public static void main(String[] args) {
        //每次都需要重新new一个Thread对象
        new ThreadStyle().start();
    }

}
