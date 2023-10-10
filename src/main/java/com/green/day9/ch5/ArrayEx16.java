package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int i=0;
        String[] arr = new String[3];
        while(true) {
            System.out.print("문자열을 입력 하세요 >> ");
            String input = scan.nextLine();
            arr[i] = input;
            i++;
            if (i == 3) { break; }
        }
        int z = 0;
        for (String str : arr ) {
            System.out.printf("arr[%d] : %s\n", z++, str);
        }
        System.out.println("---!끝!---");
        System.out.println(Arrays.toString(arr));
        */
        System.out.println("---------------------");
        int v=0;
        String[] arr2 = new String[3];
        for (v=0; v<arr2.length; v++) {
            System.out.print("문자열을 입력 >> ");
            String input2 = scan.nextLine();
            input2 = arr2[v];
        }
        int r= 0;
        for (String s : arr2) {
            System.out.printf("arr2[%d] : %s\n", r++, s);
        }



        /*
        3개의 String값을 담을 수 있는 배열 생성.
        3번 문자열로 입력을 받는다. (Scanner이용)
        입력받은 문자열들을 순차적으로 배열에 값을 넣는다.
        값 넣는게 종료가 되면 향상된 for문을 이용하여
        저장되어 있는 값들을 콘솔에 출력한다.
        첫번째 입력 받은것 0번방 ~
        */
    }
}
