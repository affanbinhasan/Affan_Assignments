package com.springrest.spring_rest_assignment.services;

import java.math.BigInteger;

import com.springrest.spring_rest_assignment.models.Visa;

import org.springframework.stereotype.Component;

@Component
public class VisaService {
    Visa visa;

    static {
        VisaService lisa = new VisaService();
    }

    public boolean validate(Visa card){
        
        if (card.getVisacard().length() > 15){
            return true;
        }
        return false;
    }

    public String enRouteVisa(Visa card){
        String str1 = "2014";
        String str2 = "2149";
        StringBuffer str_new = new StringBuffer("");

        for (int i = 0; i<4 ; i++){
            str_new.append(card.getVisacard().charAt(i));
        }

        if (str1.contentEquals(str_new) || str2.contentEquals(str_new)){
            return "Validation Successful";
        }
        return "Not a Valid Visa";
    }

    public String JCBVisa(Visa card){
        String str1 = "3258";
        String str2 = "3598";
        StringBuffer str_new = new StringBuffer("");
        return "Not a Valid User";
    }
}
