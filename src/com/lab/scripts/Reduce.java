package com.lab.scripts;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        int sum = numbers.stream().reduce(0, Integer::sum);
        
        System.out.println(sum);
    }

}
