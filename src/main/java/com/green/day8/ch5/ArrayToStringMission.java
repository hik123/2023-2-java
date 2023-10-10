package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 11, 100 };
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            if (i != arr.length-1) {
                System.out.printf("%d, ", arr[i]);
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]\n");
        System.out.println("-----------------------");

        int val = arr.length-1;
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            System.out.print(val != i ? arr[i]+", " : arr[i]); //삼항식
        }
        System.out.print("]\n");

    }
}
