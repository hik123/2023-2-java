package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16Result {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<strArr.length; i++) {
            System.out.print("문자열 입력 >> ");
            String val = scan.nextLine();
            strArr[i] = val;
        }
        for(String s : strArr) {
            System.out.println(s);
        }
    }
}
