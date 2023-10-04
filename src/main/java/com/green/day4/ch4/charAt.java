package com.green.day4.ch4;

public class charAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase();
        //str = str.toUpperCase(); // 대문자로 바꿔주는 메소드
        System.out.println(str);

        System.out.println("result2 : " + str.charAt(0));
        char result = str.charAt(1);   // 배열 0번부터 시작
        System.out.println("result1 : " + result);
        System.out.println("result2 : " + str.charAt(2));

        System.out.println("---------------------------------");

        String str2 = "abs";
        char rsult2 = str2.charAt(1);

        System.out.println(rsult2);

        String str3 =str.toUpperCase();
        System.out.println("str3 : " + str3);


    }
}
