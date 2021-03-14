package com.njnx.threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * @author xubr 2021/3/14
 * <h1>展示wait和notify的基本用法 1.研究代码的执行顺序 2.证明wait释放锁<h1/>
 */
public class Wait {

    public static Object object = new Object();

    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                //1.第一步
                System.out.println(Thread.currentThread().getName() + "开始执行了");
                try {
                    //2.第二步 wait是释放锁(wait必须在synchronized修饰的方法中)
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程:"+Thread.currentThread().getName()+"获取到了锁");
            }
        }
    }



    static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                //3.第三步
                object.notify();
                //4.第四步
                System.out.println("线程"+Thread.currentThread().getName()+"调用了notify()");
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        Thread.sleep(200);
        thread2.start();
    }


}
