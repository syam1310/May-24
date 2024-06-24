package org.practice_24.leetcode;

public class PalindromicSubstrings {
    public static int palindromicSubstring(String s){
        int count = 0;
        for(int i=0; i<=s.length(); i++){
            for(int j=0; j<=i; j++){
                String s1 = s.substring(j, i);
                if(isPal(s1, 0, s1.length()-1))count++;
            }
        }
        return count;
    }
    private static boolean isPal(String s, int i, int j){
        if(s.length() == 0 || s.isBlank() || s.isEmpty())return false;
        if(i >= j)return true;
        if(s.charAt(i) == s.charAt(j)){
            return isPal(s, i+1, j-1);
        }
        return false;
    }
}
