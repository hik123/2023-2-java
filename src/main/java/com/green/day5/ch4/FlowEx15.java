package com.green.day5.ch4;

public class FlowEx15 {
    public static void main(String[] args) {
        final int DAN = 11;
        for (int i=1; i<10; i++) {
            int val = (DAN * i);
            System.out.printf("%d x %d = %d\n",DAN, i, val);
        }
        /*
        반복문 사용
        6 x 1 = 6
        6 x 2 = 12
        6 x 3 = 18
        ...
        6 x 9 = 54
         */
    }
}
