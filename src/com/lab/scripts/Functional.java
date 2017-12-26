package com.lab.scripts;

@FunctionalInterface
public interface Functional {
    
    String accept(String s);
        
    public static void main(String ... strings) {
        
        Functional printer = s -> s + "1";
        System.out.println(printer.accept("ss"));
        
    }
    
}
