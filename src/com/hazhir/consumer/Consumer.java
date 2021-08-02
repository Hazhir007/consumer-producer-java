package com.hazhir.consumer;

import java.util.List;

public class Consumer implements ConsumerInterface
{
    final List<Integer> list;

    public  Consumer(List<Integer> l)
    {
        this.list = l;
    }

    @Override
    public void run()
    {
        for (int i =0; i < 100; i++) {
            synchronized (list) {
                while (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer fetch = list.remove(0);
                System.out.println("Fetched:" + fetch);
            }
        }
    }
}
