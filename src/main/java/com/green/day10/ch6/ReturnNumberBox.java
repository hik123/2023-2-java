package com.green.day10.ch6;

public class ReturnNumberBox {
    int sum(int n1, int n2) { //void가 아닌것들은 전부 return 메소드
        return n1 + n2;
    }
    int abs(int n1) {
        return n1 < 0 ? -n1 : n1;
    }

}
