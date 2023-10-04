package com.green.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {

        //반복문을 사용하여 1~10을 전부 더한 값을 출력
        // 55출력                     //스코프
        int sum = 0;    //지역변수
        for (int i=1; i <11; i++) {
            //sum = sum + i;
            sum += i;
            // int sum = 0; // 반복문 안에있으면 계속 새로운 값
            System.out.printf("sum : %d, i: %d\n", sum, i);
        }
        //System.out.println(i); << for문 {}안에서만 사용가능
        System.out.println("sum : " + sum);
    }

}
