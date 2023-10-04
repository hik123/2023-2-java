package com.green.day5.ch4;

public class MultiFor {
    public static void main(String[] args) {
        for(int h=0; h<10; h++) { // 안쪽의 for문이 끝나야 h++ //중첩for문

            for(int m=0; m<7; m++) {
                System.out.printf("h: %d - m:%d\n", h, m);
            }
        }
    }
}
