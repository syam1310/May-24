package org.practice_24.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
    public static List<List<Integer>> subArray(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                list.add(arr[j]);
                res.add(list);
            }
        }
        return res;
    }
}
