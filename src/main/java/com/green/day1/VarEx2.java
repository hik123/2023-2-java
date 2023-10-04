package com.green.day1;

public class VarEx2 {
    public static void main(String [] args) {
        int x = 10, y = 20; //int정수형, 상수-한번 입력된 값이 변경되지 않는다,  상수,리터럴
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x : " + x); // +는 문자열 합칠때도 사용 , x는 문자열로 자동형변환
        System.out.println("y : " + y);
    }
}
