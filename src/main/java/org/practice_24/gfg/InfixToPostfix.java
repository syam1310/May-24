package org.practice_24.gfg;

import java.util.Stack;

public class InfixToPostfix {
    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L';
    }

    static void infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ')continue;

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek()) ||
                        prec(s.charAt(i)) == prec(stack.peek()) &&
                                associativity(s.charAt(i)) == 'L')) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        //String ex = "a+b*(c^d-e)^(f+g*h)-i";

        //String ex = "(1+(4+5+2)-3)+(6+8)";
        String e = "1 + 1";
        //String ex = "(k+l-m*n+(o^p)*w/u/v*t+q)";

        infixToPostfix(e);
    }
}
