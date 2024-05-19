package org.practice_24.leetcode;

import java.util.List;

public class MinimumSizeSubarraySum {
    public static int maxSizeSubArraySum(int[] arr, int target){
        List<List<Integer>> lists = SubArray.subArray(arr);
        int res = Integer.MAX_VALUE;
        for(List<Integer> list : lists){
            int sum = list.stream().mapToInt(Integer::intValue).sum();

            System.out.println("Sum :" + sum);
            if(sum >= target){
                res = Math.min(res, list.size());
            }
        }
        return res;
    }
}
