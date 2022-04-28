package com.rabbitmq.rabbitmq_code_buffer.controller;

import java.util.UUID;

import com.rabbitmq.rabbitmq_code_buffer.configuration.RabbitMQConfig;
import com.rabbitmq.rabbitmq_code_buffer.model.Customer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private RabbitTemplate template;

    // @GetMapping("/")
    // public Customer getCustomer(){
        
    //     return customer;
    // }


    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer){
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, customer);
        return "succesfully published";
    }
}
