package com.green.day4.ch4;

public class Switch {
    public static void main(String[] args) {
        int val = 10;

        switch(val) { //switch는 범위 지정못함 ==밖에안됨 , 문자열도 자동으로equals됨
            case 1:
                System.out.println("1이다.");
                break;
            case 2:
                System.out.println("2이다.");
                break;
            case 3 :
                System.out.println("3이다.");
                break;
            default: // default 위치가 중간, 맨위에 있어도 상관없다
                System.out.println("1~3이 아니다.");
                break; // 마지막줄 break 생략해도 상관없다
        }
        System.out.println("--끝--");
    }
}
