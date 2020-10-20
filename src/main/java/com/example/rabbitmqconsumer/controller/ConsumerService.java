package com.example.rabbitmqconsumer.controller;

import com.example.rabbitmqconsumer.payload.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    public void doSomething() {
        //Something happening here
    }

    @RabbitListener(queues = "${rabbitmq.queue.name}" )
    public void consumeMessage(Notification notification) {
        System.out.println("Notification type: "+notification.getNotificationType());
        System.out.println("Notification message: "+notification.getMsg());
    }
}
