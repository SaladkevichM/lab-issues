package com.lab.tasks;

public class ReverseString {

    public String reverseStringTrue(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    
    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        char[] chars = s.toCharArray();        
        for(int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }    
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("cat"));
    }

}
