package com.lab.tasks;

public class SearchIn2D {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7}, {5, 6, 8, 9},};

        int[] r = searchMatrix(matrix, 9);

        System.out.println(r[0] + ":" + r[1]);
    }

    public static int[] searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int e = matrix[mid / n][mid % n];

            if (target < e) {
                end = mid - 1;
            } else if (target > e) {
                start = mid + 1;
            } else {
                return new int[] {mid / n, mid % n};
            }
        }
        return new int[] {-1, -1};
    }


}
