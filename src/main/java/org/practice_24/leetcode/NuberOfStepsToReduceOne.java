package org.practice_24.leetcode;

public class NuberOfStepsToReduceOne {

    /*Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:

    If the current number is even, you have to divide it by 2.

    If the current number is odd, you have to add 1 to it.

    It is guaranteed that you can always reach one for all test cases.*/

    public static int numSteps(String s) {
        int decimal = bTod(s);
        int count = 0;
        while (decimal != 1) {
            count++;
            if (decimal % 2 == 1) {
                decimal += 1;
            } else {
                decimal /= 2;
            }
        }
        return count;
    }

    private static int bTod(String s) {
        int decimal = 0;
        int power = s.length() - 1;
        for (char c : s.toCharArray()) {
            int temp = myPower(2, power);
            decimal += (temp * (c - '0'));
            power--;
        }
        return decimal;
    }

    private static int myPower(int a, int b) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res *= a;
            }
            a *= a;
            b /= 2;
        }
        return res;
    }
}
