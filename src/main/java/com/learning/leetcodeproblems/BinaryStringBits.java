package com.learning.leetcodeproblems;
/*
    Print binary strings with n bits.
    Example: 0 0
             0 1
             1 0
             1 1
 */
public class BinaryStringBits {

    public static void main(String[] args) {
        int bitLength = 2;
        int[] arr = new int[bitLength];
        bitsGenerator(bitLength, 0, arr);
    }

    public static void bitsGenerator(int bitLength, int num, int[] bits){

        if(bitLength == num){ // Base condition to break the recursion.
            for(int i = 0 ; i < bits.length; i++)
                System.out.print(bits[i]+"\t");
            num = 0;
            System.out.println();
            return;
        } else {
            bits[num] = 0;
            bitsGenerator(bitLength, num + 1, bits);
            bits[num] = 1;
            bitsGenerator(bitLength, num + 1, bits);
        }

    }
}
