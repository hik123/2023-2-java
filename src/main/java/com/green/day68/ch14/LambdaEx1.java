package com.green.day68.ch14;


@FunctionalInterface // 메소드가 1개만 있는지 검증하기 위함, 2개 있으면 빨간줄
interface MyFunction {          //추상 클래스는 객체화x ,추상 메소드 하나만 가지고 있어도 자동으로 추상 클래스
    void run();
}
public class LambdaEx1 {  // 람다식은 익명클래스 내용을 줄이기 위해 사용함
    public static void main(String[] args) {
        MyFunction mf0 = () -> System.out.println("mf0 - run !!"); // 추상메소드가 1개밖에 없어서 이름적을 필요없다
                                                            // { System.out.println("mf0 - run !!"); } 한 문장일때 중괄호 생략됨 // 2줄 이상일대 중괄호 꼭 있어야 함
                                                            // 파라미터가 1개 였다면 ()소괄호 생략 가능  MyFunction mf0 = i -> { System.out.println("mf0 - run !!") } i의 타입도 안적어도됨
        MyFunction mf1 = new MyFunction() { // MyFunction을 implements 받은 이름이 없는 클래스를 객체화
            public void run() {
                System.out.println("fm2 - run !! ");
            }
        };

        MyFunction mf2 = new MyFunctionClass();

        mf0.run();
        mf1.run();
        mf2.run();
    }
}

class MyFunctionClass implements MyFunction {
    public void run() {
        System.out.println("class name - run !! ");
    }
}