package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        //남자의 평균키 170, 여자의 평균키 157
        //Scanner를 이용하여 성별을 입력 받습니다. (남, 여)
        //키를 입력 받습니다.
        //평균키 미만이면 "156cm는 남자 평균 이하입니다."
        //평균키랑 같다면 "170cm는 남자 평균입니다."
        //평균키 초과면 "170cm는 남자 평균 초과입니다."

        //평균키 미만이면 "146cm는 여자 평균 이하입니다."
        //평균키랑 같다면 "157cm는 여자 평균입니다."
        //평균키 초과면 "170cm는 여자 평균 초과입니다."

        Scanner scan = new Scanner(System.in);
        System.out.print("본인의 성별을 입력하세요(남자/여자) : ");
        String gen = scan.nextLine();
        System.out.print("본인의 키를 입력하세요 : ");
        int tall = scan.nextInt();


        if (gen.equals ("남자")) {
            if (tall > 170) {
                System.out.printf("%dcm는 남자 키 평균초과 입니다.", tall);
            } else if (tall < 170) {
                System.out.printf("%dcm는 남자 키 평균미만 입니다.", tall);
            } else {
                System.out.printf("%dcm는 남자 키 평균 입니다.", tall);
            }
        }
        else if (gen.equals ("여자")) {
            if (tall > 157) {
                System.out.printf("%dcm는 여자 키 평균초과 입니다.", tall);
            } else if (tall < 157) {
                System.out.printf("%dcm는 여자 키 평균미만 입니다.", tall);
            } else {
                System.out.printf("%dcm는 여자 키 평균 입니다.", tall);
            }
        }
    }
}
