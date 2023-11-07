package com.green.day29.ioc;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker (Woofer woofer) { //생성자는 리턴타입x 클래스명과 같다 < 메소드와 차이점
        this.woofer = woofer;
    }
    public void sound() {
        System.out.println("애플 스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}
