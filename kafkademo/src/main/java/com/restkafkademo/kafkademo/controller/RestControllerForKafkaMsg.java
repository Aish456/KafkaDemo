package com.restkafkademo.kafkademo.controller;

import com.restkafkademo.kafkademo.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {
    @Autowired
    KafkaProducer kafkaproducer;
    @GetMapping("/producerMsg")
    public String getMessageFromClient(@RequestParam("message")String message){
        kafkaproducer.sendMsgToTopic(message);
        return "Message sent Successfully to the your kafka demo topic ";
    }

}
