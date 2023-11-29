package com.green.day44;

public class MyOpenAPI {
    private MyInfo info;
    private String name;
    public MyOpenAPI info(MyInfo info) {
        this.info = info;
        return this;
    }

    public MyOpenAPI name(String name) {
        this.name = name;
        return this;
    }
    @Override
    public String toString() {
        return String.format("name: %s", name);
    }
}
