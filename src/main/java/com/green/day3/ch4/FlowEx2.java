package com.green.day3.ch4;

import java.util.Scanner;
/*
    Scanner
    if
    parsing
 */
public class FlowEx2 {
    public static void main(String[] args) {
        // (콘솔) 숫자를 하나 입력하세요 >
        // (입력 기다려야함)
        // 숫자가 입력하고 엔터를 누르면
        // 문자열String 변수에 해당값이 저장될 수 있도록
        // 해당 문자열을 > 정수형으로 형변환
        // 해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        // 해당 숫자가 0이 아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다.
        // 완성하고 FlowEx2에 올리기

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 하나 입력하세요 > ");//
        String str = scan.nextLine();
        int num = Integer.parseInt(str); //메소드 parseInt 문자열 하나하나를 정수로 바꿈

        if (num == 0) {System.out.println("입력하신 숫자는 0입니다."); }
        if (num != 0) {System.out.println("입력하신 숫자는 0이 아닙니다."); }



    }
}
