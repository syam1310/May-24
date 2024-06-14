package org.practice_24.leetcode.dp;

import java.util.Arrays;

public class LongestCommonSubstringCount {
    private static int lcs = 0;


    public static int lcs(String s1, String s2) {
        int[][] memo = new int[s1.length() + 1][s2.length() + 1];
        for (int[] arr : memo) Arrays.fill(arr, -1);
        StringBuilder sb = new StringBuilder();
        String substring = solve2(s1, s2);
        System.out.println(substring);
        return 0;

    }

    private static int solve(String s1, String s2, int m, int n, int[][] memo) {
        if (m == 0 || n == 0) return 0;
        if (memo[m][n] != -1) return memo[m][n];

        solve(s1, s2, m - 1, n, memo);
        solve(s1, s2, m, n - 1, memo);
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            memo[m][n] = 1 + solve(s1, s2, m - 1, n - 1, memo);
            lcs = Math.max(lcs, memo[m][n]);
            return memo[m][n];
        }
        return memo[m][n] = 0;
    }

    private static int solve2(String s1, String s2, int m, int n, int count) {
        if (m == 0 || n == 0) return 0;

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            count = solve2(s1, s2, m - 1, n - 1, count + 1);
        }
        count = Math.max(count, Math.max(solve2(s1, s2, m - 1, n, 0), solve2(s1, s2, m, n - 1, 0)));
        return count;
    }

    private static int solve3(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) return 0;

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + solve3(s1, s2, m - 1, n - 1);
        }
        return Math.max(solve3(s1, s2, m - 1, n), solve3(s1, s2, m, n - 1));

    }

    private static int solve2(String s1, String s2, int m, int n, int count, StringBuilder sb) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            sb.append(s1.charAt(m - 1));
            count = solve2(s1, s2, m - 1, n - 1, count + 1, sb);
        }

        count = Math.max(count, Math.max(solve2(s1, s2, m - 1, n, 0, new StringBuilder()), solve2(s1, s2, m, n - 1, 0, new StringBuilder())));
        return count;
    }


    private static int solve(String s1, String s2) {
        int lcs = 0;
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    lcs = Math.max(lcs, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return lcs;
    }

    private static String solve2(String s1, String s2) {
        StringBuilder[][] sb = new StringBuilder[s1.length() + 1][s2.length() + 1];
        int len = 0;
        String res = "";
        for (int i = 0; i < sb.length; i++) {
            for (int j = 0; j < sb[0].length; j++) {
                if (i == 0 || j == 0) {
                    sb[i][j] = new StringBuilder("");
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    sb[i][j] = sb[i - 1][j - 1].append(s1.charAt(i - 1));
                    if (len < sb[i][j].length()) {
                        len = sb[i][j].length();
                        res = sb[i][j].toString();
                    }
                }else{
                    sb[i][j] = new StringBuilder("");
                }
            }
        }
        return res;
    }
}
