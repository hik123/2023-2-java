package com.green.day2.ch3;

public class OperatorEx23 {
    public static void main (String[] args) {
        String s1 = "Hello", s2 = "Hello";
        String s3 = new String("Hello"); //새로운 주소값 할당

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2); //동일성 비교
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3)); //java에서 문자열 비교는 equals
        System.out.printf("%s.equals(%s) : %b\n", s3, s1, s3.equals(s1)); //동등성 비교

        //reference type 에서 == 비교는 주소값 비교 // 같은객체인지

    }
}
