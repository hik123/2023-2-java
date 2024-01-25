package com.green.day83;

public class Gbox<T> {  // T의 gbox   / T는 타입변수
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
