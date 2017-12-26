package com.lab.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {

    public static int singleNumber(int[] a) {
        int result = 0;
        for (int i : a) {
            result = result ^ i;
        }
        return result;
    }

    public static int singleNum(int[] ints) {
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        for (Integer uInteger : list) {
            if (Collections.frequency(list, uInteger) == 1) {
                return uInteger;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        int[] a = {2345, 2345, 3, 3345, 3345};
        System.out.println(singleNumber(a));

    }

}
