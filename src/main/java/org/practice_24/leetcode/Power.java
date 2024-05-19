package org.practice_24.leetcode;

public class Power {
    public static int myPow(int a, int b){
        if (b == Integer.MIN_VALUE) {
            a *= a;
            b /= 2;
        }
        if (b < 0) {
            a = 1 / a;
            b = -b;
        }
        int res = 1;
        while(b>0){
            if(b%2 == 1){
                res *= a;
            }
            a *= a;
            b /= 2;
        }
        return res;
    }
}
