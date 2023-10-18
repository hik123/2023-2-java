package com.green.day14.ch6;

public class Card {
    String pattern;
    String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern; //지역변수와 전역변수 이름 같을때 가까운거 사용
        this.denomination = denomination; //this.(주소값.) 전역변수 메소드 호출할때
        // 우클릭 generate constructor //컬렉션 배열
    }

    void printMySelf() {
        System.out.printf("%s (%s)\n", pattern, denomination);
    }
}
