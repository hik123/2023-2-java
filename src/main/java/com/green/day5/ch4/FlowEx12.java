package com.green.day5.ch4;

public class FlowEx12 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------1");

        for(int i=0; i<5; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("--------------------------2");

        for(int i=0; i<5; i++) { //i=0, i<5 수정 금지  //12345찍히도록
            System.out.print(i + 100);
        }
        System.out.println();
        System.out.println("--------------------------3");

        for(int i=92; i< 97; i++) { //변경x // * 5개가 찍히게

            System.out.print("*");
        }
        System.out.println();
        System.out.println("--------------------------4");

        for(int i=6; i>0 ; i--) {  //i=6, i-- 변경x  *6개출력 //for문 무한루프 조심
            System.out.print("*");
        }
        System.out.println();
        System.out.println("--------------------------5");



    }


}

