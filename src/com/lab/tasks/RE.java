package com.lab.tasks;

import java.util.Arrays;

public class RE {

    public static void main(String[] args) {
        // System.out.println(fact(5));
        System.out.println(factCycle(5));
        // fi(10);
        // sortArray(new int[] { 4,7,2,4,742345,56});
    }


    public static void sortArray(int[] x) {

        boolean swapped = true;
        while (swapped) {

            swapped = false;

            for (int i = 1; i < x.length; i++) {

                int temp = 0;

                if (x[i - 1] > x[i]) {

                    temp = x[i - 1];
                    x[i - 1] = x[i];
                    x[i] = temp;

                    swapped = true;
                }
            }

        }
        System.out.println(Arrays.toString(x));
    }


    private static void fi(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 1) {
                numbers[i] = numbers[i - 2] + numbers[i - 1];
            } else {
                numbers[i] = i;
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * (fact(n - 1));
        }
    }

    private static int factCycle(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

}
