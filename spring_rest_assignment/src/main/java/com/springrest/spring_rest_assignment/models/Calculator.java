package com.springrest.spring_rest_assignment.models;

public class Calculator {
    int first_value , second_value;

    public Calculator(int first_value, int second_value) {
        this.first_value = first_value;
        this.second_value = second_value;
    }

    public int getFirst_value() {
        return first_value;
    }

    public void setFirst_value(int first_value) {
        this.first_value = first_value;
    }

    public int getSecond_value() {
        return second_value;
    }

    public void setSecond_value(int second_value) {
        this.second_value = second_value;
    }

    @Override
    public String toString() {
        return "Calculator [first_value=" + first_value + ", second_value=" + second_value + "]";
    }
    
}
