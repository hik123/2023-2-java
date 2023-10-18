package com.green.day15.ch7;



class Tv {
    boolean power;
    int channel; //private 붙으면 같은공간 클래스 내에서만 사용가능

    void power() { power = !power; }
    void channelUp () { channel++; }
    void channelDown () { channel--; }
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
    @Override //오버라이딩이 맞다고 증명해줌 // 빨간줄 안뜨면 오버라이딩 맞음
    void channelUp() { //오버라이딩 //부모 메소드를 새롭게 정의해서 씀 //이름,파라미터는 같고 구현부는 다를수있다
        channel += 2;
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n", cTv.power); // boolean타입은 %b
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.channel = 10;
        cTv.channelUp();
        System.out.printf("cTv.power : %d\n", cTv.channel);
        cTv.displayCaption("반갑다 친구들!!");
        cTv.caption = true;
        cTv.displayCaption("sdfsdfsdfsd");
    }
}

