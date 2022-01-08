package com.learning.leetcodeproblems;

public class ReverseCharArray {

    public static void main(String[] args) {
        char[] arr = {'H','a','n','n','a','h'};
        reverseString(arr);
    }

    public static void reverseString(char[] s) {
        int arrLen = s.length;
        int i = 0;
        int j = arrLen - 1;
        while (i < arrLen / 2) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }
}
