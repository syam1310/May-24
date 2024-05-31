package org.practice_24.leetcode;

public class CalculateNCR {
    public static int calculateNCR(int n, int r) {
        // this using factorial
        return factR(n) / (factR(r) * factR(n - r));

        // this is using pascal triangle method

        //int[][] pt = pt(n);
        //return pt[n][r];
    }

    private static int factR(int n) {
        if (n == 1) return 1;
        return n * factR(n - 1);
    }

    private static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    private static int[][] pt(int n) {
        int[][] pt = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    pt[i][j] = 1;
                } else {
                    pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
                }
            }
        }
        return pt;
    }

}
