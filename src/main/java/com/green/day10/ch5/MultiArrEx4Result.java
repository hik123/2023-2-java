package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4Result {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                ,{ "computer", "컴퓨터"}
                ,{ "intteger", "정수"}
        };
        Scanner scan = new Scanner(System.in);

        System.out.println("foreach문------향상된for문---------------------");
        int z = 1;
        for(String[] wordArr : words) {
            System.out.printf("Q%d. %s의 뜻은? >> ", z++ , wordArr[0]);
            String answer = scan.nextLine();
            String expectedAnswer = wordArr[1];

            if (!answer.equals(expectedAnswer)) {
                System.out.printf("오답입니다. 정답은 %s 입니다.\n", expectedAnswer);
                continue;
            }
            System.out.println("정답입니다");
        System.out.println("끝!!");
        }

        System.out.println("---------------------------");

        for(int i=0; i< words.length; i++) {
            String[] wordArr = words[i];
            System.out.printf("Q%d. %s의 뜻은? >> ", i + 1, wordArr[0]);
            String answer = scan.nextLine();
            String expectedAnswer = wordArr[1];

            if (answer.equals(expectedAnswer)) {
                System.out.println("정답입니다");
            } else {
                System.out.printf("오답입니다. 정답은 %s 입니다.\n", expectedAnswer);
            }

            System.out.println("---------------------------");

            if (!answer.equals(expectedAnswer)) {
                System.out.printf("오답입니다. 정답은 %s 입니다.\n", expectedAnswer);
                continue;
            }
            System.out.println("정답입니다");
        }
        System.out.println("끝!!");

        /*
        Q1. chair의 뜻은? >> dmlwk
        틀렸습니다. 정답은 의자입니다.

        Q2. computer의 뜻은? >> 컴퓨터
        정답입니다.

        Q3. integer의 뜻은? >> 정주
        틀렸습니다. 정답은 정수입니다.
         */
    }
}

