package com.springrest.spring_rest_assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.spring_rest_assignment.services.VisaService;

@RestController
public class VisaController {
    @Autowired
    VisaService VisaService;


}
