package org.practice_24.leetcode.dp;

import java.util.Arrays;

public class HouseRobber {

    /*
    You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

    Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
    */
    public static int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);

        return solve(nums);
    }

    private static int solve(int[] nums, int n) {


        if (n == 0) return nums[0];
        if (n < 0) return 0;
        return Math.max(
                solve(nums, n - 1),
                nums[n] + solve(nums, n - 2)
        );
    }

    private static int solve(int[] nums, int n, int[] memo) {
        if (n == 0) return nums[0];
        if (n < 0) return 0;
        if (memo[n] != -1) return memo[n];
        memo[n] = Math.max(nums[n] + solve(nums, n - 2, memo), solve(nums, n - 1, memo));
        return memo[n];
    }

    private static int solve(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int pick = nums[i];
            if (i > 1) {
                pick += dp[i - 2];
            }
            int npick = dp[i - 1];
            dp[i] = Math.max(pick, npick);
        }
        return dp[dp.length - 1];
    }
}
