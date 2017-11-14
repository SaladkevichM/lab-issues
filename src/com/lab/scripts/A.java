package com.lab.scripts;

public class A {

    {
        System.out.println("init block A");
    }

    public A() {
        System.out.println("A constructor");
    }

    public static class B extends A {

        {
            System.out.println("init block B");
        }

        public B() {
            System.out.println("B constructor");
            C inner = new C();
        }

        class C {
            {
                System.out.println("init block C");
            }

            public C() {
                System.out.println("C constructor");
            }
        }

    }

    public static void main(String[] args) {
        A.B ex = new A.B();
    }

}
