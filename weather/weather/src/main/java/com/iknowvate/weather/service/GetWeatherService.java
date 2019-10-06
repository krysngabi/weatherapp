package com.iknowvate.weather.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iknowvate.weather.models.Wdetails;
import com.iknowvate.weather.models.Weather;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GetWeatherService {
    @Autowired
    RestTemplate restTemplate;
    @Value("${api.url}")
    private String url;
    @Value("${api.key}")
    private String key;
    private static final Logger logger = LoggerFactory.getLogger(GetWeatherService.class);

    public Wdetails getByCity(String city) {

        ResponseEntity<Wdetails> apiResponse =
                restTemplate.exchange(url+"?q="+city+"&units=metric&APPID="+key,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Wdetails>() {
                        });


        Wdetails mcity = (Wdetails)apiResponse.getBody();

        return mcity;

    }
    public Wdetails getById(String id) {

        ResponseEntity<Wdetails> apiResponse =
                restTemplate.exchange(url+"?id="+id+"&units=metric&APPID="+key,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Wdetails>() {
                        });


        Wdetails mcity = (Wdetails)apiResponse.getBody();

        return mcity;

    }
    public Wdetails getByCoord(String lat,String lon) {

        ResponseEntity<Wdetails> apiResponse =
                restTemplate.exchange(url+"?lat="+lat+"&lon="+lon+"&units=metric&APPID="+key,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Wdetails>() {
                        });


        Wdetails mcity = (Wdetails)apiResponse.getBody();

        return mcity;

    }
    public String getCityName(String city) {

        ResponseEntity<Wdetails> apiResponse =
                restTemplate.exchange(url+"?q="+city+"&units=metric&APPID="+key,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Wdetails>() {
                        });


        Wdetails mcity = (Wdetails)apiResponse.getBody();

        return mcity.getName();

    }
    public double getCode(String city) {

        ResponseEntity<Wdetails> apiResponse =
                restTemplate.exchange(url+"?q="+city+"&units=metric&APPID="+key,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Wdetails>() {
                        });


        Wdetails mcity = (Wdetails)apiResponse.getBody();

        return mcity.getCoordObject().getLat();

    }



}
