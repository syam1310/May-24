package org.practice_24.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> pt(int numRows) {
        List<List<Integer>> pt = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                } else {
                    row.add(pt.get(i - 1).get(j - 1) + pt.get(i - 1).get(j));
                }
            }
            pt.add(row);
        }
        return pt;
    }
}
