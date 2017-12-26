package com.lab.tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DaysWeight {

    public static void main(String[] args) {

        int[] days = new int[] {6, 4, 5, 5};
        System.out.println(bestDay(days, 7));

    }

    public static int bestDay(int[] days, int m) {

        int bitmask = getMask(m);
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < days.length; i++) {
            result.put(i, days[i] & bitmask);
        }

        return Collections.max(result.entrySet(), Map.Entry.comparingByValue()).getKey();

    }

    public static int getMask(int size) {
        StringBuilder mask = new StringBuilder();
        for (int i = 0; i < size; i++) {
            mask.append(1);
        }
        return Integer.valueOf(mask.toString(), 2);
    }

}
