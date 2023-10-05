package com.green.day7.ch4;

import java.util.Scanner;
public class FlowEx29 {
    public static void main(String[] args) {
        // 3, 6, 9 게임
        // i = 1
        // i = 2
        // i = 3 짝
        // i = 4 //i = 5 // i = 6 짝
        // i = 30 짝 // i = 33 짝짝 // i ==99 짝짝

        for(int i=1; i<=101; i++) {
            System.out.printf("i=%d", i);
            int temp = i;
            while(temp > 0) {
                int modVal = temp % 10;
                if (modVal != 0 && modVal % 3 == 0) { //&&둘다 트루여야
                    System.out.print("짝");
                }
                temp /= 10;
            }
            System.out.println();
            //일단 1의자리숫자를 가져옴
            //반복문으로 10으로 나눈 몫이 0이 될때까지 계속 반복
        }
    }
}
