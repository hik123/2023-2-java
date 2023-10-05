package com.green.day7.ch4;

public class FlowEx31Result {
    public static void main(String[] args) {

        int i = 0;
        for (i=0; i<11; i++) {
            if (i % 3 == 0) { continue; }
            System.out.println(i);
        }
        System.out.println("---------------");
        for (i=0; i<11; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
