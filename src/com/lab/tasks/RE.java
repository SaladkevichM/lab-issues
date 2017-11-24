package com.lab.tasks;

public class RE {

    public static void main(String[] args) {
        //System.out.println(fact(10));
        fi(10);
    }

    private static void fi(int n) {
       int[] numbers = new int[n];
       for(int i = 0; i < n; i++) {           
           if(i > 1) {
               numbers[i] = numbers[i - 2] + numbers[i - 1];
           } else {
               numbers[i] = i;
           }                      
       }       
       
       for(int number : numbers) {
         System.out.println(number);
       }
    }

    private static int fact(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * (fact(n - 1));
        }
    }

}
