package org.practice_24.leetcode.dp;

public class LongestPalindromicSubstring {
    public static String lps(String s) {
        String rev = rev(s);
        return lcs(s, rev);
    }

    private static String rev(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length - 1;
        while (l <= r) {
            char c = ch[l];
            ch[l] = ch[r];
            ch[r] = c;
            l++;
            r--;
        }
        return new String(ch);
    }

    public static String lps2(String s) {
        int len = 0;
        String res = "";
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String substr = s.substring(j, i);
                if (isPal(substr, 0, substr.length() - 1)) {
                    if (len < substr.length()) {
                        len = substr.length();
                        res = substr;
                    }
                }
            }
        }
        return res;
    }

    private static String lcs(String s1, String s2) {
        StringBuilder[][] dp = new StringBuilder[s1.length() + 1][s2.length() + 1];
        int len = 0;
        String res = "";
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = new StringBuilder("");
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1].append(s1.charAt(i - 1));
                    if (isPal(dp[i][j].toString(), 0, dp[i][j].length() - 1)) {
                        if (len < dp[i][j].length()) {
                            len = dp[i][j].length();
                            res = dp[i][j].toString();
                        }
                    }
                } else {
                    dp[i][j] = new StringBuilder("");
                }
            }
        }
        return res;
    }

    private static boolean isPal(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) == s.charAt(j)) return isPal(s, i + 1, j - 1);
        return false;
    }
}
