package com.lab.scripts;

import java.util.concurrent.locks.ReentrantLock;

public class Up {

    private final ReentrantLock lock = new ReentrantLock();
    
    public interface Shape {
        void print();
    }

    public class Circle implements Shape {
        @Override
        public void print() {
            System.out.println("Circle");
        }
    }

    public class Square implements Shape {

        @Override
        public void print() {
            System.out.println("Square");
        }

    }
    
    public static void main(String ...strings) {
        
        Up ups = new Up();
        
        Shape s1 = ups.new Circle();
        Shape s2 = ups.new Square();
        
        s1.print();
        s2.print();
        
    }

}
