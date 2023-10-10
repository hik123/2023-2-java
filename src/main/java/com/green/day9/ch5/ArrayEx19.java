package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 수학, 영어 점수
                { 101, 102, 103 },  //1번
                { 21, 22, 23 },     //2번
                { 31, 32, 33 },     //3번
                { 41, 42, 43 },     //4번
                { 51, 52, 53 }      //5번
        }; //\t 탭
        // sum = score[0][0] + score[0][1] + score[0][3] 각각 나와야
        // sum = score[1][0] + score[1][1] + score[1][2]
        int sum = 0;
        int i = 0, z = 0;
        int avg = 0;
        int [] arr = score[i];
        System.out.print("번호\t국어\t수학\t영어\t총점\t평균\n");
        System.out.print("------------------------\n");
        for (i=0; i<score.length; i++) { //5
            System.out.print(i+1+"\t");
            for (z=0; z<arr.length; z++ ) { //3
                System.out.print(score[i][z]+"\t");
                sum += score[i][z];
                avg = sum/arr.length;
            }
            System.out.print(""+sum);
            System.out.print("\t"+avg);
            System.out.println();
            sum=0;
        }
        System.out.print("------------------------\n");
        for (i=0; i<score.length; i++) { //5
            for (z=0; z<arr.length; z++) { //3
                sum += score[i][z];  // sum = score[0][0] + score[1][0] + score[2][0] 각각 나와야
                                     // sum = score[0][1] + score[1][1] + score[2][1]
            }
            System.out.print("총점\t");
            System.out.print(sum);
        }
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
