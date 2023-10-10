package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2Result {
    public static void main(String[] args) {
        final int LEN = 5;                              //<<<
        int[] arr = new int[5];         //의미가있는 숫자 매직넘버 따로 이름을 주는것도 좋다
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) +1;
        }                                                   //
        for(int i=0;i< args.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }

        System.out.println(arr); //주소값을 보냄
        System.out.println(arr.toString()); //문자열 보냄 // arr이름을 적는느낌
        System.out.println(Arrays.toString(arr));
    }
}
//노션?블로그
