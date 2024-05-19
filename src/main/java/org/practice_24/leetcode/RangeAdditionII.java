package org.practice_24.leetcode;

public class RangeAdditionII {

    // this solution gives memory limit extension
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        int[][] arr = new int[m][n];
        int max = Integer.MIN_VALUE;
        for (int[] op : ops) {
            for (int j = 0; j < op[0]; j++) {
                for (int k = 0; k < op[1]; k++) {
                    arr[j][k] += 1;
                    max = Math.max(max, arr[j][k]);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == max) count++;
            }
        }
        return count;
    }

    public static int maximumCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;

        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }
        return minCol * minRow;
    }
}
