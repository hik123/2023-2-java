package com.green.day4.ch4;

public class AbsResult {
    public static void main(String[] args) {
        int num = 10;
        System.out.printf("%d는(은) 절대값 %d\n", num, Math.abs(num));

        System.out.println("-------------------");

        if(num < 0) {
            System.out.printf("(1)%d는(은) 절대값 %d\n", num, -num);
        } else {
            System.out.printf("(1)%d는(은) 절대값 %d\n", num, num);
        }
    }
}
