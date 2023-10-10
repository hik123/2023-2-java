package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {        //2차원배열    //int[][][] arr >> 3차원배열
                { 100, 200 },
                { 300, 400 },
                { 500, 600 } //정수 배열 타입
        };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

        System.out.println("--------------");
        int[] intArr = arr[0];
        System.out.println("intArr.length : "+ intArr.length);
        System.out.println(intArr[0]);
        System.out.println("--------------");
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        /*
        int[] intArr1 = arr[0];

        int newIntArr = { 1, 2, 3, 4 };
        arr[0] = newIntArr;
        */
    }
}
