package com.lab.scripts;

public class StringGames {

    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName());
        
        String s1 = "1";
        String s2 = "1";
        String s3 = new String("1");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
        System.out.println(s1.equals(s3));

        System.out.println();

        System.out.println(s1.hashCode() + " ^ " + s2.hashCode());
        System.out.println(s1.hashCode() + " ^ " + s3.hashCode());
        
    }

}
