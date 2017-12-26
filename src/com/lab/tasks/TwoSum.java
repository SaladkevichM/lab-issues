package com.lab.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author Mikita_Saladkevich
 *
 */
public class TwoSum {

    public static int[] twoSumTrue(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 7, 1};
        System.out.println(Arrays.toString(twoSumTrue(a, 2)));
    }

}
