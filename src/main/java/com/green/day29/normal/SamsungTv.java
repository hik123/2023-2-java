package com.green.day29.normal;

public class SamsungTv {
    private boolean isMute;
    private AppleSpeaker speaker; // has A관계
    private HarmanSpeaker speaker2;


    public SamsungTv() {
        speaker = new AppleSpeaker();
        speaker2 = new HarmanSpeaker();
    }

    public void sound() {
        if(isMute) {
            return;
        }
        //speaker.sound();
        speaker2.speak();
    }
    public void toggleMute() {
        isMute = !isMute;
    }
}
