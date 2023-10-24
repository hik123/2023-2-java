package com.green.day19.ch7.starcarft2;

public interface Fighterble extends Movable, Attackable {}//같은 인터페이스끼리 상속받을때 extends 사용
    //interface는 다중상속 가능                //다중상속해도 구현부가없으니 문제가 되지않음
interface Movable { void move(int x, int y); }

interface Attackable { void attack(Unit u); }

class Unit {
    private int currentHp;
    private int x;
    private int y;
}
class Fighter extends Unit implements Fighterble {
    @Override
    public void move(int x, int y) {}
    @Override
    public void attack(Unit u) {}
}
class Fightertest {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10, 20);

        Fighter fighter = (Fighter)movable;
        fighter.attack(null);

        Attackable attackable = (Attackable)movable;
        attackable.attack(null);
    }
}
