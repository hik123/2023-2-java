package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();
        String r1 = me2.scoreResultOpt(78);
        System.out.printf("학점은 : " + r1);

        /*
        100초과 0미만은 "점수를 확인해 주세요" 값이 리턴
        A학점 8점이상 A+, 3점이하 A-, 나머지 0
        B학점
        C학점
        D학점 (+-0) 없음
         */

        String season = me2.getSeason(10);
        System.out.printf("\n계절은 : %s", season);
        /*
        3, 4, 5 >> 봄 // 1 ~ 10
        6, 7, 8 >> 여름
        9, 10, 11 >> 가을
        12, 1, 2 >> 겨울
        나머지 >> 없음
         */
    }
}
