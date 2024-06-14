package org.practice_24.leetcode.dp;

public class Driver {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bcb";
        String s = "aacabdkacaa";
        int[] nums = {2,1,1,2};
        //System.out.println(LongestPalindromicSubstring.lps2(s));
        //System.out.println(LongestCommonSubstringCount.lcs(s1, s2));
        //System.out.println(MinimumEditDistance.minimumEditDistance(s1, s2));
        //System.out.println(ClimbingStairs.climbStairs(4));
        System.out.println(HouseRobber.rob(nums));
    }
}
