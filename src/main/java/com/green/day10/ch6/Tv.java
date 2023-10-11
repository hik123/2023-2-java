package com.green.day10.ch6;

public class Tv {  //객체는 속성과 메소드로 구성
    //멤버필드, 속성. property (값을 저장하는게 목적) //
    String color;
    boolean power;
    int channel;

    //멤버메소드, 메소드

    //리턴타입 메소드명 파라미터() {} //위치가 바뀔순 있으나 구성은 그대로
    void power() { power = !power; } //메소드를 정의   // void power()메소드의 선언부(필수)
    void channelUp() { channel++; }                 // { power = !power; } 구현부(없을수도있다)
    void channelDown() { channel--; }
}
