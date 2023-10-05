package com.green.day7.ch5;

public class Array3MissionResult2 {
    public static void main(String[] args) {

        int[] arr1 = {5, 10, 15, 16, 17};
        int[] arr2 = new int[arr1.length +1];

        for(int i=0; i<arr1.length; i++) { //5
            arr2[i] = arr1[i]; // 5, 10, 15, 16, 17, 0
        }
        arr2[arr1.length] = 20; // 5, 10, 15, 16, 17, 20

        for(int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n",i, arr2[i]);
        }
    }
}
