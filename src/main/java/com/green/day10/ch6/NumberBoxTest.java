package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox();  //변수 선언과 동시에 초기화 //레퍼런스 변수는 주소값(객체, 배열) 만 담을수있다
        nb1 = new NumberBox();

        nb1.sum(10, 20); //메소드를 호출!
        nb1.sum(30, 40); //(argument)

        System.out.println("-----------------");
        nb1 = new NumberBox();
        nb1.minus(40, 20); // 40 - 20 = 20

        System.out.println("-----------------");
        nb1.abs(-10); //10
        nb1.abs(10); //10
        nb1.abs(-33); //33
        nb1.abs(39); //39
    }
}
