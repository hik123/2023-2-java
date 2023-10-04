package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17MissionResult2 {
    public static void main(String[] args) {
        System.out.print("정수를 입력 하세요! >> ");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
            // int line = 5일때
        for (int i=line; i>0; i--) {  //5부터 1까지 1씩--
            for (int z=1; z<=line; z++) { // 1부터 5까지 1씩++
                                    //   z  <  i        중첩for문 안쪽for문 반복
                if (z < i) {        // 12345   5   ____*
                                    // 12345   4   ___**
                                    // 12345   3   __***
                                    // 12345   2   _****
                                    // 12345   1   *****

                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}