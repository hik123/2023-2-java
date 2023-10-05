package com.green.day6.ch4;

import java.util.Scanner;
public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1; //1~100
        System.out.println("answer : " + answer);
        System.out.print("1~100 사이의 정수를 입력하세요 >> ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        while (true) {
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            input = scan.nextInt();
            if (input < answer) {
                System.out.println("UP");
            } else if ( input > answer) {
                System.out.println("Down");
            } else {
                break;
            }



        }
        /*
        while
        1~100 사이의 정수를 입력하세요 >>
        입력숫자보다 정답이크다 > "up"
        입력숫자보다 정답이작다 > "Down"
        맞출때까지 반복한다.

         */
    }
}
        //깃허브
        //현상관리 로컬 (git) 에 저장할수있어서 인터넷이 안될때도 사용가능
        //중앙집중 서비스로 github를 많이 사용한다
        //pull
        //작업도중 내꺼먼저 comit하고 pull받고 작업끝내고 push
        //프로젝트 진행시 가능한 한파일은 한사람이 작업 끝나고 나서

