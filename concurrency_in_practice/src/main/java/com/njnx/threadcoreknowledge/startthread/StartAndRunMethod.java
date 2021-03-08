package com.njnx.threadcoreknowledge.startthread;

/**
 * @author xubr 2021/3/8
 */
public class StartAndRunMethod {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
        };

        //这里运行结果是main,因为由JVM创建的main方法线程和system租线程,并不会通过start来启动
        runnable.run();

        //这里的运行结果是Thread-0
        //调用start方法启动线程,start方法是被synchronized修饰的方法,可以保证线程安全
        new Thread(runnable).start();
    }

}
