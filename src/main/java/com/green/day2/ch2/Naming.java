package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args) {
        //1. 대소문자 구별, 길이제한 x
        int abc, aBc, abC, adsffsdafsdf;

        //2. 이름으로 예약어 사용 x
        // int int, void, static;

        //3. 숫자로 시작 x(처음만 아니면 된다)
        //int 1ab; x
        int a1b, ab1;

        //4. 특수 문자 _, $만 가능
        int _ab, $ab;

        //----------------------------

        // 케이스 기법
        // hello my name is hong

        // 1. 파스칼 케이스 기법 (클래스명) - 단어마다 첫번째 문자를 대문자로 바꿔서 합침, 변수명은 띄어서X
        // HelloMyNameIsHong  << 대문자로 시작

        // 2. 카멜 케이스 기법 (변수명, 메소드명) <<클래스 빼고 대부분사용
        // helloMyNameIsHong << 첫단어만! 소문자로 시작

        // 3. 케밥 케이스 기법 (자바에서 못씀 css에서 사용)
        // hello-my-name-is-hong

        // 4. 스네이크 케이스 기법 (쓸수는 있지만 사용 안함)
        // hello_my_name_is_hong

        //

        //-----------------
        // 상수는 전부 대문자 구분은 언더바

        // PI, MAX_NUMBER
        final int PI, MAX_NUMBER = 10;  // 변수명 앞에 final 붙으면 상수 됨

        //변수 기본형 속도빠름 //

        Date today = new Date();  //데이터타입 대문자(레퍼런스 변수) 참조형, 소문자 기본형
    }
}