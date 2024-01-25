package com.green.day78;

import java.util.regex.Pattern;

public class RegularExpressionTest1 { //정규표현식
    public static void main(String[] args) {
        String str1 = "12  3";
        String str2 = "12345";    //스페이스바 빈칸도 문자열
        String str3 = "12A345";
        String regexp = "^[\\d]*$"; //*여러개      +1개이상       ?0개나 1개, 2개이상 부터

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str3));
    }
}
