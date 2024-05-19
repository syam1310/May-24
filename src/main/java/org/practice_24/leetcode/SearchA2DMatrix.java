package org.practice_24.leetcode;

public class SearchA2DMatrix {
    public static int[] searchIn2DMatrix(int[][] mat, int target) {
        int row = 0;
        int col = mat[0].length - 1;

        while (col >= 0 && row < mat.length) {
            if (mat[row][col] == target) return new int[]{row, col};
            else if (mat[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
