package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4};
        printArr(arr); // [3, 2, 1, 6, 5, 4]
        System.out.println(Arrays.toString(arr)); // [3, 2, 1, 6, 5, 4]
        System.out.println("(1)-------");
        /*ReferenceParamEx3.*/sortArr(arr); //.이없다 >>같은공간안에 있다
        System.out.println("(2)-------");
        printArr(arr); // [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6]

        System.out.println("(3)-------");
        System.out.println("sum = " + sumArr(arr)); //배열값을 전부 더한 값
    }

    public static void sortArr(int[] arr) { //오름차순 , 오른쪽이 제일큰값  //
        for (int i=arr.length-1; i>0; i--) {  //i       z
            for (int z=0; z<i; z++) {         //5       0 1 2 3 4
                int nIdx = z + 1;             //4       1 2 3
                if (arr[z] > arr[nIdx]) {     //3       -
                    int tmp = arr[z];         //2       -
                    arr[z] = arr[nIdx];       //1       -
                    arr[nIdx] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void printArr(int[] arr) {
        System.out.printf("[%d", arr[0]);
        for (int i=1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i] );
        }
        System.out.println("]");
    }
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
