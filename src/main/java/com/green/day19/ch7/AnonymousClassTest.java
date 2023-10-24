package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new Runrobot();
        Runnable2 run2 = new Runnable2() { //interface에 new붙이면 익명클래스
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
    }
}

interface Runnable2 {
    void run();
}
class Runrobot implements Runnable2{

    @Override
    public void run() {
        System.out.println("로봇이 달린다");
    }
}