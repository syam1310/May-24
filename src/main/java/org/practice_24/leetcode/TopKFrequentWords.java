package org.practice_24.leetcode;

import java.util.*;

public class TopKFrequentWords {

    /*Given an array of strings words and an integer k, return the k most frequent strings.

    Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

            Example 1:

    Input: words = ["i","love","leetcode","i","love","coding"], k = 2
    Output: ["i","love"]
    Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.*/

    public static List<String> topKFrequentEle(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                int freqSort = entry2.getValue().compareTo(entry1.getValue());
                if (freqSort != 0) return freqSort;
                else
                    return entry1.getKey().compareTo(entry2.getKey());
            }
        });
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k && i < entryList.size(); i++) {
            res.add(entryList.get(i).getKey());
        }
        return res;
    }
}
