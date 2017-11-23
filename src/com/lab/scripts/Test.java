package com.lab.scripts;

import java.util.HashMap;
import java.util.Map;

public class Test {

    
    
    public static void main(String[] args) {
        
        class Person {                    
            private String name;                 
            public Person(String n) {
                this.name = n;
            }            
            public void setName(String n) {
                this.name = n;
            }     
            
            @Override
            public int hashCode() {
                return this.name.hashCode();               
            }            
        }
        
        Person p = new Person("ку1");
        Map<Person, String> m = new HashMap<Person, String>();                
        m.put(p, "1");
        p.setName("ку12");
        
        System.out.println(m.get(p));
        System.out.println(m.keySet().iterator().next().name);
        
        
    }

}
