package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        //1~100
        int val = (int)(Math.random() * 100) + 1 ;
            System.out.printf("%d는(은) %s입니다.\n",
                    val, val % 2 == 0 ? "짝수" : "홀수" );

            System.out.println("-----------------------------------------");

        if (val % 2 == 0) {
            System.out.printf("%d는(은) 짝수입니다.\n", val);
        } else {
            System.out.printf("%d는(은) 홀수입니다.\n", val);
        }
        //val 값이 11이면 > "11는(은) 홀수입니다."
        //val 값이 12이면 > "12는(은) 짝수입니다."
    }
}
