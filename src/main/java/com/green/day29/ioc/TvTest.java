package com.green.day29.ioc;

public class TvTest {
    public static void main(String[] args) {
        String strTv = args[0];
        String strSpeaekr = args[1];
        String strWoofer = args[2];
        Tv tv = TvFactory.instance(strTv, strSpeaekr, strWoofer);
        tv.sound();
        tv.toggleMute();
        tv.sound();
    }
}
