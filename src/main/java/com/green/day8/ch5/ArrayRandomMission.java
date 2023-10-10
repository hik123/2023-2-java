package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)((Math.random() * 5) +1);
            System.out.println(arr[i]);
            for(int z=0; z<i; z++) {
                if(arr[i] == arr[z]) {
                    i--; //중복 값 나왔을때 넘어가지 않도록 i--;
                    break; // 불필요한 연산과정 제거
                }
            }
          /* 중복제거는 for문 2개필요
        5개 방을 갖고 있는 정수형 배열 만들고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
        각 방의 값이 모두 같으면 안됨.
        중복 제거
         */
        }
        System.out.println(Arrays.toString(arr));
    }
}
