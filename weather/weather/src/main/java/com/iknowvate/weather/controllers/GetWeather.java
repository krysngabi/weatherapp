package com.iknowvate.weather.controllers;

import com.iknowvate.weather.models.Wdetails;
import com.iknowvate.weather.service.GetWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:8085"}, maxAge = 6000)
public class GetWeather {
    @Autowired
    private GetWeatherService getWeatherService;


    @GetMapping(value = "/api/getbycity/{city}")
    public Wdetails getDetailsByCity(@PathVariable String city){
        return getWeatherService.getByCity(city);

    }

    @GetMapping(value = "/api/getbyid/{id}")
    public Wdetails getDetailsByID(@PathVariable String id){
        return getWeatherService.getById(id);

    }
    @GetMapping(value = "/api/getbycoord/{lat}/{lon}")
    public Wdetails getDetailsByCoord(@PathVariable String lat,@PathVariable String lon){
        System.out.println("ELEKI KITOKO");
        return getWeatherService.getByCoord(lat,lon);

    }
}
