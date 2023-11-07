package com.green.day27;

public class SubstringTest {
    public static void main(String[] args) {
        String str ="ABCDEFGHIJ";

        String r1 = str.substring(2, 4); //CD   4번 전까지 가져옴
        System.out.println("r1: " + r1);

        System.out.println("r2: "
                + str.substring(4)); // 시작idx
                            // 원본 값이 수정되지 않는 비파괴 함수
        System.out.println(str);
    }
}
