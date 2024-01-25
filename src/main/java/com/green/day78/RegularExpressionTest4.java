package com.green.day78;

import java.util.regex.Pattern;

public class RegularExpressionTest4 {
    public static void main(String[] args) {
        String str1 = "a-bc@naver.com";
        String str2 = "abc@naver.c.kr";    //스페이스바 빈칸도 문자열
        String str3 = "하하1342ㄹㅣㅡ";
        String str4 = "111111ㅁㄴ ";
        String str5 = "1히1 1하11이11";
        String str6 = "123";
        String regexp = "^[a-zA-z0-9_-]+@([a-zA-z0-9]{3,}\\.[a-z]{2,}|[a-zA-z0-9]{3,}\\.[a-z]{2,}\\.[a-z]{2,})$";     // [a-z|A-Z] [a부터z까지 or A부터Z 까지 가능] |없어도 자동으로or줌
                                                        // + 1자 이상 있어야 // [0-9 ] 스페이스바 있으면 띄어쓰기허용
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));
        System.out.printf("%s > %b\n", str6, Pattern.matches(regexp, str6));
    }
}
