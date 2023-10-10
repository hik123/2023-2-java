package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11Result {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for(int i=0; i<LEN; i++) {
            int rVal = (int)(Math.random() * 10);
            numArr[i] = rVal;
        }
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i<LEN; i++) {
            int val = numArr[i];
            cntArr[val]++;
        }
        System.out.println(Arrays.toString(cntArr));

    }
}
