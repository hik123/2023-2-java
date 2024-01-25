package com.green.day78;

import java.util.regex.Pattern;

public class RegularExpressionTest2 {
    public static void main(String[] args) {
        String str1 = "asdfsadg";
        String str2 = "aasd12345";    //스페이스바 빈칸도 문자열
        String str3 = "asdas asda d";
        String regexp = "^[a-z|A-Z]*$";     // [a-z|A-Z] [a부터z까지 or A부터Z 까지 가능] |없어도 자동으로or줌

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str3));
    }
}
