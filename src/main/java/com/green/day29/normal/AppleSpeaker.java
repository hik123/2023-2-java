package com.green.day29.normal;

public class AppleSpeaker {
    private HansungWoofer woofer;

    public AppleSpeaker () { //생성자는 리턴타입x 클래스명과 같다 < 메소드와 차이점
        woofer = new HansungWoofer();
    }
    public void sound() {
        System.out.println("애플 스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}
