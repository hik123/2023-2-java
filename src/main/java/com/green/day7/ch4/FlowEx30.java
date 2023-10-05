package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        //반복문 사용
        //
        int sum = 0;
        int i = 0;
        //i값이 계속 증가가 되면 sum에 중첩으로 더하기
        //sum값이 100초과가 되는 시점의 i값
        for (i=0; i<101; i++){
            System.out.printf("sum=%d, i=%d\n",sum += i, i);
            if (sum > 100) {
                System.out.println(sum);
                break;
            }



        }
    }
}
