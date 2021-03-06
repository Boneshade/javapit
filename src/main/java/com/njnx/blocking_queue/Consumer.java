package com.njnx.blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author:scott
 * @Description:消费者(阻塞队列)
 * @Date: 2020-10-25
 */
@SuppressWarnings("all")
public class Consumer implements Runnable {

    private final ArrayBlockingQueue<Integer> blockingDeque;

    public Consumer(ArrayBlockingQueue<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = blockingDeque.take();
                System.out.println("Consume: " + value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumer Done!");
    }
}
