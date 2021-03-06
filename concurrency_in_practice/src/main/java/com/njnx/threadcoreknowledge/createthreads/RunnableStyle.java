package com.njnx.threadcoreknowledge.createthreads;

/**
 * @author xubr 2021/3/6
 * @description: 用runnable 方式创建线程
 */
@SuppressWarnings("all")
public class RunnableStyle implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("用户Runnable方法实现线程");
    }
}
