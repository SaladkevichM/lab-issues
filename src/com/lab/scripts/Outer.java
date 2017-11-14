package com.lab.scripts;

public class Outer {

    private String text = "I am Outer private!";

    public class Inner {

        private String text = "I am Inner private";

        public void printText() {
            System.out.println(text);
            System.out.println(Outer.this.text);
        }
    }
    
    
    
    public static void main(String... strings) {
        
        Outer o = new Outer();
        Outer.Inner i = o. new Inner();
        
        i.printText();
        
    }
}
