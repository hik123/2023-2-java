package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 11, 100 };
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.

        int comLen = arr.length-1;
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            if (i <= comLen) {
                System.out.print(", ");
            }
            System.out.printf("%d",arr[i]);
        }
        System.out.println("]");
    }
}
