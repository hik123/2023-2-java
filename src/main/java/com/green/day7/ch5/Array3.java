package com.green.day7.ch5;

import java.util.function.DoubleFunction;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 20};
        int[] arr2 = new int[arr1.length]; //new int[6] 방크기=6

        for(int i=1; i<arr1.length; i++) {
            arr2[i] = arr1[i];  //딥카피          //주소값만 복사(셸로우카피,얕은복사)
        }
        // 동등성(equals,주소값 달라도 서로 가진값이 같으면 동등) , 동일성(==, 주소값이 같은지)
                                                            //동일성 >> 딥카피false뜸
        arr2[1] = 200;
        for (int i=0; i<arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
        for (int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
