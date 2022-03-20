package com.springrest.spring_rest_assignment.models;

import java.math.BigInteger;

public class Visa {
    BigInteger visacard;

    public Visa(BigInteger visacard) {
        this.visacard = visacard;
    }

    public BigInteger getVisacard() {
        return visacard;
    }

    public void setVisacard(BigInteger visacard) {
        this.visacard = visacard;
    }

    @Override
    public String toString() {
        return "Visa [visacard =" + visacard + "]";
    }
    
}
