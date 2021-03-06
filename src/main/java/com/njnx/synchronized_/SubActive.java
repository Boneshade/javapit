package com.njnx.synchronized_;

/**
 * @Author:scott
 * @Description:多线程下的安全问题
 * @Date: 2020-10-25
 */
@SuppressWarnings("all")
public class SubActive extends MainActivite {

    private int value = 1000;

    @Override
    public synchronized void run() {

        String name = Thread.currentThread().getName();
        while (true)
            if (value > 0) {
                System.out.println(name + "start:" + value);
                value--;
                System.out.println(name + "done:" + value);
            } else {
                break;
            }
    }
}
