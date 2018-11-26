package com.telran.producer.kafkaproducerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    @PostMapping("/send")
    public void sendData(@RequestBody String message) {
        kafkaTemplate.send("Topic1", "key", message);
    }
}
