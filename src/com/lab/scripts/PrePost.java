package com.lab.scripts;

public class PrePost {

    private static void recursive() {
        try {
            recursive();
            System.out.println(1);   
        } finally {
            recursive();
        } 
        
    }
    
    public static void main(String[] args) {                
        recursive();
            
    }

}
