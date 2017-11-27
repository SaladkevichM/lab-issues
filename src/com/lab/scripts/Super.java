package com.lab.scripts;

public class Super extends Object {

    final int f;
    
    public Super() throws NullPointerException {
        this(1);    
                       
    }
    
    public Super(int o) {
        this(1, 5); 
    } 
    
    public Super(int o, int h) {
        super();  
        f = 1;  
    }

}
