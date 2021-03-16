package com.njnx.threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * @author xubr
 * @title: WaitNotifyReleaseOwnMonitor
 * @projectName javapit
 * @description: <h1>证明wait只释放当前的那把锁</h1>
 * @date 2021/3/1610:31
 */
public class WaitNotifyReleaseOwnMonitor {

    private static volatile Object resourceA = new Object();

    private static volatile Object resourceB = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println("ThreadA got resourceA lock");
                    synchronized (resourceB) {
                        System.out.println("ThreadA got resourceB lock.");
                        try {
                            System.out.println("Thread A release resourceA lock.");
                            resourceA.wait();
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                    }
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //如果不睡眠就无法确定ThreadA和ThreadB的执行顺序,
                    //因为start()并不是立即就会执行。
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourceA){
                    System.out.println("ThreadB got resourceA lock");
                    System.out.println("ThreadB tries to resourceB lock.");


                    //此处执行不到的原因是resourceB一直没有wait释放锁,所以此处的resourceB就拿不到锁
                    synchronized (resourceB){
                        System.out.println("ThreadB got resourceA lock");
                    }

                }
            }
        });

        thread1.start();
        thread2.start();
    }


}
