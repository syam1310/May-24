package org.practice_24.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static int getIndexOfFirstUniqueCharacterInAString(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), new ArrayList<>());
            }
            map.get(s.charAt(i)).add(i);
        }
        for (char key : map.keySet()) {
            if (map.get(key).size() == 1) return map.get(key).get(0);
        }
        return -1;
    }

}
