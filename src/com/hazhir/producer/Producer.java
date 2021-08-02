package com.hazhir.producer;

import java.util.List;

public class Producer implements ProducerInterface
{
    final List<Integer> list;

    public Producer(List<Integer> l)
    {
        this.list = l;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            synchronized (list) {
                int num = (int) (Math.random() * 1000);
                System.out.println("Added: " + num);
                list.add(num);
                list.notify();
            }
            try {
                Thread.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
