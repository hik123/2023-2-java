package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();  // 숫자말고 딴거넣으면 에러

        //score 값이 90점보다 같거나 크면 A학점 출력
        //score 값이 80점보다 같거나 크면 B학점 출력
        //1의 자리수가 8이상이면 +, 3이하이면 -, 나머지는 없음(빈칸)
        //나머지 C학점 출력

        //예를 들어 92점 > A-, 94점>A, 98점 > A+ 출력
        //          83점 > b- 출력,  86 > B,  89점 > B+
        //          75 or 79 or 71 > C
        if (100 >= score && score >= 90) {
            if (score >= 98) {
                System.out.println("A+");
            } else if (score >= 94) {
                System.out.println("A ");
            } else {
                System.out.println("A-");
            }
        }

        else if (90 >= score && score >= 0) {
                if (score >= 88) {
                    System.out.println("B+");
                } else if (score >= 84) {
                    System.out.println("B ");
                } else if (score >= 80) {
                    System.out.println("B-");
                } else if (score >= 0) {
                    System.out.println("C");
                }
        }
        else {
            System.out.println("잘못 입력 하셨습니다"); }
    }
}
            // if
            // else if
            // else
