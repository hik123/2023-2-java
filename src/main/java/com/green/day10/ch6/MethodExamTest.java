package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10); // 0 이 아닙니다.
        me.checkZero(9);  // 0 이 아닙니다.
        me.checkZero(0);  // 0 입니다.

        int r = me.randomValFreomTo(10, 100); //10 ~ 100랜덤값 리턴되도록;
        int r2 = me.randomValFreomTo(5, 9); //5 ~ 9랜덤값 리턴되도록;

        System.out.println(r2);
        System.out.println("-----------------------------");
        for(int i=0; i<10; i++) {
            System.out.println(me.randomValFreomTo(10, 100));
        }

        System.out.println("-----------------------------");
        me.scoreResultPrint(101); //잘못된 점수입니다
        me.scoreResultPrint(100); //A학점
        me.scoreResultPrint(90);  //A학점
        me.scoreResultPrint(89); // B학점
        me.scoreResultPrint(80); // B학점
        me.scoreResultPrint(79); // C학점
        me.scoreResultPrint(69); // D학점 (69점 이하는 전부 D학점)
        me.scoreResultPrint(-1); // 잘못된 점수 입니다.
    }
}
