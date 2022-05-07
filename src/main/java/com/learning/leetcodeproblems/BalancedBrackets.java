package com.learning.leetcodeproblems;


import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class BalancedBrackets {


    public static boolean isValid(String s) {
        if (s.length() < 1)
            return false;
        Stack<Character> characterStack = new Stack<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '}' || charArr[i] == ')' || charArr[i] == ']') {
                characterStack.pop();
            } else {
                characterStack.push(charArr[i]);
            }
        }
        return characterStack.size() == 0;
    }

    public static void main(String[] args) {
        String s = "[{([](){})}]";
        System.out.println("Is valid parenthesis: " + isValid(s));
    }
}
