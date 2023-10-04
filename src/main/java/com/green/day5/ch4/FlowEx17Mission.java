package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        System.out.print("정수를 입력 하세요! >> ");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();

        //5 입력
        /*
        ____*
        ___**
        __***
        _****
        *****
         */
        for (int i=1; i<=line; i++) {
            for(int z=line; z>i; z--) {
                System.out.print("_");
                    //for(int s=1; s<i; s++); {
                    //  System.out.print("*");
                    //}
            }
            for (int x=0; x<i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
