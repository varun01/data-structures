package com.learning.leetcodeproblems;


/**
 * A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.
 *
 * abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….
 */
public class ArmStrongNumber {


    private static boolean checkArmStrongNumber(int num, int n){
        int result = 0;
        int num1 = num;
        while(num1 > 0){
            int temp = num1 % 10;
            result = result + (int)Math.pow(temp,n);
            num1 = num1 / 10;
        }
        return (num == result);
    }

    private static boolean checkArmStrongNumberWithoutGivenOrder(int num){
        int order = findOrderOfElement(num);
        return checkArmStrongNumber(num, order);
    }

    private static int findOrderOfElement(int n){
        int i = 0;
        if( n == 0)
            return n;
        while(n > 0){
            i++;
            n = n/10;
        }
        return i;
    }

    public static void main(String[] args) {

        System.out.println(checkArmStrongNumber(153, 3));
    }
}
