package com.green.day12.ch6;

public class Gugudan {
    void print(int gu) {
        for (int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", gu, i, gu*i);
        }
    }

    void printFromTo(int min, int max) {
        for (int i=min; i<=max; i++) {
            for (int z=1; z<10; z++) {
                System.out.printf("%d x %d = %d\n", i, z, i*z);
            }
        }
    }
    void printFromTo (int min, int max, String sep) {
        for (int i=min; i<=max; i++) {
            for (int z=1; z<10; z++) {
                System.out.printf("%d x %d = %d\n", i, z, i*z);
            }
            if (i != max) { System.out.println(sep); }
        }
    }
}
