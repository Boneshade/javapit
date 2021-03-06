package com.njnx.synchronized_;

/**
 * @Author:scott
 * @Description:对减法进行操作
 * @Date: 2020-10-25
 */
public class Active implements Runnable {

    private int value = 1000;

    @Override
    public void run() {
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
