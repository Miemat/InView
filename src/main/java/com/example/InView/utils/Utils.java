package com.example.InView.utils;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

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

    public String sortValue(String value){

        return sortString(value);
    }

    public String sortString(String inputString)
    {
        long startTime = System.currentTimeMillis();
        String resultValue =  "";
        resultValue = sort(inputString);
        long endTime = System.currentTimeMillis();
        long durationTime = (endTime - startTime);

        String result = String.format("sortText: %s \n </br> sortedText: %s \n </br> operationDuration: %d",inputString, resultValue, durationTime);

        return result;
    }

    private String sort(String inputString) {
        String resultValue;
        if("DESC".equals(parametr)){
            char[] s = inputString.toCharArray();
            descOrder(s); // function call
            resultValue = String.valueOf(s);
        }else{
            resultValue = sortASC(inputString);
        }
        return resultValue;
    }

    static void descOrder(char[] s)
    {
        Arrays.sort(s);
        reverse(s);
    }

    static void reverse(char[] a)
    {
        int i, n = a.length;
        char t;
        for (i = 0; i < n / 2; i++)
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    private String sortASC(String inputString){
            Character tempArray[]
                    = new Character[inputString.length()];

            for (int i = 0; i < inputString.length(); i++) {
                tempArray[i] = inputString.charAt(i);
            }
            Arrays.sort(tempArray, new Comparator<Character>() {
                @Override
                public int compare(Character c1, Character c2)
                {
                    return Character.compare(
                            Character.toLowerCase(c1),
                            Character.toLowerCase(c2));
                }
            });
            StringBuilder sb
                    = new StringBuilder(tempArray.length);

            for (Character c : tempArray)
                sb.append(c.charValue());

            return sb.toString();
    }

}
