package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5); // *****(개행)
        sp.line(7); // *******(개행)
        System.out.println("--------------------");
        sp.square(4);
        //****
        //****
        //****
        //****
        System.out.println("-------------");
        sp.triangle(5);
        //*
        //**
        //***
        //****
        //*****
        System.out.println("------------gender-------------");
        String gender = sp.chkGenderById("011231-8117111");
        System.out.println("성별 : "+gender);
            /* 8번째 자리의 숫자가
            2, 4이면 > 여성
            1, 3이면 > 남성
            이외의 값이면 > 유효하지 않은 주민번호
             */
        System.out.println("----------sum-------------");
        int sum = sp.sumFromTo(1,3);
        int sum2 = sp.sumFromTo(10,12);
        System.out.printf("총합은 : %d\n", sum);
        System.out.printf("총합은 : %d\n", sum2);
    }
}
