package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        // 0~10 까지 출력(11번 반복)
        // 3의 배수는 (0포함) 출력이 안 되도록 해주세요
        /*
        1
        2
        4
        7
        8
        10
         */
        int i = 0;
        for (i=0; i<11; i++) {
            if (i % 3 == 0) { continue; }
            System.out.println(i);
        }
    }
}
