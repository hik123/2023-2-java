package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
            //첫번째: 공간: 초기화 공간
            //두번재: 반복여부체크
            //세번째: 증감식
        for(int i=0; i<=3; i++) {  // 순서 0번i=0;  1번i<5  3번i++ //1번이 false 될때까지 되는순간 for문 빠져나옴  // for () {}  {}사이를 반복
            System.out.println("안녕"); //  2번sout
        }
        System.out.println("-- 끝 --");

        int j = 0;
        for( ; j<10; ) {
            System.out.println("j : " + (++j));
        }
    }
}
