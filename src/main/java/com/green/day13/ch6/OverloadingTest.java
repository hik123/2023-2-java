package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(10.2D);
    }
    void print () {}
    void print (int t)  {}
    void print(int n1, int n2) {}

    //int print(int n3, int n4) {}
    void print(String n2, int n1) {}
    void print(int n1, String str2) {}
    //오버로딩 리턴타입이랑 상관없다

}
