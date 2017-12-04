package com.lab.scripts;

import java.util.ArrayList;

public class Over {
    
    public static void m1(int ... is) {
        System.out.println(1);
    }
    
    public static void m1(int m, int n) {
        System.out.println(2);
    }
    
    public static void m1(Integer m) {
        System.out.println(3);
    }
    
    public static void main(String[] args) {
        m1(1, 2);
        System.out.println(new ArrayList<Object>().getClass());
    }

}
