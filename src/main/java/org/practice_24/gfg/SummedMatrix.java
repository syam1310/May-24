package org.practice_24.gfg;


import java.util.Arrays;

/*A matrix is constructed of size n*n and given an integer ‘q’. The value at every cell of the matrix is given as, M(i,j) = i+j, where ‘M(i,j)' is the value of a cell, ‘i’ is the row number, and ‘j’ is the column number. Return the number of cells having value ‘q’.

Note: Assume, the array is in 1-based indexing.

Examples:

Input: n = 4, q = 7
Output: 2
Explanation: Matrix becomes
2 3 4 5
        3 4 5 6
        4 5 6 7
        5 6 7 8
The count of 7 is 2.*/
public class SummedMatrix {
    public static int summedMat(int n, int q) {
        int count1 = solve1(n, q);
        int count2 = solve2(n, q);
        System.out.println(count1 + " " + count2);
        return count1;
    }

    private static int solve1(int n, int q) {
        int[][] mat = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (i + j) + 2;
                if (mat[i][j] == q) count++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(Arrays.toString(mat[i]));
        }
        return count;
    }

    private static int solve2(int n, int q) {
        if (q < 2 || q > 2 * n) return 0;
        return Math.min(q - 2, 2 * n - q) + 1;
    }
}
