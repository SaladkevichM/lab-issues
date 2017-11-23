package com.lab.scripts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        List<Character> in = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> out = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        for (char ch : t.toCharArray()) {
            if (!in.contains(ch)) {
                return false;
            }
            if (Collections.frequency(in, ch) != Collections.frequency(out, ch)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isAnagramTrue(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        
        System.out.println(System.currentTimeMillis());
        //System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagramTrue("anagram", "nagaram"));
        System.out.println(System.currentTimeMillis());

    }

}
