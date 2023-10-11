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

        //cntArr[1]++;
        //cntArr[1] += 1;
        //cntArr[1] = cntArr[1] + 1;

        for(int i=0; i<LEN; i++) {
            int val = numArr[i];
            cntArr[val]++;
        }
        System.out.println(Arrays.toString(cntArr));
        System.out.println("------------------");

        /*for(int i=0; i<LEN; i++) {
            int val = numArr[i];
            cntArr[val]++;
        }
         */  //   numArr의 배열값 뽑아서 n에 차례대로 넣음
        for(int n: numArr) { //foreach문 //향상된 for문 // for( 변수타입 변수명: 배열변수명) {}
            cntArr[n]++;
        }
        System.out.println(Arrays.toString(cntArr));


    }
}
