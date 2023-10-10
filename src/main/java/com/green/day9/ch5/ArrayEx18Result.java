package com.green.day9.ch5;

public class ArrayEx18Result {
    public static void main(String[] args) {
        int[][] score = {
                { 101, 102, 103 },
                { 21, 22, 23 },
                { 31, 32, 33 },
                { 41, 42, 43 }
        };
        for(int i=0; i<score.length; i++) {
            int[] arr = score[i];
            for(int z=0; z<arr.length; z++) {
                //sum += arr[z];
                int val = score[i][z];
                System.out.printf("score[%d][%d] = %d\n", i, z, score[i][z]);
            }
        }

        //향상된 for문을 이용하여 sum값을 구하고 싶다.
        int sum = 0;
        for (int[] arr: score) { // int[] >> score각방의 타입인 정수int[]형을 적음
            for(int val : arr) {
                sum += val;
            }
        }

        System.out.printf("sum : %d\n", sum);
    }
}
