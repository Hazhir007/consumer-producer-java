package com.hazhir;


import com.hazhir.services.ProducerConsumerService;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException
    {

        ProducerConsumerService service = new ProducerConsumerService();
        service.call();
    }
}
