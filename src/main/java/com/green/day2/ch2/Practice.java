package com.green.day2.ch2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //5 입력
        /*
        *****
        ****_
        ***__
        **___
        *____
         */
        System.out.print("숫자 입력 : ");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        for (int i=1; i<=val; i++) {  //1~5 증가
            for(int z=val; z>0 ; z--) { // 5~1 감소
                if ( z > i) {
                    System.out.print("*");
                } else {
                    System.out.println("_");
                }
                System.out.println();
            }
        }
    }
}
