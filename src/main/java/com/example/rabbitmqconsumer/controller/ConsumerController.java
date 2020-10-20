package com.example.rabbitmqconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/something")
    public void doSomething(){
        consumerService.doSomething();
        System.out.println("Message consumed.");
    }
}
