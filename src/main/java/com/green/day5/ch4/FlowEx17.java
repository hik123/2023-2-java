package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        /*
        Scanner를 이용하여 정수를 입력 받으신다.
        "*을 출력할 라인의 수를 입력하세요 >> "

        만약 3을 입력        4 입력
        *                   *
        **                  **
        ***                 ***
                            ****
         */
        System.out.print("정수를 입력 하세요! >> ");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        for (int i=1; i<=val; i++) {
            for(int z=0; z<i; z++) {
                System.out.printf("*");


                }
            System.out.println();
            }
        }
    }
