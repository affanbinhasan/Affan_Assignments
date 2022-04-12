package com.springrest.spring_rest_assignment.controllers;

import com.springrest.spring_rest_assignment.models.Calculator;
import com.springrest.spring_rest_assignment.services.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    CalculatorService CalculatorService;
    

    @GetMapping("/calculator")
    public String calculator_home(){
        return "Available Navigations : \n /calculator/add \n/calculator/subtract\n /calculator/multiply\n /calculator/divide";
    }

    @PostMapping("/calculator/add")
    public int calculator_add(@RequestBody Calculator value){
        //CalculatorService.createvalues();
        return CalculatorService.add(value);
    }

    @PostMapping("/calculator/subtract")
    public int calculator_subtract(@RequestBody Calculator value){
        return CalculatorService.subtract(value);
    }

    @PostMapping("/calculator/multiply")
    public int calculator_multiply(@RequestBody Calculator value){
        return CalculatorService.multiply(value);
    }

    @PostMapping("/calculator/divide")
    public int calculator_divide(@RequestBody Calculator value){
        return CalculatorService.divide(value);
    }
}
