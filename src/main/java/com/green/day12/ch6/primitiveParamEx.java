package com.green.day12.ch6;

class Data {
    int x;
}
public class primitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.printf("main() : x = %d\n", d.x);
    }
}
