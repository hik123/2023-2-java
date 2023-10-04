package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) >>> ");
        Scanner scan = new Scanner(System.in);
        String vil2 = scan.nextLine();

        char vil = vil2.charAt(7);
        switch(vil) { //문자 문자열 정수만 되고 boolean, 실수 타입 안됨
            case '1', '3':
                System.out.println("남자");
                break;
            case '2', '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("유효하지않은 주민등록번호");
                break;
        }
        // 주민번호 입력받고, 주민번호를 확인하고,
        // > 여자인지 남자인지, 유효하지 않은 주민등록번호인지 출력 / 1,3남자 / 2,4여자
        //switch문 사용
    }
}
