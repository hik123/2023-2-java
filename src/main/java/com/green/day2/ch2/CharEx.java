package com.green.day2.ch2;

public class CharEx {
    public static void main (String[] args) {
        char ch = '4';   //실제로는 정수타입 / 숫자를 문자로 인코딩 , 문자를 숫자로 디코딩
        int val = 66;

        System.out.printf("%c: %d\n", ch, (int)ch);
        System.out.printf("%c: %d\n", (char)val, val);
    }
}
