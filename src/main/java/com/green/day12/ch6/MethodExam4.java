package com.green.day12.ch6;


import java.util.Arrays;


public class MethodExam4 {
    int[] plusMap(int[] arr, int val) {
        int[] temp = new int[arr.length]; //temp { 0, 0, 0 }
        for (int i=0; i<arr.length; i++) {
             temp[i] = arr[i] + val;  // {12, 22, 32}  //딥카피
        }
        return temp;
    }
    void plusOrigin (int[] arr, int val)  {
        for (int i=0; i<arr.length; i++) {
            arr[i] += val;
        }
        System.out.println(Arrays.toString(arr));
    }
    public int[] randomvalFreomTo(int leng, int min,int max) { //public붙이면 다른 패키지의 메소드 호출 가능?
        int[] arr = new int[leng];
        for (int i=0; i<leng; i++) {
            arr[i] = (int)(Math.random() * max - min + 1) + min;
        }
        return arr;
    }

    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = { 10, 20, 30, 40, 50 }; //
        int[] rArr1 = me4.plusMap(arr, 2); //arr각 배열값에 +2 되는 새로운배열
        System.out.println(Arrays.toString(arr)); // [10, 20, 30]
        System.out.println(Arrays.toString(rArr1)); // [12, 22, 32]

        System.out.println("--------------------");

        me4.plusOrigin(arr, 4); // 원본이 4씩 더해지게 [14, 24, 34]

        System.out.println("--------------------");
        //(배열크기, 랜덤값min값, 랜덤max값) 중복허용
        int[] rArr2 = me4.randomvalFreomTo(10, 5, 20);
        System.out.println(Arrays.toString(rArr2));
    }
}
