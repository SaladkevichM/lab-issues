package com.lab.scripts;

import java.util.Arrays;
import java.util.Map;
import java.util.Vector;

public class EnumGames {

    enum CarsMore implements Comparable<CarsMore> {
        
       
        AUDI, VOLVO;         
        
        public int compareTo(CarsMore o1, CarsMore o2) {
                        
            
            return 0;            
        }
        
    }
    
    enum Cars {
        
        AUDI, VOLVO, BMW;
       
    }

    public static void main(String[] args) {
    
        Vector<String> v = new Vector<String>();
        v.add("1");
        
        Object o = new Object();
        
        CarsMore brand = CarsMore.AUDI;
        
        if(brand.equals(CarsMore.AUDI)) {
            System.out.println(Arrays.toString(Cars.values()));
        }
        
        CarsMore.AUDI.ordinal();
    }

}
