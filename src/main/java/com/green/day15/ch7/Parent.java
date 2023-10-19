package com.green.day15.ch7;

public class Parent { //extends Object 자동생성 //모든 객체는 오브젝트를 상속받음 , 오브젝트는 최상위 부모객체
    int age;
    public Parent () {
        super(); //부모 기본생성자 호출
    }                      //this. > 메소드,속성 /전역변수와 지역변수 명이 같을때 this.생략불가 // this() 생성자호출
    public Parent(int age) {
        super();
    }
}
class Child extends Parent { //상속
    public Child() {
        super(12); // 내바로 위에있는 부모의 주소값이 super()상수 에 저장
        //age = 100;
   }
    void play() {
        System.out.printf("나는 %d살이야 같이놀자~.\n", age);
    }
}

class GrandChild extends Child {
    void play() {
        System.out.println("hiiii");
    }
}

class Child2 extends Parent {
    public Child2 () {
       super();
    }
    void jump() {
        System.out.printf("%d살의 아이가 점프를 하였다.\n", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Parent p = new Child(); //부모는 자식의 주소값 가질수있고 반대로 자식은 부모의 주소값 가질수없다
        //Child2 c2 = c1;   //형제간에도 주소값 가질수없다

        Child2 c2 =new Child2();
        c2.age = 7;
        c2.jump();
    }
}