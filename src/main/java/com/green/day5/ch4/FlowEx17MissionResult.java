package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17MissionResult {
    public static void main(String[] args) {
        System.out.print("정수를 입력 하세요! >> ");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int z = line-i; z>0; z--) { // ; ; z>0 부분은 연산들어가면 반복마다 연산해서 연산안넣는게
                System.out.print("_");
            }
            for(int z=0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}