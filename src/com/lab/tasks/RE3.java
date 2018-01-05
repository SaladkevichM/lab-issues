package com.lab.tasks;

public class RE3 {

    
    
    
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int factorial(int n) {
        
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }
    
    public static int f(int n) {
        
        int f = 1;
        
        for(int i = 1; i <= n; i++) {
            f *= i;
        }
        
        return f;
    }

}
