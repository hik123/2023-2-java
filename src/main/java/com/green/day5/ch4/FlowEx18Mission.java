package com.green.day5.ch4;

public class FlowEx18Mission {
    public static void main(String[] args) {
        // 2 x 1 = 2 (\t) 3 x 1 =3 ... (\t) 9 x 1 = 9

        for (int i=1; i<=9; i++) {
            for (int z=2; z<=9; z++) {
                System.out.printf("%d X %d = %d\t", z, i, i*z);
            }
            System.out.println();
        }
    }
}
