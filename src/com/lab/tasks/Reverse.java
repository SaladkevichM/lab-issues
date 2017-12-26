package com.lab.tasks;

public class Reverse {

    public static int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            ones = ones + (n & 1);
            n = n >>> 1;
        }
        return ones;
    }
    
    public static int onesCount(Integer n) {
        int result = 0;
        
        String string = Integer.toBinaryString(n);
        for(char ch : string.toCharArray()) {
            if(ch == '1') {
                result++;
            }
        }
        
        return result;
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1; // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {

        int a = 1;
        int b = -1;
        
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

    }

}
