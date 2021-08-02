package com.hazhir.services;

import com.hazhir.consumer.Consumer;
import com.hazhir.producer.Producer;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerService
{
    public void call() throws InterruptedException
    {
        List<Integer> list = new LinkedList<>();

        Thread[] threads = {
                new Thread(new Producer(list)),
                new Thread(new Producer(list)),
                new Thread(new Consumer(list)),
                new Thread(new Consumer(list))
        };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread: threads) {
            thread.join();
        }

        System.out.println("Finished:" + list.size());
    }
}
