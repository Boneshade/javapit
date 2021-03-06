package com.njnx.synchronized_;

@SuppressWarnings("all")
public class MainActivite implements Runnable {

    private int value = 1000;

    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            if (value > 0) {
                System.out.println(name + "start:" + value);
                value--;
                System.out.println(name + "done:" + value);
            } else {
                break;
            }
        }

    }
}
