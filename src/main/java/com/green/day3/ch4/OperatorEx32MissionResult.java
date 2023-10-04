package com.green.day3.ch4;

public class OperatorEx32MissionResult {
    public static void main(String[] args) {
        int n =-50;

        if(n < 0) {
            System.out.println(-n);
        } else {
            System.out.println(n);
        }

        System.out.println( n < 0 ? -n : n );

        System.out.println("-----------------------");

        int n2 = -89;
        if(n2 < 0) {
            n2 = n2 * -1;
        }
        System.out.println(n2);


            //원본은 최대한 보존, 안건드리는게 좋다
    }
}
