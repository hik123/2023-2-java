package com.green.day7.ch5;

import java.util.function.DoubleFunction;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 20, 40};
        int[] arr2 = new int[arr1.length]; //new int[6] 방크기=6
        String[] arr3 = new String[arr1.length]; // 대문자로 시작하는 배열 만들면 null로 나옴  //new int[ ] 정수타입은 다들어갈수있다
        String str = arr3[0];
        String[] arr4 = arr3; //타입이 맞아야 똑같이 담을수 있다.
        //String str = arr3; //타입이 달라서 안됨

        arr4[0] = "AAA";

        System.out.println("-----arr3");
        for(int i=0; i<arr3.length; i++) {
            System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
        }

        for(int i=1; i<arr1.length; i++) {
            arr2[i] = arr1[i];  //딥카피            //주소값만 복사(셸로우카피,얕은복사)
        }
        // 동등성(equals),주소값 달라도 서로 가진값이 같으면 같은값이면 동등) , 동일성(==, 주소값이 같은지)
               // 동등성 비교에선 딥카피 셸로우카피 둘다 true              //동일성 >> 딥카피false뜸, 셸로우카피true
        arr2[1] = 200;
        for (int i=0; i<arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
        for (int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
