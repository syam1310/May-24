package org.practice_24.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) arr.add(num);

        Collections.sort(arr);

        for(int i=0; i<nums.length; i++){
            int index = bs(arr, nums[i]);
            ans.add(index);
            arr.remove(index);
        }
        return ans;
    }

    private static int bs(List<Integer> arr, int target) {
        int l = 0;
        int r = arr.size() - 1, mid = 0;

        while (l <= r) {
            mid = l + (r - l) / 2;
            int val = arr.get(mid);
            if (val < target) l = mid + 1;
            else r = mid - 1;
        }
        if (arr.get(l) == target) return l;
        return mid;
    }
}
