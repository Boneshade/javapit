package com.njnx.blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author:scott
 * @Description
 * @Date: 2020-10-25
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> blockingDeque = new ArrayBlockingQueue<>(
                3, true
        );

        Producer producer = new Producer(blockingDeque);
        Consumer consumer = new Consumer(blockingDeque);

        new Thread(producer).start();
        new Thread(consumer).start();

    }


}
