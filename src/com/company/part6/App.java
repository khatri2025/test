package com.company.part6;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static  String [] vechiles ={
            "ambulance","helicopter","lifeboat"
    };
    public static String [][] drivers = {
            {"Freed","Sue","Pete"},
            {"Sue","Robin","hood","Freed"},
            {"Petter","mary","Bob","dallas"},
    };
    public static void main(String [] args){
        Map<String , Set<String>> person = new HashMap<>();
        for(int i = 0; i<vechiles.length; i++){
            String vechicle = vechiles[i];
            String [] driverList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<>();
            for(String driver : driverList){
                driverSet.add(driver);
            }
            person.put(vechicle,driverSet);
        }

    }
}
