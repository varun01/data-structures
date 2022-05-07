package com.learning.leetcodeproblems;

/*

    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

 */

public class PlusOne {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr1 = {1, 9, 9, 9};
        onePlus(arr1);
    }

    public static int[] onePlus(int[] digits) {
        int arrLen = digits.length;
        boolean isAllNines = false;
        for (int i = 0; i < arrLen; i++) {
            if (digits[i] == 9) {
                isAllNines = true;
            } else {
                isAllNines = false;
                break;
            }
        }
        if (isAllNines) {
            digits = new int[arrLen + 1];
            digits[0] = 1;
            for (int i = 1; i < (arrLen + 1); i++) {
                digits[i] = 0;
            }
            return digits;
        }

        if (digits[arrLen - 1] == 9) {
            incrementNumber(digits, digits.length);
        } else {
            digits[arrLen - 1] = digits[arrLen - 1] + 1;
        }

        return digits;
    }

    public static void incrementNumber(int[] digits, int length) {
        if (length > 0 && digits[length - 1] == 9) {
            digits[length - 1] = 0;
            //digits[length - 2] = digits[length - 2] + 1;
            length--;
            incrementNumber(digits, length);
        } else {
            digits[length - 1] = digits[length - 1] + 1;
        }
    }
}
