package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2Result {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) +1;
        }
        for(int i=0;i< args.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }

        System.out.println(arr); //주소값 보냄
        System.out.println(arr.toString()); //문자열 보냄
        System.out.println(Arrays.toString(arr));
    }
}
//노션?블로그
