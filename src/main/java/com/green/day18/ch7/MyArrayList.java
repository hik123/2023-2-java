package com.green.day18.ch7;

import java.util.Arrays;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int val) {
        int[] tmp = new int[arr.length+1];
        for (int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = val;
        arr = tmp;
    }

    public void add(int idx, int val) {
        int[] tmp = new int[arr.length +1];
        tmp[idx] = val;                     // n, val, n, n
        for(int i=0; i<idx; i++) {          // 10, val, n, n
            tmp[i] = arr[i];
        }
        for(int i=idx; i<arr.length; i++) { // 10, val, 20, 30
            tmp[i+1] = arr[i];
        }
        arr = tmp;

    }
    @Override
    public String toString() {
        if (arr.length == 0) { return "[]"; }
        String r = String.format("[%d",arr[0]);
        for (int i=1; i<arr.length; i++) {
            r += String.format(", %d",arr[i]);
        }
        r += "]";
        return r;
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10); //0: 10
        list.add(20); //1: 20
        list.add(30); //2: 20

        System.out.println(list); // [10, 20, 30] // []
        list.add(1, 40); //
        System.out.println(list); // [10, 40, 20, 30]
    }
}