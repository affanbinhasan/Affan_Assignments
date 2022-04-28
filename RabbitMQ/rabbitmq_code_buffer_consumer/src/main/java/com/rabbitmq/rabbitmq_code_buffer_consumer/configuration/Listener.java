package com.rabbitmq.rabbitmq_code_buffer_consumer.configuration;

import com.rabbitmq.rabbitmq_code_buffer_consumer.model.Customer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.rabbitmq.rabbitmq_code_buffer_consumer.configuration.RabbitMQConfig;

@Component
public class Listener {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void listener(Customer customer){
        System.out.println(customer.toString());
    }
}
