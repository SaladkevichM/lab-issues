package com.lab.scripts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;

public class LabOne {

    static {
        try {            
            FileReader reader = new FileReader("C:\\SomeDir\\notes3.txt");  
            
            Object obj = null;
            System.out.println(obj.toString());            
        } catch (NullPointerException e) {
            
            e.printStackTrace();
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            
        }
        
    }

    class Inner {
        public Inner() {

        }   
        
        {
            try {
                
                FileReader reader = new FileReader("C:\\SomeDir\\notes3.txt");   
                
                Object obj = null;
                System.out.println(obj.toString());
                
            } catch (NullPointerException e) {
                
                e.printStackTrace();
                
            } catch (FileNotFoundException e) {
                
                e.printStackTrace();
                
            }
        }
    }

    static class StaticInner {

    }

    public static void main(String... strings) {
        
        LabOne outer = new LabOne();
        
        LabOne.Inner innerObject = outer.new Inner();
        LabOne.StaticInner staticInner = new LabOne.StaticInner();
    }

}
