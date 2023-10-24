package com.green.day19.ch7;

public interface PlayingCard {//객체화 불가 부모역할만
    public static final int SPADE = 4; //interface는 멤버필드 public static final 생략해도 자동으로 들어감
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber(); //public abstract 자동으로 들어감 안적어도 무방함
    String getCardkind();
}

interface PlayingChess extends PlayingCard { //같은 인터페이스끼리 상속받을때 extends 사용
    void moveHorse(int x, int y); //public abstract 생략되있음
}
class chess implements PlayingChess {
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardkind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}

class Card3 implements PlayingCard {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardkind() {
        return null;
    }
}

class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
class Card implements PlayingCard {
    @Override
    public String getCardNumber() {
        return null;
    }
    @Override
    public String getCardkind() {
        return null;
    }
}
