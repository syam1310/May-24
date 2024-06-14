package org.practice_24.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public static boolean isValidSudoku(int[][] mat) {
        boolean rowFlag = true;
        boolean colFlag = true;

        for (int j = 0; j < mat[0].length; j++) {
            if (!containsDup(mat[j])) colFlag = false;
        }
        for (int i = 0; i < mat.length; i++) {
            if (!containsDup(mat[i])) rowFlag = false;
        }
        return colFlag && rowFlag;
    }

    private static boolean containsDup(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int key : map.keySet()) {
            if (map.get(key) > 1) return false;
        }
        return true;
    }
}
