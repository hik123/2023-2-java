package com.green.day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        double dval = Math.random();
        for (int i=0; i<arr.length; i++) {
            int val = (int)((Math.random() * 10) + 1) ;
            arr[i] = val;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
        System.out.println("-----------------------");
         /*
        5개 방을 갖고 있는 정수형 배열 만들고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
        중복 허용
         */
        //double dval2 = Math.random();
        int[] arr2 = new int[5];
        for(int i=0; i<arr2.length; i++) {
            int val2 = (int)Math.random();
        }

    }
}
