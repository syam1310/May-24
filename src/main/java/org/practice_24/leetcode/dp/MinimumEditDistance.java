package org.practice_24.leetcode.dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumEditDistance {
    public static int minimumEditDistance(String s1, String s2) {
        int[][] memo = new int[s1.length()+1][s2.length()+1];
        for(int[] arr : memo) Arrays.fill(arr, -1);
        return solve(s1, s2);
    }

    private static int solve(String s1, String s2, int m, int n) {
        if (m == 0) return n;
        if (n == 0) return m;

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return solve(s1, s2, m - 1, n - 1);
        }else
        return 1 + Math.min(solve(s1, s2, m, n - 1), Math.min(solve(s1, s2, m - 1, n), solve(s1, s2, m - 1, n - 1)));
    }
    private static int solve(String s1, String s2, int m, int n, int[][] memo){
        if(m == 0)return n;
        if(n == 0)return m;

        if(memo[m][n] != -1)return memo[m][n];

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            memo[m][n] = solve(s1, s2, m-1, n-1, memo);
        }else{
            memo[m][n] = 1 + Math.min(solve(s1, s2, m, n - 1, memo), Math.min(solve(s1, s2, m - 1, n, memo), solve(s1, s2, m - 1, n - 1, memo)));
        }
        return memo[m][n];
    }
    private static int solve(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i == 0){
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
