package com.springrest.spring_rest_assignment.controllers;

import com.springrest.spring_rest_assignment.services.LocationService;

import java.util.List;

import com.springrest.spring_rest_assignment.models.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationServiceController {
    @Autowired
    private LocationService all_locations;

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/locations")
    public LocationService getlocations(){
        return all_locations;
    }

    @GetMapping("/{zipcode}")
    public Location getinfo(@PathVariable String zipcode){

        return all_locations.getInfo(zipcode);
    }
}
