package com.green.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args) {
        int r1 = 0, n1 = 0, a1 = 0;
        r1 = ++n1; // ++앞에있으면 n1값 먼저 올리기 // 값을 읽어오고 쓰기 ++앞에있을때 쓰기먼저 값을 올림, 뒤에있을때 읽기 먼저
        ++a1;  //쓰기만 ++앞뒤 상관없
        System.out.printf("r1: %d, n1: %d, a1: %d\n", r1, n1, a1);

        int r2 = 0, n2 = 0, a2 = 0;
        r2 = n2++; //
        a2++;
        System.out.printf("r2: %d, n2: %d, a2: %d\n", r2, n2, a2);

    }
}
