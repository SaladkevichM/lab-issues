package com.lab.scripts;

public class Hash {

    static int hash(int h) {
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
    
    public static void main(String[] args) {
        
        System.out.println(Integer.toBinaryString(100001));
        System.out.println(Integer.toBinaryString(100002));
        System.out.println(Integer.toBinaryString(100003));
        
        System.out.println();
        
        int one = hash(100001);
        int two = hash(100002);
        int three = hash(100003);
        
//        System.out.println(hash(100001));
//        System.out.println(hash(100002));
//        System.out.println(hash(100003));
        
        System.out.println(Integer.toBinaryString(one));
        System.out.println(Integer.toBinaryString(two));
        System.out.println(Integer.toBinaryString(three));
        
    }

}
