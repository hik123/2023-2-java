package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 > ");
        String str = scan.nextLine();
        int val = Integer.parseInt(str);

        if (val == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }
        if (val != 0) {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        System.out.printf("입력하신 숫자는 %d입니다.", val);

        }
    }
}
