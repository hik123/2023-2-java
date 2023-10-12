package com.green.day11.ch6;

public class StarPrint {
    void line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int n) {
        for (int i = 0; i < n; i++) {
            line(n); // 같은 공간에 있어서 .필요없
        }
    }

    void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            line(i);
            //for(int z=0; z<=i; z++) {
            //    System.out.print("*");
            //}
            //System.out.println();
        }
    }

    String chkGenderById(String s) {
        char vil = s.charAt(7);
        /*
        if (vil == '2' || vil == '4') {
            return "여성";
        } else if (vil == '1' || vil == '3') {
            return "남성";
        }
        return "유효하지 않은 주민번호";
         */
        switch(vil) {
            case '2', '4' :
                return "여성";
            case '1', '3' :
                return "남성";
        }
        return "유효하지 않은 번호입니다.";

    }
    int sumFromTo(int min, int max) {
        int sum = 0;
        for (int i=min; i<=max; i++) {
            sum += i;
        }
        return sum;
    }
}
