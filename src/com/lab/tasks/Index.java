package com.lab.tasks;

import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        int[] m = {1, 1, 1, 1, 1, 1, 6};
        System.out.println(getIndex(m));

    }

    private static int getIndex(int[] m) {

        long left = 0;
        long sum = Arrays.stream(m).asLongStream().sum();

        if (sum % 2 == 0) {
            for (int i = 0; i < m.length; i++) {
                left += m[i];
                if (left == sum / 2) {
                    return i;
                }
            }
        }

        return -1;
    }

}
