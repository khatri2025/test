package com.company.part6;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static String [] country = {
        "USA","UK","Europe"
    };
    public static  String [][] city ={
            {"Dallas","Austin","New york"},
            {"London","Liverpool"},
            {"Germany","Franch"},
    };
    public static void main(String [] args){
        Map<String, List<String>> contenent = new HashMap<>();

        for(int i = 0; i<country.length;i++){
            String countryTest = country[i];
            String [] cityList = city[i];

            List<String> cityTest = new ArrayList<>();
            for(String citytest1 : cityList){
                cityTest.add(citytest1);
            }
            contenent.put(countryTest,cityTest);
        }

        for(String countrytest3 :contenent.keySet()){
            System.out.print(countrytest3);
            System.out.print(": ");
            List<String> cityTest = contenent.get(countrytest3);

            for(String citytest11 : cityTest){
                System.out.print(citytest11);
                System.out.print(" ");
            }
        }

    }
}
