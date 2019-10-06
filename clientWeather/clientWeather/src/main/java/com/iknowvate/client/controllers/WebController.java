package com.iknowvate.client.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
    @GetMapping(value = "/notfound")
    public String notfound() {
        return "notfound";
    }
}