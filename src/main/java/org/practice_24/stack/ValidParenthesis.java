package org.practice_24.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c== '{' || c == '['){
                st.push(c);
            }else{
                if(!st.isEmpty()  &&( (st.peek() == '(' && c != ')') || (st.peek() == '{' && c != '}') || (st.peek() == '[' && c != ']')))return false;
                st.pop();
            }
        }
        return st.isEmpty() ? true : false;
    }
}
