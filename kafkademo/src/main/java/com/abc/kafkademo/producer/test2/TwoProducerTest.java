package com.abc.kafkademo.producer.test2;

import java.io.IOException;

public class TwoProducerTest {

    public static void main(String[] args) throws IOException {
        TwoProducer producer = new TwoProducer();
        producer.sendMsg();
        System.in.read();
    }
}



