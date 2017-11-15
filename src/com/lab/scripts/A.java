package com.lab.scripts;

public class A {

    public static int i = 0;
    
    
    public void doSmth2() {};
    
    static {
        System.out.println("static init block A"); 
    }
    
    {
        System.out.println("init block A");
    }

    public A() {
        System.out.println("A constructor");
        
        new Thread(new Runnable() {
            public void run() {               
                System.out.println("C constructor. New thread 3");                                                               
                
            }
        }).start();
    }

    public static class B extends A {

        {
            System.out.println("init block B");
        }

        public B() {
            System.out.println("B constructor");
            //C inner = new C();
        }

        class C {
            {
                System.out.println("init block C");
            }

            
            
            public C() {
                
                System.out.println("C constructor");
                
                new Thread(new Runnable() {
                    public void run() {               
                        System.out.println("C constructor. New thread 1.");
                        
                        new Thread(new Runnable() {
                            public void run() {               
                                System.out.println("C constructor. New thread 2");                                                               
                                doSmth2();
                            }
                        }).start();
                        
                    }
                }).start();
                
                
                new Thread(new Runnable() {
                    public void run() {               
                        System.out.println("C constructor. New thread 3");                                                               
                        
                    }
                }).start();
            }
        }

    }

    public static void main(String[] args) {
        A.B ex = new A.B();
    }

}
