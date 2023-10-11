package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = tv1; //주소값 복사 //셸로우 카피

        System.out.printf("tv1.channel : %d\n", tv1.channel);
        tv1.channelUp(); // 호출 //주소값.
        tv1.channelUp();
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        System.out.printf("tv2.channel : %d\n", tv2.channel);
    }
}
// Stack 메모리 영역(좌)
    //FILO 가장먼저넣은게 뺄때는 마지막에나옴
    //Tv tv1, Tv tv2 << 스택메모리영역에 만들어짐

//new Tv() 객체 생성하면  Heap메모리영역(우)에 생성
