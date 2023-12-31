package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for문을 활용하여 구구단 2~9단 출력
        /*
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18

        3 x 1 = 3
        3 x 2 = 6
        ..
        9 x 9 = 81
         */
        for (int i=2; i<=9; i++) {
            for(int z=1; z<=9; z++) {
                System.out.printf("%d X %d = %d\n", i, z, i*z);
            }
            System.out.println("----------");
        }
    }
}
