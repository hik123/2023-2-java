package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random(); // Math.random 메소드 > 절대 1이 안나옴최소0.00~최대0.9999
        System.out.println("val" + doubleVal);

        int intVal = (int)(doubleVal * 10); //(doubleVal)연산 끝나고나서 (int)로 바꿈 //doubleVal소괄호 없으면 실수값 날아감
        System.out.println("intVal : " + intVal);

        int rVal = (int)(Math.random() * 20); //최소최대값 0~19
        System.out.println("rval : " + rVal);
    }
}
