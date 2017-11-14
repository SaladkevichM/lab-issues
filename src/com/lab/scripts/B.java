package com.lab.scripts;

public class B {
    public B() {
        System.out.println(" constructor B ");
    }
    {
        System.out.println(" init B ");
    }

    class Inner {
        {
            System.out.println(" init Inner ");
        }
        public Inner() {            
            super();
            System.out.println(" constructor Inner ");            
        }
    }

    static class StaticInner {
        {
            System.out.println(" init StaticInner ");
        }
    }

    public static void main(String[] args) {
        B.Inner i = new B().new Inner();
    }
}
