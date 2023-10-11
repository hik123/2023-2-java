package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        names[1] = "Woo"; //원래 가진값 날리고 새로운 값이 들어올때 대입연산자(=) 사용

        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);


        }
        System.out.println(Arrays.toString(names));
        System.out.println("--------------");
        int z=0;
        for(String str : names) { //향상된 for문 //foreach문
                    // names 값을 >> str에 하나하나 넣음
            System.out.printf("names[%d]: %s\n", z++, str);
        }           // 실행될때 마다 다음 name값을 str에
                    //값만 찍을때 foreach문 사용
        System.out.println("--------------");

        for(int i=0; i<names.length; i++) {
            String str = names[i];
            System.out.println(str);
        }
    }
}

