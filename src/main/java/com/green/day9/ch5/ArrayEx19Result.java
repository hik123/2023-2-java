package com.green.day9.ch5;

public class ArrayEx19Result {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 수학, 영어 점수
                { 101, 102, 103 },  //1번
                { 21, 22, 23 },     //2번
                { 31, 32, 33 },     //3번
                { 41, 42, 43 },     //4번
                { 51, 52, 53 }      //5번
        }; //\t 탭

        int[] sumArr = new int[score[0].length];
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("-----------------------------");

        /*번호    국어  영어  수학  총점  평균
        ------------------------------------
          1       101  102   103  306   102.0
          ...
          5       51   52    53   ??   ??
          -----------------------------------
          총점     ??   ??   ??
         */
    }
}
