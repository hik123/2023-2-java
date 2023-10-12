package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n) {
        //System.out.println(n == 0 ? "0 입니다." : "0 이 아닙니다.");
        if(n==0) {
            System.out.println("0 입니다.");
            return;
        }
        System.out.println("0 이 아닙니다.");
    }
    int randomValFromTo(int n1, int n2) {
        int rVal = (int) (Math.random() * (n2 - n1 + 1)) + n1;
        return rVal;
    }

    void scoreResultPrint(int score) {
        /*
        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수 입니다.");
        } else if (score / 10 >= 9) {
            System.out.println("A학점");
        } else if (score / 10 >= 8) {
            System.out.println("B학점");
        } else if (score / 10 >= 7) {
            System.out.println("C학점");
        } else if (score / 10 <= 6) {
            System.out.println("D학점");
        }
        */
        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수 입니다.");
            return;
        }
        String grade ="D";
        if (score >= 90) {
            grade = "A";
        } else if ( score >= 80) {
            grade = "B";
        } else if ( score >= 70) {
            grade = "C";
        }
        System.out.printf("%s학점\n", grade);
    }
}
