package com.restkafkademo.kafkademo.service;

import org.springframework.stereotype.Service;

@Service
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(topics = "kafkaDemo_Topic", groupId = "kafkaDemo_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("Received message is ::" +receivedMessage);
    }
}
