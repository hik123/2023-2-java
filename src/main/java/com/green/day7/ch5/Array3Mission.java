package com.green.day7.ch5;

public class Array3Mission {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};
        //arr2는 길이가 4 , arr1과 같은 방은 같은 값을 가지고 있고
        //3번 방은 20을 갖고 있는 배열을 만들어 주세요.
        int[] arr2 = new int[4];
        arr2[3] = 20;
        for(int i=0; i<arr1.length; i++ ) {
            arr2[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
