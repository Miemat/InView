package com.example.InView.utils;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

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

    public String sortAscValue(String value){

        return sortString(value);
    }

    public String sortDescValue(){

        if("DESC".equals(parametr)){
            parametr="ASC";
        }else if("ASC".equals(parametr)){
            parametr="DESC";
        }

        return parametr;
    }

    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }

}
