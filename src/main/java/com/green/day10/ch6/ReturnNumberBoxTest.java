package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox(); //ReturnNumberBox rnb >> ReturnNumberBox 객체의 주소값을 담을수 있는 레퍼런스 변수
        int r1 = rnb.sum(10, 20);
        System.out.println("r1 : " + r1);

        int r2 = rnb.sum(20, 30); //= 50
        System.out.println("r2 : " + r2);
        System.out.println(" -- 끝 -- ");

        int r3 = rnb.abs(-10); //메소드 호출 //리턴 메소드
        System.out.println("r3 : " + r3); //10

        System.out.println("r4 : " + rnb.abs(10)); //10
        System.out.println("r4 : " + rnb.abs(-99)); //99
        System.out.println("r4 : " + rnb.abs(98)); //98


    }
}
