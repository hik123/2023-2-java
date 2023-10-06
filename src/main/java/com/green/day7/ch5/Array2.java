package com.green.day7.ch5;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200};
        int[] arr2 = {5, 10, 15};

        for(int i=0; i<arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }

        arr1 = arr2; //셸로우 카피(주소값8byte, 얕은 복사) 주소값만 복사  //딥카피 ex)10개짜리 배열을 그대로 복사
        System.out.println(arr1[0]);

        System.out.println("-------------------");

        arr1[1] = 44;
        arr2[2] = 55;

        for(int i=0; i<arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        System.out.println("||||||||||||");
        for(int i=0; i<arr2.length; i++) {
            System.out.printf("arr1 [%d] : %d\n", i, arr2[i]);
        }
        System.out.println("arr1 == arr2 : " + (arr1 == arr2)); //레퍼런스 사이의 ==식은 주소값비교
    }
}
