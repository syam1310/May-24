package org.practice_24.leetcode;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class LongestIncreasingSubsequence {
    private static int ans = 0;
    public static int lis(int[] arr){
        List<Integer> list = new ArrayList<>();
        solve(arr, 0, Integer.MIN_VALUE, list, 0);
        System.out.println(list);
        return ans;
    }
    public static void solve(int[] nums, int pos, int prev, List<Integer> lis, int i) {
        if (pos == nums.length) {
            ans = Math.max(i, ans);
            return;
        }
        solve(nums, pos + 1, prev, lis, i);
        if (nums[pos] > prev) {
            lis.add(nums[pos]);
            solve(nums, pos + 1, nums[pos], lis, i + 1);
            lis.remove(lis.size() - 1); // backtrack: remove the last element added
        }
    }
}
