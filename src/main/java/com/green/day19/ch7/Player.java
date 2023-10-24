package com.green.day19.ch7;

public abstract class Player {              //추상 클래스는 객체화 안됨  //구현부가 없어서
    public abstract void play(int pos); //추상 메소드 선언부만 있는 메소드 //
                                        // 클래스가 가진 자식메소드(멤버메소드)중에 추상메소드가 있다면 추상클래스가됨
                                        // 추상메소드가 없어도 추상클래스될수있다 //abstrct메소드는 오버라이딩 강제성 있음
}
class AudioPlayer extends Player {
    @Override
    public void play(int pos) {
        System.out.println("Audio Play 위치 : " + pos);
    }
}

class VideoPlayer extends Player {
    @Override
    public void play(int pos) {
        System.out.println("Video Player 위치 : " + pos);
    }
}

abstract class DvdPlayer extends Player { //abstract붙이면 오버라이딩 안해도 빨간줄사라짐

}

class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap; // 부모타입이라 주소값 담을 수있다.
        player.play(30);
        player = vp;
        player.play(40);
    }
}
