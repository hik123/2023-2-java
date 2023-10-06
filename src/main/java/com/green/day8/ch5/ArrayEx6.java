package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
        //score 안에서 min값과 max값을 찾아서 출력해 주세요.
        int min = 0;
        int max = 0;
        for (int i=0; i<score.length; i++) {
            max = Math.max(max, score[i]);
            min = Math.min(min, score[i]);
        }
        System.out.printf("최대값은 : %d", max);
        System.out.printf("\n최소값은 : %d", min);
    }
}

