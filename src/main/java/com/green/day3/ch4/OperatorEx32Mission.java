package com.green.day3.ch4;

import java.util.Scanner;

public class OperatorEx32Mission {
    public static void main(String[] args) {
        // 만약에 n이 (음수 아무값) -10 이였다면 콘솔에 10이 출력
        // 만약에 n이 (양수 아무값) 9 이였다면 콘솔에 9가 출력
        // 음수든 양수든 무조건 양수가 출력되어야함
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");

        int val = scan.nextInt();

        if (val < 0) {
            System.out.printf("값 : %d", -val);

        } else
            System.out.printf("값 : %d", val);

        //-------------------------------

        System.out.printf("값 : %d", val < 0 ? -val : val);



        System.out.println("\n-------------------");
        int n = -10;
        n = n * -1;
        n = -n; // -n  n값에 -를 곱하는것과 같다
        System.out.println("n:" + n);
    }
}
