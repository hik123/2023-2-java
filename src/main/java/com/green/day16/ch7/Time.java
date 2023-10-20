package com.green.day16.ch7;
import com.green.day15.ch7.DeckTest.*;

public class Time {
    public final int MIN_HOUR = 0;
    public final int MAX_HOUR = 23;
    private int hour, minute, second;

    //1. 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //2. setter 메소드
    public void setHour(final int hour) {
        if (hour < MIN_HOUR) { this.hour = MIN_HOUR; return; }
        if (hour > MAX_HOUR) { this.hour = MAX_HOUR; return; }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    //3. getter 메소드
    public int getHour() {
        return this.hour;

    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }
    @Override
    public String toString() {

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }           //class이름으로 호출할수있는것 static 밖에없
}                   //static메소드 만드는 조건 인스턴스 안쓰면 가능 //
class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 20, 7);
        time.setMinute(5);

        time.setHour(300);
        // 0~23, 만약 23초과값이 들어오면 23이, 0미만 값이 들어오면 0이 들어가도록

        System.out.println(time); // 10시 20분 30초  //10시 30분 30초 나오게! //00:30:30 으로나오게
        //time.hour = 10; //Time클래스의 중괄호 벗어나서 사용불가
    }
}
//메소드, 생성자 이용해서 private멤버필드 에 값을 넣을수있음
//메소드를 통해서 private멤버필드 값을 빼낼수 있음