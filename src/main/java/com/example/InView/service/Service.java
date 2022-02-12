package com.example.InView.service;

import com.example.InView.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    @Autowired
    private Utils util;

    @RequestMapping("/switchConfiguration")
    public String switchConfiguration(){

        return util.changeParametr();
    }

    @RequestMapping("/sortText/{value}")
    public String sortText(@PathVariable String value){
        return util.sortValue(value);
    }

}
