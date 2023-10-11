package com.green.day10.ch6;

public class NumberBox { //클래스는 문서
    void sum(int n1, int n2) {  //메소드를 정의
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }
    void minus(int n1, int n2) {  //메소드를 정의
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }
    void abs (int n1) {
        if (n1 > 0) {
            System.out.printf("%d\n", n1);
        } else {
            System.out.printf("%d\n", -n1);
        }
        //return; << void 마지막에 자동으로 return; 되서 안적어도됨
    }  //리턴 메소드 만들때는 void 마지막에 return; 넣어야됨
}
