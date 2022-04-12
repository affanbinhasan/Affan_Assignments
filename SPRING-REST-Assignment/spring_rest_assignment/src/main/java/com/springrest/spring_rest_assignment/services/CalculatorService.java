package com.springrest.spring_rest_assignment.services;

import com.springrest.spring_rest_assignment.models.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
    Calculator calculator;

    static{
        CalculatorService cal = new CalculatorService();
    }

    public Calculator createvalues(){
        Calculator cal = new Calculator(1,1);
        return cal;
    }

    public int add(Calculator value){
        createvalues();
        return value.getFirst_value() + value.getSecond_value();
    }
    public int subtract(Calculator value){
        createvalues();
        return value.getFirst_value() - value.getSecond_value();
    }
    public int multiply(Calculator value){
        createvalues();
        return value.getFirst_value() * value.getSecond_value();
    }
    public int divide(Calculator value){
        createvalues();
        return value.getFirst_value() / value.getSecond_value();
    }
}
