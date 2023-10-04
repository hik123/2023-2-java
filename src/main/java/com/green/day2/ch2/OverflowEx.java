package com.green.day2.ch2;

public class OverflowEx {
    public static void main(String[] args) {
        int intVal = 128;
        byte byteVal = (byte)intVal;  //int byte 타입이 안맞아서 연산 불가

        System.out.printf("byteVal : %d\n", byteVal);

        int intVal2 = 129;
        byte byteVal2 = (byte) intVal2;
        System.out.printf("byteVal2 : %d\n", byteVal2); //오버플로우Overflow

        int intVal3 = -130;
        byte byteVal3 = (byte)intVal3; //언더플로우 Underflow
        System.out.printf("byteVal3 : %d\n", byteVal3);

    }
}
