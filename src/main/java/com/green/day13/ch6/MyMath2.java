package com.green.day13.ch6;

public class MyMath2 {
    int num; //인스턴스 변수 // 쓸려면 객체화가 되어야 사용가능
    static int staticNum; //static 다른메모리영역에 들어감, static붙는순간 공간이 하나 할당 //객체생성과 상관없 new와 별개
                    //static 붙은 변수는 이미 메모리영역에 올라감
    void instanceAbs() {
        System.out.println(num < 0 ? -num : num);
    }
    void staticAbs() {
        System.out.println(num < 0 ? -num : num);
    }
    static void print() {  //인스턴스 변수 안쓸때  static가능한 붙이자 (속도빠르고, 사용방법 편함) //
        //print2(); static에서 인스턴스 변수 사용불가
        System.out.printf("staticNum : %d\n", staticNum); //MyMath2.static  >> 같은공간에 있어서 MyMath2.생략가능
    }
    void print2() {
        print(); //인스턴스에서 static 사용가능
        System.out.printf("staticNum : %d, num : %d\n", staticNum, num);
    }
}
