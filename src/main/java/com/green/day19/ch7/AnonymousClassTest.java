package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunrobotImpl();
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
class RunrobotImpl implements Runnable2{ //상속받은 클래스명에 알아보기쉽게 Impl넣기도함
    @Override
    public void run() {
        System.out.println("로봇이 달린다");
    }
}