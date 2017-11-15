package com.lab.scripts;

import java.lang.reflect.Modifier;

public class Outer {

    private String text = "I am Outer private!";

    public class Inner extends Outer implements Comparable {

        private String text = "I am Inner private";

        public void printText() {

            System.out.println(text);
            System.out.println(Outer.this.text);
        }

        @Override
        public int compareTo(Object o) {
            // TODO Auto-generated method stub
            return 0;
        }
    }
    
    
    
    public static void main(String... strings) {
        
        Outer o = new Outer();
        Outer.Inner i = o. new Inner();
        
        i.printText();
        
    }
}
