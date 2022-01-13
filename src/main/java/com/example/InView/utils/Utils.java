package com.example.InView.utils;

import org.springframework.stereotype.Service;

@Service
public class Utils {

    private String parametr = "DESC";

    public String changeParametr(){

        if("DESC".equals(parametr)){
            parametr="ASC";
        }else if("ASC".equals(parametr)){
            parametr="DESC";
        }

        return parametr;
    }

}
