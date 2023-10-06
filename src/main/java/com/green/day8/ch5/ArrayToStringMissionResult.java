package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissionResult {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 11, 100 };
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.

        int commaLen = arr.length - 1;
        System.out.print("[");
        for (int i=0; i<arr.length; i++) { //연산 안들어가는게 퍼포먼스상 좋다 //연산 해야한다면 바깥에서 int commaLen = arr.length - 1;
            if(i <commaLen) {
                System.out.printf("%d, ", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.println("]\n");
        System.out.println("(2)-----------------");
        System.out.println("[");
        for(int i=0; i<arr.length; i++) {
            if(i <commaLen) {

            }
        }


        System.out.println("(3)-----------------");
        System.out.println("[");
        for(int i=0; i<arr.length; i++) {
            System.out.print(i <commaLen ? arr[i] + ", " : arr[i]);
        }
        System.out.print("]\n");
    }
}
