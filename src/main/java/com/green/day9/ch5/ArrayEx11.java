package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        int rval = 0;
        for (int i = 0; i<LEN; i++) {
            rval = (int) (Math.random() * 10);
            numArr[i] = rval;
            cntArr[rval]++; //cntArr[rval] = cntArr[rval] +1;
        }
            System.out.println(Arrays.toString(numArr));
            System.out.println(Arrays.toString(cntArr));
        for (int i = 0; i<LEN; i++) {
            System.out.printf("%d의 개수 %d\n", i, cntArr[i]);
        }
        /*
        numArr 각 방에 0~9사이의 랜덤값을 대입한다 (중복허용)
        numArr 각 방의 값도 출력
        cntArr 의 0번 방은 0의 개수, 1번방은 1의 개수 count 값을 넣는다.
        0~9의 개수를 출력
        [4, 4, 4, 6, 5, 7, 9, 7, 5, 3]
        0의 개수: 0
        1의 개수: 0
        4의 개수: 3
        6의 개수: 1
        ...
         */
    }
}
