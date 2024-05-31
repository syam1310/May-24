package org.practice_24.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> allSubsets(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        solve(arr, 0, new ArrayList<>(), res);
        return res;
    }
    private static void solve(int[] arr, int start, List<Integer> path, List<List<Integer>> res){
        if(start == arr.length){
            res.add(new ArrayList<>(path));
            return;
        }
        path.add(arr[start]);
        solve(arr, start + 1, path, res);
        path.remove(path.size()-1);
        solve(arr, start + 1, path, res);
    }
}
