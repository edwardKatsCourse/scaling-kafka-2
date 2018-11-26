package com.telran.consumer.kafkaconsumerdemo.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class StringConsumer {

    @KafkaListener(topics = "Topic1")
    public void listen(@Payload String message) {
        System.out.println(message);
    }
}
