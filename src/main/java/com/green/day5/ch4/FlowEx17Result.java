package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Result {
    public static void main(String[] args) {
        System.out.print("정수를 입력 하세요! >> ");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();

        for (int i = 1; i <= line; i++) {
            // i는 1부터 3까지 1씩증가
                // 안쪽 for문을 반복한다고 생각
                    /*
                     입력값 line = 3일때
                     *
                     *
                     *
                     */
            // z는 0부터 1까지 1씩증가
            //  *
            for (int z = 0; z < i; z++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        for (int i = 0; i < line; i++) {
            for (int z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}