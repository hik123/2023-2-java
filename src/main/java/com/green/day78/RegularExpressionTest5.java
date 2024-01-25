package com.green.day78;

import java.util.regex.Pattern;

public class RegularExpressionTest5 {
    public static void main(String[] args) {
        String str1 = "010";
        String str2 = "011-15345";    //스페이스바 빈칸도 문자열
        String str3 = "015-1111";
        String str4 = "016-24425";
        String str5 = "017-124-5564";
        String str6 = "018-1111-1245";
        String str7 = "019";
        String str8 = "123";
        //010, 011 ,016 ,017 ,018 ,019
        String regexp = "^01[0-1|6-9]{1}-[\\d]{3,4}-[\\d]{4}$";     // [a-z|A-Z] [a부터z까지 or A부터Z 까지 가능] |없어도 자동으로or줌
                                                        // + 1자 이상 있어야 // [0-9 ] 스페이스바 있으면 띄어쓰기허용
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));
        System.out.printf("%s > %b\n", str6, Pattern.matches(regexp, str6));
        System.out.printf("%s > %b\n", str7, Pattern.matches(regexp, str7));
        System.out.printf("%s > %b\n", str8, Pattern.matches(regexp, str8));
    }
}
