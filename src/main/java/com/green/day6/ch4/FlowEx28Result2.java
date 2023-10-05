package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28Result2 {
    public static void main(String[] args) {
        // int input = 0; // while문이 끝나도 마지막에 입력된 input값은 살아있다
        int answer = (int) (Math.random() * 100) + 1; //1~100
        System.out.println("answer : " + answer);
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("1~100 사이 정수 >> "); //System <<클래스 //System.out속성 //()있을때 메소드
            final int input = scan.nextInt(); //Scanner라는 객체의 메소드 //스코프 밖에서 사용불가 while문 안에서만 사용
             //final 상수 속도가 빠름 // 꼭 대문자로 할필요없는 없다 // 상수 빠르게 인지 하고싶다면 대문자 final INPUT
            if(input == answer) {break;}
            System.out.println(input < answer ? "up" : "down");
        }
        System.out.println("끝!!");
    }
}
        /*
        while
        1~100 사이의 정수를 입력하세요 >>
        입력숫자보다 정답이크다 > "up"
        입력숫자보다 정답이작다 > "Down"
        맞출때까지 반복한다.

         */
    //객체 > 속성(키,몸무게), 메소드(움직이는 모든것,뛴다,하품한다)로 구성
            //전역변수 >>속성(멤버필드)
    //깃허브
        //현상관리 로컬 (git) 에 저장할수있어서 인터넷이 안될때도 사용가능
        //중앙집중 서비스로 github를 많이 사용한다
        //pull
        //작업도중 내꺼먼저 comit하고 pull받고 작업끝내고 push
        //프로젝트 진행시 가능한 한파일은 한사람이 작업 끝나고 나서

