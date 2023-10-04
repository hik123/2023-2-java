package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        // 50~200 사이의 랜덤값
        // 100이하면 그 값의 *2한 결과값
        // 100 초과면 그 값의 +10한 결과값

        int val = (int)((Math.random() * 151) +50);
        System.out.printf("%d 의 값은 : %d",
                val , val <= 100 ? val*2 : val+10);

        System.out.println("--------------------------");
        int val2 = (int)((Math.random() * 151) +50);
        int result = 0;

    }
}
