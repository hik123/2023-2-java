package com.green.day15.ch7;


class Tv2 {
    boolean power;
    int channel; //private 붙으면 같은공간 클래스 내에서만 사용가능
    void power() { power = !power; }
    void channelUp () { channel++; }
    void channelDown () { channel--; }
}

class CaptionTv2 extends Tv2 {
    int channel;
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
    void printParentChannel() { //1. Tv2 에 있는 채널, 2. ct2에 있는데 채널, 3. ct2 밑에있는 printParentChannel 지역변수 채널
        System.out.printf("parent-channel: %d\n", channel);
    }                                            // this.channel
}
public class CationTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel = 10;
        ctv.channelUp();

        System.out.printf("ctv.channel : %d\n", ctv.channel);
        ctv.printParentChannel();
    }
}
