package com.lab.tasks;

import java.util.ArrayList;
import java.util.List;

public class ToIntervals {

    public static void main(String[] args) {
        System.out.println(print(new Integer[] {5, 25, 50, 100, 155}));
    }

    public static String getPair(Integer left, Integer right) {
        return "[" + (left + 1) + "-" + (right - 1) + "]";
    }

    private static String print(Integer[] numbers) {
        List<String> parts = new ArrayList<>();

        for (int i = 1; i < numbers.length; i++) {
            parts.add(getPair(numbers[i - 1], numbers[i]));
        }

        return String.join(",", parts);
    }

}
