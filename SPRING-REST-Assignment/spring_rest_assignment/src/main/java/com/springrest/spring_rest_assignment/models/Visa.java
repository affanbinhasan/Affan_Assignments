package com.springrest.spring_rest_assignment.models;

import java.math.BigInteger;

public class Visa {
    String visacard;

    public Visa(String visacard) {
        this.visacard = visacard;
    }

    public String getVisacard() {
        return visacard;
    }

    public void setVisacard(String visacard) {
        this.visacard = visacard;
    }

    @Override
    public String toString() {
        return "Visa [visacard=" + visacard + "]";
    }
 
}
