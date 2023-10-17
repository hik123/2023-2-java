package com.green.day14.ch6;

public class Car {
    String color;
    String gearType;
    int door;

    public Car () {
        this("white"); // this() 생성자 호출
    }
    public Car (String color) {
        this(color, "auto", 4); //이름이 같을때 this 사용 이름 다를때는 생략해도됨
    }
    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public void printMySelf () {
        System.out.printf("color=%s, gearType=%s, door%d\n", color, gearType, door);
    }
}

class carTest {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue");

        car1.printMySelf(); // color=white, gearType=auto, door=4
        car2.printMySelf(); // color=blue, gearType=auto, door=4
    }
}
