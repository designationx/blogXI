package com.xi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/test")
    public String test(){
        return restTemplate.postForObject("http://BLOG-DATA/test",new String(),String.class);
    }

}
