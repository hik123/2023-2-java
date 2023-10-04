package com.green.day2.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        // int score = d;  타입이 달라서 안됨
        int score = (int)d;
        System.out.println("score : " + score);

        byte b1 =127;
        short s1 = (short)b1; // short 굳이 안넣어도
        int i1 = s1;  // 자동형변환

        float f1 = i1;  //
        int i2 = (int)f1; //강제형변환


    }
}
