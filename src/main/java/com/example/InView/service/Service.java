package com.example.InView.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    @RequestMapping("/switchConfiguration")
    public String switchConfiguration(){

        return "test1";
    }

    @RequestMapping("/sortText")
    public String sortText(){

        return "test2";
    }

}
