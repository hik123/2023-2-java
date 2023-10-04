package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0; //초기화
        System.out.printf("x=%d 일 때, 참인 것은\n", x);
        if (x == 0) {System.out.println("x == 0"); } //boolean타입
        if (x != 0) {System.out.println("x != 0"); }

        System.out.println("-----------------");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);
        if (x == 0) {
            System.out.println("x == 0");
            System.out.println("x == 0");
            System.out.println("x == 0");
        }
        if (x != 0) {System.out.println("x != 0"); }

        if ( !(x == 0) ) {System.out.println("!(x == 0)"); } //!(not) 연산결과를 반대로
        if ( !(x != 0) ) {System.out.println("!(x != 0)"); }

        System.out.println("끝!");
    }
}
