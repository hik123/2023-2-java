package com.green.day19.ch7.starcraft;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit {
    protected int x;
    protected int y;

    public abstract void move(int x, int y); //구현부가 없는 추상 메소드
    public void stop() {
        System.out.println("현재 위치에서 정지");
    }
    //public void setX(int x) { this.x = x; }
    //public void setY(int y) { this.y = y; }

    //public void setMove(int x, int y) {
    //    this.x = x;
     //   this.y = y;
    //}


}
class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);

        Unit unit2 = new Tank();
        unit2.move(10, 20);

        List<Unit> units = new ArrayList();
        units.add(unit);
        units.add(unit2);
        units.add(new Marine());
        units.add(new Tank());
        //배열, Arraylist

    }
}
class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);
        Unit unit1 = units.get(units.size() - 1); //마지막 방의 주소값을 얻어오기
           Tank tank = (Tank)unit1;  //타입은 알고 있는 메소드만 호출할 수 있다! //호출이 된다면 객체기준
            //unit1.changeMode(); //Unit에는 changeMode()없으니 빨간줄
            tank.changeMode();

    }

    public static void moveAll (List<Unit> list, int x, int y) {
        for(int i=0; i<list.size(); i++) {
            list.get(i).move(x, y);
        }
        for(Unit unit : list) {
            unit.move(x, y);
        }
        //Unit unit = (Unit)units.get(2);
        //unit.move(x, y);
        //Unit unit2 = (Unit)units.get(3);
        //unit2.move(x, y);
    }
}
class Marine extends Unit { //추상 메소드는 강제성있어서 오버라이딩 해야됨
    @Override
    public void move(int x, int y) { //메소드에서는 생성자 호출 안됨 //.은 가능
        this.x = x;
        this.y = y;
        //setX(x);
        //setY(y);
        System.out.printf("마린이 좌표 x: %d, y: %d로 이동\n", x, y);
    }
    public void steamPack() {
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit {
    private boolean siegeMode;
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 x: %d, y: %d로 이동\n", x, y);
    }

    //siegeMode = false는 시즈모드가 아님
    //이 상태에서 changeMode메소드가 호출이 되면 > 시즈모드가 되어야함
    //siegeMode = true; 들어가야되고 콘솔에는 "시즈모드가 되었습니다."
    //siegeMode = ture; 는 시즈모드가 된것
    //이상태에서 changeMode메소드가 호출이 되면 > 시즈모드가 풀려야 한다.
    //siegeMode = false 가 들어가야 되고 콘솔에는 "시즈모드가 풀렸습니다."
    public void changeMode() {
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");
        /*if (siegeMode) { //true인 경우
            System.out.println("시즈모드가 되었습니다.");
        } else { //false인 경우
            System.out.println("시즈모드가 풀렸습니다.");
        }*/
    }
}
