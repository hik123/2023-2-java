package com.green.day4.ch4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // 10는(은) 절대값 10
        // -9는(은) 절대값 9
        // -6는(은) 절대값 6
        if (num > 0) {
            System.out.printf("%d는(은) 절대값 %d", num, num);
        } else {
            System.out.printf("%d는(은) 절대값 %d", num, -num);
        }
        //System.out.println( num < 0 ? -num : num );
    }
}
