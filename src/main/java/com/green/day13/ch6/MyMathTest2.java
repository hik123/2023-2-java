package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum = 30;

        MyMath2 mm2_2 =new MyMath2();
        mm2_2.num = 100;
        mm2_2.staticNum = 50;
        System.out.printf("mm2.num = %d, staticNum = %d\n", mm2.num,mm2.staticNum);
        System.out.printf("mm2_2.num = %d, mm2_2.staticNum = %d\n", mm2_2.num, mm2_2.staticNum);

        System.out.printf("staticNum = %d\n",MyMath2.staticNum); //보통 static은 MyMath2.staticNum 이렇게 사용
    }
}
