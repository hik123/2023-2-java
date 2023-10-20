package com.green.day16.ch7;

public class Singleton {
    private Singleton() {}

    private static Singleton singleton;
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }                   //객체
        return singleton;
    }
    //부모타입은 자식 객체 주소값을 담을 수 있다.
    //자식타입은 부모 객체 주소값을 담을 수 없다
    //타입은 알고 있는 멧소드만 호출할 수 있고, 호출이 된다면 객체 기준이다/
}

class SingletonTest {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance(); //대문자로 시작하는 메소드 호출 static은 객체화랑 안해도됨 class명.메소드
        Singleton s2 = Singleton.getInstance(); //
        System.out.println(s1 == s2);
        // Singleton s1 = new Singleton(); private 붙어있어서 객체화 불가능
    }
}