package com.green.day2.ch2;

public class StringEx {
    public static void main(String[] args){
        String name = "ja" + "va";
        System.out.println(name);

        System.out.println("Ja"+ "va");

        System.out.println("12" + 10 + 9);
        // "12" + 10 먼저 계산 //문자열(String)
        // "12" + "10"  > "1210"
        // "1210" + 9
        // "1210" + "9" > "12109"

        System.out.println("12" + (10 + 9));  //()소괄호가 우선순위 높
        //10 + 9 > 19
        //"12" + 19
        //"12" + "19" > "1219"
    }
}
