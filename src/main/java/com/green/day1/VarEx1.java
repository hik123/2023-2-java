package com.green.day1;

public class VarEx1 {
    //psvm
    //메인 메소드
    public static void main(String[] arg) {
        int year = 0;  // int데이터타입  year변수명  우측0값을 year에 담는다
        int age = 14;  //변수 선언 int(타입) 변수명

        int a = 0, b= 0; //int 값, 이어서 적을수있음 a값 b값을 0으로 초기화
        int c = 10;
        System.out.println(c);  // 빨간 밑줄-컴파일에러, 실행 후 에러뜨면 런타임에러

        System.out.println(year);
        year = 100; //year값을 100으로 치환  '='기존 값 상관없이 지우고 치환
        System.out.println(year); //year값 출력

        System.out.println(age);

        System.out.println(age + age + age);
    }
}
