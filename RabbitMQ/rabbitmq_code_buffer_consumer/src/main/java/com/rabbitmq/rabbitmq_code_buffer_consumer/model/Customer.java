package com.rabbitmq.rabbitmq_code_buffer_consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private String id;
    private String name;
    private int age;

}
