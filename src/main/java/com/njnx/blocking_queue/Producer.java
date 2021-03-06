package com.njnx.blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

/**
 * @Author:scott
 * @Description:生产者(阻塞队列)
 * @Date:2020-10-25
 */
@SuppressWarnings("all")
public class Producer implements Runnable {

    private final ArrayBlockingQueue<Integer> blockingDeque;

    private static int element = 0;

    public Producer(ArrayBlockingQueue<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }


    @Override
    public void run() {

        try {
            while (element < 100) {
                System.out.println("Produce " + element);
                blockingDeque.put(element++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Produce Done!");
    }
}
