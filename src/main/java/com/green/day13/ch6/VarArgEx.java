package com.green.day13.ch6;

public class VarArgEx {
    public static void sum(int... arr) {
        System.out.println(arr.length);
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("sum : %d\n", sum);
    }
    public static void main(String[] args) {
        sum(10, 20); //sum : 30 출력 되게끔
        sum(10, 20, 30);// sum : 60
        sum(10, 20, 30, 40, 40, 40, 50, 50);
        sum(10, 11, 12, 13, 10, 10);
    }
}
