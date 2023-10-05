package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
        // break를 사용할 수 있는 곳: switch, 반복문

        //continue 를 사용할 수 있는 곳: 반복문

        for (int i=0; i<10; i++) {
            System.out.println(i);
            if(i==5) { break; }
            // break; //가장 가까운 for(반복)문 그냥 빠져나옴 //보통은 분기문if 과 함께쓰인다
        }
        System.out.println("------------------");
        for(int i=0; i<10; i++) {
            if(i % 2 == 0) { continue; }       //continue 아래 실행x
            System.out.println(i);
        }
    }
}
