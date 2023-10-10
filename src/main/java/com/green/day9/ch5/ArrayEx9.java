package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];
        int rval = 0;
        for (int i = 0; i < arr.length; i++) {
            rval = (int)(Math.random() * 12) +0;
            if (rval == 3 || rval == 6 || rval == 11) {
                arr[i] = rval;
            } else if ((-rval) == 1 || (-rval) == 4) {
                arr[i] = -rval;
            } else { i--; }
        }

        /*
        arr 각 방에 code에 있는 값만 순서 랜덤하게 넣어주세요.
         */
        System.out.println(Arrays.toString(arr));
    }
}

