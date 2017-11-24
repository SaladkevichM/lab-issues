package com.lab.tasks;

import java.util.Arrays;

public class Factorial {

    static int fact(int num) {
        if (num == 0)
            return 1;
        return num * fact(num - 1);
    }

    static void fibM(int n) {
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 1) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            } else {
                sequence[i] = i;
            }
        }
        System.out.println(Arrays.toString(sequence));
    }

    static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret = ret * i;
        }
        return ret;
    }

    public static void main(String[] args) {

        System.out.println(fact(5));

    }

}
