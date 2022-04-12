package com.springrest.spring_rest_assignment.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.springrest.spring_rest_assignment.models.Location;

import org.springframework.stereotype.Component;

@Component
public class LocationService {
    private static List<Location> locations = new ArrayList<>();

    static{
        locations.add(new Location("99501","AK","ANCHROGE","US"));
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Location getInfo(String zip_code){
        
        for(Location i : locations){
            if(i.getZipcode().equals(zip_code)){
                return i;
            }
        }
        return null;
    }
}
