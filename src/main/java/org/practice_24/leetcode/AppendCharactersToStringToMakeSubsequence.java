package org.practice_24.leetcode;

public class AppendCharactersToStringToMakeSubsequence {

    /*You are given two strings s and t consisting of only lowercase English letters.

    Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.

    A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.



    Example 1:

    Input: s = "coaching", t = "coding"
    Output: 4
    Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
    Now, t is a subsequence of s ("coachingding").
    It can be shown that appending any 3 characters to the end of s will never make t a subsequence.*/

    public static int appendCharacters(String s, String t) {
        int l1 = 0;
        int l2 = -1;

        while (l1 < s.length() && l2 + 1 < t.length()) {
            if (s.charAt(l1) == t.charAt(l2 + 1)) l2++;
            l1++;
        }
        return t.length() - (l2) - 1;
    }
}
